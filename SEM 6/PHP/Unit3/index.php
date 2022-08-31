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
        <!--<form action="" method="get">
            <div>
                <label>Enter Name:</label>
                <input type="text" name="name" id="name">
                <input type="submit">                
            </div>
        </form> -->      
        <form method="post">
            Enter first number <input type="text" name="fnum"/>
            Enter second number <input type="text" name="snum"/>
            <input type="submit" value="ADD"/>
        </form>
        <?php
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
                $x=$_POST['fnum'];
                $y=$_POST['snum'];
                $sum=$x+$y;
                echo "<input type=text name='t1' value='$sum'>";
        }

        ?>
        <?php
            //echo @$_GET['name'];
           /* if(isset($_GET['name']))
            {
                echo @$_GET['name'];
            }*/
            /*if(!empty($_GET['name']))
            {
                echo @$_GET['name'];
            }  */
                      
        ?>
    </body>
</html>
