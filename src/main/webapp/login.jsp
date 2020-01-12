<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<s:form action="authentication">
<s:textfield key="userId" label="Login ID"></s:textfield>
<s:password key="password" label="Password"></s:password>
<s:textfield key="emailId" label="Email"></s:textfield>
 <s:submit/>
</s:form>
</body>
</html>