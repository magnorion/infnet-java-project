<%@include file="../header.jsp"%>

<section class="container">
  <h1> ${title} </h1>

  <table class="table">
    <thead>
      <th> Nome </th>
      <th> Telefone </th>
      <th> Email </th>
      <th> Idade </th>
      <th> Data de Registro </th>
    </thead>
    <tbody>
      <c:forEach var="professor" items="${professores}">
        <tr>
          <td> <c:out value="${professor.nome}" /> </td>
          <td> <c:out value="${professor.telefone}" /> </td>
          <td> <c:out value="${professor.email}" /> </td>
          <td> <c:out value="${professor.idade}" /> </td>
          <td> <c:out value="${professor.dataContrato}" /> </td>
        </tr>
      </c:forEach>
    </tbody>
  </table>

</section>
