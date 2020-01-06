package cache.app;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;
import jar.app.CalculatorService;

public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = Micronaut.run(Application.class);
        CalculatorService calculatorService = ctx.getBean(CalculatorService.class);
        calculatorService.addOne(1).blockingGet();
        calculatorService.addOne(1).blockingGet();
        calculatorService.addOne(1).blockingGet();
    }
}
