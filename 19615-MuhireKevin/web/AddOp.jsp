<%-- 
    Document   : Add
    Created on : Feb 17, 2021, 12:26:49 PM
    Author     : alice
--%>



<%@page import="BusinessModel.Student"%>
<%@page import="BusinessModel.Course"%>
<%@page import="Data.GenericDAO"%>
<%
    Student st = (Student)session.getAttribute("student");
    if(st==null){
                %>
                <h4> The session is closed, Go to the <a href="F1StudentForm.jsp"> Student Registration Page</a></h4>
                <%
                return;
            }
    String id = request.getParameter("id");
    GenericDAO<Course> gen = new GenericDAO<Course>(Course.class);
    Course c = gen.findById(id);
    st.registerCourse(c);
%>
<jsp:forward page="F2SelectCourses.jsp" />