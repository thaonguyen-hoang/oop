package oop.lab06.inheritance.school_info;

public class TestPerson {
    private Person[] people;
    private int availIndex;

    public TestPerson() {
        people = new Person[10];
        availIndex = 0;
    }

    public void add(Person person) {
        people[availIndex] = person;
        availIndex++;
    }

    public Student[] filterStudent() {
        Student[] students = new Student[people.length];
        int index = 0;
        for (Person person : people) {
            if (person instanceof Student) {
                students[index] = (Student) person;
                index++;
            }
        }
        return students;
    }

    public Staff[] filterStaff() {
        Staff[] staffs = new Staff[people.length];
        int index = 0;
        for (Person person : people) {
            if (person instanceof Staff) {
                staffs[index] = (Staff) person;
                index++;
            }
        }
        return staffs;
    }

    public Student[] filterProgram(String program) {
        Student[] students = filterStudent();
        Student[] sameProgram = new Student[filterStudent().length];
        int index = 0;
        for (Student student : students) {
            if (student != null && student.getProgram().equals(program)) {
                sameProgram[index] = student;
                index++;
            }
        }
        return sameProgram;
    }

    public void printPeople(Person[] people) {
        for (Person person : people) {
            if (person != null) {
                System.out.println(person);
            }
        }
    }

    public static void main(String[] args) {
        TestPerson peopleManager = new TestPerson();

        Student person1 = new Student("Nguyen Van A", "22 Nguyen Trai", "KHDL", 2020, 300000);
        peopleManager.add(person1);

        Person person2 = new Student("Tran Thi B", "11 Xuan Thuy", "KHDL", 2019, 400000);
        peopleManager.add(person2);

        Person person3 = new Student("Hoang Van C", "33 Cau Giay", "KHCNTP", 2020, 350000);
        peopleManager.add(person3);

        Staff person4 = new Staff("Nguyen Thi D", "5 Le Loi", "KHTN", 300000);
        peopleManager.add(person4);

        Person person5 = new Staff("Le Van E", "1 Hoang Hoa Tham", "KHXNNV", 400000);
        peopleManager.add(person5);

        System.out.println("staffs:");
        peopleManager.printPeople(peopleManager.filterStaff());
        System.out.println("students:");
        peopleManager.printPeople(peopleManager.filterStudent());
        System.out.println("students in KHDL:");
        peopleManager.printPeople(peopleManager.filterProgram("KHDL"));
    }
}
