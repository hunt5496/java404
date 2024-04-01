package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class JavaQuiz {
    // 문제 1) 사용자 입력을 통해서 파일 이름을 입력받고 해당 파일의 내용을 화면에 출력하는 프로그램을 작성하세요
    // 파일명 : quiz1.txt
    // 내용 : 영어로 아무거나
    public void write1(String FileName) throws IOException{
        OutputStream os = new FileOutputStream(FileName);
        byte[] data = "fasfsfasef".getBytes();

        for (int i = 0; i < data.length; i++){
            os.write(i);
        }
        os.flush();
        os.close();
    }



    // 문제 2) 사용자 입력을 통해서 파일의 원본 파일의 이름과 사본 파일의 입력을 받고, 원본 파일의 내용을 사본 파일에 저장하는 프로그램을 작성하세요
    // 파일명 : quiz2.txt
    // 원본 내용 : network programming
    public void quiz2() {
        System.out.println("\n----- quiz2 ------\n");


    }





    // 문제 3) 사용자 입력을 통해서 파일의 원본 파일의 이름과 사본 파일의 이름을 입력받고, 원본 파일의 내용을 사본 파일에 저장하는 프로그램을 작성하세요
    // 원본 파일명 : quiz3.txt
    // 원본 내용 : network programming quiz3
    // 사본 파일명 : quiz3_copy.txt



}
