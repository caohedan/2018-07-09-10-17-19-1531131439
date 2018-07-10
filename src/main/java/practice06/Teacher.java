package practice06;

public class Teacher extends Person{
    String name;
    int age;
    int klass;

    public Teacher(String name, int age, int klass) {
       super(name,age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public  String  introduce () {
        if(this.getKlass()== 0)
            return super.introduce()+" I am a Teacher. I teach No Class.";
        else
            return super.introduce()+" I am a Teacher. I teach Class "+this.klass+".";
    }

    public int getKlass() {
        return klass;
    }
}
