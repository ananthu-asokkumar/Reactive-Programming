package com.rp.sec01;

import com.rp.sec01.assignment.FileService;
import com.rp.courseutil.Util;

public class Lec09AssignmentDemo {
    public static void main(String[] args) {

        FileService.write("file03.txt","hello world")
                .subscribe(Util.onNext(),Util.onError(),Util.onComplete());
        FileService.read("file03.txt")
                .subscribe(Util.onNext(),Util.onError(),Util.onComplete());
        FileService.delete("file03.txt")
                .subscribe(Util.onNext(),Util.onError(),Util.onComplete());
    }
}
