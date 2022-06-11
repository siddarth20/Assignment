let id = (id) => document.getElementById(id);

let classes = (classes) => document.getElementsByClassName(classes);

let username = id("username"),
  email = id("email"),
  password = id("password"),
  form = id("form"),
  
  errorMsg = classes("error"),
  successIcon = classes("success-icon"),
  failureIcon = classes("failure-icon");

function userNameValidation(id, serial, message) {

  //checking whether field is blank
  if (id.value.trim() === "") {
    errorMsg[serial].innerHTML = message;
    id.style.border = "2px solid red";
    
    failureIcon[serial].style.opacity = "1";
    successIcon[serial].style.opacity = "0";
  } 
  
  else {
    errorMsg[serial].innerHTML = "";
    id.style.border = "2px solid green";
    
    failureIcon[serial].style.opacity = "0";
    successIcon[serial].style.opacity = "1";
  }
}

function emailValidation(id,serial,message){
  var status = false;
    if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(id.value)){
    status=true;
}
if(status==true){
  errorMsg[serial].innerHTML = "";
    id.style.border = "2px solid green";
    
    failureIcon[serial].style.opacity = "0";
    successIcon[serial].style.opacity = "1";
}
else{
message="Invalid Email Address"
errorMsg[serial].innerHTML = message;
id.style.border = "2px solid red";

failureIcon[serial].style.opacity = "1";
successIcon[serial].style.opacity = "0";
}
status=false
}

function passwordValidation(id,serial,message){
var lowerCaseLetters = /[a-z]/g;
var upperCaseLetters = /[A-Z]/g;
var numbers = /[0-9]/g;

if (id.value.trim() === "") {
    message="Password cannot be blank"
    errorMsg[serial].innerHTML = message;
    id.style.border = "2px solid red";
    
    failureIcon[serial].style.opacity = "1";
    successIcon[serial].style.opacity = "0";
  } 
  
  //Validate lower case letters
  else if(!id.value.match(lowerCaseLetters)) {
    message = "Password should have lowercase letters"
    errorMsg[serial].innerHTML = message;
    id.style.border = "2px solid red";
    
    failureIcon[serial].style.opacity = "1";
    successIcon[serial].style.opacity = "0";
  } 

  // Validate capital letters
  else if(!id.value.match(upperCaseLetters)) {
    message = "Password should have uppercase letters"
    errorMsg[serial].innerHTML = message;
    id.style.border = "2px solid red";
    
    failureIcon[serial].style.opacity = "1";
    successIcon[serial].style.opacity = "0";
  } 
  
  // Validate numbers
  else if(!id.value.match(numbers)) {
    message = "Password should contain a number"
    errorMsg[serial].innerHTML = message;
    id.style.border = "2px solid red";
    
    failureIcon[serial].style.opacity = "1";
    successIcon[serial].style.opacity = "0";
  } 
  
  // Validate length
  else if(!(id.value.length >= 8)) {
    message = "Password should be atleast 8 characters long"
    errorMsg[serial].innerHTML = message;
    id.style.border = "2px solid red";
    
    failureIcon[serial].style.opacity = "1";
    successIcon[serial].style.opacity = "0";
  } 
  
  else {
    errorMsg[serial].innerHTML = "";
    id.style.border = "2px solid green";
    
    failureIcon[serial].style.opacity = "0";
    successIcon[serial].style.opacity = "1";
  }
}

form.addEventListener("submit", (e) => {
    e.preventDefault();
    
  userNameValidation(username, 0, "Username cannot be blank");
  emailValidation(email,1,"");
  passwordValidation(password, 2, "");
  });

