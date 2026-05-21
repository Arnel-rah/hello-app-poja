package school.hei.demo.endpoint.hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello() {
        assertEquals("Hello World!", new HelloController().hello());
    }
}