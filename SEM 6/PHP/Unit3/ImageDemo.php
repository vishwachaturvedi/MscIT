<html>
<head>
    <title>PHP File Upload example</title>
</head>
<body>

    <form action="#" enctype="multipart/form-data" method="post">
        Select image :
        <input type="file" name="file"><br/>
        <input type="submit" value="Upload" name="Submit1"> <br/>
    </form>
    <?php
    //if (isset($_POST['submit'])) {
       // $filepath = "upload/" . $_FILES["file"]["name"];
        $target_dir = "upload/";
        $target_path = $target_dir . basename($_FILES['file']['name']);
        if (move_uploaded_file($_FILES["file"]["tmp_name"], $target_path))
        {
        }
        //echo "<img src=" . $target_path . " height=200 width=300 />";
        ?>
    <img src="<?php echo $GLOBALS['target_path']; ?>" height="320" width="200"/>
       
   // }
    ?>

</body>
</html>