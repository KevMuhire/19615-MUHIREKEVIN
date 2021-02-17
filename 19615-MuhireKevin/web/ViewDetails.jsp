<%-- 
    Document   : ViewDetails
    Created on : Feb 17, 2021, 1:02:24 PM
    Author     : alice
--%>

<%@page import="BusinessModel.Student"%>
<%@page import="BusinessModel.Course"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ViewDetails Page</title>
        <link rel ="stylesheet" type="text/css" href="ViewDetailsStyle.css">
    </head>
    <body>
        <% 
            Student st = (Student)session.getAttribute("student");
            if(st==null){
                %>
                <h4> The session is closed, Go to the <a href="F1StudentForm.jsp"> Student Registration Page</a></h4>
                <%
                return;
            }
        %>
        <div class="wrapper">
            <form >
            <h4>Details of Selected Courses</h4>
            <table class="table1" border="0">
                <thead>
                    <tr>
                        <th>Code</th>
                        <th>Name</th>
                        <th>Credits</th>
                        <th>Course Fee</th>
                    </tr>
                </thead>
                <tbody>
                    <%for (Course c : st.getCourses()) {
                    %>
                    <tr>
                        <td><%=c.getCode() %></td>
                        <td><%=c.getNames() %></td>
                        <td><%=c.getCredits() %></td>
                        <td><%=c.getCourseFee() %></td>
                    </tr>
                    <%}%>
                    <tr>
                        <td>Total</td>
                        <td></td>
                        <td><%=st.TotalnumberOfCredits()  %></td>
                        <td><%=st.totalPayment()  %></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><a href="CompleteRegistration.jsp">Complete Registration</a></td>
                        <td></td>
                        <td><a href="F2SelectCourses.jsp">Go Back</a></td>
                    </tr>
                </tbody>
            </table>

        </form>
        </div>
        
        
        
    </body>
</html>
