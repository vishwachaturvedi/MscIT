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
            /*class test
            {
                public $name="Radha";
                function __construct() 
                {
                    echo 'Class Test working <br />';
                }
                function show()
                {
                    echo "Hello World!<br/>";
                    //echo "<br/>".$this->name;;
                }
            }
            $t = new test();
            $t->show();
            echo $t->name;*/
           /* class student
            {
                public $id;
                Public $name;
                function set($id,$name)
                {
                    $this->id=$id;
                    $this->name=$name;
                }
                function get()
                {
                    echo "ID:-".$this->id;
                    echo "<br/> Name:-".$this->name;
                }
            }
                $s = new student();
                $s->set(1,'Dolly');
                $s->get();*/
            /*class test 
            {
                public $name;
            }
            $t = new test();
            $t->name = "abc";
            echo $t->name;*/
            class test
            {
                public $name;
                function __construct($name) 
                {

                    $this->name=$name;
                    echo $this->name;
                }  
               function __destruct() 
               {
                   echo "<br/>This is destructor method<br/>";
                   echo $this->name;
               }  
             function show($name) 
                {
                    echo $this->name;
                } 
            }
             $t=new test('abc');
             $t->show();
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
