<%@ include file="/vistas/cabecera.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Alumnos</title>
</head>
<body>
	<c:forEach items="${miModelo.alumnos}" var="alum">
		<c:out value="${alum.nombreAlumno}" />
		<i><c:out value="${alum.numeroAlumno}" /></i>
		<a href="eliminarAlumno?numeroAlumno=${alum.numeroAlumno}">
			<button type="button">Eliminar</button>
		</a>
		<br>
		<br>
	</c:forEach>
</body>
</html>