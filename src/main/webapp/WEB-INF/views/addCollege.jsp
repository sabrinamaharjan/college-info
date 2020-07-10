<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>College Registration Form</title>
<%-- <%@ include file="header.jsp"%> --%>
</head>
<body>
	<div>
		<form action="save_college" method="post">
			<fieldset>
				<legend> College Registration Form</legend>
				<div>
					<label> College's Name</label> <input type="text" name="name">
				</div>

				<div>
					Contact Information

					<div>
						<label> Phone Number</label> <input type="number" name="phone">
					</div>
					<div>
						<label> Dean's Name</label> <input type="text" name="deanName">
					</div>
				</div>
				<div>
					<label> Established Date</label> <input type="date" name="estd">
				</div>




				<div>
					<label> Hobbies</label> <input type="checkbox" name="hobbies"
						value="Reading"> Reading <input type="checkbox"
						name="hobbies" value="Playing"> Playing
				</div>
				<div>
					<label>Verification Type</label> <select name="verificationType">
						<option value="Citizenship">Citizenship</option>
						<option value="Passport ">Passport</option>
						<option value="SSN">SSN</option>
					</select>

				</div>









				<div>
					<div>
						<label style="font-weight: bold;">Address</label><br> <label>
							City Name</label> <input type="text" name="address.cityName">
					</div>
					<div>
						<label> Country Name </label> <input type="text"
							name="address.countryName">
					</div>
				</div>

				<div>
					<input type="submit" value="Submit">
				</div>

			</fieldset>
		</form>
	</div>
</body>
</html>