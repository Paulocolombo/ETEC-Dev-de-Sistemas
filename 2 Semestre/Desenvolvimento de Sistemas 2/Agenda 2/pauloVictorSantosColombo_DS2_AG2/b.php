<!DOCTYPE html>

<html lang="pt-BR">

<head>
    <link rel="stylesheet" type="text/css" href="b.css" media="screen" />

    <meta charset="UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

    <title>GET e POST</title>

</head>

<body>

    <div class="w3-container w3-teal">

        <h1>Cadastro Confirmado com Sucesso!</h1><br>

        <form class="w3-container w3-center" method="post" action="b.css">

            <?php
            echo "Nome: " . $_POST['txtNome'] . "<br>";
            echo "Sobrenome: " . $_POST['txtSobrenome'] . "<br>";
            echo "E-mail: " . $_POST['txtEmail'] . "<br>";
            echo "Formação: " . $_POST['txtFormacao'] . "<br>";
            echo "Descrição do Último emprego: " . $_POST['txtEmprego'] . "<br>";
            ?>

</body>

</html>