package org.example.data_access.impl;


import org.example.data_access.StudentDao;
import org.example.models.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDao {

    private List<Student> students;
    private int idCounter = 1;

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
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public void delete(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}
