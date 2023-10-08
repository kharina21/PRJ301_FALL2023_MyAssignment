<%-- 
    Document   : login
    Created on : Oct 9, 2023, 5:27:34 AM
    Author     : kharr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .login-container{
                width: 300px;
                margin: 0 auto;
                padding: 16px;
                border: 1px solid #ddd;
                border-radius: 8px;
            }
            
            label{
                display: block;
                margin-bottom: 8px;
            }
        </style>
    </head>
    <body>
        <div class="login-container">
            <h2>Login</h2>
            <form action="login" method="post">
                <label for="username">Username:</label>
                <input type="text" name="username" required><br>
                
                <labe for="password">Password:</labe>
                <input type="password" name="password" required><br>
                
                <input type="submit" value="Login">
            </form>
        </div> 
    </body>
</html>
