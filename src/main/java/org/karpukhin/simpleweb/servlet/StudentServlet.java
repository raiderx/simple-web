package org.karpukhin.simpleweb.servlet;

import org.karpukhin.simpleweb.dao.impl.StudentDaoImpl;
import org.karpukhin.simpleweb.model.Student;
import org.karpukhin.simpleweb.search.StudentSearchCriteria;
import org.karpukhin.simpleweb.service.StudentService;
import org.karpukhin.simpleweb.service.impl.StudentServiceImpl;

import javax.print.DocFlavor;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Pavel Karpukhin
 */
@WebServlet(name="studentServlet", urlPatterns = "/students/*")
public class StudentServlet extends HttpServlet {

    private static final String ACTION_PARAM_NAME = "action";

    private StudentService studentService;

    /**
     * Default constructor
     */
    public StudentServlet() {
        studentService = new StudentServiceImpl(new StudentDaoImpl());
    }

    /**
     * Constructs StudentServlet instance with given {@link StudentService}
     * implementation
     * @param studentService {@link StudentService} implementation
     */
    public StudentServlet(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter(ACTION_PARAM_NAME);
        list(request, response);
    }

    public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentSearchCriteria criteria = new StudentSearchCriteria();
        List<Student> students = studentService.getStudentsBySearchCriteria(criteria);
        request.setAttribute("students", students);
        getServletContext().getRequestDispatcher("/WEB-INF/jsp/students/list.jsp")
            .forward(request, response);
    }
}
