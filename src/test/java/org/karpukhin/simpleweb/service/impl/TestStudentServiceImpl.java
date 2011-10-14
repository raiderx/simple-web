package org.karpukhin.simpleweb.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.karpukhin.simpleweb.dao.StudentDao;
import org.karpukhin.simpleweb.model.Student;
import org.karpukhin.simpleweb.search.StudentSearchCriteria;
import org.karpukhin.simpleweb.service.StudentService;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author Pavel Karpukhin
 */
public class TestStudentServiceImpl {

    private StudentDao studentDao;
    private StudentService studentService;

    @Before
    public void setUp() {
        studentDao = mock(StudentDao.class);
        studentService = new StudentServiceImpl(studentDao);
    }

    @Test
    public void testGetStudentsBySearchCriteria() {
        StudentSearchCriteria criteria = mock(StudentSearchCriteria.class);
        List<Student> students = mock(List.class);
        when(studentDao.getStudentsBySearchCriteria(criteria)).thenReturn(students);
        List<Student> result = studentService.getStudentsBySearchCriteria(criteria);
        assertNotNull(result);
        verify(studentDao).getStudentsBySearchCriteria(criteria);
    }
}
