var checknum = function () { };
var sayhello = function (username) {
    console.log(`hello ${username}`);
};
var result = sayhello(`vk`);
console.log(result);
console.log(sayhello(`vikas`));
var checkAge = function (age) {
    if (age > 18) {
        return (`eligible for voting`);
    }
    else {
        return (`not eligible`);
    }
};
var result1 = checkAge(20);
console.log(result1);
function showData(fun) {
    console.log("inside Show");
    fun();
    console.log("printing");
}
showData(() => {
    console.log("java is fun");
});
showData((myname) => {
    console.log(`hello${myname}`);
});
