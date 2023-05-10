let number1 = promt("Enter number1:");
let number2 = promt("Enter number2:");
let number3 = promt("Enter number3:");
alert((number1 + number2 + number3) / 3);

let age = 20;
if (age < 18) {
  alert("error");
} else {
  alert("ok");
}
let number_1 = promt("Enter number_1:");
let number_2 = promt("Enter number_2:");
if (number_1 > number_2) {
  alert("number_1 > number_2");
} else if (number_1 < number_2) {
  alert("number_2 > number_1");
} else {
  alert("number_1 = number_2");
}

let accountBalance = promt();
let orderValue = promt();
if (accountBalance >= orderValue) {
  alert("its OK");
} else {
  let result = orderValue - accountBalance;
  alert(`${result} is missing`);
}
