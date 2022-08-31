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
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <form action="demo.php"method="get">
            <div class="form-group">
              <label for="email">Email address:</label>
              <input type="email" class="form-control" name="email">
            </div>
            <div class="form-group">
              <label for="pwd">Password:</label>
              <input type="password" class="form-control" name="pwd">
            </div>

            <button type="submit" class="btn btn-default">Submit</button>
            <button type="reset" class="btn btn-default">Reset</button>
        </form>
        <?php
            $a=@$_GET['email'];
            $b=@$_GET['pwd'];
            echo "Your email is ".$a. "<br>Password is ".$b;
        ?>
    </body>
</html>
