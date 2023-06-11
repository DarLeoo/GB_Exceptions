package task_1;
public class Main {
    //Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    static void exceptionArithmeticException(){
       int num_1 = 1;
       int num_2 = 0;
       int result = num_1 / num_2;
      }

    static void exceptionNullPointerException(){
       String name = null;
       name.length();
    }



    static void exceptionArrayIndexOutOfBoundsException(){
       int[] array = {1, 2, 3};
       int num = array[5];
    }

    public static void main(String[] args) {
        try {
            exceptionArithmeticException();
        } catch (ArithmeticException e){
            System.out.println("Исключение " + e);}

        try {
            exceptionNullPointerException();
        }catch (NullPointerException e){
            System.out.println("Исключение " + e);
        }

        try {
            exceptionArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Исключение " + e);
        }
    }
}
