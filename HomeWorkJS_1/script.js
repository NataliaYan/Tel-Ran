// расчет и вывод на экран 10%  от введенного значения пользователем
let value = prompt("Введите число:");
let percent = 0.1;
let discount = value *percent;
alert(`10% от ${value} составляет ${discount}`);

// получить 2 числа и вывести наибольшее
let number_1 = +prompt("Введите первое число:");
let number_2 = +prompt("Введите второе число:");
if (number_1>number_2){
    alert(`наибольшее значение ${number_1}`);
} else if (number_1<number_2){
    alert(`наибольшее значение ${number_2}`);
} else {
    alert(`оба числа равны ${number_2}`);
}

// считать число и сравнить со значением 20
let number = prompt("Введите число:");
let fix_number = 20;
if (number<fix_number){
    alert(`Введенное число - ${number} меньше ${fix_number}`);
} else if (number>fix_number){
    alert(`Введенное число - ${number} больше ${fix_number}`);
} else {
    alert(`Введенное число - ${number} равно ${fix_number}`);
}

// запросить имя и вывести сообщение в соответствии с возрастом
let user_name = prompt("What is your name?");
let age = +prompt("How old are you?");
if (age>=18){
    alert(`Hello, ${user_name} !`);
} else {
    alert(`Hi, ${user_name} !`);
}