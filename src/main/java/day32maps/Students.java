package day32maps;

public class Students {
    public String name;
    public String eMail;
    public int age;
    public boolean success;

    public Students(String name, String eMail, int age, boolean success) {
        this.name = name;
        this.eMail = eMail;
        this.age = age;
        this.success = success;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", eMail='" + eMail + '\'' +
                ", age=" + age +
                ", success=" + success +
                '}';
    }
}
