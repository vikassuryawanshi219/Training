export var message = "welcome";
export let greet = function (username) {
    console.log(`welcome ${username}`);
};
export class Product {
    constructor(username, price) {
        this.username = username;
        this.price = price;
        this.printDetail = () => {
            console.log(`${this.username}`);
            console.log(`${this.price}`);
        };
    }
}
