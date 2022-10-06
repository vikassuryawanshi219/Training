


var checknum=function(){}

var sayhello=function(username:string){
console.log(`hello ${username}`);
}
var result=sayhello(`vk`);
console.log(result);
console.log(sayhello(`vikas`));

var checkAge=function(age:number){
if(age>18){
    return(`eligible for voting`)
}
else{
    return(`not eligible`);
}
};
var result1=checkAge(20);
console.log(result1);


function showDataa(fun:Function){
    console.log("inside Show")
    fun();
    console.log("printing")

}
showDataa(()=>{
    console.log("java is fun");
});

showDataa((myname:string)=>{
    console.log(`hello${myname}`);
})