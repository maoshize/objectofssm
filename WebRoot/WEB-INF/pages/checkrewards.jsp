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
				href="${pageContext.request.contextPath }/user/checkUserDetail.do">
					个人信息</A>
			</LI>
			<LI><A href="#"> 考勤</A>
				<UL class="submenu">
					<LI><A
						href="${pageContext.request.contextPath }/stuff/onwork.do">签到</A>
					</LI>
					<LI><A
						href="${pageContext.request.contextPath }/stuff/offwork.do">打卡</A>
					</LI>
				</UL>
			</LI>
			<LI><A href="#"> 记录 </A>
				<UL class="submenu">
					<LI><A
						href="${pageContext.request.contextPath }/stuff/checkworkrecord.do">考勤记录</A>
					</LI>
					<LI><A
						href="${pageContext.request.contextPath }/stuff/turnToRewards.do">奖惩记录</A>
					</LI>
				</UL>
			</LI>
			<LI><A href="#"> 薪资相关 </A>
				<UL class="submenu">
					<LI><A
						href="${pageContext.request.contextPath }/stuff/turnToWages.do">薪资详情</A>
					</LI>
					<LI><A
						href="${pageContext.request.contextPath }/stuff/turnToDissent.do">薪资异议</A>
					</LI>

				</UL>
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
					
				</HGROUP>
			</HEADER>
			<DIV class="content">
			<form
		action="${pageContext.request.contextPath }/stuff/checkrewards.do"
		method="post">
		<select name="work_rewards_year">
			<option value="2010">2010年</option>
			<option value="2011">2011年</option>
			<option value="2012">2012年</option>
			<option value="2013">2013年</option>
			<option value="2014">2014年</option>
			<option value="2015">2015年</option>
			<option value="2016">2016年</option>
		</select> <select name="work_rewards_month">
			<option value="01">01月</option>
			<option value="02">02月</option>
			<option value="03">03月</option>
			<option value="04">04月</option>
			<option value="05">05月</option>
			<option value="06">06月</option>
			<option value="07">07月</option>
			<option value="08">08月</option>
			<option value="09">09月</option>
			<option value="10">10月</option>
			<option value="11">11月</option>
			<option value="12">12月</option>
		</select><input type="submit" value="查询">
	</form>
			<table id="myTable" border="0" width="100">
				<thead>
					<tr>
			<td>时间</td>
			<td>类型</td>
			<td>金额</td>
			<td>原因</td>
		</tr>
				</thead>
					<tbody>
						<c:forEach items="${listOfRewards }" var="reward">
			<tr>
				<td>${reward.r_time }</td>
				<td>${reward.r_type }</td>
				<td>${reward.r_rewards }</td>
				<td>${reward.r_reason }</td>
			</tr>
		</c:forEach>
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
