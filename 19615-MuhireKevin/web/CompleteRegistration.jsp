<%-- 
    Document   : CompleteRegistration
    Created on : Feb 17, 2021, 1:02:45 PM
    Author     : alice
--%>

<%@page import="BusinessModel.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Completed Registration</title>
        <link rel ="stylesheet" type="text/css" href="CompleteRegistrationStyle.css">
    </head>
    <body>
        <% 
            Student st = (Student)session.getAttribute("student");
            if(st==null){
                %>
                <h1>Session is closed  , go to this link <a href="F1StudentForm.jsp"> Student Registration Page</h1>
                <%
                return;
                }
            %>
            <div class="Wrapper">
                <h1 style="text-align: center; color: black; font-size: 25px">Student Registration Information</h1>
                <div class="section1" style="display: flex; justify-content: center">
                    <table class = "table1" style="border: 2px solid #1ABC9C">
                        <tbody style="background:#1ABC9C;color:white">
                        <tr>
                            <td>Student ID:</td>
                            <td><label><%=st.getStudentId() %></label></td>
                        </tr>
                        <span style="margin-bottom: 10px"></span>
                        <tr>
                            <td>Name</td>
                            <td><label><%=st.getName() %></label></td>
                        </tr>
                        <span style="margin-bottom: 10px"></span>
                        <tr>
                            <td>Gender</td>
                            <td><label><%=st.getGender() %></label></td>
                        </tr>
                        <span style="margin-bottom: 10px"></span>
                        <tr>
                            <td>Date of Birth</td>
                            <td><label><%=st.getDateofbirth() %></label></td>
                        </tr>
                        <span style="margin-bottom: 10px"></span>
                        <tr>
                            <td>Number Of Courses</td>
                            <td><label><%=st.numberOfCourses()  %></label></td>
                        </tr>
                        <span style="margin-bottom: 10px"></span>
                        <tr>
                            <td>Total credits</td>
                            <td><label><%=st.TotalnumberOfCredits() %></label></td>
                        </tr>
                        <span style="margin-bottom: 10px"></span>
                        <tr>
                            <td>Total School Fees</td>
                            <td><label><%=st.totalPayment() %></label></td>
                        </tr>
                        <span style="margin-bottom: 10px"></span>
                        
<!--                        <tr>
                            <td><a href="Register.jsp"> Register Now</td>
                            <td></td>
                        </tr>-->
                        
                        <span style="margin-bottom: 10px"></span>
                        <span style="margin-bottom: 10px"></span>
                        
                    </tbody>
                </table>
                        <span style="margin-bottom: 10px"></span>
                <div class="btn" style="display: flex; justify-content: center; padding: 20px">
                            <a href="Register.jsp"> Register Now</a>
                </div>
                </div>
                
            </div>
            
    </body>
</html>
