<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to GetJobs</title>
<script type="text/javascript" language="javascript">
	function chk_onclick() {
		var myform = document.pform;
		if (myform.username.value == "" || myform.passwd.value == "") {
			alert("PLEASE COMPLETE ALL THE SPECIFICATION");
			if (myform.username.value == "") {
				myform.username.focus();
			} else {
				myform.passwd.focus();
			}
		}

	}
</script>
</head>
<body>
	<font face="verdana,arial" size=-1>
		<center>
			<table cellpadding=2 cellspacing=0 border=0 height=500 width=600>

				<tr>
					<td bgcolor="blue"><B>EMPLOYER'S LOGIN</B>
						<table cellpadding=0 cellspacing=0 border=0 width=100%>
							<tr>
								<img src="login-icon.gif" width="100" height="100">
								<td bgcolor="blue" align=center
									style="padding: 2; padding-bottom: 4"><b><font size=-1
										color="white" face="verdana,arial"><b>Enter your
												login and password</b></font></td>
							</tr>
							<tr>
								<td bgcolor="white" style="padding: 5"><br>

									<form method="post" action="Servlet1" name=pform>

										<center>
											<table>
												<tr>
													<td><font face="verdana,arial" size=-1>USERNAME:</td>
													<td><input type="text" name="username"></td>
												</tr>
												<tr>
													<td><font face="verdana,arial" size=-1>PASSWORD:</td>
													<td><input type="password" name="passwd"></td>
												</tr>
												<tr>
													<td><font face="verdana,arial" size=-1>&nbsp; </td>
													<td><font face="verdana,arial" size=-1> <input
															type="submit" value="SUBMIT" name=chkform
															onclick="chk_onclick()"></td>
												</tr>
												<tr>
													<td colspan=2><font face="verdana,arial" size=-1>&nbsp;</td>
												</tr>

												<tr>
													<td colspan=2><font face="verdana,arial" size=-1>Not
															member yet? Click <a href="emp_reg.jsp">here</a> to
															register.</td>
												</tr>
												<td align="right" valign="bottom"><img src="1.gif"
													width="5" height="5"></td>
											</table>
										</center>
									</form>
									<form method="post" action="home1.jsp">
										<input maxlength="255" size="30" value="HOME" type="submit">
									</form></td>
							</tr>
						</table></td>
				</tr>
			</table>
</body>
</html>