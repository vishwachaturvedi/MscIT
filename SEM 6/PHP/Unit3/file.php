<?php
/*$filename = "C:/Users/15-BR011TX/Desktop/demo.txt";
$file = fopen($filename, "a");

if ($file == false) {
    echo ( "Error in opening new file" );
    exit();
}
fwrite($file, "This is  a simple test\n");
fclose($file);*/
?>
<html>

    <head>
        <title>Writing a file using PHP</title>
    </head>

    <body>

        <?php
        $filename = "C:/Users/15-BR011TX/Desktop/test.txt";
        $file = fopen($filename, "r");

        if ($file == false) {
            echo ( "Error in opening file<br/>" );
            exit();
        }

        $filesize = filesize($filename);
        //fread(file, length)
        $filetext = fread($file, $filesize);

        fclose($file);

        echo ( "File size : $filesize bytes<br/>" );
        echo ( "$filetext" );
        echo"<br/>";
        echo("file name: $filename");
        ?>

    </body>
</html>