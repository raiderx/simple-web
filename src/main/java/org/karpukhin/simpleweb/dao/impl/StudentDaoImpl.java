package org.karpukhin.simpleweb.dao.impl;

import org.karpukhin.simpleweb.dao.StudentDao;
import org.karpukhin.simpleweb.model.Student;
import org.karpukhin.simpleweb.search.StudentSearchCriteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Karpukhin
 */
public class StudentDaoImpl implements StudentDao {

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentDao createStudent(Student student) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Student> getStudentsBySearchCriteria(StudentSearchCriteria criteria) {
        return new ArrayList<Student>();
    }
}
