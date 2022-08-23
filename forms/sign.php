<?php


$name = $_POST['name'];
$email = $_POST['email'];
$password = $_POST['password'];



$mailheader = "From :".$name."<".$email.">\r\n";

$recipient = "bhoyarradhika17@gmail.com";

mail($recipient,"Hello !! Wlcome Mail","Glad to have you on board with us",$mailheader)
or die("Error");


echo"Message Sent";



?>