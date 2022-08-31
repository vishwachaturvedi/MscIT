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
        <?php
       /*function Demo($a)
        {
            print("Hello".$a);
        
        }
        Demo(5);*/
        
        ?>
        <?php
            //Demo(5);
        ?>
        <?php
        //Passing Arguments by Reference 
            function Show(&$ID, &$Name)
            {
                $ID = $ID;
                $Name=$Name;
                $str = $ID." ".$Name;
                return $str ;
            }
            $ID = 101;
            $Name = "ABC";
            $var = show($ID, $Name);
            print($var);

        ?>
    </body>
</html>
