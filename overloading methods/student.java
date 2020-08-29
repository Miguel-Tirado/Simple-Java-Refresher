public class student implements Comparable<student> {
    private String name;

    public student(String name) {
        this.name = name;
    }

    public boolean equals(student other) {
        if(this.name == other.name) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(student other) {
        return this.name.compareTo(other.name);
    }

    //this will be used to represent our object
    public String toString() {
        return "Student(" + this.name + ")";
    }
}