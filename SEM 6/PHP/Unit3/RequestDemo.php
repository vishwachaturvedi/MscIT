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
        <body>
        <form method="post">
            Enter first number <input type="text" name="fnum"/>
            Enter second number <input type="text" name="snum"/>
            <input type="submit" value="ADD"/>
        </form>
        <?php
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
                $x=$_REQUEST['fnum'];
                $y=$_GET['snum'];
                //$sum=$x+$y;
                echo $x;
                echo "<br/>";
                echo $y;
        }

        ?>
       
    </body>
</html>
