public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);  // b = 0
            int c = calc.devide.apply(a, b);  // деление на 0 приведёт к вызову ArithmeticException
            calc.println.accept(c);
        } catch (ArithmeticException exception) {  // ловим исключение и выводим сообщение об ошибке
            System.out.println("Ошибка - деление на 0!");
        }
    }
}
