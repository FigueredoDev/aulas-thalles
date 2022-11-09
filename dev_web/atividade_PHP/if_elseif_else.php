<?php

$test1 = 10;
$test2 = 8;

$note = ($test1 + $test2) / 2;

if ($note < 3) {
    $performance = "Péssimo";
} elseif ($note < 5) {
    $performance = "Ruim";
} elseif ($note < 7) {
    $performance = "Médio";
} elseif ($note < 8) {
    $performance = "Bom";
} else {
    $performance = "Excelente";
}

echo "Seu desempenho nas provas foi $performance!";