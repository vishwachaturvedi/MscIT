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
/* An iterable is any value which can be looped through with 
a foreach() loop.
 Access one by one datamember.
 It can be used as a data type for function arguments and 
 function return values.  */     
       
         $arr1=array("PHP","Java","Python");
        function myfunc (iterable $arr1){
           foreach ($arr1 as $lang){
              echo $lang . "<br/>";
           }
        }
        myfunc($arr1);
        function printIterable(iterable $myIterable) {
            foreach($myIterable as $item) {
              echo $item;
            }
        }

        $arr = ["a", "b", "c"];
        printIterable($arr);
        
       class demo
        {
            public $var1 = 'value 1';
            public $var2 = 'value 2';
            public $var3 = 'value 3';
            function show() {
               foreach($this as $key => $value) {
                   print "$key => $value .<br>";
               }
            }
        }
        $class = new demo();
        foreach($class as $key => $value) {
            print "$key => $value.<br>";
        }
        $class->show();*/
        ?>
    </body>
</html>
