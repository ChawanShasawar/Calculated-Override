public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(5,7));

        System.out.println(calculator.add(5.1, 4.1));

        int[] numbers = {3,6,9,12,15};
        System.out.println(calculator.add(numbers));
    }
}