<%-- 
    Document   : message-form
    Created on : 14-Mar-2020, 11:00:43
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${title} Message</title>
    </head>
    <body>
        <h1>Message Form - ${title}</h1>
        <form name="msg-form" action="message/save" method="POST">
            <input type="text" name="description" value="" />
            <input type="date" name="date" value="" />
            <input type="submit" value="${button}" name="submit" />
        </form>
    </body>
</html>
