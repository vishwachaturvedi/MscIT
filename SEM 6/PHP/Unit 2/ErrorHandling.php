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
/*

if(file_exists("mytestfile1.txt")) 
        {
            $file = fopen("mytestfile1.txt", "r");
            while (!feof($file)) 
            {
                $line = fgets($file);
                echo $line;
            }
            fclose($file);
        } 
        else
        {
            die("Error: The file does not exist.");
        }
        */
        function myerror($error_no, $error_msg,$errline,$errfile) { 
            echo "Error: [$error_no] $error_msg "; 
            echo "Error on line $errline in $errfile<br/>";
            echo " Now Script will end";  
            die(); 
        }   
        //The set_error_handler() function sets a user-defined error 
       // handler function. 
// error_function(errno,error_message, error_file,error_line,error_context); 
            set_error_handler("myerror"); 
            //$a = 10; 
            //$b = 0;  
            //echo($a / $b);
           
         $test = 2;   
   //The trigger_error() function creates a user-level error message.
           if ($test >  1) {
               trigger_error("A custom error has been triggered");
            }
        ?>
    </body>
</html>
