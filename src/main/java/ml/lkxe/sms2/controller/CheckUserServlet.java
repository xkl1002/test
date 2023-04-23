package ml.lkxe.sms2.controller;

import ml.lkxe.sms2.entity.Student;
import ml.lkxe.sms2.service.StudentService;
import ml.lkxe.sms2.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/CheckUserServlet")
public class CheckUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        String name= request.getParameter("name");
        String password = request.getParameter("password");
        StudentService studentService = new StudentServiceImpl();
        try {
            List<Student> students = studentService.searchAllByNameAndPassword("戴子韬", "2hRsykFpOz");
            Student student = students.get(0);
            out.println("<h1 style= \"color: red; text-align: center; margin: 297px;\" >"+"登陆成功！"+"<br>"+"你的班级为"+student.getSclass()+"</h1>");
        }
        catch (Exception e) {
            out.println("<h1 style= \"color: red; text-align: center; margin: 297px;\" >"+"用户名或密码错误！"+"<br>"+"请重试！"+"</h1>");
            response.setHeader("Refresh","3;url=index.jsp");
        }

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
