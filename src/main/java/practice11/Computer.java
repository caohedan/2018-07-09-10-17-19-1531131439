package practice11;

public class Computer implements JoinListener,LeaderAssignedListener{
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
