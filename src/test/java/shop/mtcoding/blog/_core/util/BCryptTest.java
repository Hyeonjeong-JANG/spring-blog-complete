package shop.mtcoding.blog._core.util;

import org.junit.jupiter.api.Test;
import org.mindrot.jbcrypt.BCrypt;

public class BCryptTest {
    @Test
    public void gensalt_test(){
        String salt = BCrypt.gensalt();
        System.out.println(salt);
//        $2a$10$m6WnWB56yQxMQPM4PeBEbO
//        $2a$10$b/3CxwzX0gYO.ZxWt/kVg.
//        값이 계속 달라짐
//        $2a$10$ 이 값이 반복됨. 밑에도 그렇구. 그렇기 때문에 값을 비교해줄 수 있다.
    }
    @Test
    public void hashpw_test() {
        String rawPassword = "1234";
        String encPassword = BCrypt.hashpw(rawPassword, BCrypt.gensalt());
        System.out.println(encPassword);
//        $2a$10$vdygfr1ObK6xKwodD5A14uKNdtOrDwIGuuQr89whVg0/IWEm1VRm.
//        $2a$10$2kDx3GfxFYLRkbTe5FQXR./BWx5sGNOgY6/DM5M23a79v60XzC56C
    }

}
