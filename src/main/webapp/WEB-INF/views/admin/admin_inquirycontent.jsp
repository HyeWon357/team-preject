<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
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
	
	var hRcnum = ${admin_inquirycontent.hInum};
	
	$(function() {
		getreplyList();
	});

	//답글 리스트
	function getreplyList() {

		$ .ajax({
					type : 'get', //http 요청방식 (get,post)
					url : "./reply_list", //controller에서 호출 url주소
					dataType : "json", //서버에 보내줄 데이터 타입
					data : {hRcnum: hRcnum}, //controller로 보낼 데이터
					contentType : "application/json; charset=UTF-8",
					success : function(data) {

						var html = "";
						var Rlist = data.length; //list개수를 확인할 수 있다.
						$("#Rlist").html(Rlist);

						if (data.length > 0) {

							for (var i = 0; i < data.length; i++) {
								html += "<p id='writeForm"+ data[i].hRnum +"'> 담당자 <span> &emsp;"
										+ data[i].hRcontent + "</span></p>";
							}

						} else {
							html += "<p> 담당자 <span> 등록된 댓글이 없습니다. </span> </p>";
						}

						$('#REPLYLIST').html(html);

					},
					error : function(request, status, error) {
						alert("실패" + error);
					}
				});
	}

	
	//답글 쓰기
	function reply_write(hRnum) {
		
		$.ajax({
			type: 'post',
			url: "./reply_write",
			data: $("#reply_Form").serialize(),
			success: function (data) {
				alert("답변 달기 완료.");
				
				if(data == "success") {
					getreplyList();
					$("#hRcontent").val("");
				}
			},
			error:  function(request, status, error) {
				alert("실패: " + error);
			}
		});
	}
	
	
	//답변 삭제
	function reply_delete() {
		
		$.ajax({
			type:'post',
			url: "./reply_delete",
			data: {hRcnum: hRcnum},
			success: function (data) {
				alert("답변 삭제 완료");
				
				if(data == "success") {
					getreplyList();
				}
			},
			error: function(request, status, error) {
				alert("실패: " + error);
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
			<li><a href="../noticeboard/admin_noticelist"><span
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
				<input type="hidden" name="hid">
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
							<br> <br> <img alt="img"
								src="../uploadFile/${admin_inquirycontent.hIfile }">
						</div>
					</div>

					<!-- 답변 -->
					<div class="answer">
						<div class="inbox">
							<div class="aname" id="REPLYLIST"></div>
							<div class="atxt"></div>
						</div>
					</div>
					<!-- //답변 -->

					<br>
					<br>
					
					<!-- 답변 달기 -->
					<form id="reply_Form" name="reply_Form" method="post">
						<div class="checkDiv">
							<table summary="분류, 제목, 상세내용, 첨부파일 순으로 궁금하신 점을 문의 하실수 있습니다." class="checkTable" border="1" cellspacing="0">
								<caption>1:1문의</caption>
								<colgroup>
									<col width="19%" class="tw30" />
									<col width="*" />
								</colgroup>
								<tbody>

									<tr>
										<th scope="row"><span>답변 내용</span></th>
										<td>
										<textarea class="tta" maxlength=1000 id="hRcontent" name="hRcontent" placeholder="댓글을 입력해 주세요."></textarea> 
										<br>
										<input type="hidden" name="hRcnum" value="${admin_inquirycontent.hInum}"> <!-- value의 DB는 게시판의 번호로 해야함. (댓글 기능 db의 게시판 번호가 아님) -->
										<input type="hidden" name="hid2" value="${admin_inquirycontent.hid}">
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
									<li><a href="admin_inquiryReply_modify" class="nbtnbig mw">답글 수정</a></li>
									<li><a href="#" class="nbtnbig mw" onclick="reply_delete()">답글 삭제</a></li>
								</ul>
							</div>
						</div>
						
						<!-- 이전다음글 -->
					<div class="pnDiv web">
						<table summary="이전다음글을 선택하여 보실 수 있습니다." class="preNext" border="1"
							cellspacing="0">
							<caption>이전다음글</caption>
							<colgroup>
								<col width="100px" />
								<col width="*" />
							</colgroup>

							<tbody>
								<c:if test="${inquiry_prev.hInum == null}">
									<tr>
										<th class="pre">PREV</th>
										<td>이전글이 없습니다.</td>
										<td>&nbsp;</td>
									</tr>
								</c:if>

								<c:if test="${inquiry_prev.hInum != null}">
									<tr>
										<th class="pre">PREV</th>
										<td><a href="admin_inquirycontent?hInum=${inquiry_prev.hInum}">${inquiry_prev.hItitle}</a></td>
										<td>&nbsp;</td>
									</tr>
								</c:if>

								<c:if test="${inquiry_next.hInum == null}">
									<tr>
										<th class="next">NEXT</th>
										<td>다음글이 없습니다.</td>
										<td>&nbsp;</td>
									</tr>
								</c:if>

								<c:if test="${inquiry_next.hInum != null}">
									<tr>
										<th class="next">NEXT</th>
										<td><a href="admin_inquirycontent?hInum=${inquiry_next.hInum}">${inquiry_next.hItitle}</a></td>
										</td>
										<td>&nbsp;</td>
									</tr>
								</c:if>
							</tbody>
						</table>
					</div>
					<!-- //이전다음글 -->
					
					</form>
					<!-- //Btn Area -->

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