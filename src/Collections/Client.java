package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Studen studen1 = new Studen(1,"veekshith","GsN", 2004);
        Studen studen2 = new Studen(3,"deekshith","GoN", 1897);
        Studen studen3 = new Studen(2,"teekshith","GuN", 1897);
        Studen studen4 = new Studen(4,"yeekshith","GtN", 1244);
        Studen studen5 = new Studen(5,"ieekshith","GrN", 4133);

        List<Studen> studenList = new ArrayList<>();
        studenList.add(studen1);
        studenList.add(studen2);
        studenList.add(studen3);
        studenList.add(studen4);
        studenList.add(studen5);

        // method java.util.Collections.<T>sort(java.util.List<T>,java.util.Comparator<? super T>) is not applicable
        //Comparable
//         Collections.sort(studenList);


        //Comparator
        //explict sorting
        Collections.sort(studenList,new StudentYearSort());

         for (Studen stu : studenList){
             System.out.println(stu.getName() + "  "+ stu.getYear());
         }

    }
}
