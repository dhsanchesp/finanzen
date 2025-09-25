package br.com.finanzen.exception;

import br.com.finanzen.controller.dto.DefaultErrorResponse;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<DefaultErrorResponse> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        DefaultErrorResponse errorResponse = new DefaultErrorResponse("SRV0400", "Data Integrity Violation");
        return ResponseEntity.status(400).body(errorResponse);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<DefaultErrorResponse> handleException(Exception ex) {
        DefaultErrorResponse errorResponse = new DefaultErrorResponse("SRV0500", "Internal Server Error");
        return ResponseEntity.status(500).body(errorResponse);
    }
}
