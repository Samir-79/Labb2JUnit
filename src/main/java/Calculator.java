public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }

    public int mult(int a, int b){
        return a*b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int div(int a, int b){
        return a/b;
    }


    public static void main(String[] args) {

        System.out.println("2 + 2 is " + new Calculator().add(2, 2) + ".");
        System.out.println("2 * 2 is " + new Calculator().mult(2,2)+".");
        System.out.println("2 - 2 is" + new Calculator().sub(2,2)+".");
        System.out.println("2 / 2 is" + new Calculator().div(2,2)+".");

    }
}



