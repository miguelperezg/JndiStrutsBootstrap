<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listado de todos los taxis</title>
</head>
<body>
<logic:iterate name="listaParadas" id="listTaxis">
<p>
	
	Listado de taxi:  
	<bean:write name="listTaxis" property="id"/> , 
	<bean:write name="listTaxis" property="title"/>
</p>
</logic:iterate>

</body>
</html>