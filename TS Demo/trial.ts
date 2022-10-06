export var message:string="welcome";
export let greet=function(username:string){
    console.log(`welcome ${username}`);
}
export class Product{
public constructor(

    public username:string,
    public price:number
){}

printDetail=()=>{
console.log(`${this.username}`);
console.log(`${this.price}`);
};
}


