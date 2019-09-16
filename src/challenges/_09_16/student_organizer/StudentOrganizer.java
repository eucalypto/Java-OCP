package challenges._09_16.student_organizer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.TreeSet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class StudentOrganizer {
    private TreeSet<Student> students = new TreeSet<>();
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    void printStudents() {
        lock.readLock().lock();
        try {
            for (Student student : students) {
                System.out.println(student);
            }
        } finally {
            lock.readLock().unlock();
        }
    }

    void addStudent(Student student) {
        lock.writeLock().lock();
        try {
            students.add(student);
        } finally {
            lock.writeLock().unlock();
        }
    }

    void saveStudentsToFile(String fileName) {
        lock.readLock().lock();
        try {
            try {
                ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
                os.writeObject(students);
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {
            lock.readLock().unlock();
        }
    }
}
