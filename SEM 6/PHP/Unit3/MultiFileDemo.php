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
        <form action="#" method="post" enctype="multipart/form-data">  
            Select File:  
            <input type="file" name="file[]" multiple="multiple" /> 
            <input type="submit" value="Upload Image" name="submit"/>  
        </form> 
        <?php
            $total = count($_FILES['file']['name']);
            for ($i = 0; $i < $total; $i++) 
            {
                $tmpFilePath = $_FILES['file']['tmp_name'][$i];
                if ($tmpFilePath != "") 
                {
                    $newFilePath = "./upload/" . $_FILES['file']['name'][$i];
                    if (move_uploaded_file($tmpFilePath, $newFilePath)) 
                    {
                        //echo "File uploaded successfully!";
                        //echo "<br/>";
                    }
                    else 
                    {
                        echo "Sorry, file not uploaded, please try again!";
                        echo "<br/>";
                    }    
                }
            }
        ?>
    </body>
</html>
