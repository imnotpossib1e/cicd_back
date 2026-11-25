package web.mvc.cicd02_boot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Cicd02BootApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("test");
        throw new RuntimeException("Fail!");
    }

}
