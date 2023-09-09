package com.rp.sec02;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

import static com.rp.courseutil.Util.*;

public class Lec01FluxIntro{

    public static void main(String[] args) {

        Flux<Object> flux = Flux.just(1,2,3,"a", Util.faker().name().firstName());

//        Flux<Integer> flux=Flux.empty(); // nothing to emit , so onComplete will be callued directly
        flux.subscribe(
                onNext(),
                onError(),
                onComplete()
        );
    }
}
