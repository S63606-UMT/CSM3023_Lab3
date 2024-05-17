<%-- 
    Document   : Calculator
    Created on : 17 May 2024, 7:52:12 am
    Author     : Saiful
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            String num1 = "0", num2 = "0";
            int result = 0;
            String op = "+";
            char opchar = op.charAt(0);
            
            if (request.getParameter("op") != null) {
                op = request.getParameter("op");
                opchar = op.charAt(0);
                
                num1 = request.getParameter("operandi1");
                num2 = request.getParameter("operandi2");
            
                switch(opchar) {
                    case '0': result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    break;
                    case '1': result = Integer.parseInt(num1) - Integer.parseInt(num2);
                    break;
                    case '2': result = Integer.parseInt(num1) * Integer.parseInt(num2);
                    break;
                    case '3': result = Integer.parseInt(num1) / Integer.parseInt(num2);
                    break;
                    case '4': result = Integer.parseInt(num1) % Integer.parseInt(num2);
                    break;
                }
            }
        %>
    </head>
    <body bgcolor="#a00FFF" text="gold">
    <center>
        
        <h2>Basic Calculator Program in JSP</h2>
        <form method="GET" name="fi">
            <input type="text" size="20" name="operandi1" value=""/>
            <select name="op" size="1">
                <option value="0">+</option>
                <option value="1">-</option>
                <option value="2">*</option>
                <option value="3">/</option>
                <option value="4">%</option>
            </select>
            
            <input type="text" size="20" name="operandi2" value=""/>
            <p><br><br><br><br>
                <input type="submit" value="Calculate"/>
                Result = <%=result + ""%>
        </form>
    </center>
    </body>
</html>
