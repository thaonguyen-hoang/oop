package oop.lab06.inheritance.school_info;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Student[").append(super.toString())
                .append(", program = ").append(program)
                .append(", year = ").append(year)
                .append(", fee = ").append(fee).append("]");
        return description.toString();
    }
}
