public class App {
    public static void main(String[] args) {
        double num1 = 20.00d; 
        double num2 = 80.00d; 
        double result = (num1 + num2) * 100.00; 
        result = result % 40.00d; 
        boolean bool = result == 0 ? true : false; 
        System.out.println(bool);

        if(!bool) {
            System.out.println("Got some remainder");
        }
    }
}
