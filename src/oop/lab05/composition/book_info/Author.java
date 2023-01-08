package oop.lab05.composition.book_info;

public class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
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

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Author[name = ").append(name)
                .append(", email = ").append(email)
                .append("]");
        return description.toString();
    }
}
