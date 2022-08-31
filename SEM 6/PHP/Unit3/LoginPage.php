<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <form method="post" action="RetriveData.php">
            Enter Name <input type="text" name="Name"/>
            Enter Password <input type="password" name="Password"/>
            <input type="submit" />
        </form>
        <?php
            /*if($_SERVER["REQUEST_METHOD"]=="POST")
            {
               echo $_POST["Name"]; 
               echo "<br/>";
               echo $_POST["Password"];                
            }*/
           /* if($_SERVER["REQUEST_METHOD"]=="GET")
            {             
               echo @$_GET["Name"]; 
               echo "<br/>";
               echo @$_GET["Password"]; 
            }*/
        ?>
    </body>
</html>
