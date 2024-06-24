package section01.conditional;

import java.util.Scanner;

public class A_if {

    /* 수업목표. if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
    /* 필기.
     *  [if문 표현식]
     *  if(조건식) {
     *      조건식이 true일 때 실행할 명령문;
     *  }
     * */

    /* 필기.
     *  조건식 : true or false가 나오는 연산식을 조건식이라고 한다.
     *  if문은 조건식의 결과 값이 참(true)이면 { } 안에 있는 코드를 실행하고,
     *  조건식의 결과 값이 거짓(false)이면 { } 안에 있는 코드를 무시하고 넘어감.
     *  주로 조건을 만족하는 경우에만 추가적인 명령을 실행하고자 할 때 사용함.
     * */

    /* 필기.
     *  정수 한 개를 입력 받아 그 수가 짝수이면 "입력하신 숫자는 짝수입니다." 라고 출력하고,
     *  짝수가 아니면 출력하지 않는 구문을 작성해보자
     *  단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
     * */

    public void testSimpleIfStatement() {

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 한 개를 입력하세요 : ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("입력하신 숫자는 짝수입니다");
        }

        System.out.println("프로그램을 종료합니다.");
    }



    /* 수업목표. 중첩된 if문의 흐름을 이해하고 적용할 수 있다. */
    /* 필기. 중첩된 if문 실행 흐름 확인 */
    /* 설명. if문 안에서 또 다른 조건을 사용하여 if문을 사용할 수 있다. */

    /* 필기.
     *  정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하여
     *  짝수이면 "입력하신 숫자는 양수이면서 짝수입니다." 라고 출력하고,
     *  둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문을 작성해보자
     *  단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
     * */

    public void testnestIfStatement() {

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 한 개를 입력하세요 : ");
        int num = sc.nextInt();

        /* 설명. 양수인지 조건 확인 */
        if (num > 0) {

            /* 설명. 만약 양수일 때, 짝수인지 조건 확인 */
            if (num % 2 == 0) {

                /* 설명. 짝수가 맞을 떄 출력할 출력구문 */
                System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
