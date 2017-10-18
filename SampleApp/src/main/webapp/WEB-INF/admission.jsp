<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%-- <%@ taglib prefix="spring"uri="http://www.springframework.org/tags" %>> --%>
<html>
<body>

 <%--  <link rel="stylesheet" href="<spring:theme code="stylesheet"/>" type="text/css" />
  <p>
    <a href="/SampleApp/studentAdmissionform.html?siteTheme=green">Green</a>
     <a href="/SampleApp/studentAdmissionform.html?siteTheme=Red">Red</a> --%>
	<h1>${message}</h1>
	<h3>Student Registration form For Engineering</h3>
	
	<form:errors path="student.*"/>
    
	<form action="/SampleApp/studentAdmissionform.html" method="post">
		<table>
			<tr>
				<td>Student'Name: </td>  <td><input type="text" name="studentName" /></td>
			</tr>
			<tr>
				<td>Stuent'Hobby:  </td>  <td>  <input type="text" name="studentHobby" /></td>
			</tr>
			<tr>
				<td>Student'Mobile: </td>  <td> <input type="text" name="studentMobile" /></td>
			</tr>
			<tr>
				<td>Student'DOB: </td>  <td> <input type="text" name="studentDOB" /></td>
			</tr>
			<td>Student'Skills set:</td><td>
			<select name="studentSkills" multiple>
					<option value="Core java">Core Java</option>
					<option value="Spring core">Spring Core</option>
					<option value="Spring MVC">Spring MVC</option>
			</select> </td> 
			</table>
			
			<table>
			    <tr>
			      <td>Student's Address</td></tr>
			    <tr>
			       <td>Country: <input type="text" name="studentAddress.country"></td> 
			       <td>city: <input type="text" name="studentAddress.city"></td> 
			       <td>street: <input type="text" name="studentAddress.street"></td> 
			       <td>pincode: <input type="text" name="studentAddress.pincode"></td> 
			    </tr>   
			</table>
			 <tr><td><input type="submit" value="By Clicking Here">	</td></tr>
	</form>

</body>
</html>