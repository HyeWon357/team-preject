<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>INQUIRY CONTENT</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
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
	//html 페이지 모두 호출후에 jquery 실행

	$(function() {
		getreplyList();
	});

	//답글 리스트
	function getreplyList() {

		$.ajax({
			type : 'get',
			url : "./reply_list",
			dataType : "json",
			data : {hRcnum}, //hRcnum; 121 $("#formtable").serialize
			contentType : "application/json; charset=UTF-8",
			success : function(data) {
				alert("성공");
				
				var html = "";
				var Rlist = data.length; //list개수를 확인할 수 있다.
				$("#Rlist").html(Rlist);
				
				if(data.length > 0) {
					for(var i=0; i<data.length; i++){
					html += "<p id='writeForm'> 담당자 <span> &emsp;" + data[i].hRcontent + "</span></p>";
					}
					
				}else {
					html += "<p> 담당자 <span> 등록된 댓글이 없습니다. </span> </p>";
				}
				
				$('#REPLYLIST').html(html);
				
			},
			error : function(request, status, error) {
				alert("실패" + error);
			}
		});
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
						<strong>1:1문의</strong><span>쟈뎅에 궁금하신 사항을 남겨주시면 답변해드립니다.</span>
					</h2>
					<div class="viewDiv">
						<div class="viewHead">
							<div class="subject">
								<ul>
									<li class="cate">[기타]</li>
									<li>${admin_inquirycontent.hItitle }</li>
								</ul>
							</div>
							<div class="day">
								<p class="txt">
									등록일<span>${admin_inquirycontent.hIday }</span>
								</p>
								<p class="btn">
									<span class="obtnMini">답변완료</span>
								</p>
							</div>
						</div>

						<div class="viewContents">${admin_inquirycontent.hIcontent }
							<img alt="img"
								src="../uploadFile/${admin_inquirycontent.hIfile }">
						</div>
					</div>

					<form action="" id="replyForm" name="replyForm" method="post">
						<!-- 답변 -->
						<div class="answer">
							<div class="inbox">
								<div class="aname" id="REPLYLIST">
									
								</div>
								<div class="atxt">
								
								</div>
							</div>
						</div>
						<!-- //답변 -->
					</form>

					<br> <br>
					<form id="formtable" name="formtable" method="post">
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
										<td><textarea class="tta" maxlength=1000 id="hRcontent"
												name="hRcontent" placeholder="댓글을 입력해 주세요."></textarea> <br>
											<input type="hidden" name="hRcnum"
											value="${admin_inquirycontent.hInum}"> <input
											type="hidden" name="hRname"
											value="${admin_inquirycontent.hIid}"> <!-- 사용자 아이디-->
										</td>
									</tr>
								</tbody>
							</table>
						</div>

						<!-- Btn Area -->
						<div class="btnArea">
							<div class="bRight">
								<ul>
									<li><a href="admin_inquirylist" class="sbtnMini mw">목록</a></li>
									<li><a href="#" class="writeBtn" onclick="reply_write()">답글달기</a></li>
									<li><a href="#" class="nbtnbig mw"
										onclick="reply_modify()">수정</a></li>
									<li><a href="#" class="nbtnbig mw"
										onclick="reply_delete()">삭제</a></li>
								</ul>
							</div>
						</div>
						<!-- //Btn Area -->
					</form>


				</div>
			</div>
			<!-- //contents -->


		</div>
	</div>
	<!-- //container -->


	</div>
	<!--main-->

	</div>
	<!--left list-->
</body>

</html>