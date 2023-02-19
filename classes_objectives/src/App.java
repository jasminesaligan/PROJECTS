public class App {
    public static void main(String[] args) throws Exception {
        
        Student myStudent = new Student();

        myStudent.firstName = "Jasmine";
        myStudent.lastName = "Saligan";
        myStudent.gpa = 4.00;
        myStudent.age = 19;
        myStudent.major = "BSIT";
        myStudent.schoolName = "National University Manila";
        myStudent.onProbation = false;

        System.out.println("My name is " + myStudent.firstName + myStudent.lastName + "I have a gpa of " + myStudent.gpa + "And I am " + myStudent.age );




    }
}
