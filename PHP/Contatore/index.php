<?php
     
    session_start();
    if ($_SESSION['count']) 
     $_SESSION['count'] = 1;
    else
    $_SESSION['count']++;
?>


<html>
<head>
<title>Contatore pagina</title>
</head>

<body>
<h2>Hai visitato questa pagina <?php echo( $_SESSION['count']); ?> volte</h2>

</body>
</html>