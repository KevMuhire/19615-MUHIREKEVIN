<%-- 
    Document   : Register
    Created on : Feb 16, 2021, 9:25:52 PM
    Author     : alice
--%>

<%@page import="Data.GenericDAO"%>
<%@page import="BusinessModel.Student"%>
<%
    Student st = (Student)session.getAttribute("student");
    if(st==null){
    %>
    <h1> Session is closed, Please GoTo<a href="F1StudentForm.jsp"></a></h1>
    <%
    return;   
}
GenericDAO<Student> gen = new GenericDAO<Student>(Student.class);
gen.create(st);
    
%>
<jsp:forward page="F5ConfirmationPage.jsp"/>