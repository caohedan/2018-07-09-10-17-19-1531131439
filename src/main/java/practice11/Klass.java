package practice11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Klass {
    int number;
    Student leader;
    List<Student> members = new ArrayList<Student>();
    public Klass(int number) {
        this.number = number;
    }
    LinkedList<Teacher> leaderAssignedListeners = new LinkedList();
    LinkedList<Teacher>  joinListeners = new LinkedList();
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
            this._notifyLeaderAssigned(leader);
            this._notifyLeaderAssigned(leader);
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public List<Student> getMembers() {
        return members;
    }

    public Student getLeader() {
        return leader;
    }
    public void appendMember(Student student){
        student.changeClass(this);
        this.members.add(student);
        this._nofiyJoined(student);
    }
    public boolean isLeader(Student student){
        return this.leader!=null && student !=null && student.equal(this.leader);
    }

    public void registerAssignLeaderListener(Teacher listener){
        this.leaderAssignedListeners.add(listener);
    }

    public void _notifyLeaderAssigned(Student leader){
        for(Teacher leaderAssignedListener:leaderAssignedListeners)
        {
            leaderAssignedListener.nofityLeaderAssigned(leader,this);
        }
    }

    public void registerJoinListener(Teacher listener){
        this.joinListeners.add(listener);
    }

    public void _nofiyJoined(Student student) {
        for(Teacher leaderAssignedListener:joinListeners)
        {
            leaderAssignedListener.nofiyJoined(student,this);
        }

    }
}