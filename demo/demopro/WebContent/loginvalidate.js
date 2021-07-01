function validate(){
    var uname=document.getElementById("uname").value;
    var upass=document.getElementById("upass").value;
    if(uname==""){
        alert("Enter the Username");
        return false;
    }
    else if(upass==""){
        alert("Enter the Password");
        return false;
    }
    else{
        alert("successfully login");
        return true;
    }
}