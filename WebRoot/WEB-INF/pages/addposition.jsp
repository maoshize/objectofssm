﻿<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
				<P>Welcome back ${u_name }</P>
			</DIV>
			</SPAN>
	</DIV>
	</SECTION>
	</DIV>
	<NAV>
		<UL>
			<LI><A
				href="${pageContext.request.contextPath }/admin/turnToStuff.do">
					员工管理</A></LI>
			<LI><A
				href="${pageContext.request.contextPath }/admin/turnToChargeEmployee.do">
					招聘管理</A></LI>
			<LI><A
				href="${pageContext.request.contextPath }/admin/turnToChargePosition.do">
					岗位管理 </A></LI>
			<LI><A
				href="${pageContext.request.contextPath }/admin/turnToChargeTrain.do">
					培训管理 </A></LI>

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
				<form
					action="${pageContext.request.contextPath}/admin/addposition.do"
					method="post">
					<ul style="list-style:circle;">
						<li>职位名称：<input type="text" id="" name="p_position">
							<span id="error1" style="color: red"></span>
						</li>
						<li>所属部门：<select name="p_d_id">

								<c:forEach items="${listOfDepartment }" var="department">
									<option value="${department. d_id}">${department.d_department
										}</option>
								</c:forEach>
						</select>
						<li>职位薪资：<input type="text" id="" name="p_salary">
						</li>
					</ul>
					<input type="submit" id="sub" value="提交" /> <input type="reset"
						id="res" value="取消" />
				</form>
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