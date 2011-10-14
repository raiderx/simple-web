package org.karpukhin.simpleweb.service.impl;

import org.karpukhin.simpleweb.dao.StudentDao;
import org.karpukhin.simpleweb.model.Student;
import org.karpukhin.simpleweb.search.StudentSearchCriteria;
import org.karpukhin.simpleweb.service.StudentService;

import java.util.List;

/**
 * @author Pavel Karpukhin
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    /**
     * Default constructor
     */
    public StudentServiceImpl() {
    }

    /**
     * Constructs StudentDao with given {@link StudentDao} implementation
     * @param studentDao
     */
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Student> getStudentsBySearchCriteria(StudentSearchCriteria criteria) {
        return studentDao.getStudentsBySearchCriteria(criteria);
    }
}
