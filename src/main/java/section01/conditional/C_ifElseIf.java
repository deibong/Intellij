package section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {
    /* 수업목표. if-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
    /* 필기.
     *  [if-else-if문 표현식]
     *  if(조건식 #1) {
     *      조건식 #1이 true일 때 실행할 명령문;
     *  } else if(조건식 #2) {
     *      조건식 #1이 false이고, 조건식# 2가 true일 때 실행할 명령문;
     *  } else {
     *      위의 조건 2개가 모두 거짓인 경우 실핼할 명령문;
     *  }
     * */

    /* 필기.
     *  if-else-if문은 조건식1의 결과 값이 참(true)이면 if { } 안에 있는 코드를 실행하고,
     *  조건식1이 false이면 조건식2를 확인하여 참(true)이면 else if { } 안에 있는 코드를 실행한다.
     *  조건식1, 2의 결과 값이 모두 거짓(false)이면  else { } 안에 있는 코드를 실행한다.
     * */

    /* 설명.여러 개의 조건을 제시하여 그 중 한 가지를 반드시 실행시키고 싶은 경우 사용한다. */

    /* 설명.
     *  금도끼 은도끼 동화에서 산신령이 어떤 도끼가 나무꾼의 도끼인지를 물어보는 시나리오대로
     *  코드를 작성하고 실행하보자!
     * */
    public void testSimpleIfElseIfStatement() {

        System.out.println("======================================================");
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다!");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다...");

        System.out.println("======================================================");
        System.out.print("산신령 : 어느 도끼가 너의 도끼이냐? (1. 금도끼, 2. 은도끼, 3.쇠도끼) : ");

        Scanner sc = new Scanner(System.in);

        int axe = sc.nextInt();
        System.out.println("======================================================");

        if(axe == 1) {
            System.out.println("이런 거질맛쟁이! 너에게는 아무런 도끼도 줄 수 없구나!! 이 욕심쟁이야!");
        } else if(axe == 2) {
            System.out.println("욕심이 과하지는 않지만, 그래도 넌 거짓말을 하고 있구나! 어서 썩 사라지거라!");
        } else {
            System.out.println("오호~ 정직하구나~ 여기 있는 금도끼, 은도끼, 쇠도끼를 다 가져가거라!");
        }

        System.out.println("===========================(END)===========================");
        System.out.println("그리하야... 산신령은 다시 연못으로 사라지고 말았다...");
    }

    /* 수업목표. 중첩된 if-else-if문의 흐름을 이해하고 적용할 수 있다. */
    /* 필기. 중첩된 if-else-if 문 실행 흐름 확인 */
    /* 설명. if-else-if 문 안에서 또 다른 조건을 사용하여 if or if-else or if-else-if 문을 사용할 수 있다. */

    /* 필기.
     *  OhGiraffers 대학의 송xx 교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
     *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
     *  60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
     *  추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
     *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
     * */
    public void testNestedIfElseIfStatement() {

        // Step #1 : 사용자 입력
        Scanner sc = new Scanner(System.in);

        System.out.println("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.println("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();

        String grade = "";

        // Step #2 : 점수 계산
        if(point >= 90) {
            grade = "A";

            if(point >= 95) {
                grade += "+";
            }

        } else if(point >= 80) {
            grade = "B";

            if(point >= 85) {
                grade += "+";
            }
        } else if(point >= 70) {
            grade = "C";

            if(point >= 75) {
                grade += "+";
            }
        } else if(point >= 60) {
            grade = "D";

            if(point >= 65) {
                grade += "+";
            }
        } else {
            grade = "F";
        }

        // Step #3 : 학생 이름, 점수 및 학점 출력

        System.out.println(name + "학생의 점수는 " + point + "이고, 등급은 " + grade + "입니다.");
        System.out.println("프로그램을 종료합니다.");

    }
}
