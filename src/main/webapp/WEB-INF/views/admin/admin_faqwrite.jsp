<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>FAQ WRITE</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
<link rel="stylesheet" href="../css/admin_account.css">
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

        $(document).ready(function () {
            msiecheck();
        });

        var msiecheck = function () {
            var browser = navigator.userAgent.toLowerCase();
            if (browser.indexOf('msie 6') != -1
                || browser.indexOf('msie 7') != -1
                || browser.indexOf('msie 8') != -1) {
                msieshow();
            } else {
                msiehide();
            }
        }

        var msieshow = function () {
            $("#ieUser").show();
            msietimer = setTimeout("msiehide()", settimediv);
        }

        var msiehide = function () {
            $("#ieUser").hide();
            clearTimeout(msietimer);
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

			<!-- <table class="header-tb">
        <tr>
          <td class="select">
            <img src="http://lmsenterprise2019.itmap.co.kr/_admin/image/KOR.png" alt="">
            <span>한국어</span>
          </td>
          <td class="arrow">
            <div class="separator"></div>
            <span>▼</span>
          </td>
        </tr>
      </table>

      <table class="header-tb">
        <tr>
          <td class="select">
            <span>LMS 매뉴얼</span>
          </td>
          <td class="arrow">
            <div class="separator"></div>
            <span>▼</span>
          </td>
        </tr>
      </table> -->
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
						<strong>1:1문의</strong><span>쟈뎅에 궁금하신 사항을 남겨주시면 답변해드립니다.</span>
					</h2>

					<div class="myInfo">
						<ul>
							<li class="info"><strong>가나다</strong> 님의 정보를 한눈에 확인하세요.</li>
							<li>보유 쿠폰<br /> <span class="num">199</span> <span
								class="unit">장</span></li>
							<li class="point">내 포인트<br /> <span class="num">100,000</span>
								<span class="unit">P</span></li>
							<li class="last">진행중인 주문<br /> <span class="num">199</span>
								<span class="unit">건</span></li>
						</ul>
					</div>

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
								<tr>
									<th scope="row"><span>작성자</span></th>
									<td><input type="text" class="wlong" /></td>
								</tr>
								<th scope="row"><span>분류</span></th>
								<td><select>
										<option value="">선택해주세요.</option>
										<option value="">회원가입</option>
										<option value="">상품</option>
										<option value="">주문</option>
								</select></td>
								</tr>
								<tr>
									<th scope="row"><span>제목</span></th>
									<td><input type="text" class="wlong" /></td>
								</tr>
								<tr>
									<th scope="row"><span>상세 내용</span></th>
									<td><textarea class="tta"></textarea></td>
								</tr>

							</tbody>
						</table>
					</div>

					<!-- Btn Area -->
					<div class="btnArea">
						<div class="bCenter">
							<ul>
								<li><a href="admin_faqlist.html" class="nbtnbig">취소</a></li>
								<li><a href="#" class="sbtnMini">확인</a></li>
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