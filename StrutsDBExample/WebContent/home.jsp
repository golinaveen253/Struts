<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-html" prefix="html" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<%HttpSession sess = request.getSession(); %>
</head>
<body>
<html:html>
    <div style="color:red">
    <html:errors />
    </div>
	<html:form action="/home" method="get">
		Enter your username:
		<html:text property="userName" size="50" /><br><br>
		<br><br>
	</html:form>
</html:html>
</body>
</html>