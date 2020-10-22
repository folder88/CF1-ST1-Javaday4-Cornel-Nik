package Cornel;

public class Person {

    String firsName;
    String lastName;

    Person( String name, String lastname){

        this.firsName = name;
        this.lastName = lastname;
    }

    public void getFullName(){

        System.out.println(this.firsName + " " + this.lastName);
    }
}
