package br.com.tech4me.animaisms.view.handler;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ValidationHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
        org.springframework.http.HttpHeaders headers, org.springframework.http.HttpStatus status,
        WebRequest request) {

        List<String> erros = ex.getBindingResult()
        .getFieldErrors()
        .stream()
        .map(err -> err.getDefaultMessage())
        .collect(Collectors.toList());

        return new ResponseEntity<>(erros, HttpStatus.NOT_ACCEPTABLE);
    }

}
