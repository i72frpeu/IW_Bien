<head>
<meta charset="ISO-8859-1">
  <title>WireFrame 7.3</title>
  <link rel="stylesheet" href="../../css/wf7.2.css">
</head>

<body>

  <h2><strong>Datos Laborales</strong></h2>
  <div>
     <table class="table_curr">
         <tr>
             <td>
                 <table>
                     <tr>
                         <td>Tipo</td>
                         <td><%= request.getParameter("tipo") %></td>
                     </tr>
                     <tr>
                         <td>Empresa</td>
                         <td><%= request.getParameter("organizacion") %></td>
                     </tr>
                     <tr>
                         <td>Fecha de inicio</td>
                         <td><%= request.getParameter("start") %></td>
                     </tr>
                     <tr>
                         <td>Fecha de fin</td>
                         <td><%= request.getParameter("end") %></td>
                     </tr>
                 </table>
             </td>
         </tr>
     </table>
	<button onclick="self.close();">Volver</button> <a href="../control/loginProfesionalExperienceControl.jsp"><button>Editar</button></a><br>
  </div>
</body>
</html>