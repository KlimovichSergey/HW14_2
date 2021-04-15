package hw;


import java.util.function.BinaryOperator;


public class Main {


    public static void main(String[] args) {

        BinaryOperator<Integer> addition = Integer::sum;
        System.out.println(" Addition " + addition.apply(6,8));
        BinaryOperator<Integer> subtraction = (x,y)-> x-y;
        System.out.println(" Subtraction " + subtraction.apply(6,8));
         BinaryOperator<Integer> multiplication = (x,y)-> x*y;
        System.out.println(" Multiplication " + multiplication.apply(6,8));
        BinaryOperator<Integer> sum = Integer::sum;
        Integer result = sum.apply(6,8);
        double sqrt = Math.sqrt(result);
        System.out.println(" Sqrt " + sqrt);
        BinaryOperator<Integer> and = (x,y)-> x&y;
        System.out.println(" add " + and.apply(6,8));

    }
}
