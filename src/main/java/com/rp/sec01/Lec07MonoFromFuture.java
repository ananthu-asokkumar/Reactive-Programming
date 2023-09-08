package com.rp.sec01;

import com.rp.sec01.courseutil.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

public class Lec07MonoFromFuture {
    public static void main(String[] args) {
        Mono.fromFuture(
                getName()
        ).subscribe(Util.onNext());

        Util.sleepSeconds(1);
    }

    // CompletableFuture java equivalent of javascript promise
    private static CompletableFuture<String> getName(){
        return CompletableFuture.supplyAsync(()-> Util.faker().name().fullName());
    }
}