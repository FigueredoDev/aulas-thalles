<?php

$number = 0;

do{
    echo "Valor do contador $number \n";
    $$number++;
}while($number < 20);