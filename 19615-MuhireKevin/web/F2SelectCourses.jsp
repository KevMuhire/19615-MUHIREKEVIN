<%-- 
    Document   : SelectedCoursesForm2
    Created on : Feb 16, 2021, 6:57:48 PM
    Author     : alice
--%>


<%@page import="java.util.List"%>
<%@page import="BusinessModel.Course"%>
<%@page import="Data.GenericDAO"%>
<%@page import="BusinessModel.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Select Course</title>
        <link rel ="stylesheet" type="text/css" href="selectCourseStyles.css">
    </head>
    <body>
        <%
            Student st = (Student)session.getAttribute("student");
            if(st == null){
                %>
                <h1>The session is closed, Go to the <a href="StudentForm.jsp"> student Registration Page</a></h1>
                <%
                    return;
                }
            %>
        <div class="wrapper">
            <div class=" division1">
            <h2>Dear <%=(st.getGender().toString().equals("FEMALE"))?"Ms. ":"Mr." %> <%=st.getName() %> , you may</h2>
            <h3>Select Courses you want to learn.</h3>
            <table class = "blue" >
                <thead>
                    <tr>
                        <td>Code</td>
                        <td>Names</td>
                        <td>Credits</td>
                        <td>Course Fees</td>
                        <td>Actions</td>
                    </tr>
                </thead>
                    <%
                        GenericDAO<Course> gen = new GenericDAO<Course>(Course.class);
                        List<Course> courses = gen.findAll();
                        for(Course c: courses){
                     %>
                     <tbody>
                     <tr>
                         <td><%=c.getCode() %></td>
                         <td><%=c.getNames() %></td>
                         <td><%=c.getCredits()%></td>
                         <td><%=c.getCourseFee()%></td>
                         <td>
                             <% 
                                 if(st.isExist(c.getCode())){
                                     %>
                                     <a href="RemoveOp.jsp?id=<%=c.getCode()%>">Remove</a>
                                     <%
                                 }else{
                                  %>
                                  <a href="AddOp.jsp?id=<%=c.getCode()%>">Add</a>
                                  <%
                                 }
                              %>
                         </td>
                     </tr>
                        <%}%>
                        
                </tbody>
            </table>
                        
            </div>
         <div class="division2">
                <table class="secondtable"border="0">
                    <thead>
                        <tr>
                            <th>Your Current Selection</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Number Of Courses</td>
                            <td><%=st.numberOfCourses()  %></td>
                        </tr>
                        <tr>
                            <td>Total credits</td>
                            <td><%=st.TotalnumberOfCredits()  %></td>
                        </tr>
                        <tr>
                            <td>Total Fee</td>
                            <td><%=st.totalPayment()  %></td>
                        </tr>
                        <tr>
                            <td><a href="ViewDetails.jsp">View Details</a></td>
                            
                        </tr>
                        <tr>
                            <td><a href="CompleteRegistration.jsp">Complete Registration</a></td>
                        </tr>
                    </tbody>
                </table>

            </div>
            
        </div>                
    </body>
</html>
