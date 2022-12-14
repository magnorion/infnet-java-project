<%@include file="../header.jsp"%>

<section class="container">
  <h1> ${title} </h1>
  <p> <a class="btn btn-primary" href="/aluno/cadastro"> Cadastrar Aluno </a> </p>

  <table class="table">
    <thead>
      <th> Nome </th>
      <th> Telefone </th>
      <th> Email </th>
      <th> Idade </th>
      <th> Registro </th>
      <th></th>
    </thead>
    <tbody>
      <c:forEach var="aluno" items="${alunos}">
        <tr>
          <td> <c:out value="${aluno.nome}" /> </td>
          <td> <c:out value="${aluno.telefone}" /> </td>
          <td> <c:out value="${aluno.email}" /> </td>
          <td> <c:out value="${aluno.idade}" /> </td>
          <td> <c:out value="${aluno.registro}" /> </td>
          <td> <a href="/aluno/${aluno.id}/excluir">excluir</a> </td>
        </tr>
      </c:forEach>
    </tbody>
  </table>

</section>
