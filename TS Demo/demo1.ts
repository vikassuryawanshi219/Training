
var username= 'vikas';  // type infered
console.log(username);

let message:string;
message='have a great day';
console.log(message,username);

const weekday='SUNDAY';

console.log(weekday+" is a holiday"); //object literal

let newmessage=`this is a demo\n  it is raining`;

//Object literal
console.log(`${weekday} is a holiday.${newmessage}`);
console.log(`welcome ${username}`);

let num1=100;
let num2=200;

console.log(`${num1+num2}`)

//print num using object literal as sum=300

console.log (typeof num1+num2);
