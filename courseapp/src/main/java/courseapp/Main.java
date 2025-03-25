package courseapp;

import jakarta.persistence.EntityManager;

public class Main {

    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Physics");

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        em.persist(s1);
        em.persist(s2);
        em.persist(c1);
        em.persist(c2);

        em.getTransaction().commit();
        em.getTransaction().begin();

        Student fetchedStudent = em.find(Student.class, s1.getId());
        System.out.println("Student: " + fetchedStudent.getName());
        System.out.println("Courses Enrolled:");
        for (Course course : fetchedStudent.getCourses()) {
            System.out.println(course.getTitle());
        }

        em.getTransaction().commit();
        em.close();
        JPAUtil.close();
    }
}
