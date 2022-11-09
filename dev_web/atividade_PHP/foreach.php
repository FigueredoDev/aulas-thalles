<?php

$vetor = array(1, 2, 3, 4, 5);
foreach ($vetor as $v) {
    print "O valor atual do vetor é de $v. \n";
}

echo "\n\n";

$a = array("um" => 1, "dois" => 2, "tres" => 3);
foreach ( $a as $key => $value ) {
    echo "\$a[$key] = $value. \n";
}