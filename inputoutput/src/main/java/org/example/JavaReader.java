package org.example;

import java.io.FileReader;
import java.io.Reader;

public class JavaReader {

    public void read1() throws Exception {
        Reader reader = new FileReader("C:\\java404\\test.txt");
        int readData; // 읽어온 문자를 저장할 변수

        // 반복문을 통해서 문자를 계속 읽어옴
        while (true){
            // read() 메소드를 사용하여 하나의 문자를 파일에서 읽어옴
            readData = reader.read();
            if (readData == -1) {
                break;
            }
            // 읽어온 데이터
            System.out.print((char)readData);
        }

        reader.close();
    }


        // read(char[] cBuff, int off, int len) 사용하기
        public void read3(String fileName) throws Exception {
        // fileReader 를 통해서 파일 열기
        Reader reader = new FileReader(fileName);
        int readCharNo; // 읽어온 문자의 수를 저장하기 위한 변수
        char[] cbuff = new char[4]; // 파일에서 읽어온 데이터를 저장할 char[] 배열
            //  read(char[] cBuff, int off, int len) 을 사용하여 파일에서 데이터를 읽어와서 지정한 배열에 저장 시 offset으로
            // 지정한 위치에 length 크기만큼 저장함
        readCharNo = reader.read(cbuff, 1, 2);

        for(int i = 0; i < cbuff.length; i++ ){
            System.out.println(cbuff[i]);

        }
        reader.close();

    }

    public void read2(String fileName) throws Exception{
        // reader 를 통해서 파일 열기
        Reader reader = new FileReader(fileName);
        int readCharNo; // 읽어온 문자의 수를 저장할 변수
        char[] cBuff = new char[2]; // 읽어온 데이터를 저장할 char[] 배열
        String data = ""; // 읽어온 데이터를 문자열로 출력하기 위한 변수


        // 반복문을 통해서 파일의 내용을 계속 읽어옴
        while (true){
            // read(char[] cBuff) 를 사용하여 지정한 char[] 배열의 크기만큼 파일에서 문자열을 읽어옴
            readCharNo = reader.read(cBuff);

            if(readCharNo == -1){ break;} // 더이상 읽어올 데이터가 없으면 종료

            data += new String(cBuff, 0, readCharNo); //

        }

        System.out.println(data);
        reader.close();

    }



}
