<%-- 
    Document   : details
    Created on : 02 Mar 2024, 12:48:36 PM
    Author     : loveness
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ID Number Info Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>ID Number Info</h1>
        <form action="IDValidationServlet.do" method="POST">
            <table>
                <tr>
                    <td>ID Number: </td>
                    <td><input type="text" name="idNum" required="" ></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="VALIDATE" ></td>
                </tr>
            </table>
        </form>
        <p>Click <a href="index.html">here</a> to go back to the main page.</p>
    </body>
</html>
