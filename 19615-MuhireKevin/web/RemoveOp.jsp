<%-- 
    Document   : RemoveOp
    Created on : Feb 17, 2021, 12:27:51 PM
    Author     : alice
--%>

<%@page import="Data.GenericDAO"%>
<%@page import="BusinessModel.Course"%>
<%@page import="BusinessModel.Student"%>
<%
    Student st = (Student)session.getAttribute("student");
    if(st==null){
                %>
                <h4> Session Terminated, Please goto<a href="student.jsp"> Student Registration Page</a></h4>
                <%
                return;
            }
    String id = request.getParameter("id");
    GenericDAO<Course> gen = new GenericDAO<Course>(Course.class);
    Course c = gen.findById(id);
    st.removeCourse(c);
%>
<jsp:forward page="F2SelectCourses.jsp" />
