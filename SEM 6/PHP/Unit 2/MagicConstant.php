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

 /*-Magic constants are the predefined constants in PHP which get 
 changed on the basis of their use. 
 -They start with double underscore (__) and ends 
 with double underscore.
 -Magic functions will never directly be called by the programmer.
 -they allow the programmer to do some pretty powerful things.
 */
echo "<h3>Example for __LINE__</h3>";  
echo "You are at line number " . __LINE__ . "<br><br>";
// print Your current line number i.e;3  

echo "<h3>Example for __FILE__</h3>";  
echo __FILE__ . "<br><br>";
//print full path of file with .php extension  

echo "<h3>Example for __DIR__</h3>";  
echo __DIR__ . "<br><br>";
//print full path of directory where script will be placed  

echo "<h3>Example for __FUNCTION__</h3>";  
function test(){  
echo 'The function name is '. __FUNCTION__ . "<br><br>";  
} 
test();
class a  
{  
          
    public function a_method()
    {  
        echo'The class name is '.__CLASS__ . "<br><br>"; 
    }  
}  
$t = new a;  
$t->a_method(); 


echo "<h3>Example for __METHOD__</h3>";  
class demo{  
public function __construct() {  
echo __METHOD__ . "<br><br>"; 
}  

public function get(){  
echo __METHOD__; 
}  
}  
$a = new demo();  
$a->get();
echo "<h3>Example for __toString()</h3>";
class Test {
        public function __toString() {
            return "<br/>This is a PHP";
        }
    }

$t = new Test;
echo $t;

        ?>
    </body>
</html>
