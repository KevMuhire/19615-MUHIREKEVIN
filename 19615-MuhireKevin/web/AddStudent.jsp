<%-- 
    Document   : AddStudent
    Created on : Feb 16, 2021, 9:17:27 PM
    Author     : Kevin
--%>

<%@page import="Util.Dates"%>
<%@page import="java.time.LocalDate"%>
<%@page import="BusinessModel.Gender"%>
<%@page import="BusinessModel.Student"%>
<%
    Dates dt = new Dates();
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String gender = request.getParameter("gender");
    String dob = request.getParameter("dob");
    Student st = (Student)session.getAttribute("student");
    if(st==null){
        st = new Student(id, name, Gender.FEMALE.toString().equals(gender)?Gender.FEMALE:Gender.MALE, dt.getDate(dob) );
        session.setAttribute("student", st);
    }
  
%>
<jsp:forward page="F2SelectCourses.jsp"/>
    
