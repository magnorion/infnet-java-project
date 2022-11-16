<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" 
            integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <title> ${title} </title>
  </head>
  <body>
    <nav class="navbar navbar-expand-sm bg-light navbar-light">
        <div class="container-fluid d-flex justify-content-between">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" href="/home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/aluno/lista">Aluno</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/monitor/lista">Monitor</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/professor/lista">Professor</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/curso/lista">Curso</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/disciplina/lista">Disciplina</a>
                </li>
            </ul>

            <ul class="navbar-nav">
                <li class="nav-item"> <a href="/usuario/lista" class="nav-link">Usuarios</a> </li>
                <li class="nav-item"> <a href="/" class="nav-link">Logout</a> </li>
            </ul>
        </div>
    </nav>