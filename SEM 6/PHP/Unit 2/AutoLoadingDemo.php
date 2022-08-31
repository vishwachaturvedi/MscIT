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
/*__autoload : magic function __autoload() which is automatically 
called when your code references a class or interface that 
hasn’t been loaded yet.

Rules:
When wants to access the class which are exist 
In another file just need to create one autoload method.
Filename, classname must be same.*/    
        
        
        function __autoload($class_name) 
          {
          require_once $class_name . '.php';
          } 

        function __autoload($class_name) {
            $filename =  $class_name . ".php";
            include ($filename);
        }
        $a = new Test();
        $a1 = new Test1();
        
       */ 
       //$a = new Test();
        function __autoload($class_name) 
          {
          if(file_exists($class_name . '.php')) {
            require_once($class_name . '.php');
          } 
          else 
          {
            throw new Exception("Unable to load class $class_name.");
          }
          }

          try {
            $a = new Test();
            $b = new Image();
          }
          catch (Exception $e) {
            echo $e->getMessage(), "<br/>";
          }
         
        ?>
    </body>
</html>
