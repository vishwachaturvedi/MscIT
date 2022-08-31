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
          <form method="post">
            Enter first number <input type="text" name="fnum"/><br/>
            Enter Last number <input type="text" name="snum"/><br/>
           
            <input type="radio" name="gender" value="Male">Male</input><br/>
            <input type="radio" name="gender" value="Female">Female</input><br/>
            
            <input type="checkbox" name="check_list[]" value="PHP"><label>PHP</label><br/>
            <input type="checkbox" name="check_list[]" value="SEO"><label>SEO</label><br/>
            <input type="checkbox" name="check_list[]" value="SPM"><label>SPM</label><br/>
            Address<textarea  name="address"></textarea>
          
            <select name="Color[]" multiple> 
            <option value="Red">Red</option>
            <option value="Green">Green</option>
            <option value="Blue">Blue</option>
            <option value="Pink">Pink</option>
            <option value="Yellow">Yellow</option>
            </select>
            
            <input type="email" id="email" name="email"><br/>
            <label for="favcolor">Select your favorite color:</label><br/>
            <input type="color" id="favcolor" name="favcolor"><br/>
            <label for="birthday">Birthday:</label><br/>
            <input type="date" id="Date" name="date"><br/>
            <input type="datetime-local" id="datetime" name="datetime"><br/>
            <input type="month" id="bdaymonth" name="bdaymonth"><br/>
            <label for="quantity">Quantity (between 1 and 50):</label><br/>
            <input type="number" id="quantity" name="quantity" min="1" max="50" step="2" ><br/>
            <label for="vol">Volume (between 0 and 50):</label><br/>
            <input type="range" id="vol" name="vol" min="0" max="50"><br/>
            <label for="phone">Enter your phone number:</label><br/>
            <input type="tel" id="phone" name="phone" pattern="[0-9]{10}"><br/>
            <label for="appt">Select a time:</label><br/>
            <input type="time" id="appt" name="appt"><br/>
            <input type="text" id="country_code" name="country_code" pattern="[A-Za-z]{3}" title="Three letter country code"><br><br>
            <input type="submit" value="ADD"/>
        </form>
        <?php
        // put your code here
        ?>
    </body>
</html>
