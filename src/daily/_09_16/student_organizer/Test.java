package daily._09_16.student_organizer;

public class Test {
    public static void main(String[] args) {
        StudentOrganizer studentOrganizer = new StudentOrganizer();

        Runnable chrisTask = () -> {
            studentOrganizer.addStudent(Student.of("Alexander the Great", 1977, 12, 22));
            studentOrganizer.addStudent(Student.of("Albert Einstein", 1873, 03, 13));
        };

        Thread chris = new Thread(chrisTask, "Chris");

        Runnable aliceTask = () -> {
            try {
                chris.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            studentOrganizer.printStudents();
        };

        Thread alice = new Thread(aliceTask, "Alice");

        Runnable bobTask = () -> {
            try {
                chris.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            studentOrganizer.saveStudentsToFile("students.ser");
        };

        Thread bob = new Thread(bobTask, "Bob");


        chris.start();
        alice.start();
        bob.start();


    }


    public static void develop() {
        StudentOrganizer studentOrganizer = new StudentOrganizer();

        Student alex = Student.of("Alexander the Great", 1977, 12, 22);
        System.out.println(alex);

        Student albert = Student.of("Albert Einstein", 1873, 03, 13);

        System.out.println(alex.compareTo(albert));


        studentOrganizer.addStudent(alex);
        studentOrganizer.addStudent(albert);

        studentOrganizer.printStudents();

        studentOrganizer.saveStudentsToFile("students.ser");

        StudentOrganizer studentOrganizer2 = new StudentOrganizer();
        // studentOrganizer2

    }
}
