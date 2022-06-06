package pro.sky.hw_2_3;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/colculator")
    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

}
