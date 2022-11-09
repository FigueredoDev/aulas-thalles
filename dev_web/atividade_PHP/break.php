<?php

$vetor = array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
$k = 0;

while ($k < 10) {
    if ($vetor[$k] == "sair") {
        break;
    }

    echo $vetor[$k] . "\n";
    $k++;
}


echo "\n Exercício 2 \n";

$k = 0;
$i = 0;

while ($i < 10) {
    $i++;
    $k++;

    while ($i < 20) {
        if ($i == 10) {
            echo "\n Encerrando o primeiro while \n";
            break;
        } elseif ($i == 15) {
            echo "Encerrando os dois whiles... \n";
            break 2;
        }
        $i++;
    }
}