<%-- 
    Document   : StudentForm
    Created on : Feb 17, 2021, 10:07:28 AM
    Author     : alice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel ="stylesheet" type="text/css" href="StudentFormStyles.css">
    </head>
<!--    <body>
                <h1>Hello World!</h1>
        <div class="wrapper">
            <form action = "AddStudent.jsp" method="POST" >
                
                    <table>
                   
                        <thead>
                            <tr>
                                <th>Student Information Form</th>
                            </tr>
                        </thead>
                  
                    
                        <tbody>
                       
                            <td>
                                Student Id: 
                            </td>
                        
                            <td>
                                <input type="text" name="id"> </td>
                       
                            <td>Name</td>
                            <td><input type="text" name="name"> </td>
                        
                            <td> Gender </td>
                            <td><select name="gender">
                                    <option>MALE</option>  
                                    <option>FEMALE</option>    
                                </select>
                            </td>
                       
                            <tr>
                                <td>
                                    Date of Birth
                                </td> 
                                <td>
                                    <input type="date" name ="dob">
                                </td>
                            </tr> 
                       
                            <tr>
                                <td></td>
                                <td></td>
                            </tr>  
                        
                            <tr>
                                <td></td>
                                <td><button type="submit">Next</button></td>
                            </tr>
                      

                        </tbody>
                    </div>

                </table>
                </div>
                

            </form>
        </div>

    </body>-->
<body style="display: grid;width: 100%; height:100%">
        <div class="Container" style="background-color: grey">

            <div class="box" style="margin-left: 400px ; margin-right: 400px; margin-top: 20px;margin-bottom: 100%; background-color: white;border-radius: 20px;   ">
                <div class="text" style="border-radius: 15px 15px 0 0; background-color:blueviolet;font-weight: 600;line-height: 100px">
                    <h1 style="text-align: center; color: black;font-size: 25px">Student Information Form</h1>
                </div>
                <form style="display: flex; flex-direction: column;  padding: 5px; margin-top: 50px; border-color:blueviolet " action="AddStudent.jsp" method="POST">

                    <input style="padding: 10px; margin-left: 20px; margin-right: 20px; border-radius: 15px;outline: none;border: 2px solid lightgrey;transition: all 0.3s ease" type="text" placeholder="Write the Student id number" name="id">

                    <span style="margin-bottom: 10px"></span>
                    <input  style="padding: 10px; margin-left: 20px; margin-right: 20px; border-radius: 15px;outline: none;border: 2px solid lightgrey" type="text" placeholder="Enter Student's Name" name="name">
                    <span style="margin-bottom: 10px"></span>
                    <select style="padding: 10px; margin-left: 20px; margin-right: 20px; border-radius: 15px;outline: none; border-color: black;border: 2px solid lightgrey" type="text" name="gender">
                        <option>Male</option>
                        <option>Female</option>
                    </select>
                    <span style="margin-bottom: 10px"></span>
                    <input style="padding: 10px; margin-left: 20px; margin-right: 20px; border-radius: 15px;outline: none;border: 2px solid lightgrey" type="date" name="Date" >
                    <span style="margin-bottom: 10px"></span>
                    <button type="submit" style="padding:10px; margin-left: 20px; margin-right: 20px; border-radius: 15px; margin-bottom: 50px; background-color: purple; color:white;font-size:20px">Next</button>


                </form>
            </div>


        </div>

    </body>
</html>
