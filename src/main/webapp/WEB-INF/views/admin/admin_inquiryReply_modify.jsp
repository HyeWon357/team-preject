<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin Notice Modify</title>
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


<script type="text/javascript">
	var settimediv = 200000; //지속시간(1000= 1초)
	var msietimer;

	$(document).ready(function() {
		msiecheck();
	});

	var msiecheck = function() {
		var browser = navigator.userAgent.toLowerCase();
		if (browser.indexOf('msie 6') != -1 || browser.indexOf('msie 7') != -1
				|| browser.indexOf('msie 8') != -1) {
			msieshow();
		} else {
			msiehide();
		}
	}

	var msieshow = function() {
		$("#ieUser").show();
		msietimer = setTimeout("msiehide()", settimediv);
	}

	var msiehide = function() {
		$("#ieUser").hide();
		clearTimeout(msietimer);
	}

	//수정 확인
	function modify_check() {

		if (confirm("정말 수정하시겠습니까?") == true) { //확인
			document.replymodify.submit();

		} else { //취소
			return false;
		}
	}

	//취소 확인
	function cancel_check() {

		if (confirm("정말 취소하겠습니까?") == true) {
			location.href = "admin_inquirycontent";

		} else {
			return false;
		}
	}
</script>
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
	</header>

	<nav>
		<ul>
			<li><a href="../community/"><span class="nav1">&emsp;</span>
					커뮤니티 </a></li>
			<li><a href="../member/"><span class="nav2">&emsp;</span>
					회원관리 </a></li>
			<li><a href="../noticeboard/admin_noticelist.html"><span
					class="nav3">&emsp;</span> 게시판관리 </a></li>
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
				<div id="mypage">
					<h2>
						<strong>NOTICE</strong><span>쟈뎅샵 소식을 전해드립니다.</span>
					</h2>

					<!-- 답변 달기 -->
					<form  name="replymodify" method="post">
					<input type="hidden" name="hNnum" value="${admin_inquiryReply_modify.hNnum }">
						<div class="checkDiv">
							<table summary="분류, 제목, 상세내용, 첨부파일 순으로 궁금하신 점을 문의 하실수 있습니다."
								class="checkTable" border="1" cellspacing="0">
								<caption>1:1문의</caption>
								<colgroup>
									<col width="19%" class="tw30" />
									<col width="*" />
								</colgroup>
								<tbody>

									<tr>
										<th scope="row"><span>답변 내용</span></th>
										<td><input name="hRcontent" value="${admin_inquiryReply_modify.hRcontent}"></textarea> <br>
											<input type="hidden" name="hRcnum" value="${admin_inquiryReply_modify.hInum}"> <!-- value의 DB는 게시판의 번호로 해야함. (댓글 기능 db의 게시판 번호가 아님) -->
											<input type="hidden" name="hid2" value="${admin_inquiryReply_modify.hid}"></td>
									</tr>

								</tbody>
							</table>
						</div>

						<!-- Btn Area -->
						<div class="btnArea">
							<div class="bCenter">
								<ul>
									<li><a href="#" class="nbtnbig" onclick="cancel_check()">취소</a></li>
									<input type="button" class="sbtnMini" value="확인"
										onclick="modify_check()">
								</ul>
							</div>
						</div>
						<!-- //Btn Area -->
					</form>

				</div>
			</div>
			<!-- //contents -->


		</div>
		<!--main-->

	</div>
	<!--left list-->
</body>

</html>