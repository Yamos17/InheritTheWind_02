public abstract class Person {
    private String fName;
    private String lName;
    private String ID;
    private String title;
    private int YOB;

    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.fName = firstName;
        this.lName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    public String fullName() {
        return fName + " " + lName;
    }

    public String formalName() {
        return title + " " + fullName();
    }

    public int getAge() {
        return getAge(2023);
    }

    public int getAge(int year) {
        return year - YOB;
    }
}
