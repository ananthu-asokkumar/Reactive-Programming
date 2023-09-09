package com.rp.sec02;

import reactor.core.publisher.Flux;

import static com.rp.courseutil.Util.*;

public class Lec03FluxFromArrayOrList {
    public static void main(String[] args) {
 //       List<String> strings = Arrays.asList("a", "b", "c");

//        Flux.fromIterable(strings)
//                .subscribe(Util.onNext());

        Integer[] arr ={1,2,3};
        Flux.fromArray(arr)
                .subscribe(onNext());
    }
}
