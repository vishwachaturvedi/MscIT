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
        /*class employee 
        {
          private $name;
          public function text($emp_name) {
                   $this->name = $emp_name;
          }
          public function Name() {
                   return $this->name;
          }
        }
        $obj1 = new employee();
        $obj1->text("Neha");
        $obj2 = clone $obj1;   //only reference assigned to $obj2
        $obj2->text("Ragini");
        echo $obj1->Name()."</br>";
        echo $obj2->Name();*/
        class MyClass {
            public $amount;
            
          }
          $value = 5;
          $obj = new MyClass();
          $obj->amount = $value;
          $copy = clone $obj;
          print_r($copy);
      ?>
    </body>
</html>
