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
        
       $x = 5; // local scope
        function myTest() {
            global $x;
            echo "<p> x inside function is: $x</p>";
          }
        myTest();
        echo "<p> x outside function is: $x</p>"; 
        
       
        //Define Constant
        define("PI",3.14); 
        print(PI);
        /*//var_dump example*/
        /*$a = 32;
        echo "<br>";
        echo var_dump($a) . "<br>";
        
        $b = "Hello world!";
        echo var_dump($b) . "<br>";
        
        $d = array("red", "green", "blue");
        echo var_dump($d) . "<br>";*/
        //Static Demo
        function add1() {
            static $number = 0;
            $number++;
            return $number;
        }

            echo add1();
            echo "<br>";
            echo add1();
            echo "<br>";
            echo add1();
         ?>
    </body>
</html>
