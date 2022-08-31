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
/*An abstract class is a class that contains at least one 
abstract method. 
An abstract method can not contain body.
An abstract class or method is defined with the abstract keyword.
Abstract class doesn't support multiple inheritance.*/

        abstract class base 
        {
            abstract function printdata();
            public function getdata() 
            {
               echo "Tutorials Point";
            }
         }
        class child extends base
         {
            public function printdata()
            {
               echo "<br/>Good morning";
            }
         }
        $obj = new child();
        $obj->getdata();
        $obj->printdata();
        
        abstract class AbstractClass 
        {
            abstract protected function getValue();
            abstract public function getValue1($name);

            public function printOut () 
            {
                echo $this->getValue();
            }
        }
        class Class1 extends AbstractClass 
        {
            protected function getValue ()
            {
                    return "SEM 6A";
            }
            public function getValue1($name) {
                    return '<br/>'.$name."<br/>UTU";                
                    }                
        }
        $class1 = new Class1();
        $class1->printOut(); 
        echo $class1->getValue1('BMIIT');
        
        ?>
    </body>
</html>
