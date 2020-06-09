<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NOTICE LIST</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
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
            <span>관리자 (GMT+9:00) Seoul </span>
            <img src="http://lmsenterprise2019.itmap.co.kr/_admin/image/logout.png" alt="">

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
            <li><a href="../community/"><span class="nav1">&emsp;</span> 커뮤니티 </a></li>
            <li><a href="../member/"><span class="nav2">&emsp;</span> 회원관리 </a></li>
            <li><a href="../noticeboard/admin_noticelist.html"><span class="nav3">&emsp;</span> 게시판관리 </a></li>
            <li><a href="#"><span class="nav4">&emsp;</span> 상품관리 </a></li></a>
            <li><a href="#"><span class="nav5">&emsp;</span> 통계관리 </a></li></a>
            <li><a href="#"><span class="nav6">&emsp;</span> 환경설정 </a></li>
        </ul>
    </nav>


    <div id="left_list">
        <h1 id="left_t">게시판 관리</h1>


        <div id="left_m">
            <h2 id="left_t2">고객센터 관리</h2>

            <ul id="list">
                <a href="../noticeboard/admin_noticelist.html">
                    <li>NOTICE</li>
                </a>
                <a href="../noticeboard/admin_inquirylist.html">
                    <li>1:1문의</li>
                </a>
                <a href="../noticeboard/admin_faqlist.html">
                    <li>FAQ</li>
                </a>
                <a href="#">
                    <li>이용안내</li>
                </a>
            </ul>

            <h2 id="left_t2">이벤트 관리</h2>

            <ul id="list">
                <a href="event">
                    <li>이벤트</li>
                </a>
                 <a href="adminEvent">
                    <li>진행중 이벤트</li>
                </a>
                <a href="adminCloseEvent">
                    <li>종료된 이벤트</li>
                </a>
                <a href="adminPrize">
                    <li>당첨자 발표</li>
                </a>
            </ul>
        </div>


        <div id="main">

           <!-- contents -->
			<div id="contents2">
				<div id="mypage">
					<h2><strong>당첨자 발표</strong><span>쟈뎅샵의 특별한 혜택이 가득한 이벤트의 당첨자를 발표합니다. </span></h2>

					<div class="viewDivMt">
						<div class="viewHead">
							<div class="subject">
								<ul>
									<li>${adminPContent.prize_title }</li>
								</ul>
							</div>
							<div class="data">
								<ul>
									<li>등록일<span>
									<fmt:parseDate value="${adminPContent.prize_date }" var="prize_date" pattern="yyyy-MM-dd"/>
									<fmt:formatDate value="${prize_date }" pattern="yyyy-MM-dd" />
									</span></li>
									<li>조회수<span>${adminPContent.prize_hit }</span></li>
								</ul>
							</div>
						</div>

						<div class="viewContents">
							${adminPContent.prize_content }<br/>
							${adminPContent.prize_file }
						</div>
					</div>


					<!-- 이전다음글 -->
					<div class="pnDiv web">
						<table summary="이전다음글을 선택하여 보실 수 있습니다." class="preNext" border="1" cellspacing="0">
							<caption>이전다음글</caption>
							<colgroup>
							<col width="100px" />
							<col width="*" />
							</colgroup>
							<tbody>
							<c:if test="${prize_next.prize_id ==null }">
								<tr>
									<th class="pre">NEXT</th>
									<td>다음 글이 없습니다.</td>
								</tr>
							</c:if>
							<c:if test="${prize_next.prize_id !=null }">
								<tr>
									<th class="pre">NEXT</th>
									<td><a href="adminPContent?prize_id=${prize_next.prize_id }">${prize_next.prize_title }</a></td>
								</tr>
							</c:if>
							<c:if test="${prize_prev.prize_id !=null }">
								<tr>
									<th class="next">PREV</th>
									<td><a href="adminPContent?prize_id=${prize_prev.prize_id }">${prize_prev.prize_title }</a></td>
								</tr>
							</c:if>
							<c:if test="${prize_prev.prize_id ==null }">
								<tr>
									<th class="next">PREV</th>
									<td>이전 글이 없습니다.</td>
								</tr>
							</c:if>
							</tbody>
						</table>
					</div>
					<!-- //이전다음글 -->


					<!-- Btn Area -->
					<div class="adminbtnArea">
						<div class="bRight">
							<ul>
								<li><a href="adminPrizeM?prize_id=${adminPContent.prize_id}" class="sbtnMini mw">수정</a></li>
								<li><a href="prizeDelete?prize_id=${adminPContent.prize_id}" class="sbtnMini mw">삭제</a></li>
								<li><a href="adminPrize" class="sbtnMini mw">목록</a></li>
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