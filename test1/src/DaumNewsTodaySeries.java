import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class DaumNewsTodaySeries {
    public static void main(String[] args){
        System.out.println("\n다음 뉴스의 오늘의 연재 출력하기\n");

        // 문제 1) jsoup을 사용하여 다음 뉴스의 오늘의 연재 부분을 파싱하여 화면에 출력하는 프로그램을 작성하세요.

        // 출력 형태 = 기사 제목, 기사 링크 2가지 내용을 출력하세요.
        // 실행 순서
        // 1. url 설정
        // 2. Document 객체 생성
        // 3. Connection.Response 객체 생성 및 Jsoup.connect() 로 지정한 url에 접속
        // 4. 받아온 데이터를 Document 객체로 변환
        // 5. 가져올 데이터가 있는 태그 중 가장 가까운 조상 태그 가져오기
        // 6. select()를 사용하여 원하는 태그 가져오기
        // 7. 마지막에 선택한 태그에서 기사 제목 및 기사 링크 가져오기


        String url = "https://news.daum.net/";

        Document html = null;

        try{
            // 지정한 url에 접속하여 가져오기
            Connection.Response res = null;
            res = Jsoup.connect(url).method(Connection.Method.GET).execute();
            // 가져온 데이터를 Document 타입으로 변환하여 저장
            html = res.parse();
        }
        catch (IOException e){
            System.out.println("Jsoup로 데이터 파싱 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    Elements today_series = html.select(".item_todayseries");

    Elements item_series = today_series.select(".item_todayseries");
        System.out.println(item_series.size());

    for(int i = 0; i < item_series.size(); i++){
        Element item = item_series.get(i);

        Element box_g = item.select(".box_g").first();
        Element cont_thumb = item.select(".cont_thumb").first();
        Element strong = cont_thumb.select(".tit_g").first();
        Element aTag = strong.select(".link_txt").first();
        String title = aTag.text();
        String link = aTag.attr("href");
        System.out.println("기사 제목 : " + title);
        System.out.println("기사 링크 : " + link);



//    Element newsATag = item.select("tit_g").first();
//    String newsTitle = newsATag.text();
//    String newsLink = newsATag.attr("href");

//        System.out.println("기사 제목 : " + newsTitle);
//        System.out.println("기사 링크 : " + newsLink);

        System.out.println("----------------------\n");
    }




    }
}
