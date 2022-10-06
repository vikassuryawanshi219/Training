var showName=(uname:string)=>{
    console.log(`great day ${uname}`);
}

var printSqrt=(num:number)=>console.log(Math.sqrt(num));
//var printCube=(num:number)=>(num*num*num);
var printCube=(num:number)=>(Math.pow(num,3));
printSqrt(16)
console.log(printCube(10));