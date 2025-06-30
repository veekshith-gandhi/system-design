package Collections;

import java.util.Comparator;

public class StudentYearSort implements Comparator<Studen> {

    @Override
    public int compare(Studen o1, Studen o2) {
        if(o1.getYear() > o2.getYear()){
            return 1;
        }else if (o1.getYear() < o2.getYear()){
            return -1;
        }else{
            if(o1.getRollNumber() > o2.getRollNumber()){
                return 1;
            } else if (o1.getRollNumber() < o2.getRollNumber()) {
                return -1;
            }
        }
        return 0;
    }
}
