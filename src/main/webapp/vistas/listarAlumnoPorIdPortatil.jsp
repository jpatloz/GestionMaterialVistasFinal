<%@ include file="/vistas/cabecera.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Encontrar Alumno</title>
</head>
<body>
<h1>Encontrar alumno por id del pc</h1>
	<form:form method="POST" action="guardarAlumnoPorIdPortatil"
		modelAttribute="ordenador">
		<table>
			<tr>
				<td><form:label path="identificador">Identificador</form:label></td>
				<td><form:input path="identificador" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Guardar" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>