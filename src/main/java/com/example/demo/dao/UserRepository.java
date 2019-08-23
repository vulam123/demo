package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query(value = "SELECT * FROM [User] u WHERE u.USERNAME = :username", nativeQuery = true)
	User findByUsername(@Param("username") String username);
}
