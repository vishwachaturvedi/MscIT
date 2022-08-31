<!DOCTYPE html>
<html>
    <head>
        <script>
            function validateForm() {
                /*
                //Validation for textbox
                var x = document.forms["myForm"]["fname"].value;
                if (x === "") {
                    alert("Name must be filled out");
                    return false;
                }
                //==================================
                //Validation for matching password
                var firstpassword=document.myForm.password.value;  
                var secondpassword=document.myForm.password2.value;  

                if(firstpassword===secondpassword){  
                    return true;  
                }  
                else{  
                    alert("password must be same!");  
                    return false;  
                } */
                //---------------------------------------
                //Validation for checking only number 
                /*var num=document.myForm.num.value;  
                if (isNaN(num)){  
                  document.getElementById("numloc").innerHTML="Enter Numeric value only";  
                  return false;  
                }
                else{  
                  return true;  
                  }  */
                  //Validation for checking Length
                  /*var data=document.myForm.fname.value;
                  if(data.length<6){
                      alert("Name must be greater then 6 digits"); 
                      return false;
                  }  
                  else
                  {
                      return true;
                  }*/
                  //Radio Button validation
                /*  if ((myForm.Gender[0].checked == false) && (myForm.Gender[1].checked == false))
                    {
                        alert("Choose Your Gender: Male or Female");
                        return false;
                    }
               */
              //Validation for Dropdown 
                    /*if (myForm.City.value == "-1")
                      {
                          alert("Enter Your City!");
                          myForm.City.focus();
                          return;
                      }*/
              //Validation for Pincode or Contact no
                   /* if (myForm.pincode.value == "" ||
                        isNaN(myForm.pincode.value) ||
                        myForm.pincode.value.length != 6)
                    {
                        alert("Enter your pincode in format ######.");
                        myForm.pincode.focus();
                        return;
                    }*/
                    //Validation for Email
                    /*var email = myForm.emailid.value;
                    atpos = email.indexOf("@");
                    dotpos = email.lastIndexOf(".");
                    if (email == "" || atpos < 1 || (dotpos - atpos < 2))
                    {
                        alert("Enter your correct email ID")
                        return;
                    }*/
               }
        </script>
    </head>
    <body>

        <form name="myForm" action="#" onsubmit="return validateForm()" method="post">
            
            Name: <input type="text" name="fname"><br/><br/>
            Password:<input type="password" name="password" /><br/><br/>  
            Re-enter Password:<input type="password" name="password2"/><br/><br/> 
            Number: <input type="text" name="num"><span id="numloc"></span><br/> <br/>
            
            <input type="radio" name="Gender" value="male" size="10">Male
            <input type="radio" name="Gender" value="Female" size="10">Female
            
            <select name="City">
                <option value="-1" selected>select..</option>
                <option value="Surat">Surat</option>
                <option value="Bardoli">Bardoli</option>
                <option value="Baroda">Baroda</option>
                <option value="Rajkot">Rajkot</option>
            </select>
            
            <input type="text" name="pincode" id="pincode" size="30">
            
            <input type="text" name="emailid" id="emailid" size="30">
            <input type="submit" value="Submit">
        </form>

    </body>
</html>