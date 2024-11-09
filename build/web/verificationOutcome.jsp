<%-- 
    Document   : verificationOutcome
    Created on : 26 Feb 2024, 5:06:18 AM
    Author     : loveness
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verification Outcome Page</title>
    </head>
    <body>
        <h1>Verification Outcome</h1>
        
        <%
            String idNumber = (String)request.getAttribute("idNumber");
            String dateOfBirth = (String)request.getAttribute("dateOfBirth");
            String gender = (String)request.getAttribute("gender");
            String citizenship = (String)request.getAttribute("citizenshipStatus");
            String idVerification = (String)request.getAttribute("validateIDOutcome");
            String email = (String)pageContext.getServletContext().getInitParameter("home_affairs_email");
            String contact = (String)pageContext.getServletContext().getInitParameter("home_affairs_number");
        %>
        <p><b>Summary Report</b></p>
        <br>
        <p>ID number: <%=idNumber%></p>
        <p>Date of birth of the user: <%=dateOfBirth%></p>
        <p>Gender: <%=gender%></p>
        <p>Verification outcome: <%=citizenship%></p>
        <p>Citizenship status: <%=idVerification%></p>
        <p>Home Affairs query email (<a href=""><%=email%></a>) and toll free number <%=contact%></p>
       
        <p>
            Click <a href="index.html">here</a> to go back to the main page.
        </p>
    </body>
</html>
