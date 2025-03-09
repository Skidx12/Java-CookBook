class student{
    int rollNo;
    String name;
    float marks;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        student s1 = new student();
        s1.rollNo = 1;
        s1.name = "Arsh";
        s1.marks = 62.43f;

        student s2 = new student();
        s2.rollNo = 2;
        s2.name = "homie";
        s2.marks = 42.43f;

        student s3 = new student();
        s3.rollNo = 3;
        s3.name = "Sofie";
        s3.marks = 84.43f;

        student studs[] = new student[3];
        studs[0] = s1;
        studs[1] = s2;
        studs[2] = s3;

        for(int i=0;i<studs.length;i++){
            System.out.println("Student: "+studs[i].rollNo+" "+studs[i].name+" "+studs[i].marks);
        }
    }
}
