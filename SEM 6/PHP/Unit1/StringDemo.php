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
            //$str = 'Hello';
            //$str1 = "World!";
            //echo $str." ".$str1;
             /*$a= 'India';
             $b = 'Hi I love $a';
             $c =  "Hi I love $a";
             echo $b , "<BR> , $c";*/
            //echo "Open Source Web Technology<br/>";
            //$str="Hello";
            //$str1="Hello1";
            //echo strlen($str);
            //echo strcmp($str,$str1);
            //echo str_word_count("Open Source Web Technology");
            //echo strrev("Hello World!");
            //echo strpos("I love php, I love php too!","php");//Position
            /*$arr = array('Hello','World!','Beautiful','Day!');
            echo join("=",$arr);
            echo str_replace("Python","PHP","Hello Python!");
            echo ucwords("open source web technology");
            */
             //Related functions:
             //ucfirst() - converts the first character of a string to uppercase
            //lcfirst() - converts the first character of a string to lowercase
            //strtoupper() - converts a string to uppercase
            //strtolower() - converts a string to lowercase
            //$str = "Hello World!";
            //echo $str . "<br>";
            //echo chop($str,"World!");//Remove characters from the right end of a string
            //Wrap a string into new lines when it reaches a specific length
            $str = "An example of a long word is: Supercalifragulistic";
            echo wordwrap($str,15,"<br>\n");
        ?>  
    </body>
</html>
