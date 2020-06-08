<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>INQUIRY WRITE</title>
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
            <li><a href="#"><span class="nav1">&emsp;</span> 커뮤니티 </a></li>
            <li><a href="#"><span class="nav2">&emsp;</span> 회원관리 </a></li>
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
        <div id="eventW_title">
		<p>당첨자 발표</p>
		</div>
		<form action="prizeWrite" name="adminEventW" method="post">
            <div id="contents2">
                <div id="mypage">

                    <div class="checkDiv">
                        <table summary="분류, 제목, 상세내용, 첨부파일 순으로 궁금하신 점을 문의 하실수 있습니다." class="checkTable" border="1"
                            cellspacing="0">
                            <caption>event</caption>
                            <colgroup>
                                <col width="19%" class="tw30" />
                                <col width="*" />
                            </colgroup>
                            
                            <tbody>
                                <tr>
                                    <th scope="row"><span>관리자</span></th>
                                    <td><input type="text" name="admin" class="wlong" readonly value="admin"/></td>
                                </tr>
                               
                                <tr>
                                    <th scope="row"><span>제목</span></th>
                                    <td><input type="text" name="prize_title" class="wlong" /></td>
                                </tr>
                                <tr>
                                    <th scope="row"><span>상세 내용</span></th>
                                    <td><textarea name="prize_content" class="tta"></textarea></td>
                                </tr>
                                <tr>
                                    <th scope="row"><span>첨부 파일</span></th>
                                    <td><input type="file" name="prize_file" class="fileType" /></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!-- Btn Area -->
                    <div class="adminbtnArea2">
                        <div class="bCenter">
                            <ul>
                                <li><a href="adminPrize" class="nbtnbig">취소</a></li>
                                <li><input type="submit" value="확인" class="sbtnMini" id="submit"></li>
                            </ul>
                        </div>
                    </div>
                    <!-- //Btn Area -->
                </div>
            </div>
		</form>
            <!-- //contents -->


        </div>
        <!--main-->

    </div>
    <!--left list-->
</body>

</html>