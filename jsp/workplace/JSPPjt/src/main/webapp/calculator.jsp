<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
input{
	width:50px;
	height:50px;
}
.output{
	height:50px;
	background: #e9e9e9;
	font-size:24px;
}
</style>
</head>
<body>
	<form action="/cal3" method="POST">
		<table>
			<tr>
				<td class="output" colspan="4">0</td>
			</tr>
			<tr>
				<td><input	type="submit" value="CE" name="operator"></td>
				<td><input	type="submit" value="C" name="operator"></td>
				<td><input	type="submit" value="BACK" name="operator"></td>
				<td><input	type="submit" value="/" name="operator"></td>
			</tr>
			<tr>
				<td><input	type="submit" value="7" name="value"></td>
				<td><input	type="submit" value="8" name="value"></td>
				<td><input	type="submit" value="9" name="value"></td>
				<td><input	type="submit" value="*" name="operator"></td>
			</tr>
			<tr>
				<td><input	type="submit" value="4" name="value"></td>
				<td><input	type="submit" value="5" name="value"></td>
				<td><input	type="submit" value="6" name="value"></td>
				<td><input	type="submit" value="-" name="operator"></td>
			</tr>
			<tr>
				<td><input	type="submit" value="1" name="value"></td>
				<td><input	type="submit" value="2" name="value"></td>
				<td><input	type="submit" value="3" name="value"></td>
				<td><input	type="submit" value="+" name="operator"></td>
			</tr>
			<tr>
				<td><input	type="submit" value="0" name="value"></td>
				<td><input	type="submit" value="." name="dot"></td>
				<td><input	type="submit" value="=" name="operator"></td>
			</tr>
			
		</table>
	</form>
</body>
</html>