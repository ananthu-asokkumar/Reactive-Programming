package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;

//mono emoting empty or error
public class Lec04MonoEmptyOrError {

    public static void main(String[] args) {

        //subsriber
        userRepository(1).subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );

    }

    private static Mono<String> userRepository(int userId){

        //1
        if(userId==1){
            return Mono.just(Util.faker().name().firstName());
        } else if (userId==2) {

            return Mono.empty(); // null

        }else{
            return Mono.error(new RuntimeException("No in the allowed range"));
        }
    }
}
