<%@include file="../header.jsp"%>

<section class="container">
  <h1> ${title} </h1>

  <table class="table">
    <thead>
      <th> Nome </th>
      <th> Nota </th>
      <th> Descricao </th>
      <th> Professor </th>
    </thead>
    <tbody>
      <c:forEach var="curso" items="${cursos}">
        <tr>
          <td> <c:out value="${curso.nome}" /> </td>
          <td> <c:out value="${curso.nota}" /> </td>
          <td> <c:out value="${curso.descricao}" /> </td>
          <td> <c:out value="${curso.professor.nome}" /> </td>
        </tr>
      </c:forEach>
    </tbody>
  </table>

</section>
