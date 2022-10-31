<%@include file="../header.jsp"%>

<section class="container">
  <h1> ${title} </h1>

  <table class="table">
    <thead>
      <th> Nome </th>
      <th> Data </th>
      <th> Descricao </th>
      <th> Curso </th>
      <th> Professor </th>
      <th> Alunos </th>
      <th> Monitor </th>
    </thead>
    <tbody>
      <c:forEach var="disciplina" items="${disciplinas}">
        <tr>
          <td> <c:out value="${disciplina.nome}" /> </td>
          <td> <c:out value="${disciplina.data}" /> </td>
          <td> <c:out value="${disciplina.descricao}" /> </td>
          <td> <c:out value="${disciplina.curso.nome}" /> </td>
          <td> <c:out value="${disciplina.professor.nome}" /> </td>
          <td> <c:out value="${disciplina.alunos.size()}" /> </td>
          <td> <c:out value="${disciplina.monitor.nome}" /> </td>
        </tr>
      </c:forEach>
    </tbody>
  </table>

</section>
