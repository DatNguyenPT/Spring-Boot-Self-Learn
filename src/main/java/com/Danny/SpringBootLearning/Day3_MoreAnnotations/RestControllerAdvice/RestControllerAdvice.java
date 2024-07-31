package com.Danny.SpringBootLearning.Day3_MoreAnnotations.RestControllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@org.springframework.web.bind.annotation.RestControllerAdvice
public class RestControllerAdvice {
    @ExceptionHandler(value = IndexOutOfBoundsException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorMessage TodoException(Exception ex, WebRequest request) {
        return new ErrorMessage(10100, "Đối tượng không tồn tại");
    }
}

/*
* Ta đã define ErrorMessage chứa id và message
* Với @RestControllerAdvice, khi có 1 exception xảy ra trong RestController, thay vì throw và báo lỗi
* lên hệ thống thì class chứa @RestControllerAdvice sẽ thực thi các hàm trong nó
*
* @ResponseStatus trả về error code cho người dùng
* */