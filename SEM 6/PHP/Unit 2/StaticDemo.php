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
//Static methods can be called directly - without creating an instance of the class first.
//To access a static method use the class name, double colon (::)and the method name.        
//Static methods can be accessed from the methods in the same class using the self keyword and ::.        
            class test 
            {
                public static function show() 
                {
                    echo "Babu Madhav Institute of Information Technology";
                }
               /*public function __construct()
                {
                    self::show();
                }*/
                
            }  
            class test1 extends test
            {
                public function get()
                {
                    parent::show();
                }
            }
            
           //test::show();
            $t= new test();
           // $t1= new test1();
            //$t1->get();
       //Static Property
        class pi {
            public static $value=3.14;
            public function staticValue() {
              return self::$value;
            }
          }
          //$pi = new pi();
          //echo $pi->staticValue();
           echo pi::$value;
            
        /* class test {
            public static function show() 
            {
                echo "Hello World!";
            }
            public function __construct() {
                self::show();
            }
            }  
        new test();*/
        ?>
    </body>
</html>
