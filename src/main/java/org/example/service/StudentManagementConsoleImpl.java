package org.example.service;

import org.example.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementConsoleImpl implements StudentManagement{

    public List<Student> students;
    public int idCounter = 1;

    @Override
    public Student create() {
        Student student = new Student();
        student.setId(idCounter++);
        student.setName("Sergiulicafarafrica");
        student.setAge(24);
        return student;
    }

    @Override
    public Student save(Student student) {
        if (student.getId() == 0) {
            student.setId(idCounter++);
            students.add(student);
        }
        return null;
    }

    @Override
    public Student find(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Student remove(int id) {
        students.removeIf(student -> student.getId() == id);
        return null;
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public Student edit(Student student) {
        Student existingStudent = find(student.getId());

        if (existingStudent != null) {
            existingStudent.setName(student.getName());
            existingStudent.setAge(student.getAge());

            save(existingStudent);
        }
        return existingStudent;
    }
}
