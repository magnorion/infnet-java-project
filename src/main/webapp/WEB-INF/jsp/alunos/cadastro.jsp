<%@include file="../header.jsp"%>

<section class="container">
    <h1> ${title} </h1>

    <div class="mt-2 mx-auto">
        <form action="/aluno/criar" method="POST" class="form">
            <div class="form-group">
                <label for=""> nome </label>
                <input name="nome" type="text" class="form-control">
            </div>
            <div class="form-group">
                <label for=""> telefone </label>
                <input name="telefone" type="text" class="form-control">
            </div>
            <div class="form-group">
                <label for=""> email </label>
                <input name="email" type="text" class="form-control">
            </div>
            <div class="form-group">
                <label for=""> idade </label>
                <input name="idade" type="text" class="form-control">
            </div>

            <div class="d-flex justify-content-end">
                <button class="btn btn-primary mt-4"> Cadastrar </button>
            </div>
        </form>
    </div>

</section>
