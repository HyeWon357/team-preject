<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>NOTICE LIST</title>
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
	</header>

	<nav>
		<ul>
			<li><a href="../"><span class="nav1">&emsp;</span> 커뮤니티 </a></li>
			<li><a href="../"><span class="nav2">&emsp;</span> 회원관리 </a></li>
			<li><a href="../admin_noticelist.html"><span class="nav3">&emsp;</span>
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
						<strong>NOTICE</strong><span>쟈뎅샵 소식을 전해드립니다.</span>
					</h2>

					<div class="orderDivMt">
						<table summary="NO, 제목, 등록일, 조회수 순으로 공지사항을 조회 하실수 있습니다."
							class="orderTable2" border="1" cellspacing="0">
							<caption>공지사항 보기</caption>
							<colgroup>
								<col width="10%" class="tnone" />
								<col width="*" />
								<col width="14%" class="tw25" />
								<col width="14%" class="tnone" />
							</colgroup>

							<thead>
								<th scope="col" class="tnone">NO.</th>
								<th scope="col">제목</th>
								<th scope="col">등록일</th>
								<th scope="col" class="tnone">조회수</th>
							</thead>


							<tbody>
								<c:forEach var="dto" items="${notice_list }">
									<tr>
										<td class="tnone">${dto.hNnum}</td>
										<td class="left"><a
											href="notice_content?hNnum=${dto.hNnum}"> ${dto.hNtitle}</a>
											<img src="../images/ico/ico_new.gif" alt="NEW" /></td>
										<td>${dto.hNday }</td>
										<td class="tnone right">${dto.hNhit }</td>
									</tr>
								</c:forEach>
							</tbody>

						</table>
					</div>



					<div class="btnAreaList">
						<!-- 페이징이동1 -->
						<div class="allPageMoving1">

							<a href="#" class="n"><img src="../images/btn/btn_pre2.gif"
								alt="처음으로" /></a><a href="#" class="pre"><img
								src="../images/btn/btn_pre1.gif" alt="앞페이지로" /></a> <strong>1</strong>
							<a href="#">2</a> <a href="#">3</a> <a href="#">4</a> <a href="#">5</a>
							<a href="#" class="next"><img
								src="../images/btn/btn_next1.gif" alt="뒤페이지로" /></a><a href="#"
								class="n"><img src="../images/btn/btn_next2.gif"
								alt="마지막페이지로" /></a>

						</div>
						<!-- //페이징이동1 -->
					</div>

					<div class="searchWrap">
						<div class="search">
							<ul>
								<li class="web"><img src="../images/txt/txt_search.gif"
									alt="search" /></li>
								<li class="se"><select>
										<option value="" />제목
										</option>
								</select></li>
								<li><input type="text" class="searchInput" /></li>
								<li class="web"><a href="#"><img
										src="../images/btn/btn_search.gif" alt="검색" /></a></li>
								<li class="mobile"><a href="#"><img
										src="../images/btn/btn_search_m.gif" alt="검색" /></a></li>
							</ul>
						</div>
					</div>
					<!-- //포토 구매후기 -->


				</div>
			</div>
			<!-- //contents -->
		</div>
		<!--main-->

	</div>
	<!--left list-->
</body>

</html>