package section01.conditional;

import java.util.Scanner;

public class D_switch {
    /* 수업목표. switch문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
    /* 필기.
     *  [switch문 표현식 #1]
     *  switch(비교할변수) {
     *      case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
     *      case 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break;
     *      default : case에 모두 해당하지 않는 경우 실행할 구문; break;
     *  }
     *
     * 필기.
     *  [switch문 표현식 #2]
     *  switch(비교할변수) {
     *      case 비교값1 : 비교값1과 일치하는 경우 실행할 구문;
     *      break;
     *      case 비교값2 : 비교값2와 일치하는 경우 실행할 구문;
     *      break;
     *      default : case에 모두 해당하지 않는 경우 실행할 구문;
     *      break;
     *  }
     * */

    /* 필기.
     *  여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else-if와 유사하다.
     *  따라서 일부 호환이 가능하다.
     *  하지만, switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다.
     *  실수와 논리는 비교할 수 없다.
     *  또한 정확하게 일치하는 경우만 비교할 수 있으며 대소비교를 할 수 없다는게 차이점이다.
     *  case절에는 변수를 사용하지 못한다. (값만 비교 가능)
     *  또한, 문자열 비교는 jdk 1.7 이상부터 가능하다.
     * */

    /* 필기.
     *  정수 두 개와 연산 기호 문자를 입력 받아서
     *  두 숫자의 연산 결과를 출력해보는 간단한 계산기 만들기
     * */
    public void testSimpleSwitchStatement() {

        // Step1. 사용자 입력
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 입력 : ");
        int first = sc.nextInt();

        System.out.print("두 번째 정수 입력 : ");
        int second = sc.nextInt();

        System.out.print("연산 기호(+, -, *, /, %) 입력 : ");
        char operator = sc.next().charAt(0);

        int result = 0;

        // Step2. 연산
        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
            default :
                System.out.println("올바르지 못한 값을 입력했습니다.");
                break;
        }
        // Step3. 연산 결과 출력
        System.out.println(first + " " + operator + " " + second + " = " + result);
    }

    /* 수업목표. switch문 내의 break문에 대해 흐름을 이해하고 적용할 수 있다. */
    /* 필기. switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트 */
    /* 필기.
     *  1. JDK 1.7 이상부터 switch문을 이용하여 문자열을 비교할 수 있다.
     *  2. break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다.
     * */
    public void testSwitchVendingMachine() {
        /* 필기. switch문을 이용한 간단한 자판기 */
        System.out.println("====== OhGiraffers vending machine ======");
        System.out.println("  사이다   콜라   환타   바카스  핫식스  ");
        System.out.println("=========================================");
        System.out.print("음료를 선택해주세요 : ");

        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();

        int price = 0;

        switch (selectedDrink) {
            case "사이다" :
                price = 500;
                break;
            case "콜라" :
                price = 700;
                break;
            case "환타" :
                price = 1000;
                break;
            case "바카스" :
                price = 600;
                break;
            case "핫식스" :
                price = 1200;
                break;
            default :
                System.out.println("잘못 입력했습니다.");
                break;
        }

        System.out.println(selectedDrink + "를 선택하셨습니다.");
        System.out.println(price + "원을 투입해주세요!");

    }
}
