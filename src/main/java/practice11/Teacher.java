package practice11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Teacher extends Person implements LeaderAssignedListener, JoinListener {
    private int id;
    private String name;
    private int age;
    LinkedList<Klass> classes = new LinkedList<Klass>();

    public Teacher(int id, String name, int age,  LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for(Klass item:classes)
        {
            item.registerJoinListener(this);
            item.registerAssignLeaderListener(this);
        }
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        ArrayList<String> list = new ArrayList();
        if (this.getClasses().size() == 0)
            return super.introduce() + " I am a Teacher. I teach No Class.";
        else{
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

    public void nofityLeaderAssigned(Student leader, Klass klass) {
       String tempStr = "I am "+this.getName()+". I know "+leader.getName()+" become Leader of "+klass.getDisplayName()+".";
       System.out.print(tempStr+"\n");
    }

    public void nofiyJoined(Student student, Klass klass) {
        String tempStr = "I am "+this.getName()+". I know "+student.getName()+" has joined "+klass.getDisplayName()+".";
        System.out.print(tempStr+"\n");
    }


}
