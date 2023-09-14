<!DOCTYPE html>

<html lang="pt-BR">

<head>
    <link rel="stylesheet" type="text/css" href="b.css" media="screen" />

    <meta charset="UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

    <title>GET e POST</title>
    <style>
        div.a {
            font-size: 25px;
        }
    </style>
</head>

<body>

    <div class="w3-container w3-center w3-yellow">
        <h1 class="w3-center w3-text-red">PROMOÇÃO DO MÊS DE ANIVERSÁRIO!</h1><br>
        <div class="a">
            <?php
            $nome = $_POST['txtNome'];
            $valorcompra = $_POST['txtValorCompra'];
            $pagamento = $_POST['cmbPag'];

            $descontoboleto = ($valorcompra * 8) / 100;
            $descontodeposito = ($valorcompra * 10) / 100;

            echo "$nome, você terminou a sua compra! <br>";
            echo "Valor da Compra Sem Desconto: R$$valorcompra <br>";

            if ($pagamento == "deposito") {
                echo "Forma de pagamento escolhida: Depósito <br>";
                echo "Desconto de: 10% <br>";
                echo "você economizou: R$$descontodeposito <br> <br>";
                echo "Valor à pagar: R$" . ($valorcompra - $descontodeposito);
            } elseif ($pagamento == "boleto") {
                echo "Forma de pagamento escolhida: Boleto <br>";
                echo "Desconto de: 8% <br>";
                echo "você economizou: R$$descontoboleto <br> <br>";
                echo "Valor à pagar: R$" . ($valorcompra - $descontoboleto);
            } else {
                echo "Compra com cartão de crédito! <br>";
                echo "Compras nesta forma de pagamento não tem desconto.";
            }
            ?>
        </div>
    </div>
</body>

</html>