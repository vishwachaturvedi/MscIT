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
        <form action="#" method="post" >
            <input type="checkbox" name="check_list[]" value="PHP"><label>PHP</label><br/>
            <input type="checkbox" name="check_list[]" value="SEO"><label>SEO</label><br/>
            <input type="checkbox" name="check_list[]" value="SPM"><label>SPM</label><br/>
            <input type="submit" name="submit" value="Submit"/>
        </form>
        <?php
        /*if(isset($_POST['submit']))
        {
            if(!empty($_POST['check_list']))
            {
                foreach($_POST['check_list'] as $selected)
                {
                    echo $selected."</br>";
                }
            }
        }*/
        include 'Chkbox.php'
        ?>
    </body>
</html>
