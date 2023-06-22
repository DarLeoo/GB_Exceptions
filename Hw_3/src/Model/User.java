package Model;

public class User {
    public String name;
    public String surName;
    public String patronymic;
    public String birthday;
    public long phoneNumber;
    public String gender;


     public User(String name, String surName, String patronymic, String birthday, long phoneNumber, String gender) {

        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }


    public User(){
        new User("","","","",0,"");
    }

    public String getFullData(){
        return "<"+surName+">" + "<"+name+">" + "<"+patronymic+">" + "<"+birthday+">" + " " + "<"+phoneNumber+">" + " " + "<"+gender+">" + "\n";
    }

    public String getSurName() {
        return this.surName;
    }


}

