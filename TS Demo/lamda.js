var showName = function (uname) {
    console.log("great day ".concat(uname));
};
var printSqrt = function (num) { return console.log(Math.sqrt(num)); };
//var printCube=(num:number)=>(num*num*num);
var printCube = function (num) { return (Math.pow(num, 3)); };
printSqrt(16);
console.log(printCube(10));
