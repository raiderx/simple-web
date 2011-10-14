package org.karpukhin.simpleweb.dao;

import org.karpukhin.simpleweb.model.Student;
import org.karpukhin.simpleweb.search.StudentSearchCriteria;

import java.util.List;

/**
 * @author Pavel Karpukhin
 */
public interface StudentDao {

    /**
     * Creates new student
     * @param student student data
     * @return created student
     */
    StudentDao createStudent(Student student);

    /**
     * Returns list of students found by given search criteria
     * @param criteria student search criteria
     * @return list of students
     */
    List<Student> getStudentsBySearchCriteria(StudentSearchCriteria criteria);
}
