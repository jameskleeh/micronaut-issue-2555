package jar.app;

import io.micronaut.cache.annotation.Cacheable;
import io.reactivex.Single;

import javax.inject.Singleton;

@Singleton
public class CalculatorService {

    @Cacheable("my-cache")
    public Single<Integer> addOne(int num) {
        System.out.println("called");
        return Single.just(num + 1);
    }
}
