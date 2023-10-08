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
            body {
                margin: 0;
                padding: 0;
                height: 100vh;
                display: flex;
                align-items: center;
                justify-content: center;
                background: linear-gradient(to right, #6a11cb 0%, #2575fc 100%);
                font-family: Arial, Helvetica, sans-serif;
            }

            .login-container {
                background-color: rgba(255, 255, 255, 0.9);
                padding: 20px;
                border-radius: 8px;
                width: 300px;
                text-align: center;
                box-shadow: 0px 0px 10px 0px #000000;
            }

            h2 {
                margin-bottom: 20px;
            }

            input[type=text],
            input[type=password] {
                width: 100%;
                padding: 10px;
                margin: 10px 0;
                border-radius: 5px;
                border: 1px solid #ccc;
            }

            input[type=submit] {
                width: 100%;
                padding: 10px;
                background-color: #6a11cb;
                color: white;
                border: none;
                border-radius: 5px;
                cursor: pointer;
                transition: background-color 0.3s;
            }

            input[type=submit]:hover {
                background-color: #2575fc;
            }

            label {
                text-align: left;
                display: block;
                margin: 5px 0;
            }
        </style>
    </head>
    <body>
        <div class="login-container">
            <h2>Login</h2>
            <form action="login" method="post">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required><br>

                <label for="password">Password:</labe>
                <input type="password" id="password" name="password" required><br>

                <input type="submit" value="Login">
            </form>
        </div> 
    </body>
</html>
