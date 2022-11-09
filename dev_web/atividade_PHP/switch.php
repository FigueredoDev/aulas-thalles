<?php

$option = "s";

switch ($option){

    case "s":
        echo "Você escolheu SIM";
        break;
    case "n":
        echo "Você escolheu NÃO";
        break;
    default:
        echo "Opção invalida";
        break;
}