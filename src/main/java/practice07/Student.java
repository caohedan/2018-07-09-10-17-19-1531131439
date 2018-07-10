package practice07;

public class Student extends Person {
   private String name;
    private int age;
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce () {
        return super.introduce()+" I am a Student. I am at Class "+this.getKlass().getNumber()+".";
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", klass=" + klass +
                '}';
    }
}