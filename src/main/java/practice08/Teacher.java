package practice08;

public class Teacher extends Person{
    private int id;
    private  String name;
    private  int age;
    Klass klass;

    public Teacher(int id,String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public  String  introduce () {
        if(this.getKlass() == null)
            return super.introduce()+" I am a Teacher. I teach No Class.";
        else
            return super.introduce()+" I am a Teacher. I teach Class "+this.getKlass().getNumber()+".";
    }

    public String basicIntroduce(){
        return super.introduce()+" I am a Teacher.";
    }

    public String introduceWith(Student student) {
        System.out.println(student.toString());
        String teachString = " I don't teach "+student.getName()+".";
        if(this.klass.equal(student.getKlass())){
            teachString =" I teach "+student.getName()+".";
        }

        return this.basicIntroduce()+teachString;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", klass=" + klass +
                '}';
    }
}