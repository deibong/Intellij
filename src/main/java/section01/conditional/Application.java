package section01.conditional;

public class Application {

    public static void main(String[] args) {

        /* 설명.
         *  여기서 모든 테스트를 진행할 클래스들은 클래스 네이밍 규칙에 어긋나긴 하지만
         *  학습 순서를 보기좋게 정렬하기 위해 지은 이름들이다.
         *  모든 메소드는 해당 메소드(main()) 내에서 호출할 것이기 때문에
         *  하나의 메소드를 확인 후 다음 메소드를 호출하여 다음 것을 확인할 때 주석처리 하여 매번 실행되지 않게 한다.
         */

        A_if a = new A_if();

//        a.testSimpleIfStatement();
        a.testnestIfStatement();
    }
}
