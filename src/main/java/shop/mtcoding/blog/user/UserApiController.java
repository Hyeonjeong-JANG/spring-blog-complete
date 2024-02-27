package shop.mtcoding.blog.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import shop.mtcoding.blog._core.ApiUtil;

@RequiredArgsConstructor
@RestController
public class UserApiController {
    private final UserRepository userRepository;

    @PostMapping("/api/users")
    public ApiUtil<?> join(@RequestBody UserRequest.JoinDTO requestDTO){
        userRepository.save(requestDTO);
        return new ApiUtil<>(null);
    }
}
