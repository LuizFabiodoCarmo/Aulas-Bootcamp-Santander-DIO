package projectdio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTest {



	@Test
    @EnabledOnOs({OS.WINDOWS, OS.LINUX})
    void validarAlgoSomenteNoUserLuiz() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
