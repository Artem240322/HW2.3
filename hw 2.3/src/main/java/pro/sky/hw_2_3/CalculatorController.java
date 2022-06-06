package pro.sky.hw_2_3;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculator")
    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/calculator/plus")
    public String plus(@RequestParam ("numb1") float a,
                       @RequestParam ("numb2") float b) {
        return a + " + " + b + " = " + (a + b);
    }

    @GetMapping("/calculator/minus")
    public String minus(@RequestParam ("numb1") float a,
                       @RequestParam ("numb2") float b) {
        return a + " - " + b + " = " + (a - b);
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam ("numb1") float a,
                        @RequestParam ("numb2") float b) {
        return a + " * " + b + " = " + (a * b);
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam ("numb1") float a,
                           @RequestParam ("numb2") float b) {
        if (b ==0) {
            return "На ноль делить нельзя!";
        } else {
            return a + " / " + b + " = " + (a / b);
        }

    }

}
