<%@ include file="/vistas/cabecera.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Alumnos</title>
</head>
<body>
	<c:forEach items="${miModelo.alumnos}" var="alumno">
		<c:out value="${alumno.nombre_alumno}" />
		<c:out value="${alumno.apellidos_alumno}" />
		<i><c:out value="${alumno.id_alumno}" /></i>
		<a href="eliminarAlumno?id_alumno=${alumno.id_alumno}"><button type="button">Eliminar</button></a>
	</c:forEach>
	<br>
	<br>
	<button type="button" onclick="history.back()">Volver</button>
</body>
</html>