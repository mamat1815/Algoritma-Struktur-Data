package Tugas_7_NotasiPostfix;

import java.util.Stack;

public class NotasiPostfix {
    
    public static void main(String[] args) {
        String postfix = "5,2,*,3,0,^,+,9,-,8,+";

        String[] postfixArray = postfix.split(",");

        for (int i = 0; i < postfixArray.length; i++) {
            System.out.print(postfixArray[i] + " ");
        }

        
        double result = evaluasiPostfix(postfix);

        if (!Double.isNaN(result)) {
            System.out.println("\nEvaluasi notasi postfix " + postfix);
            System.out.println("Hasil akhir: " + result);
        } else {
            System.out.println("\nEvaluasi notasi postfix " + postfix);
            System.out.println("Notasi postfix tidak valid");
        }
        
        
        
    }

    private static double evaluasiPostfix(String postfix) {
        StackArray<Double> stack = new StackArray<>();

        String[] postfixArray = postfix.split(",");

        for (String x : postfixArray) {
            if (stack.isOperator(x)) {
                double operand2 = (double) stack.pop();
                double operand1 = (double) stack.pop();

                double result = stack.operation(operand1, operand2, x);
                stack.push(result);
            } else {
                stack.push(Double.parseDouble(x));
            }
        }

        if (stack.empty() || stack.size() > 1) {
            return Double.NaN;
        }

        return (double) stack.pop();
    }

 

}
