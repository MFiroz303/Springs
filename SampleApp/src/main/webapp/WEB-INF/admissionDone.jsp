<html>
<body>
	<h1>${message}</h1>
	<h3>Congratulations! form proceed Successfully</h3>
	<h2>Details Submitted by you:</h2>

	<table>
		<tr>
			<td>Student Name:</td>
			<td>${student.studentName}</td>
		</tr>
		<tr>
			<td>Student Hobby:</td>
			<td>${student.studentHobby}</td>
		</tr>
		<tr>
			<td>Student Mobile:</td>
			<td>${student.studentMobile}</td>
		</tr>
		<tr>
			<td>Student DOB:</td>
			<td>${student.studentDOB}</td>
		</tr>
		<tr>
			<td>Student Skills:</td>
			<td>${student.studentSkills}</td>
		</tr>
		
		<tr>
			<td>Student Address:</td>
			<td>country:${student.studentAddress.country}
			    city:${student.studentAddress.city}
			    street:${student.studentAddress.street}
			    pincode:${student.studentAddress.pincode}</td>
		</tr>
	</table>
	
</body>
</html>