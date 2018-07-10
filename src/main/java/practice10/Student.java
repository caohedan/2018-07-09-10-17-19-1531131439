package practice10;

public class Student extends Person {
    private  int id;
    private String name;
    private int age;
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }


    public String introduce () {
        if (this.klass.isLeader(this)) {
            return super.introduce()+" I am a Student. I am Leader of "+this.klass.getDisplayName()+".";
        }
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

    public void setKlass(Klass klass)
    {
        this.klass = klass;
    }
    public boolean is(Student student) {
        return this.id == student.id;
    }
    public boolean equal(Student student) {
        return student !=null && this.id == student.id;
    }
    public void changeClass(Klass klass){
        this.klass = klass;
    }
}