package com.github.ftchirou.yajl.pojo;

import com.github.ftchirou.yajl.annotations.JsonValue;

import java.util.ArrayList;
import java.util.List;

public class PersonWithDefinedValueForEnumConstant {
    public enum Gender { @JsonValue("male") MALE, @JsonValue("female") FEMALE }

    private String firstName;

    private String lastName;

    private Gender gender;

    private int age;

    private List<String> friends;

    public PersonWithDefinedValueForEnumConstant() {
        this.friends = new ArrayList<>();
    }

    public PersonWithDefinedValueForEnumConstant(String firstName, String lastName, Gender gender, int age, List<String> friends) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.friends = friends;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
}
