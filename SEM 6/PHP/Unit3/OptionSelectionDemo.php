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
        <form action="#" method="post">     
         <select name="Color[]" multiple> 
        <option value="Red">Red</option>
        <option value="Green">Green</option>
        <option value="Blue">Blue</option>
        <option value="Pink">Pink</option>
        <option value="Yellow">Yellow</option>
        </select>
        <input type="submit" name="submit" value="Get Selected Values" />
        </form>
        <?php
        //For selecting single item from Dropdown
       /* if(isset($_POST['submit'])){
             $selected_val = $_POST['Color'];  
             echo "You have selected :" .$selected_val; 
        }*/
         //For selecting multiple item.
        if(isset($_POST['submit'])){
            foreach ($_POST['Color'] as $select)
            {
            echo "You have selected :" .$select;
            }
        }
        ?>
    </body>
</html>
