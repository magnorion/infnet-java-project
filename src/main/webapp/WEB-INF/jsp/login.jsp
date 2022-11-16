<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" 
            integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <title> Login </title>
  </head>
  <body>
    <nav class="navbar navbar-expand-sm bg-light navbar-light">
        <div class="container-fluid d-flex justify-content-end">

            <ul class="navbar-nav">
                <li class="nav-item"> <a href="/signup" class="nav-link">Cadastre-se</a> </li>
            </ul>
        </div>
    </nav>

<section class="container">
    <h1> Login </h1>

    <div class="mt-2 w-25 mx-auto">
        <form action="/login" method="POST" class="form">

            <div class="form-group">
                <label for=""> email </label>
                <input name="email" type="text" class="form-control">
            </div>

            <div class="form-group">
                <label for=""> senha </label>
                <input name="senha" type="password" class="form-control">
            </div>

            <div class="d-flex justify-content-end">
                <button class="btn btn-primary mt-4"> Login </button>
            </div>
        </form>
    </div>

</section>
