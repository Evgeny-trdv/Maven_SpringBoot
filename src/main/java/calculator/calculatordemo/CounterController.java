package calculator.calculatordemo;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CounterController {
    private final CounterService counterService;

    public CounterController(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping()
    public String hello() {
        return counterService.hello();
    }

    @GetMapping(path = "/plus")
    public String sum(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return counterService.sum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return counterService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return counterService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return counterService.divide(num1, num2);
    }
}
