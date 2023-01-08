package oop.lab10.collections.phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student student) {
        if (!phoneBook.containsKey(student.getPhone())) {
            phoneBook.put(student.getPhone(), student);
        }
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook.values()) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastname) {
        for (Student student : phoneBook.values()) {
            if (student.getLastname().equals(lastname)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        if (phoneBook.containsKey(phone)) {
            return phoneBook.get(phone);
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
