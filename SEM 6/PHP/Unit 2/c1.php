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
            class demo
            {
                public $name='ABC';
                 function show()
                {
                     
                    echo $this->name;
                }
            }
            $d = new demo();
            $d->show();
        ?>
    </body>
</html>
