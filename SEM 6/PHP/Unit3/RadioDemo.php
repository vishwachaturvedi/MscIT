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
            <input type="radio" name="gender" value="Male">Male</input>
        <input type="radio" name="gender" value="Female">Female</input>
        <input type="submit"  value="Submit"/>
        </form>
        <?php
      //  if(isset($_POST["submit"]))
       // {
            echo @$_POST["gender"];
        //}
        ?>
    </body>
</html>
