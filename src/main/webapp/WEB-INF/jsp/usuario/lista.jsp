<%@include file="../header.jsp"%>

<section class="container">
  <h1> ${title} </h1>

  <table class="table">
    <thead>
      <th> Nome </th>
      <th> Email </th>
      <th></th>
    </thead>
    <tbody>
      <c:forEach var="usuario" items="${usuarios}">
        <tr>
          <td> <c:out value="${usuario.nome}" /> </td>
          <td> <c:out value="${usuario.email}" /> </td>
          <td> <a href="/usuario/${usuario.id}/excluir">excluir</a> </td>
        </tr>
      </c:forEach>
    </tbody>
  </table>

</section>
