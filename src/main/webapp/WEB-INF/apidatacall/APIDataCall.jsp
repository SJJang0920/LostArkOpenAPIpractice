<%@page import="com.mypractice.lostarkapi.APIKey"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<h1>가져온 데이터</h1>
	
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script type="text/javascript">
	
 	var xhr = new XMLHttpRequest();
 	var wantdata = "/news/events"
 	var url = "https://cors-anywhere.herokuapp.com/https://developer-lostark.game.onstove.com"
 	 
 	xhr.open("GET", url+wantdata, true);
 	xhr.responseType='json';
 	xhr.setRequestHeader('accept', 'application/json');
 	xhr.setRequestHeader('authorization', 'bearer <%=APIKey.APIkey()%>');
 	xhr.onload = () => {
 		 obj = xhr.response;
         console.log(xhr.response);
       };
 	xhr.onreadystatechange = () => { };
 	xhr.send();  	
 	alert(obj);

 	
	</script>
	
</body>
</html>