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
        //$numbers = array( 1, 2, 3, 4, 5);
        //print_r($numbers);
       
        
// Numeric Array
            //Automatic
            /*$numbers = array( 1, 2, 3, 4, 5);
            $l=count($numbers);
            for($i=0;$i<=$l;$i++)
            {
                print($numbers[i]."<br/>");
            }
            foreach( $numbers as $value ) {
               print("Value is".$value."<br/>");
            }
            print($numbers[1]);*/
            //Manual
           // $array = array(1=>10,2=>20,3=>30,4=>40,5=>50);
            //print_r($array);
           // print($array);
            
         
         // Associative Array
           /*$student = array("Ram"=>"Surat", "Jay"=>"Bardoli", "Het"=>"Ahmedabad");
            foreach ($student as $value)
            {
                print($value."<br/>");
            }
            foreach($student as $key => $value) {
                echo "Student=".$key.",City=".$value;
                echo "<br>";
            }*/
            /*$student[10]="Krishna";
            //print_r($student);
            //print($student[10]);*/
            
        //Multidimensional Array
            $student = array (
                    array("Karma",24,18,20,25),
                    array("Jiya",15,13),
                    array("Reena","Bardoli",45,2.5),
                    array("Meera",17,15,'a')
            );
            #print_r($student);
            print($student[0][1])
            /*$marks = array( 
                    "Ankit" => array( 
                        "C" => 95, 
                        "DCO" => 85, 
                        "FOL" => 74, 
                    ),  
                    "Ram" => array( 
                        "C" => 78, 
                        "DCO" => 98, 
                        "FOL" => 46, 
                    ), 
                    "Anoop" => array(
                        "C" => 88, 
                        "DCO" => 46, 
                        "FOL" => 99, 
                    ), 
                ); 
                echo "Display Marks: <br/>"; 
                print_r($marks); */
        //Three Dimention Array
           /* $myarray = array( 
                array(array(1, 2),array(3, 4),), 
                array(array(5, 6),array(7, 8),), 
            ); 
            print($myarray[0][1][1]);*/
        

        ?>
    </body>
</html>
