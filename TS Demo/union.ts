var nname:any;
nname='priya'
console.log(`${nname}`);
nname=1000
console.log(`${nname}`);
nname=['a','b']
console.log(`${nname}`);

////////
var myval:string|number;

function printdata (myval:string|number){
    if(typeof myval=='string'){
        console.log(`hello ${myval}`);
    }
}
