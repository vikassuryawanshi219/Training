function sumofNum(...nums:number[]){
let sum = 0;
nums.forEach((value:number)=>{
    sum+=value;
});
console.log(`sum ${sum}`);

}
//the values are combine into aarray
sumofNum(17,34,556)
sumofNum(17,34,556,44)
sumofNum(17,67)

let newcities:string[]=[];
var cities=['bhopal','bangalore','indore','newyork']
 cities.forEach((city:string)=>{
    
  if(!city.startsWith('n'))
   newcities.push(city);

 })
 newcities.forEach(city=>console.log(`cities ${city}`))