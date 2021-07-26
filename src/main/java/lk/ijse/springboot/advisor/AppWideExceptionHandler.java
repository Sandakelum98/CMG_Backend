package lk.ijse.springboot.advisor;


import lk.ijse.springboot.exception.NotFoundException;
import lk.ijse.springboot.exception.ValidationException;
import lk.ijse.springboot.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {

    @ExceptionHandler
    public ResponseEntity handleException(Exception e) {
        return new ResponseEntity(new StandardResponse("500","error",e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler
    public ResponseEntity handleNotFoundException(NotFoundException e) {
        return new ResponseEntity(new StandardResponse("404","error",e.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity handleValidationException(ValidationException e) {
        return new ResponseEntity(new StandardResponse("400","error",e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
