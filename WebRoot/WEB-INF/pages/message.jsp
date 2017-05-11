<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
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
			<LI><A
				href="${pageContext.request.contextPath}/user/resumecheck.do">
					简历</A>
			</LI>
			<LI><A
				href="${pageContext.request.contextPath}/user/checkMessage.do">消息</A>
			</LI>

			<LI><A
				href="${pageContext.request.contextPath}/user/trunToChangePassword.do">
					修改密码</A>
			</LI>
			<LI><A href="${pageContext.request.contextPath }/exitLogin.do">
					退出 </A>
			</LI>
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
				<table id="myTable" border="0" width="100">
					<thead>
						<tr>
							<th colspan="5">我的消息</th>
						</tr>
						<tr>
							<td>投递时间</td>
							<td>是否查看</td>
							<td>是否面试</td>
							<td>面试时间</td>
							<td>是否录用</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${checkMessage }" var="checkMessage">
							<tr>
								<td><fmt:formatDate type="BOTH" value="${checkMessage.a_deliverTime}"/></td>
								<td>${checkMessage.a_check }</td>
								<td>${checkMessage.a_interview}</td>
								<td><fmt:formatDate type="BOTH" value="${checkMessage.a_interviewTime}"/></td>
								<td>${checkMessage.a_hire}</td>
							</tr>
						</c:forEach>
						<a herf="${pageContext.request.contextPath }/manager/test.do">${a_interview}</a>
					</tbody>
				</table>
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
