package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public boolean checkFullName(String fullName) {
        String[] splitFullName = fullName.split(" ");
        if (splitFullName.length == 3) {
            Pattern pattern = Pattern.compile("[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]");
            Matcher matcher = pattern.matcher(fullName);
            return !matcher.find();
        } else {
            throw new IllegalArgumentException("Некорректное количество слов в полном имени, попробуйте снова\n");

        }
    }

    public boolean checkNumber(String number) {
        if (number.length() == 11){
                Pattern phonePattern = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{3,7}$");
                Matcher phoneMatcher = phonePattern.matcher(number);
                return !phoneMatcher.find();

        }else {
            throw new IllegalArgumentException("Невереный формат номера телефона, номер телефона состоит из 11 чисел \n");
        }
    }

    public boolean checkDate(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            throw new ParseException("Введна неверная дата, пожалуйста, введите дату в формате dd.MM.yyyy\n", 0);
        }
    }

    public boolean checkGender(String gender) {
        if (gender.length() == 1 ) {
            return gender.equals("f") || gender.equals("m");
        }
        else throw new IllegalArgumentException("Введено невереное количество символов, введите 'f' или 'm'\n");
    }
}
