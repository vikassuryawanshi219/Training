function sumofNum(...nums) {
    let sum = 0;
    nums.forEach((value) => {
        sum += value;
    });
    console.log(`sum ${sum}`);
}
//the values are combine into aarray
sumofNum(17, 34, 556);
sumofNum(17, 34, 556, 44);
sumofNum(17, 67);
let newcities = [];
var cities = ['bhopal', 'bangalore', 'indore', 'newyork'];
cities.forEach((city) => {
    if (!city.startsWith('n'))
        newcities.push(city);
});
newcities.forEach(city => console.log(`cities ${city}`));
