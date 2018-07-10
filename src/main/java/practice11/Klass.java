package practice11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Klass {
    int number;
    Student leader;
    List<Student> members = new ArrayList<Student>();
    LinkedList<LeaderAssignedListener> leaderAssignedListeners ;
    LinkedList<JoinListener>  joinListeners ;
    public Klass(int number) {
        this.number = number;
        leaderAssignedListeners = new LinkedList();
        joinListeners = new LinkedList();
    }
    public Klass(int number,Computer computer) {
        this.number = number;
        leaderAssignedListeners = new LinkedList();
        joinListeners = new LinkedList();
        this.registerJoinListener(computer);
        this.registerAssignLeaderListener(computer);
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
            this._notifyLeaderAssigned(leader);
            this._notifyLeaderAssigned(leader);
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
        this._nofiyJoined(student);
    }
    public boolean isLeader(Student student){
        return this.leader!=null && student !=null && student.equal(this.leader);
    }

    public void registerAssignLeaderListener(LeaderAssignedListener listener){
        this.leaderAssignedListeners.add(listener);
    }

    public void _notifyLeaderAssigned(Student leader){
        for(LeaderAssignedListener leaderAssignedListener:leaderAssignedListeners)
        {
            leaderAssignedListener.nofityLeaderAssigned(leader,this);
        }
    }

    public void registerJoinListener(JoinListener listener){
        this.joinListeners.add(listener);
    }

    public void _nofiyJoined(Student student) {
        for(JoinListener leaderAssignedListener:joinListeners)
        {
            leaderAssignedListener.nofiyJoined(student,this);
        }

    }
}