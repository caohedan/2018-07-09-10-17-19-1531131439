package practice07;

public class Klass {
    int number;

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
}
