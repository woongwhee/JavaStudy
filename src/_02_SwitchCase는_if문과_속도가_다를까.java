public class _02_SwitchCase는_if문과_속도가_다를까 {

    private static String[] testArray = {"hi", "Hi", "Hello", "Bye", "Bad", "Good"};

    public static void switchStringTest(String str, StringBuffer sb) {
        int b = 0;
        switch (str) {
            case "hi": b = 1; break;
            case "Hi": b = 2; break;
            case "Hello": b = 3; break;
            case "Bye": b = 4; break;
            case "Bad": b = 5; break;
            case "Good": b = 6; break;
            default: b = 7; break;
        }
        sb.append(b);
    }

    public static void switchPrimitivesTest(int i, StringBuffer sb) {
        int b = 0;
        switch (i) {
            case 0: b = 1; break;
            case 1: b = 2; break;
            case 2: b = 3; break;
            case 3: b = 4; break;
            case 4: b = 5; break;
            case 5: b = 6; break;
            default: b = 7; break;
        }
        sb.append(b);
    }

    public static void ifStringTest(String str, StringBuffer sb) {
        int b = 0;
        if (str.equals("hi")) {
            b = 1;
        } else if (str.equals("Hi")) {
            b = 2;
        } else if (str.equals("Hello")) {
            b = 3;
        } else if (str.equals("Bye")) {
            b = 4;
        } else if (str.equals("Bad")) {
            b = 5;
        } else if (str.equals("Good")) {
            b = 6;
        } else {
            b = 7;
        }
        sb.append(b);
    }

    public static void ifPrimitivesTest(int i, StringBuffer sb) {
        int b = 0;
        if (i == 0) {
            b = 1;
        } else if (i == 1) {
            b = 2;
        } else if (i == 2) {
            b = 3;
        } else if (i == 3) {
            b = 4;
        } else if (i == 4) {
            b = 5;
        } else if (i == 5) {
            b = 6;
        } else {
            b = 7;
        }
        sb.append(b);
    }

    public static void stringTest() {
        System.out.println("문자열 테스트 ");
        StringBuffer sb = new StringBuffer();
        System.out.println("SwitchCase ");
        long s = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int input = (int) (Math.random() * 6); // 0~5 사이의 정수
            switchStringTest(testArray[input], sb);
        }
        long e = System.currentTimeMillis();
        System.out.println("time: " + (e - s) + "ms");
        // 결과 초기화
        sb.setLength(0);

        System.out.println("IfStatement ");
        s = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int input = (int) (Math.random() * 6); // 0~5 사이의 정수
            ifStringTest(testArray[input], sb);
        }
        e = System.currentTimeMillis();
        System.out.println("time: " + (e - s) + "ms");
    }

    public static void primitivesTest() {
        System.out.println("원시 타입 테스트 ");
        StringBuffer sb = new StringBuffer();
        System.out.println("SwitchCase ");
        long s = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int input = (int) (Math.random() * 6); // 0~5 사이의 정수
            switchPrimitivesTest(input, sb);
        }
        long e = System.currentTimeMillis();
        System.out.println("time: " + (e - s) + "ms");
        // 결과 초기화
        sb.setLength(0);

        System.out.println("IfStatement ");
        s = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int input = (int) (Math.random() * 6); // 0~5 사이의 정수
            ifPrimitivesTest(input, sb);
        }
        e = System.currentTimeMillis();
        System.out.println("time: " + (e - s) + "ms");
    }

    public static void main(String[] args) {
        stringTest();
        primitivesTest();
        /**
         * 원시타입의 경우 10ms와 8ms정도로 큰 차이가 나지 않지만
         * 문자열의 경우 3배까지 성능차이가 난다.
         */
    }
}
