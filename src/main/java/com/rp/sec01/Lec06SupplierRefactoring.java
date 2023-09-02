package com.rp.sec01;

import com.rp.sec01.courseutil.Util;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class Lec06SupplierRefactoring {

    public static void main(String[] args) {

        getName()
                .subscribeOn(Schedulers.boundedElastic()) //async behaviour
                .subscribe(
                Util.onNext()
        );

        //lazy execution of subscription
        getName().subscribe(
                Util.onNext()
        );
    }


    // publisher
    public static Mono<String> getName(){
        System.out.println("Entered getname method");
        return Mono.fromSupplier(()->{
            System.out.println("Generating Name:");
            Util.sleepSeconds(3);
            return Util.faker().name().fullName();

        }).map(String::toUpperCase);
    }

}
