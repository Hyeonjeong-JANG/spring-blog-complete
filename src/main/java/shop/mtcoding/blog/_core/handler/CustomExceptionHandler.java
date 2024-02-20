package shop.mtcoding.blog._core.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import shop.mtcoding.blog._core.util.Script;

@ControllerAdvice // 응답 에러 컨트롤러(view 파일 리턴)모든 throw를 얘기 처리하게 한다.
public class CustomExceptionHandler {

    @ExceptionHandler(Exception.class) // 익셉션 다 받음. 이렇게 하면 좀 곤란하고 분기시켜야 한다. 처음이니까 하나로 퉁 침.
    public @ResponseBody String error1(Exception e) { // @ResponseBody를 썼기 때문에
        return Script.back(e.getMessage());
    }
}
