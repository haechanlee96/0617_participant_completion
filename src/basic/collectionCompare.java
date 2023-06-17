package basic;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class collectionCompare {
    public static void main(String[] args) {

        // list 를 활용하여 배열문 저장해보기
        System.out.println("배열 종류를 입력하세요. >enter");
        System.out.println("제목을 입력하세요. >enter");
        System.out.println("요일 : 책제목 , 형식으로 계획을 짜보세요.");

        Scanner sc = new Scanner(System.in);
        String arrayName = sc.nextLine();
        String listName = sc.nextLine();

        ArrayList<String> strList = new ArrayList<>();
        // 동적 배열이기 때문에 길이를 정하지 않는다. ()
        // 특정 조건을 채우는 것 > for , 참을 채우며 반복을 하는 것 > while >>여기서는 while
        while(true){
            // 사용자가 입력한 것이 계속 돌면서, false를 만났을 때 break; 로 탈출
            // i와 같은 int 변수 사용 x > 입력한 텍스트만 돌기 때문에

            String text = sc.nextLine();
            if(Objects.equals(text,"끝")){
                break; // if 문은 종료를 위해서만
            }
            strList.add(text); // >> while문에 대한 텍스트가 적용
        }
        System.out.println("["+ arrayName + " " + listName + "]");
        for (int i = 0; i < strList.size(); i++) {
            int number = i +1;
            System.out.println(number + "." + strList.get(i));
        }

    }

}
