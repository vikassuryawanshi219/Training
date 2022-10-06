var num = [20, 30, 40, 50];
console.log(num[2]);
console.log(num[10]);
console.log(num.length);
//num.length=10
//console.log(num.length);
console.log('for');
for (var i = 0; i < num.length; i++) {
    var element = num[i];
    console.log(element);
}
console.log('for in');
for (var i in num) {
    var element = num[i];
    console.log(element);
}
console.log('for of');
for (var _i = 0, num_1 = num; _i < num_1.length; _i++) {
    var val = num_1[_i];
    console.log(val);
}
////////
console.log();
var sumn = function (index, value, nums) {
    console.log(index);
    console.log(value);
    console.log(nums);
};
num.forEach(function (value) {
    console.log(value);
});
//////
var fruite = ['apple', 'pineapple', 'orange'];
console.log('for of');
for (var _a = 0, fruite_1 = fruite; _a < fruite_1.length; _a++) {
    var val = fruite_1[_a];
    console.log(val);
}
fruite.forEach(function (value) {
    if (value.match('o'))
        console.log(value);
});
