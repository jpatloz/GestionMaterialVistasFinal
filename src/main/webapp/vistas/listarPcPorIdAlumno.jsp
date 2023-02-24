<%@ include file="/vistas/cabecera.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Encontrar Pc</title>
</head>
<body>
<h1>Nuevo Alumno</h1>
	<form:form method="POST" action="guardarPcPorIdAlumno"
		modelAttribute="alumno">
		<table>
			<tr>
				<td><form:label path="numeroAlumno">numero de alumno (id)</form:label></td>
				<td><form:input path="numeroAlumno" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Guardar" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>