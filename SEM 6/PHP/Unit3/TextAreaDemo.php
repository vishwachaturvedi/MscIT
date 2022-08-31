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
        <form action="#" method="get">
            <textarea  name="address"></textarea>
         <input type="submit" name="submit" value="Show"/>            
        </form>         
        <?php
             echo $_GET['address'];
        ?>
    </body>
</html>
