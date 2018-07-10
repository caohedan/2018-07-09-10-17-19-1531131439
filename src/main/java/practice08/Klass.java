package practice08;

public class Klass {
    int number;
    Student leader;
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
        // this.number === leader.klass.number
        if(this.equal(leader.getKlass())){
            this.leader = leader;
        }
    }

    public Student getLeader() {
        return leader;
    }

    public boolean isLeader(Student student){
        return this.leader!=null && student !=null && student.equal(this.leader);
    }
    public boolean verifyLeader(Student student){
        return this.leader !=null && this.leader.is(student);
    }
}