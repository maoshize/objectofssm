<%@page import="main.java.com.msz.entity.UserDetail"%>
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
			<LI><A
				href="${pageContext.request.contextPath}/user/resumecheck.do">
					简历</A></LI>
			<LI><A
				href="${pageContext.request.contextPath}/user/checkMessage.do">消息</A>
			</LI>

			<LI><A
				href="${pageContext.request.contextPath}/user/trunToChangePassword.do">
					修改密码</A></LI>
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
			<form action="${pageContext.request.contextPath }/user/insertDetail.do"
		method="post">
		<table id="myTable" border="0" width="100">
			<tr>
				<th colspan="6">个人简历</th>
			</tr>
			<tr>
				<!--1-->
				<td>姓名</td>
				<td><input type="text" name="ud_realName" /></td>
				<td>性别</td>
				<td><span class="sex"><input type="radio"
						class="ud_gender" value="男" checked name="ud_gender">男 <input
						type="radio" value="女" class="ud_gender" name="ud_gender">女</span>
				</td>

				<td>年龄</td>
				<td><input name="ud_age" />
				</td>
			</tr>
			<tr>
				<!--2-->
				<td>民族</td>
				<td><input type="text" name="ud_nation" />
				</td>
				<td>籍贯</td>
				<td><input type="text" name="ud_native" />
				</td>
				<td>学历</td>
				<td><input type="text" name="ud_education" />
				</td>
			</tr>
			<tr>
				<!--3-->
				<td>手机号</td>
				<td><input type="text" name="ud_phone" />
				</td>
				<td>邮箱</td>
				<td><input type="text" name="ud_email" />
				</td>
				<td>工作经验</td>
				<td><input type="text" name="ud_experience" />
				</td>
			</tr>
			<tr>
				<!--4-->
				<td>学校</td>
				<td colspan="5"><input type="text"
					 name="ud_school" />
				</td>
			</tr>
			<tr>
				<!--5-->
				<td>申请职位</td>
			意愿部门：
					<select name="department">
					<c:forEach items="${listOfDepartment }" var="department">
						<option value="${department.d_id }">${department.d_department }</option>
						</c:forEach>
				</select> <select name="position">
						<c:forEach items="${listOfPosition }" var="position">
						<option value="${position.p_id }">${position.p_position }</option>
						</c:forEach>
				</select>
				</td>
				<td>健康状况</td>
				<td><input type="text" name="ud_health" />
				</td>
			</tr>
			<tr>
				<!--7-->
				<td>地址</td>
				<td colspan="4"><input type="text"
					 name="ud_address" />
				</td>
			</tr>
			<tr>
				<!--8-->
				<td>爱好</td>
				<td colspan="4"><input type="text"
					 name="ud_hobby" />
				</td>
			</tr>
		</table>
		<input type="submit" value="保存"><input type="reset" value="重置">
	</form></DIV>
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
