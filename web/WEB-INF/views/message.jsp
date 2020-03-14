<%-- 
    Document   : message
    Created on : Mar 12, 2020, 8:54:56 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Message with id: ${id}</h1>
        <div id="${id}">
            Message Id: ${id} or ${msg.id}
            Message Description: ${msg.description}
            Message Date: ${msg.date}
        </div>
    </body>
</html>
