package section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    /* 수업목표. if-else문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
    /* 필기.
     *  [if-else문 표현식]
     *  if(조건식) {
     *      조건식이 true일 때 실행할 명령문;
     *  } else {
     *      조건식이 false일 때 실행할 명령문;
     *  }
     * */

    /* 필기.
     *  if문은 조건식의 결과 값이 참(true)이면 if { } 안에 있는 코드를 실행하고,
     *  조건식의 결과 값이 거짓(false)이면  else { } 안에 있는 코드를 실행한다.
     * */
    public void testSimpleIfElseStatement() {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수 하나를 입력하세요 : ");
        int num = sc.nextInt();

        if(num % 2 != 0) {
            System.out.println("입력하신 정수는 홀수입니다.");
        } else {
            System.out.println("입력하신 정수는 짝수입니다.");
        }

        System.out.println("프로그램을 종료합니다.");
    }

    /* 수업목표. 중첩된 if-else문의 흐름을 이해하고 적용할 수 있다. */
    /* 필기. 중첩된 if-else 문 실행 흐름 확인 */
    /* 설명. if-else 문 안에서 또 다른 조건을 사용하여 if-else 문을 사용할 수 있다. */

    /* 필기.
     *  숫자를 하나 입력 받아 양수이면 "입력하신 숫자는 양수입니다." 출력하고,
     *  음수이면 "입력하신 숫자는 음수 입니다." 출력
     *  단, 0이면 "0입니다" 라고 출력하세요
     *  조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
     * */
    public void testNestedIfElseStatement() {

        // Step #1 : 사용자로부터 정수 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세요.");
        int num = sc.nextInt();

        // Step #2 : 부호 판별하기
        if(num != 0) {
            if(num > 0) {
                System.out.println("입력하신 숫자는 양수입니다.");
            }
            else {
                System.out.println("입력하신 숫자는 음수입니다.");
            }
        } else {
            System.out.println("입력하신 숫자는 0입니다.");
        }

        // Step #3 : 프로그램 종료하기
        System.out.println("프로그램을 종료합니다.");
    }
}
