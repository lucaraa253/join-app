 function display(){
	
	

	var name = "Richard"
	for(i = 1; i<=5; i++){
	document.write("<h1>" + name)
	}
	document.write("<br/>");
	grade = 100
	document.write("<h1>"+ name + "Your grade is " + grade)
}

function addNumbers(){
	var num1 = prompt("Enter number 1");
	var num2 = prompt("Enter number 1");
	result = parseInt(num1) + parseInt(num2);
	
	var data = confirm("Do you want to see the sum ? ")
	if(data){
		alert("Sum of the two numbers is : " + result);
	}else{
		alert("Thanks for using my app")
	}
}

function disp(message){
	var name = "Richard"
	var city = "London"
	if(message ==null){
		message = "Welcome guest"
	}
	alert(message);
}

function dispName(){
	var fName = prompt("Enter your first name");
	var lName = prompt("Enter your last name");
	var result = fName.substring(0,1)
	var data = confirm("Do you want to display your name ?")
	if(data){
		alert("Welcome " + result + " " + lName)
	}else{
		alert("Thank you")
	}
	
}
function randNum(){
	r=Math.floor((Math.random()+ .1) * 10)
	
	alert(r)
}
function lastDateCheck(){
	var today = new Date();
	var lastdate = new Date();
	lastdate.setFullYear(2022, 1, 14);//31st March 2022
	if (lastdate > today) {
		var day = 1000 * 60 * 60 * 24;
		x = (lastdate - today) / day;
		days = Math.floor(x)
		alert("Your total amount owed is 8700 and you have " + days + " days before fines are added");
	} else {
		principal = 8700
		var day = 1000 * 60 * 60 * 24;
		x = (lastdate - today) / day;
		posDay = Math.abs(x)
		fine = posDay * 50;
		totalAmount=principal + fine;
		alert("Your total amount owed is : " + totalAmount);
	}
	
}
 function revature(){
	console.log("Revature")
}
