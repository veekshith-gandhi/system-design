package Collections;

public class Studen implements Comparable<Studen>{
    private int rollNumber;
    private String name;
    private String className;
    private int year;

    Studen(int rollNumber, String name,String className, int year ){
        this.rollNumber = rollNumber;
        this.name = name;
        this.className = className;
        this.year = year;
    }

    @Override
    public int compareTo(Studen o) {
        //Three things : -ve 0 +ve
        if(this.year < o.year){
            return -1;
        }else if(this.year > o.year){
            return 1;
        }
        return 0;
    }

    public int getYear() {
        return this.year;
    }

    public String getName() {
        return this.name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}
