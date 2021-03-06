<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>NOTICE CONTENT</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
<link rel="stylesheet" href="../css/admin_account.css">
<link rel="stylesheet" type="text/css" href="../css/reset.css?v=Y" />
<link rel="stylesheet" type="text/css" href="../css/layout.css?v=Y" />
<link rel="stylesheet" type="text/css" href="../css/content.css?v=Y" />
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/top_navi.js"></script>
<script type="text/javascript" src="../js/left_navi.js"></script>
<script type="text/javascript" src="../js/main.js"></script>
<script type="text/javascript" src="../js/common.js"></script>
<script type="text/javascript" src="../js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="../js/idangerous.swiper-2.1.min.js"></script>
<script type="text/javascript" src="../js/jquery.anchor.js"></script>


</head>

<body>
	<header>
		<div id="header-left">
			LMS <span>ENTERPRISE</span> Type
		</div>
		<div id="header-right">
			<span>관리자 (GMT+9:00) Seoul </span> <img
				src="http://lmsenterprise2019.itmap.co.kr/_admin/image/logout.png"
				alt="">
		</div>

		<script type="text/javascript">
			//삭제 확인
			function delete_check() {

				if (confirm("정말 삭제하시겠습니까?") == true) { //확인
					location.href = "faqdelete?hFnum=${admin_faqcontent.hFnum}";

				} else { //취소
					return false;
				}
			}
		</script>
	</header>

	<nav>
		<ul>
			<li><a href="#"><span class="nav1">&emsp;</span> 커뮤니티 </a></li>
			<li><a href="#"><span class="nav2">&emsp;</span> 회원관리 </a></li>
			<li><a href="admin_noticelist.html"><span class="nav3">&emsp;</span>
					게시판관리 </a></li>
			<li><a href="#"><span class="nav4">&emsp;</span> 상품관리 </a></li>
			</a>
			<li><a href="#"><span class="nav5">&emsp;</span> 통계관리 </a></li>
			</a>
			<li><a href="#"><span class="nav6">&emsp;</span> 환경설정 </a></li>
		</ul>
	</nav>


	<div id="left_list">
		<h1 id="left_t">게시판 관리</h1>


		<div id="left_m">
			<h2 id="left_t2">고객센터 관리</h2>

			<ul id="list">
				<a href="../admin/admin_noticelist">
					<li>NOTICE</li>
				</a>
				<a href="../admin/admin_inquirylist">
					<li>1:1문의</li>
				</a>
				<a href="../admin/admin_faqlist">
					<li>FAQ</li>
				</a>
				<a href="#">
					<li>이용안내</li>
				</a>
			</ul>
			<h2 id="left_t2">이벤트 관리</h2>

			<ul id="list">
				<a href="#">
					<li>NOTICE</li>
				</a>
				<a href="#">
					<li>1:1문의</li>
				</a>
				<a href="#">
					<li>FAQ</li>
				</a>
				<a href="#">
					<li>이용안내</li>
				</a>
			</ul>
		</div>


		<div id="main">

			<!-- contents -->
			<div id="contents">
				<div id="customer">
					<h2>
						<strong>FAQ</strong><span>회원님들께서 자주 묻는 질문들을 모아 놓았습니다.</span>
					</h2>

					<div class="viewDivMt">
						<div class="viewHead">
							<div class="subject">
								<ul>
									<li>${admin_faqcontent.hFtitle }</li>
								</ul>
							</div>
							
						<div class="viewContents">${admin_faqcontent.hFcontent }
						</div>
					</div>
					
					<!-- Btn Area -->
					<div class="btnArea btline">
						<div class="bRight">
							<ul>
								<li><a href="admin_faqlist" class="sbtnMini mw">목록</a></li>
								<li><a href="#" class="sbtnMini mw" onclick="delete_check()"> 삭제 </a></li>
								<li><a href="admin_faqmodify?hFnum=${admin_faqcontent.hFnum }" class="sbtnMini mw"> 수정 </a></li>
							</ul>
						</div>
					</div>
					<!-- //Btn Area -->

				</div>
			</div>
			<!-- //contents -->


		</div>
		<!--main-->

	</div>
	<!--left list-->
</body>

</html>