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
      <c:forEach var="monitor" items="${monitores}">
        <tr>
          <td> <c:out value="${monitor.nome}" /> </td>
          <td> <c:out value="${monitor.telefone}" /> </td>
          <td> <c:out value="${monitor.email}" /> </td>
          <td> <c:out value="${monitor.idade}" /> </td>
          <td> <c:out value="${monitor.dataMonitor}" /> </td>
        </tr>
      </c:forEach>
    </tbody>
  </table>

</section>
