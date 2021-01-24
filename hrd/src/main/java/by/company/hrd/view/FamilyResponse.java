package by.company.hrd.view;

public class FamilyResponse {
    private int personNumber;
    private String firstName;
    private String surName;
    private String patronymic;
    private String firstNameChild;
    private String surNameChild;
    private String patronymicChild;

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFirstNameChild() {
        return firstNameChild;
    }

    public void setFirstNameChild(String firstNameChild) {
        this.firstNameChild = firstNameChild;
    }

    public String getSurNameChild() {
        return surNameChild;
    }

    public void setSurNameChild(String surNameChild) {
        this.surNameChild = surNameChild;
    }

    public String getPatronymicChild() {
        return patronymicChild;
    }

    public void setPatronymicChild(String patronymicChild) {
        this.patronymicChild = patronymicChild;
    }
}
