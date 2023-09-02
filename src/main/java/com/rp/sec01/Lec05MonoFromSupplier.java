package com.rp.sec01;

import com.rp.sec01.courseutil.Util;
import reactor.core.publisher.Mono;

public class Lec05MonoFromSupplier {

    public static void main(String[] args) {
        /*
        * use just only when there is data already
        *
        */
//        Mono<String> just = Mono.just(getName());//

        Mono<String> mono = Mono.fromSupplier(Lec05MonoFromSupplier::getName);
        mono.subscribe(Util.onNext());

        Mono<String> stringMono = Mono.fromCallable(Lec05MonoFromSupplier::getName);
        stringMono.subscribe(
                Util.onNext()
        );


    }

    private static String getName(){
        System.out.println("generating Name:");
        return Util.faker().name().fullName();
    }
}
