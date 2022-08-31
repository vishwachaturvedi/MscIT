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
 How to override the parent's properties and the methods 
 in the child class:  
Static : with the help of static keyword we can access data 
 member of the class without creating object of that class.
Eg -  class A :: $name
Self: Used to access the static data member on constant data member.
 
Parent: Used to access parent class member into derived class. 
When both the class have same data member on function. 
 */
           /*class base
            {
                public function showBase()
                {
                    echo "Base class";
                }            
            }
           
            class child extends base
            {
                public function showChild()
                {
                    echo "Child class"."<br>";
                }            
            }       
            $ch = new child();
            $ch->showChild();
            $ch->showBase();*/
       
       /* class utu
        {
            private $inst;
            public function set($inst)
            {
                $this->inst=$inst;
            }
            public function get()
            {
                return $this->inst;
            }
        }
        class bmiit extends utu
        {
            private $Course="5 Years Intigrated Msc.IT";
            public function show()
            {
                return $this->get() . " - " . $this->Course;
            }        
        }
        $b = new bmiit();
        $b->set("BMIIT");
        echo $b->show();  */  
/*The __call() method will be called when an undefined 
or inaccessible method is called.
__call($funName, $arguments)   */     
       class test
        {   
            public $name;
            public $div;
            function __call($function, $arguments) {
                if($function=="display");
                {
                    if(count($arguments)==1)
                    {
                        $this->name=$arguments[0];
                        echo $this->name, "<br>";
                    }else if(count($arguments)==2)
                    {
                        $this->name=$arguments[0];
                        $this->div=$arguments[1];
                        echo $this->name , "<br>";
                        echo $this->div;
                        }
                }
            }
        }
            $obj = new test();
            $obj->display("MCA");
            $obj->display("MSC.IT","Div-B");
        ?>
        <?php 
        class Sample 
        { 
            function user_define() 
            { 
                echo "This is user defined function "; 
                
            } 
            function __call($fun, $arg) 
            { 
                echo "<br/>function that not exists:" . $fun." "; 
                echo "<br/>parameter list of method that does not exist:";
                print_r($arg); 
                
            } 
            
        } 
        $obj = new Sample(); 
        $obj->run("teacher"); // If the method which is not existed is called within the object, then the __call() method will be called automatically.
        $obj->eat("ashok", "orange");             
        $obj->user_define();
?>
    </body>
</html>
