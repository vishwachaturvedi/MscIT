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
/* Notes:
Classes, which are the "blueprints" for an object and are 
the actual code that defines the properties and methods.

Objects, which are running instances of a class and 
contain all the internal data and state information 
needed for your application to function.

The property name does not start with the $ sign;
only the object name starts with a $.
 
The $this keyword indicates that we use the class's own methods 
and properties, and allows us to have access to them within the 
class's scope.

Overloading:When a class inherits another, it can declare 
method that override parent class method.
Method names are same.
Parameters are same.

*/

          class test
            {
                private $num=10;
                public $name="Krishna";
                public function showInfo()
                {
                    echo "BMIIT";
                    echo $this->num. " " .$this->name;
                }                               
            }
            $t = new test();
            $t->showInfo();
           
            echo $t->num;
            
            
            class demo
            {
                public $name;
                function set($name)
                {
                    $this->name=$name;
                }
                function get()
                {
                    echo $this->name;
                }
            }
            $d= new demo();
            $d->set('abc');
            $d->get();
        ?>
        

     <?php
class test {
  public $name;
}
$t = new test();
$t->name = "abc";
echo $t->name;
    
 class test
  {
      public $name;
      function __construct($name) {
          
          $this->name=$name;
          echo $this->name;
      }  
     function __destruct() {
            echo $this->name;
     }    
  }
   $t=new test('abc');

     
 /*
  To access to private properties from outside the class,
Setters that set the values of the private properties.
Getters that get the values of the private properties.

*/
        class demo
        {
           private $id; 
           public function get()
           {
               return $this->id;
           }
           public function set($id)
           {
                $this->id=$id;
           }
           
        }
        $d = new demo();
        echo $d->set(10);
        echo $d->get();
     
?>
        </body>
</html>
