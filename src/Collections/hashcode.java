package Collections;

import java.util.*;

public class hashcode {

    public static class Student {
        String name;
        int id;

        Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Student student = (Student) obj;
            return id == student.id;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', id=" + id + '}';
        }
    }

    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student("Kartikya", 1);
        Student s2 = new Student("Rahul", 2);
        Student s3 = new Student("Kartikya", 1);

        set.add(s1);
        set.add(s2);
        set.add(s3);

        for (Student s : set) {
            System.out.println(s);
        }
    }
}