var Firstname, username, password, conf_pass;
$(document).ready(function () {


})
InputBody = {
    Name : Firstname,
    username : username
}
function checkName() {
    
    Firstname = $("#register-Name").val()
    if (!Firstname) {
        $("#register-Name").replaceWith(`
         
        <input type="text" class="form-control is-invalid" id="register-Name" value="" onblur="checkName()"  name="register-Name" required="">
    
    `);
    }
    else {
        $("#register-Name").replaceWith(`
         
        <input type="text" class="form-control is-valid" id="register-Name" value=${Firstname} onblur="checkName()"  name="register-Name" required="">
    
    `);
    }
};

function checkUsername(){
    username = $("#register-email").val()
    //jsonData = JSON.stringify(InputBody)
    jsonData = {Username :username}
    console.log( "My json " + jsonData);
    $.post("/petpet/register",jsonData ,getData)
    console.log(jsonData);
}

function getData(data){
    console.log("Data " + data);
}
