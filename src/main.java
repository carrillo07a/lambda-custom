import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] myNumberList = new int[] {1,2,3,4,5,6,7,8,9};

        System.out.println("Suma con lambda custom");
        int totalSum = toolsHelper.reduceOperationCustom(myNumberList, (a, b) -> a + b, 0);
        System.out.println("Total de la Suma con lambda Custom: " + totalSum);

        System.out.println("Multiplicacion con lambda custom");
        int totalMul = toolsHelper.reduceOperationCustom(myNumberList, (a, b) -> a * b, 1);
        System.out.println("Total de la Multiplicacion con lambda Custom: " + totalMul);

        System.out.println("Java Lambda Nativo Suma");
        int sumMethodJava = Arrays.stream(myNumberList).reduce(0, (a, b) -> a + b);
        System.out.println("Total Suma Java Stream: " + sumMethodJava);

        System.out.println("Java Lambda Nativo Multiplicacion");
        int mulMethodJavaLambda = Arrays.stream(myNumberList).reduce(1, (a, b) -> a * b);
        System.out.println("Total Multiplicacion Java Stream: " + mulMethodJavaLambda);
    }
}