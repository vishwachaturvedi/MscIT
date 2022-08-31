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
/*PHP doesn’t support multiple inheritance but by using 
Interfaces in PHP or using Traits in PHP instead of classes, 
we can implement it.     
The trait is a type of class which enables multiple inheritance.   
The "use" is for using "trait" functionality.*/
        trait BMIIT { 
        public function BMIIT_Show() { 
           echo "BMIIT"; 
         } 
        } 

        // trait forGeeks 
        trait MPC { 
          public function MPC_Show() { 
             echo "<br/>MPC"; 
           } 
         } 

        class UTU { 
          use BMIIT; 
          use MPC; 
          public function UTU_Show() { 
              echo "<br/>UTU"; 
           }  
        } 

        $u = new UTU(); 
        $u->BMIIT_Show(); 
        $u->MPC_Show(); 
        $u->UTU_Show();
        
      class a { 
          public function a1() { 
             echo "Base class A"; 
          } 
        } 
        trait b { 
          public function b1() { 
             echo " Trait B"; 
          } 
        } 
        trait d { 
          public function d1() { 
             echo " Trait d"; 
          } 
        }
        class c extends a { 
           use b; 
           use d;
           public function c1() { 
              echo "Child class"; 
          }  
        } 

        $test = new c(); 
        $test->a1(); 
        $test->b1(); 
        $test->c1(); 
        $test->d1();
        
//interface:which is contain all abstracts methods , 
//it means, methods is only declared not defined in interface , 
//for defined this methods, we need to define in 
//implements class. All the methods in interface are public .
        /*class A
        {
            public function a1()
            {
                        echo "Base class A"."<br>";
            }
        }
        interface B
        {
            public function b1();
        }
        class c extends A implements B
        {
            function b1()
            {
                echo "B class methods"."<br>";
            }
            public function c1()
            {
                echo "Child class methods"."<br>";
            }
        }
        $t = new c();
        $t->a1();
        $t->b1();
        $t->c1();*/
        ?>
</html>
