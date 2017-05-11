<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<HTML lang="">
<HEAD>
<META charset="utf-8">
<TITLE>Retina Dashboard</TITLE>
<META name="description" content="">
<META name="keywords" content="">
<META name="robots" content="">
<META name="viewport"
	content="width=device-width, minimum-scale=1.0, maximum-scale=1.0">
<LINK href="../css/style.css" rel="stylesheet" media="all">
<!--[if IE]><link rel="stylesheet" href="css/ie.css" media="all" /><![endif]-->
<META name="GENERATOR" content="MSHTML 11.00.10570.1001">
</HEAD>
<BODY>
	<DIV class="testing">
		<HEADER class="main">
			<H1>
				<STRONG>Retina</STRONG> Dashboard
			</H1>
			<INPUT type="text" value="search">
		</HEADER>
		<SECTION class="user">
			<DIV class="profile-img">
				<P>Welcome back John Doe</P>
			</DIV>
			</SPAN>
	</DIV>
	</SECTION>
	</DIV>
	<NAV>
		<UL>
			
			<LI><A href="${pageContext.request.contextPath }/exitLogin.do">
					退出 </A></LI>
		</UL>
	</NAV>
	<SECTION class="alert">
		<DIV class="green"></DIV>
	</SECTION>
	<SECTION class="content">
		<SECTION class="widget">
			<HEADER>
				<HGROUP>
					<H1>Icon fonts</H1>
					<H2>The Entypo Pictogram Suite</H2>
				</HGROUP>
			</HEADER>
			<DIV class="content">
				<c:forEach items="${listOfUserDetail}" var="userDetail">
					<form
						action="${pageContext.request.contextPath }/manager/updateInterviewMessage.do">
						<div id="detail">

							<table id="myTable" border="0" width="100">
								<thead>
									<tr>
										<th>个人简历</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>编号</td>
										<td>${userDetail.ud_id }</td>
										<td>姓名</td>
										<td>${userDetail.ud_realName}</td>
										<td>性别</td>
										<td>${userDetail.ud_gender}</td>

										<td>年龄</td>
										<td>${userDetail.ud_age}</td>
									</tr>
									<tr>
										<!--2-->
										<td>民族</td>
										<td>${userDetail.ud_nation}</td>
										<td>籍贯</td>
										<td>${userDetail.ud_native}</td>
										<td>学历</td>
										<td>${userDetail.ud_education}</td>
									</tr>
									<tr>
										<!--3-->
										<td>手机号</td>
										<td>${userDetail.ud_phone}</td>
										<td>邮箱</td>
										<td>${userDetail.ud_email}</td>
										<td>工作经验</td>
										<td>${userDetail.ud_experience}</td>
									</tr>
									<tr>
										<!--4-->
										<td>学校</td>
										<td>${userDetail.ud_school}</td>
										<td>健康状况</td>
										<td>${userDetail.ud_health}</td>
									</tr>
									<tr>
										<!--5-->
										<td>申请职位代码编号</td>
										<td>${userDetail.ud_p_id}</td>
									</tr>
									<tr>
										<!--7-->
										<td>地址</td>
										<td>${userDetail.ud_address}</td>
										<td>面试安排时间：<input type="text" name="dateString"
											value="yyyy-MM-dd HH:mm:ss"></td>
										<td><input type="submit" id="b_in" value="面试" onclick="">
										</td>
									</tr>
									<tr>
										<!--8-->
										<td>爱好</td>
										<td>${userDetail.ud_hobby}</td>
										<td><input type="text" style="display: none;"
											name="ud_id" value="${userDetail.ud_id}"></td>
										<td><input type="button" id="b_ba" value="返回">
										</td>
									</tr>
									<a
						href="${pageContext.request.contextPath }/manager/updateHireMessage.do?u_id=${userDetail.ud_u_id}"><button>录用此人</button></a>
								</tbody>
							</table>
						</div>
					</form>
					
				</c:forEach>
			</DIV>
		</SECTION>
	</SECTION>
	<SCRIPT
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></SCRIPT>

	<SCRIPT src="../js/jquery.wysiwyg.js"></SCRIPT>

	<SCRIPT src="../js/custom.js"></SCRIPT>

	<SCRIPT src="../js/cycle.js"></SCRIPT>

	<SCRIPT src="../js/jquery.checkbox.min.js"></SCRIPT>
	<!--<script src="js/flot.js"></script>
        <script src="js/flot.resize.js"></script>
        <script src="js/flot-graphs.js"></script>
        <script src="js/flot-time.js"></script>
        <script src="js/cycle.js"></script>-->
	<SCRIPT src="../js/jquery.tablesorter.min.js"></SCRIPT>
</BODY>
</HTML>
