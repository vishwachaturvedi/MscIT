<html>
    <head>
        <script type="text/javascript" src="test.js"></script>
        <style>
            ul {list-style-type:none;}
            form{
                background-color: #DCDCDC;
            }
        </style>
    </head>

    <body>
        <form action="#" name="StudenSignupForm" onsubmit="return(validateHTMlform());">

            <div cellpadding="2" width="20%" bgcolor="99FFFF" align="center"
                 cellspacing="2">

                <ul>
                    <li>
                    <center><font size=4><b>Student Registration Form</b></font></center>
                    </li>
                </ul>

                <ul>
                    <li>First Name</li>
                    <li><input type=text name=textnames id="textname" size="30"></li>
                </ul>

                <ul>
                    <li>
                        Last Name</li>
                    <li><input type=text name=lastnames id="lastname" size="30"></li>
                </ul>

                <ul>
                    <li>Father Name</li>
                    <li><input type="text" name="full_father_name" id="fathername"
                               size="30"></li>
                </ul>


                <ul>
                    <li>Address</li>
                    <li><input type="text" name="personal_address"
                               id="personaladdress" size="30"></li>
                </ul>

                <ul>
                    <li>Gender</li>
                    <li><input type="radio" name="Gender" value="male" size="10">Male
                        <input type="radio" name="Gender" value="Female" size="10">Female</li>
                </ul>

                <ul>
                    <li>City</li>
                    <li><select name="City">
                            <option value="-1" selected>select..</option>
                            <option value="KOLKATA">KOLKATA</option>
                            <option value="CHENNAI">CHENNAI</option>
                            <option value="PUNE">PUNE</option>
                            <option value="JAIPUR">JAIPUR</option>
                        </select></li>
                </ul>

                <ul>
                    <li>Course</li>
                    <li><select name="Course">
                            <option value="-1" selected>select..</option>
                            <option value="B.Tech">B.TECH</option>
                            <option value="MCA">MCA</option>
                            <option value="MBA">MBA</option>
                            <option value="BCA">BCA</option>
                        </select></li>
                </ul>



                <ul>
                    <li>State</li>
                    <li><select Name="State">
                            <option value="-1" selected>select..</option>
                            <option value="New Delhi">NEW DELHI</option>
                            <option value="Mumbai">MUMBAI</option>
                            <option value="Goa">GOA</option>
                            <option value="Bihar">BIHAR</option>
                        </select></li>
                </ul>

                <ul>
                    <li>District</li>
                    <li><select name="Disulict">
                            <option value="-1" selected>select..</option>
                            <option value="Nalanda">NALANDA</option>
                            <option value="UP">UP</option>
                            <option value="Goa">GOA</option>
                            <option value="Patna">PATNA</option>
                        </select></li>

                </ul>

                <ul>
                    <li>PinCode</li>
                    <li><input type="text" name="pin_code" id="pincode" size="30"></li>

                </ul>
                <ul>
                    <li>student email</li>
                    <li><input type="text" name="email_id" id="emailid" size="30"></li>
                </ul>

                <ul>
                    <li>Date Of Birth</li>
                    <li><input type="text" name="date_of_birth" id="dob" size="30"></li>
                </ul>

                <ul>
                    <li>Mobile Number</li>
                    <li><input type="text" name="mobilenumber" id="mobile_no" size="30"></li>
                </ul>
                <ul>
                    <li><input type="reset"></li>
                    <li colspan="2"><input type="submit" value="Submit Form" /></li>
                </ul>
            </div>
        </form>
    </body>
</html>