package pro.sky.hw_2_3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {


    @GetMapping
    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "numb1", required = false) Float a,
                       @RequestParam(value = "numb2", required = false) Float b) {
        if (Objects.isNull(a) || Objects.isNull(b)){
            return "Не правельно переданны параметры";
        }
        return a + " + " + b + " = " + (a + b);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(value = "numb1", required = false) Float a,
                       @RequestParam(value = "numb2", required = false) Float b) {
        if (Objects.isNull(a) || Objects.isNull(b)){
            return "Не правельно переданны параметры";
        }
        return a + " - " + b + " = " + (a - b);
    }

    @GetMapping("/multiply")
        public String multiply(@RequestParam(value = "numb1", required = false) Float a,
                               @RequestParam(value = "numb2", required = false) Float b) {
        if (Objects.isNull(a) || Objects.isNull(b)){
            return "Не правельно переданны параметры";
        }
        return a + " * " + b + " = " + (a * b);
    }

    @GetMapping("/divide")
            public String divide(@RequestParam (value = "numb1", required = false) Float a,
                                 @RequestParam (value = "numb2", required = false) Float b){
                if (Objects.isNull(a) || Objects.isNull(b)) {
                    return "Не правельно переданны параметры";
                }

                if (b == 0) {
                    return "На ноль делить нельзя!";
                }

                return a + " / " + b + " = " + (a / b);
                    }

                }
