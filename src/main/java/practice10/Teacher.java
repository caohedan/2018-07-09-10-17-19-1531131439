package practice10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Teacher extends Person {
    private int id;
    private String name;
    private int age;
    LinkedList<Klass> classes = new LinkedList<Klass>();

    public Teacher(int id, String name, int age,  LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        if (this.getClasses().size() == 0)
            return super.introduce() + " I am a Teacher. I teach No Class.";
        else
        {
            ArrayList<String> list = new ArrayList();
            for(Klass temp:this.getClasses()){
                list.add(String.valueOf(temp.getNumber()));
            }
            String message = String.join(", ", list);
            return super.introduce() + " I am a Teacher. I teach Class " + message + ".";
        }
    }

    public String basicIntroduce() {
        return super.introduce() + " I am a Teacher.";
    }

    public String introduceWith(Student student) {
        System.out.println(student.toString());
        String teachString = " I don't teach " + student.getName() + ".";
        for(Klass temp:this.getClasses()){
            if (temp.equal(student.getKlass()))
                teachString = " I teach " + student.getName() + ".";
        }

        return this.basicIntroduce() + teachString;
    }
    public boolean isTeaching(Student student){
        for(Klass temp:this.getClasses())
        {
            if (temp.equal(student.getKlass()))
                return true;
        }
        return false;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }
}
