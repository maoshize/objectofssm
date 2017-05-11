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
				<table id="myTable" border="0" width="100">
					<form
						action="${pageContext.request.contextPath }/admin/checkPositionAndStuff.do"
						method="post">
						<select name="department">
							<c:forEach items="${listOfDepartment }" var="department">
								<option value="${department.d_id }">${department.d_department
									}</option>
							</c:forEach>
						</select> <select name="position">
							<c:forEach items="${listOfPosition }" var="position">
								<option value="${position.p_d_id }">${position.p_position}
								</option>
							</c:forEach>
						</select> <input type="submit" value="查找岗位员工">
					</form>
					<a><button>增加岗位</button> </a>
					<a><button>删除岗位</button> </a>
					<a><button>返回</button> </a>
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
