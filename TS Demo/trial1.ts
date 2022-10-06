// import {greet,Product,message } from "./trial";

// console.log(message);

// let prod=new Product(`speaker`,7000);
// prod.printDetail();

// greet(`sri`);

let greet=(username:string):void=>{
    console.log(`from the current module${username}`);
}

import * as mymodule from "./trial"
console.log(`${mymodule.message}`);
mymodule.greet(`priya`);
greet(`sri`);

var prod=new mymodule