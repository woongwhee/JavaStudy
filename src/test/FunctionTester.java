package test;

public class FunctionTester {
    public void testPerformance(testable function1, testable function2, int iterations) {
        // function1의 실행 시간 측정
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            function1.execute();
        }
        long endTime = System.nanoTime();
        long duration1 = (endTime - startTime) / 1_000_000; // 밀리초로 변환

        // function2의 실행 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            function2.execute();
        }
        endTime = System.nanoTime();
        long duration2 = (endTime - startTime) / 1_000_000; // 밀리초로 변환

        // 결과 출력
        System.out.println("Function 1 duration: " + duration1 + " ms");
        System.out.println("Function 2 duration: " + duration2 + " ms");
    }

    private int[]setIntRandomInput(int iterations){

        int[] result=new int[iterations];
        for (int i = 0; i < iterations; i++) {
            result[i]= (int) (Math.random()*5000);
        }
        return result;
    }
    public void testRandomInputPerformance(inputTestable<Integer> function1, inputTestable<Integer> function2, int iterations) {
        int[] input = setIntRandomInput(iterations);

        // function1의 실행 시간 측정
        System.out.println("function1 start");
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            function1.setInput(input[i]);
            function1.execute();
        }
        long endTime = System.nanoTime();
        long duration1 = (endTime - startTime) / 1_000_000; // 밀리초로 변환
        System.out.println("function2 start");
        // function2의 실행 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            function2.setInput(input[i]);
            function2.execute();
        }
        endTime = System.nanoTime();
        long duration2 = (endTime - startTime) / 1_000_000; // 밀리초로 변환

        // 결과 출력
        System.out.println("Function 1 duration: " + duration1 + " ms");
        System.out.println("Function 2 duration: " + duration2 + " ms");
    }


}
