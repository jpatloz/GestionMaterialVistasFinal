<%@ include file="/vistas/cabecera.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menú para la Gestión Escolar</title>
</head>
<body>
<a href="<c:url value="insertarAlumnos" />">1.-Insertar Alumno</a><br>
<a href="<c:url value="insertarOrdenadores" />">2.-Insertar Ordenador</a><br>
<a href="<c:url value="buscarOrdenadorPorIdAlumno" />">3.-Buscar ordenador por id de alumno</a><br>
<a href="<c:url value="buscarAlumnoPorIdOrdenador" />">4.-Buscar alumno por id de ordenador</a><br>
<a href="<c:url value="buscarTodosLosAlumnos" />">5.-Listado de todos los alumnos</a>

</body>
</html>