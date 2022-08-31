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
            <input type="file" name="fileToUpload"/>  
            <input type="submit" value="Upload Image" name="submit"/>  
        </form> 
        <?php
        //if(isset($_Post["submit"]))
       // {
        echo "File Name = ".$file_name = $_FILES['fileToUpload']['name'];
        echo "<br/>";
        echo "File Size = ".$file_size = $_FILES['fileToUpload']['size'];
        echo "<br/>";
        echo "File Temp Name = ".$file_tmp = $_FILES['fileToUpload']['tmp_name'];
        echo "<br/>";
        echo "File Type = ".$file_type = $_FILES['fileToUpload']['type'];
        echo "<br/>";
        
        $target_dir = "upload/";
        $target_path = $target_dir . basename($_FILES['fileToUpload']['name']);
        echo "<br/>";
        echo "File Target Path = ".$target_path;
        echo "<br/>";
        if (move_uploaded_file($_FILES['fileToUpload']['tmp_name'], $target_path)) 
        {
            echo "File uploaded successfully!";
            echo "<br/>";
        } else {
            echo "Sorry, file not uploaded, please try again!";
            echo "<br/>";
        }
 
          
        /*
          $target_path = "upload/";
          $target_path = $target_path. basename( $_FILES['fileToUpload']['name']);

          $uploadOk = 1;
          // Check if file already exists
          if (file_exists($target_path)) {
          echo "Sorry, file already exists.";
          $uploadOk = 0;
          }

          // Check file size
          if ($_FILES["fileToUpload"]["size"] > 1 ){
          echo "Sorry, your file is too large.";
          $uploadOk = 0;
          }


          if ($uploadOk == 0) {
          echo "Sorry, your file was not uploaded
          } else {
          if(move_uploaded_file($_FILES['fileToUpload']['tmp_name'], $target_path))
          {
          echo "File uploaded successfully!";
          //echo "The file ". basename( $_FILES["fileToUpload"]["name"]). " has been uploaded.";
          }
          else {
          echo "Sorry, there was an error uploading your file.";
          }
          } */
      // }
        ?>
    </body>
</html>
