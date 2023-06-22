package Controller;

import Model.User;
import View.Validator;
import java.text.ParseException;
import java.util.HashMap;

public class UserController {


    protected User user;
    protected Validator validator;


    public UserController(){
        user = new User();
        validator = new Validator();
    }

    public User getEnter(){
        return user;
    }


    public void setFullNameUser(String fullName) throws Exception {
        if (validator.checkFullName(fullName)) {
                String[] parsFullNameValue = fullName.split(" ");
                user.surName = parsFullNameValue[0];
                user.name = parsFullNameValue[1];
                user.patronymic = parsFullNameValue[2];
        }else throw new ParseException("ФИО должно содержать только буквы\n", 0);
    }


    public void setNumber(String number) throws ParseException{
        if (validator.checkNumber(number)){
            try {
                user.phoneNumber = Long.parseLong(number);
            }catch (NumberFormatException e){
                throw new ParseException("Некорректно введен номер, пожалуйста, повторите ввод\n", 0);
            }
        }
    }

    public void setBirthday(String birthday) throws ParseException {
        if (validator.checkDate(birthday)){
                user.birthday = birthday;
        }
    }

    public void setGender(String gender) throws Exception {
        if (validator.checkGender(gender)){
            HashMap<String, String> map = new HashMap<>();
            map.put("f", "female");
            map.put("m", "male");
            try {
                user.gender = map.get(gender);
            }catch (Exception e){
                System.out.println("Ошибка в гендере");
                System.out.println(e.getMessage());
            }
        }
        else throw new Exception("Некорректное значение, требуется ввести f - женщина или m - мужчина\n");
    }

}
