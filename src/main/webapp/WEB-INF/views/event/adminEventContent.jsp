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
			<div id="adcontents2">
				<div id="mypage">
					<h2><strong>진행중 이벤트</strong><span>쟈뎅샵의 특별한 혜택이 가득한 이벤트에 참여해 보세요.</span></h2>
					
					<div class="viewDivMt">
						<div class="viewHead">
							<div class="subject">
								<ul>
								<jsp:useBean id="now" class="java.util.Date" />
								<fmt:formatDate value="${now}" pattern="yyyy-MM-dd" var="today" />
								<fmt:parseDate value="${adminEContent.event_startDate }" var="event_startDate" pattern="yyyy-MM-dd"/>
								<fmt:formatDate value="${event_startDate }" var="start" pattern="yyyy-MM-dd" />
								<fmt:parseDate value="${adminEContent.event_endDate }" var="event_endDate" pattern="yyyy-MM-dd"/>
								<fmt:formatDate value="${event_endDate }" var="end" pattern="yyyy-MM-dd" />
								<c:if test="${today<start }">
									<li><span class="intendishbtn">준비중</span>&nbsp;${adminEContent.event_title }</li>
								</c:if>
								<c:if test="${start<=today && today<=end}">
									<li><span class="ingishbtn">진행중</span>&nbsp;${adminEContent.event_title }</li>
								</c:if>
								<c:if test="${today>end}">
									<li><span class="finishbtn">종료</span>&nbsp;${adminEContent.event_title }</li>
								</c:if>
								</ul>
							</div>
							<div class="day">
								<p class="txt">이벤트 기간<span>
								<fmt:parseDate value="${adminEContent.event_startDate }" var="event_startDate" pattern="yyyy-MM-dd"/>
								<fmt:formatDate value="${event_startDate }" pattern="yyyy-MM-dd" /> ~ 
								<fmt:parseDate value="${adminEContent.event_endDate }" var="event_endDate" pattern="yyyy-MM-dd"/>
								<fmt:formatDate value="${event_endDate }" pattern="yyyy-MM-dd" /></span></p>
								<p class="txt">조회수 <span>${adminEContent.event_hit }</span></p>
							</div>
						</div>

						<div class="viewContents">
							<img src="../images/img/${adminEContent.event_image2 }" alt="" />
						</div>
						<div class="viewContents">
						<p id="Econtent_text">${adminEContent.event_content }</p>
						</div>
					</div>


					<!-- 이전다음글 -->
					<div class="pnDiv web">
						<table summary="이전다음글을 선택하여 보실 수 있습니다." class="preNext" border="1" cellspacing="0">
							<caption>이전다음글</caption>
							<colgroup>
							<col width="100px" />
							<col width="*" />
							<col width="100px" />
							</colgroup>
							<tbody>
							<c:if test="${event_prev.event_id == null }">
								<tr>
									<th class="pre">PREV</th>
									<td>이전글이 없습니다.</td>
									<td>&nbsp;</td>
								</tr>
							</c:if>
							<c:if test="${event_prev.event_id != null }">
								<tr>
									<th class="pre">PREV</th>
									<td><a href="adminEventContent?event_id=${event_prev.event_id }">${event_prev.event_title }</a></td>
									<td>&nbsp;</td>
								</tr>
							</c:if>

							<c:if test="${event_next.event_id != null }">
								<tr>
									<th class="next">NEXT</th>
									<td><a href="adminEventContent?event_id=${event_next.event_id }">${event_next.event_title }</a></td>
									<td>&nbsp;</td>
								</tr>
							</c:if>
							<c:if test="${event_next.event_id == null }">
								<tr>
									<th class="next">NEXT</th>
									<td>다음글이 없습니다.</td>
									<td>&nbsp;</td>
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
								<li><a href="adminEventM?event_id=${adminEContent.event_id}" class="sbtnMini mw">수정</a></li>
								<li><a href="adminEventD?event_id=${adminEContent.event_id}" class="sbtnMini mw">삭제</a></li>
								<li><a href="adminEvent" class="sbtnMini mw">목록</a></li>
							</ul>
						</div>
					</div>
					<!-- //Btn Area -->


					<!-- 댓글-->
					<form action="eventReplyW" name="eventReplyW" method="post">
					<input type="hidden" name="event_id" value="${adminEContent.event_id }">
					<input type="hidden" name="eventReply_user" value="junny">
					<div class="replyWrite">
						<ul>
							<li class="in">
								<p class="txt">총<span class="orange">${count.eventReply_count }</span> 개의 댓글이 달려있습니다.</p>
								<h3><a href="event_view?event_id=${adminEContent.event_id }">댓글 보러 가기</a></h3>
	


        </div>
        <!--main-->

    </div>
    <!--left list-->
</body>

</html>