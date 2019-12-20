package jar.app;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = Micronaut.run(Application.class);
        ctx.getBean(CalculatorService.class).addOne(1);
        ctx.getBean(CalculatorService.class).addOne(1);
        ctx.getBean(CalculatorService.class).addOne(1);
    }
}
