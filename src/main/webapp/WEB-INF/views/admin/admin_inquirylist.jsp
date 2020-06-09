<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>INQUIRY LIST</title>
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


					<div class="orderDivNm">
						<table
							summary="NO, 종류, 적립포인트, 적립날짜, 상태 순으로 현재 적립된 포인트를 조회 하실수 있습니다."
							class="orderTable2" border="1" cellspacing="0">
							<caption>적립내역 보기</caption>
							<colgroup>
								<col width="9%" class="tnone" />
								<col width="14%" class="tw20" />
								<col width="*" />
								<col width="15%" class="tnone" />
								<col width="15%" class="tw30" />
							</colgroup>
							<thead>
								<th scope="col" class="tnone">NO.</th>
								<th scope="col">분류</th>
								<th scope="col">제목</th>
								<th scope="col" class="tnone">등록일</th>
								<th scope="col">처리상태</th>
							</thead>
							
							<tbody>
							<c:forEach var="dto" items="${admin_inquirylist}">
								<tr>
									<td class="tnone">${dto.hInum}</td>
									<td>상품</td>
									<td class="left"><a href="admin_inquirycontent?hInum=${dto.hInum}">${dto.hItitle}</a></td>
									<td class="tnone">${dto.hIday}</td>
									<td>
										<ul class="state">
											<li>
												<div class="nbtnMini iw83">답변대기</div>
											</li>
										</ul>
									</td>
								</tr>
								
								</c:forEach>

							</tbody>
						</table>

						 <!-- <div class="noData">문의 하신 내용이 없습니다.</div> -->
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

				</div>
			</div>
			<!-- //contents -->

		</div>
		<!--main-->

	</div>
	<!--left list-->
</body>

</html>