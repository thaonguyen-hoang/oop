package oop.lab05.composition.book_info2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Author[name = ").append(name)
                .append(", email = ").append(email)
                .append(", gender = ").append(gender)
                .append("]");
        return description.toString();
    }
}
