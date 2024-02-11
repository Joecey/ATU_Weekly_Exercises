package w2.ie.atu.sw;
import java.util.Date;
// Ctrl+alt+I to auto indent

public class Student {
        // These have class level scope
        private long id;
        private String name;
        private Date dob;
        private boolean registered;
        private float feeBalance;
        public Student (){
                System.out.println(this); // print out the full package name with objectID
                System.out.println(this.feeBalance);
                feeBalance = -1000.00f;
                System.out.println(this.feeBalance); // class scope
        }
        public static void main(String[] args){
                new Student(); // create a new student object
        }

}
