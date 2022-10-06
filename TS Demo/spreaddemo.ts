var nums=[10,20,30,40]
var nums1=[60,0,80,90];

// spread the arrays
//create a new array by spreading the values

var tensarr=[...nums,...nums1]
console.log(`${tensarr}`);


var emp1={name:'jo',department:'admin'}
var add ={city:'ban',state:'kar'}
//object literals
var details={
    ...emp1,...add,mobile:90182,
    allowance:tensarr
}
console.log(details);