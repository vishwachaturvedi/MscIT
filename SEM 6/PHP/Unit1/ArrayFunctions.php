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
//sort->Sort the elements of the  array in ascending alphabetical order:
//rSort->Sort the elements of the  array in descending alphabetical order
        $a=array("bardoli","surat","Baroda","Ahmedabad");
        #rsort($a);
        sort($a);
        $length=count($a);
        #print("Length:-".$length);
        for($i=0;$i<$length;$i++)
        {
            echo $a[$i];
            echo "<br>";
        }*/
        
        /*
//arsort->Sort an associative array in descending order, according to the value.
//asort->Sort an associative array in ascending order, according to the value.
//ksort->Sort an associative array in ascending order, according to the key.
//krsort->Sort an associative array in descending order, according to the key.
         $age=array("a"=>"35","c"=>"43","b"=>"30");
        //asort($age);
        //arsort($age);
        //ksort($age);
        //krsort($age);
        foreach($age as $x=>$x_value)
           {
           echo "Key=" . $x . ", Value=" . $x_value;
           echo "<br>";
           }
        */
//The implode() function returns a string from the elements of an array.
            // $arr = array('Hello','World!','Beautiful','Day!');
            //echo implode(" ",$arr);
//The explode() function breaks a string into an array.
            //$str = "Hello world. It's a beautiful day.";
            //print_r (explode(" ",$str));
//current()->Output the value of the current element in an array.
            //$var = array("a", "b", "c", "d");
            //echo current($var) . "<br>";
//Moving Current Pointer Example
              //echo next($var) . "<br>";
              //echo prev($var) . "<br>";
//Reset function : Moves an array's "current" pointer to the first element in the array and then dereferences it.
            //$first=reset($var);
            //print($first);
//End function: Moves  "current" to the last element in the array and then dereferences it.
            //$last=end($var);
            //print($last);
//Unset Function : Used to delete element as per assigned array index.
            /*$a=array(1,2,3);
            unset($a[0]);
            Print_r($a);*/
//array_diff method : Compare the values of two arrays, and return the differences
            /* $a1=array("a"=>"pink","b"=>"green","c"=>"blue","d"=>"yellow");
             $a2=array("e"=>"red","f"=>"green","g"=>"blue");
             $result=array_diff($a1,$a2);
             print_r($result);*/
//array_chunk :- Split an array into chunks of two or more
        // $UTU=array("BMIIT","Maliba","SRCP","SRIMCA","CHD","MBNC");
         //print_r(array_chunk($UTU,4));
         
        /* o/p:Array ( [0] => Array ( [0] => BMIIT [1] => Maliba ) 
                       [1] => Array ( [0] => SRCP [1] => SRIMCA ) 
                       [2] => Array ( [0] => CHD [1] => MBNC ) )*/
//The array_column() function returns the values from a single column in the input array.
       /* $stud = array( 
        array('Name'=>'Ram','City'=>'Surat'),
        array('Name'=>'Krishna','City'=>'Bardoli'));
        $City = array_column($stud, 'City');
        print_r($City);*/
//array_count_values function counts all the values of an array.
        //$a=array("A","b","c","A","c");
        //print_r(array_count_values($a));
//The array_combine() function creates an array by using the 
//elements from one "keys" array and one "values" array.
//Note: Both arrays must have equal number of elements!
            /*$id=array("A","B","C");
            $name=array("Abhi","Ram","Krishna");         
            $c=array_combine($id,$name);
            print_r($c);*/
//Flip/Swap/Replace
           /* $a1=array("a"=>"pink","b"=>"green","c"=>"blue","d"=>"yellow");
            $color = array_flip($a1);
            print_r($color);*/
//Other Methods:
//array_keys :- Return an array containing the keys
//array_reverse : - Return an array in the reverse order
//count : Return the number of elements in an array
           /* $a=array("1"=>"abc","2"=>"xyz","3"=>"jkl");
            print_r(array_keys($a));
            print_r(array_reverse($a));
            echo count($a);
//array_merge : Merge two array
            $a1=array("red","green");
            $a2=array("blue","yellow");
            print_r(array_merge($a1,$a2));*/
//list:- Assign variables as if they were an array
        $my_array = array("Dog","Cat","Horse");
        list($a, $b, $c) = $my_array;
        echo "I have several animals, a $a, a $b and a $c.";   
        ?>
    </body>
</html>
