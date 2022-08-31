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
        //PHP does support function overloading, but in a different way.
        //Overloading traditionally provides the ability to have multiple methods with the same name but different quantities and types of arguments.
        //Overloading in PHP provides means to dynamically "create" properties and methods
        
        class Foo {

    public function __call($method, $args) {

        if ($method === 'findSum') {
            echo 'Sum is calculated to ' . $this->_getSum($args);
        } else {
            echo "Called method $method";
        }
    }

    private function _getSum($args) {
        $sum = 0;
        foreach ($args as $arg) {
            $sum += $arg;
        }
        return $sum;
    }

}

$foo = new Foo;
$foo->bar1(); // Called method bar1
$foo->bar2(); // Called method bar2
$foo->findSum(10, 50, 30); //Sum is calculated to 90
$foo->findSum(10.75, 101); //Sum is calculated to 111.75
        ?>
    </body>
</html>
