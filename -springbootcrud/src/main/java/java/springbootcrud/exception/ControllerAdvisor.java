package java.springbootcrud.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class ControllerAdvisor extends  ResponseEntityExceptionHandler{
	
	    @ExceptionHandler(DataIntegrityViolationException.class)
	    public ResponseEntity<String> handleNullValue(DataIntegrityViolationException ex) {
	    	String message = ex.getMessage();

	        return ResponseEntity.status(HttpStatus.CONFLICT).body(message);
	    }

}
