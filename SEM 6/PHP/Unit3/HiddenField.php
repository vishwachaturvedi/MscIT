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
        <form action="#" method="post">
           <input type="hidden" value="Test" name="name" />
            <input type="submit" name="submit">
        </form>
        <?php
            echo $_POST['name'];       
        ?>
    </body>
</html>
