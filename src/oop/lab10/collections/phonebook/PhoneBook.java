package oop.lab10.collections.phonebook;

public interface PhoneBook {
    void addPerson(Student student);
    Student searchByName(String name);
    Student searchByLastName(String lastname);
    Student searchByNumber(String phone);
    void deleteByNumber(String phone);
}
