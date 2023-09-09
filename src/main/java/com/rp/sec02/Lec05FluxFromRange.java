package com.rp.sec02;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec05FluxFromRange {

    public static void main(String[] args) {
        Flux.range(3,10)
//                .map(i->i*2)
                .log()
                .map(i->Util.faker().funnyName().name())
                .log()
                .subscribe(
                        Util.onNext()
                );
    }
}
