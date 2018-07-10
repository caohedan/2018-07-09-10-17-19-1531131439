package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    int number;
    Student leader;
   List<Student> members = new ArrayList<Student>();
    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public String getDisplayName() {
        return "Class "+this.number;
    }
    public boolean equal(Klass klass) {
        return this.number == klass.number;
    }
    public void assignLeader(Student leader){
        if (this.equal(leader.getKlass())) {
            this.leader = leader;
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }
    public void appendMember(Student student){
        student.changeClass(this);
        this.members.add(student);
    }
    public boolean isLeader(Student student){
        return this.leader!=null && student !=null && student.equal(this.leader);
    }
    public boolean verifyLeader(Student student){
        return this.leader !=null && this.leader.is(student);
    }
}