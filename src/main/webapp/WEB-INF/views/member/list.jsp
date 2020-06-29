<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="../css/admin_header.css">
		<link rel="stylesheet" type="text/css" href="../css/admin_main.css">
		<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
        <script type="text/javascript" src="../js/jquery-ui.min.js"></script>
        <script type="text/javascript" src="../js/prefixfree.dynamic-dom.min.js"></script>
        <script type="text/javascript" src="../js/admin_header.js"></script> 
	</head>
	<body>
	<header>
		<div>
			<div id="top">
			<a href="main"><p style="color:#f7703c;">JARDIN SHOP</p></a>
			</div>
			
		</div>
	</header>
	<nav>
		<h2><em></em>관리자</h2>
		<div  id="student" class="user">
			<a>회원관리<span id="s_icon" class="icon_minus"></span></a>
			<div id="stu_list">
				<ul>
					<li><a href="#"><img src="../images/icon_title_left.png">회원찾기</a></li>
					<li><a href="#"><img src="../images/icon_title_left.png">회원탈퇴</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<section>
		<h1>회원리스트</h1>
		<div id="main_list">
			<div id="main_user_list">
				
				<div>
					<table border="1">
						<tr>
							<th>이름</th>
							<th>아이디</th>
							<th>패스워드</th>
							<th>이메일</th>
							<th>주소</th>
							<th>휴대전화</th>
							<th>생년월일</th>
							<th>이메일 수신여부</th>
							<th>SMS 수신여부</th>
							<th>가입일</th>
						</tr>
						
						<c:forEach var="row" items="${list}">
						<tr>
							<td class="table_left">${row.d_name }</td>
							<td class="table_left">${row.d_id }</td>
							<td class="table_left">${row.d_pw }</td>
							<td class="table_left">${row.d_email1 }@${row.d_email2 }</td>
							<td>${row.d_address }</td>
							<td>${row.d_phone1}-${row.d_phone2}-${row.d_phone3}</td>
							<td>${row.d_birth_yy}.${row.d_birth_mm}.${row.d_birth_dd}</td>
							<td>${row.d_email_check}</td>
							<td>${row.d_sms}</td>
							<td>${row.d_date}
						</tr>
						</c:forEach>
					</table>
					<div class="detail_btn">
						<a href="#">회원 전체보기</a>
					</div>
				</div>
			</div>
			
			
		</div>
	</section>
	</body>
</html>