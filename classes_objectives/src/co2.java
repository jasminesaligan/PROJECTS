class Student {
    String name;
    int roll_no;
    String phone;
    String address;
}

public class co2 {
    public static void main(String[] args) {
        Student sam = new Student();
        sam.name = "Sam";
        sam.roll_no = 1;
        sam.phone = "1234567890";
        sam.address = "123 Main Street, Anytown USA";

        System.out.println("Student 1:");
        System.out.println("Name: " + sam.name);
        System.out.println("Roll No: " + sam.roll_no);
        System.out.println("Phone: " + sam.phone);
        System.out.println("Address: " + sam.address);
        System.out.println();

        Student john = new Student();
        john.name = "John";
        john.roll_no = 2;
        john.phone = "9876543210";
        john.address = "456 Second Street, Anytown USA";

        System.out.println("Student 2:");
        System.out.println("Name: " + john.name);
        System.out.println("Roll No: " + john.roll_no);
        System.out.println("Phone: " + john.phone);
        System.out.println("Address: " + john.address);
    }
}
