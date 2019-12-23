<html>
<body>

<?php

$string=file_get_contents('dizionario.json');
$decode = json_decode($string, true);
$name=$_POST["newParola"];
$name2=$_GET["parola"];
$delete=$_POST["delete"];
$check=1;
if($name2!=null){
    cerca();
}
if($delete!=null){
    cancella();
}
function cerca(){
    Global $decode, $name2, $check;
    foreach ($decode as $key => $value) {
        if($key!=$name2){
            $check = 1;
        }
        else{
            $check = 0;
            echo $key.": ".$value;
            break;
        }
    }
    if($check==1){
        echo "parola non trovata";
    }
}
function cancella(){
    Global $decode, $delete;
    foreach ($decode as $key=>$value) {
        if($delete == $key){
            unset($decode[$delete]);
            echo ("elemento cancellato");
         }
    }
}

$definizione=$_POST["definizione"];
$decode[$name]=$definizione;
$decode=json_encode($decode, true);

file_put_contents("dizionario.json", $decode);

?>
</body>
</html>