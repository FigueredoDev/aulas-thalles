<?php

$vetor = array(1,3,4,56,8,7,5,);
for ($i=0; $i< sizeof($vetor); $i++){
    // Impar 
    if ($vetor[$i] % 2 != 0){
        continue;
    }

    echo "O numero " . $vetor[$i] . " é par. \n";
}