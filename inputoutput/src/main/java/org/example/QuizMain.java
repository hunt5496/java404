package org.example;

import org.example.JavaQuiz;

import java.io.IOException;

public class QuizMain {

    public static void main(String[] args)  {
        System.out.println("자바 Quiz 풀기");

        JavaQuiz jos = new JavaQuiz();
    try{
        System.out.println("\n----- Quiz1 -----\n");
        jos.write1("C:\\java404\\Quiz1.txt");
    }catch (IOException e){
        System.out.println("파일에 쓰는 도중 오류가 발생했습니다.");
        e.printStackTrace();

    }

    }

}
