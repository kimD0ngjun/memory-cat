package com.cat;

import com.cat.controller.MemoryCatController;

/**
 * 얘네는 개발환경에서만 쓰는 것, 실제 배포 파일은 jar 파일로 배포
 *
 */
// out 패키지 생성 : javac -d out/production/classes src/main/java/com/cat/**/*.java
// 실행 : java -Djava.library.path=/Users/kimdongjun/Desktop/BackEnd/memory-cat/src/main/java/com/cat/system -classpath /Users/kimdongjun/Desktop/BackEnd/memory-cat/out/production/classes com.cat.MemoryCatApplication
// 한 번에 실행 : javac -d out/production/classes src/main/java/com/cat/**/*.java && java -Djava.library.path=/Users/kimdongjun/Desktop/BackEnd/memory-cat/src/main/java/com/cat/system -classpath /Users/kimdongjun/Desktop/BackEnd/memory-cat/out/production/classes com.cat.MemoryCatApplication
public class MemoryCatApplication {
    public static void main(String[] args) {
        MemoryCatController memoryCatController = new MemoryCatController();
        memoryCatController.runAnimation();
    }
}
