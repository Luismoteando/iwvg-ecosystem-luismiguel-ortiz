package es.upm.miw.iwvg.ecosystem.practica;

public class User {

    private int number;

    private String firstName;

    private String secondName;

    private String familyName;

    public User(int number, String firstName, String secondName, String familyName) {
        this.number = number;
        this.firstName = this.format(firstName);
        this.secondName = this.format(secondName);
        this.familyName = this.format(familyName);
    }

    private String format(String string) {
        return string.trim().substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public String fullName() {
        return this.firstName + " " + this.secondName + " " + this.familyName;
    }

    public String upperCaseFullName() {
        return this.fullName().toUpperCase();
    }

    public String initials() {
        return this.firstName.substring(0, 1) + "." + this.secondName.substring(0, 1) + ".";
    }

    public int getNumber() {
        return this.number;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public String getFamilyName() {
        return this.familyName;
    }
}
