package Model;

import java.util.Scanner;

public class ScannerOperation {

    public static String callScanner(String entryText){
        Scanner scanner = new Scanner(System.in);
        System.out.print(entryText);
        return scanner.nextLine();
    }
}
