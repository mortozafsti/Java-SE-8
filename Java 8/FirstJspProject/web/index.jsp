<%-- 
    Document   : index
    Created on : Dec 7, 2018, 10:21:49 AM
    Author     : User
--%>

<%@page import="org.apache.catalina.User"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Page</title>
    </head>
    <body>
        <h1>This is Index Page</h1>
        <h1>Grettings</h1>
        <%-- <p>The Current Time is <%- new java.util.Date()%>Milton</p > --%>
        <p>The Current Time is <%= new java.util.Date()%> Milton</p >
        
        <%-- This is Declaration Tag --%>
        <%! Date now = new Date(); %>
        <%! 
            private int calculation(int a, int b){ 
                int rs = a + b;
                return rs;
            }
        %>
        <%-- This is Scriplets Tag --%>
        <% 
          //  User user = (User)request.getAttribute("User");
          //  if (user != null) {                              
        %>
            //Welcome, You are logged in Successfully!
        
        <h1> Well Come Back: <%= calculation(5, 8) %> </h1>
    </body>
</html>
