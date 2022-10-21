import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2){
        if(o1.getAge() > o2.getAge()){
            return 1;
        } else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("PhuRe", 28,"Q10");
        Student student2 = new Student("TungHeo", 19,"TienGiang");
        Student student3 = new Student("MaiChubby", 24,"ThuDuc");
        Student student4 = new Student("TienNgao", 18,"Hue");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}
