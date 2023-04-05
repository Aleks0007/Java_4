import java.util.Scanner;
import java.util.Stack;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Double> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        double currentResult = 0.0;

        System.out.print("Введите число: ");
        String input = scanner.nextLine();
        try {
            double num = Double.parseDouble(input);
            operands.push(num);
            currentResult = num;
        } catch (NumberFormatException e) {
            System.out.println("Некорректное число");
        }

        while (true) {
            System.out.print("Введите операцию (+, -, *, /), '<' для отмены последней операции или 'exit' для завершения: ");
            input = scanner.nextLine();

            if (input.equals("exit")) {
                scanner.close();
                break;
            }

            if (input.equals("<") && operands.size() > 1) {
                operands.pop();
                currentResult = operands.peek();
                System.out.println("ответ: " + currentResult);
                continue;
            }

            if (input.length() == 1 && (input.charAt(0) == '+' || input.charAt(0) == '-' || input.charAt(0) == '*' || input.charAt(0) == '/')) {
                char operator = input.charAt(0);
                operators.push(operator);
            } else {
                System.out.println("Некорректная операция");
                continue;
            }

            System.out.print("Введите число: ");
            input = scanner.nextLine();
            try {
                double num = Double.parseDouble(input);

                switch (operators.peek()) {
                    case '+':
                        currentResult += num;
                        break;
                    case '-':
                        currentResult -= num;
                        break;
                    case '*':
                        currentResult *= num;
                        break;
                    case '/':
                        currentResult /= num;
                        break;
                }
                operands.push(currentResult);
                System.out.println("ответ: " + currentResult);
            } catch (NumberFormatException e) {
                System.out.println("Некорректное число");
            }
        }
    }
}