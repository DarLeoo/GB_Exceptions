package task_4;

import java.util.Scanner;

public class InputUtils {
    public static String getNotEmptyInput(){
        Scanner scanner = new Scanner(System.in);
        String result = "";
        try {
            System.out.println("Введите что-то: ");
            result = scanner.nextLine();
            if (result.isEmpty()){
                throw new Exception();}
        }catch (Exception e){
            System.out.println("Пустые строки вводить нельзя");
        }
        return result;
    }
}
