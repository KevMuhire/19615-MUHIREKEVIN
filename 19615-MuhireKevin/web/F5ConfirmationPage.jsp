<%-- 
    Document   : ConfirmationPage
    Created on : Feb 17, 2021, 2:11:38 PM
    Author     : alice
--%>

<%@page import="BusinessModel.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmation Page</title>
    </head>
    <body>
        <%
            Student st = (Student)session.getAttribute("student");
            if(st==null){
                %>
                <h1>Session is closed, please Goto<a href="F1StudentForm.jsp">Student Registration Page</h1>
                <%
                  return;
            }
        %>
        <div class="Wrapper">
            <h2>Registration  Feedback</h2
            <p>Dear <%=(st.getGender().toString().equals("FEMALE"))?"Ms. ":"Mr." %> <%=st.getName() %>, Thank You for registering.</p>
            <p>You are requested to Pay <%=st.totalPayment()%> </p>
        </div>
            <% session.invalidate(); %>
    </body>
</html>
