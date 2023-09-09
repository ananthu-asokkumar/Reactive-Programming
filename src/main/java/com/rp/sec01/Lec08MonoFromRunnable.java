package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;

public class Lec08MonoFromRunnable {
    public static void main(String[] args) {
//        Runnable runnable =()-> System.out.println("");// used to notify when the time-consuming job is completed

        Mono.fromRunnable(timeConsumingProcess()).subscribe(
                Util.onNext(),
                Util.onError(),
                ()->{
                    System.out.println("process done ,sending email.....");
                }
        );
    }

    public static Runnable timeConsumingProcess(){
        return ()->{
            Util.sleepSeconds(1);
            System.out.println("Operation Completed");
        };
    }



}
