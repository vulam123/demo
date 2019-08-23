package com.example.demo.apiexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ApiExceptionHandler {
	@ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) {
        // quá trình kiểm soat lỗi diễn ra ở đây
		System.out.println(ex);
		return new ResponseEntity<>("Something happend", HttpStatus.NOT_FOUND);
    }

    /**
     * IndexOutOfBoundsException sẽ được xử lý riêng tại đây
     */
}
