var num=[20,30,40,50];
console.log(num[2]);
console.log(num[10]);
console.log(num.length);
//num.length=10
//console.log(num.length);
console.log('for')
for(let i=0;i<num.length;i++){
const element=num[i];
console.log(element)
}
console.log('for in')
for(const i in num){
    const element=num[i];
    console.log(element)
}

console.log('for of')
for(const val of num){
    
    console.log(val)
}

////////
console.log()

var sumn=function(index:number,value:number,nums:number[]){
    console.log(index)
    console.log(value)
    console.log(nums)
}

num.forEach((value:number)=>{
console.log(value)
});

//////
var fruite=['apple','pineapple','orange']


fruite.forEach((value:string)=>{
    if(value.match('o'))
console.log(value)
});
