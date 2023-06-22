package View;

import Model.ExampleInputText;
import Model.FileOperation;
import Model.ScannerAndInputText;

import java.util.Objects;

public class UserView {
    private final ScannerAndInputText scannerAndInputText;
    private final Controller.UserController userController;

    public UserView(){
        scannerAndInputText = new ScannerAndInputText();
        userController = new Controller.UserController();
    }
    public void run() {
        String input = " ";
        while (!Objects.equals(input, "exit")) {
            try {

                input = scannerAndInputText.enterText(ExampleInputText.fullNameMsg);
                userController.setFullNameUser(input);

                input = scannerAndInputText.enterText(ExampleInputText.dateMsg);
                userController.setBirthday(input);

                input = scannerAndInputText.enterText(ExampleInputText.phoneNumberMsg);
                userController.setNumber(input);

                input = scannerAndInputText.enterText(ExampleInputText.genderMsg);
                userController.setGender(input);

                try (FileOperation person = new FileOperation(userController.getEnter())) {
                    person.writePersonToFile();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    throw new Exception(e.getMessage());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.gc();
            }
        }
    }
}



