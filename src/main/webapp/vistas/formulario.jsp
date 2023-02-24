<%@ include file="/vistas/cabecera.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Formulario</title>
</head>
<body>
	<h1>Nuevo Alumno</h1>
	<form:form method="POST" action="guardarAlumno"
		modelAttribute="alumnoV">
		<table>
			<tr>
				<td><form:label path="nombreAlumno">Nombre del alumno</form:label></td>
				<td><form:input path="nombreAlumno" /></td>
			</tr>
			<tr>
				<td><form:label path="numeroAlumno">numero de alumno (id)</form:label></td>
				<td><form:input path="numeroAlumno" /></td>
			</tr>
			<tr>
				<td><form:label path="telefonoAlumno">Numero de Telefono</form:label></td>
				<td><form:input path="telefonoAlumno" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Guardar" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>