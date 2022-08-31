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
        <form method="post" action="chkBox.php">
            <label>Select your Email</label>
            <input type="email" id="email" name="email">
            <label for="favcolor">Select your favorite color:</label>
            <input type="color" id="favcolor" name="favcolor">
            <label for="birthday">Birthday:</label>
            <input type="date" id="Date" name="date">
            <input type="datetime-local" id="datetime" name="datetime">
            <input type="month" id="bdaymonth" name="bdaymonth">
            <label for="quantity">Quantity (between 1 and 50):</label>
            <input type="number" id="quantity" name="quantity" min="1" max="50" step="2" >
            <label for="vol">Volume (between 0 and 50):</label>
            <input type="range" id="vol" name="vol" min="0" max="50">
            <label for="phone">Enter your phone number:</label>
            <input type="tel" id="phone" name="phone" pattern="[0-9]{10}">
            <label for="appt">Select a time:</label>
            <input type="time" id="appt" name="appt">
            <input type="text" id="country_code" name="country_code" pattern="[A-Za-z]{3}" title="Three letter country code"><br><br>
            <input type="submit" value="Submit">
        </form>
        <?php
        if(isset($_POST["submit"]))
        {
           //echo $_POST["email"];
        }
        ?>
    </body>
</html>
