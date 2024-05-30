// public class NotasiPostfix {
//     public static void main(String[] args) {
//         String postfix = "7,5,+,9,3,-,/"; 

//         double result = evaluasiPostfix(postfix);
//         if (!Double.isNaN(result)) {
//             System.out.println("Evaluasi notasi postfix " + postfix);
//             System.out.println("Hasil akhir: " + result);
//         } else {
//             System.out.println("Evaluasi notasi postfix " + postfix);
//             System.out.println("Notasi postfix tidak valid");
//         }
//     }

//     public static double evaluasiPostfix(String postfix) {
//         StackArray<Double> stack = new StackArray<>();

//         String[] y = postfix.split(",");

//         for (String x : y) {
//             if (stack.isOperator(x)) {
//                 if (stack.empty()) {
//                     return Double.NaN;
//                 }
//                 double operand2 = (double) stack.pop();
//                 if (stack.empty()) {
//                     return Double.NaN; 
//                 }
//                 double operand1 = (double) stack.pop();
//                 double result = stack.operation(operand1, operand2, x);
//                 stack.push(result);
//             } else {
//                 try {
//                     double operand = Double.parseDouble(x);
//                     stack.push(operand);
//                 } catch (NumberFormatException e) {
//                     return Double.NaN; 
//                 }
//             }
//         }

//         if (stack.empty() || stack.elementCount > 1) {
//             return Double.NaN;
//         }

//         return (double) stack.pop();
//     }
// }

public class NotasiPostfix {
    public static void main(String[] args) {
        String postfix = "7,5,+,9,3,-,/"; // Notasi postfix yang akan dievaluasi

        double result = evaluasiPostfix(postfix);
        if (!Double.isNaN(result)) {
            System.out.println("Evaluasi notasi postfix " + postfix);
            System.out.println("Hasil akhir: " + result);
        } else {
            System.out.println("Evaluasi notasi postfix " + postfix);
            System.out.println("Notasi postfix tidak valid");
        }
    }

    public static double evaluasiPostfix(String postfix) {
        StackArray<Double> stack = new StackArray<>();

        String[] tokens = postfix.split(",");

        for (String token : tokens) {
            if (stack.isOperator(token)) {
                if (stack.empty()) {
                    return Double.NaN;
                }
                double operand2 = (double) stack.pop();
                if (stack.empty()) {
                    return Double.NaN;
                }
                double operand1 = (double) stack.pop();
                double result = stack.operation(operand1, operand2, token);
                stack.push(result);
            } else {
                double operand = Double.parseDouble(token);
                stack.push(operand);
            }
        }

        if (stack.empty() || stack.elementCount > 1) {
            return Double.NaN;
        }

        return (double) stack.pop();
    }
}