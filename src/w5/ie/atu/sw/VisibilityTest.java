package w5.ie.atu.sw;

import w4.ie.atu.sw.Student;

public class VisibilityTest {
    public static void main(String[] args) {
        Student s = new Student();

        // now when you do ., the protected method is no longer shown
//        s.study() // we will get an error if we run this
        s.execute();
    }
}
