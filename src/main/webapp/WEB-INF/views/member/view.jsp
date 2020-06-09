<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="view" items="${view }">
		이름 : ${view.d_name } <br>
		아이디 :	${view.d_id }<br>
		패스워드 :${view.d_pw } <br>
		이메일1 : ${view.d_email1 }<br>
		이메일2 : ${view.d_email2 }<br>
		이메일수신여부 : ${view.d_email_check }<br>
		집주소 : ${view.d_zipcode }<br>
		상세주소 : ${view.d_address }<br>
		폰번1 : ${view.d_phone1 }<br>
		폰번2 :${view.d_phone2 }<br>
		폰번3 :${view.d_phone3 }<br>
		SMS수신여부 :${view.d_sms }<br>
		유선전화 : ${view.d_tel }<br>
		생년월일 :${view.d_birth }<br>
		양력음력 : ${view.d_sl }<br>
		가입일 : ${view.d_date }<br>
	
	</c:forEach>


</body>
</html>