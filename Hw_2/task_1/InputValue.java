package task_1;

import java.util.Scanner;

public class InputValue {
    public static float getFloatInput(){

        Scanner scanner = new Scanner(System.in);
        float result = 0;
        boolean flag = false;
        while (!flag){
            try {
                System.out.println("Введите дробное число: ");
                result = scanner.nextFloat();
                flag = true;
            } catch (Exception e){
                System.out.println("Введенно некорректно значение ");
                scanner.next();
            }
        }
        return result;
    }



}
