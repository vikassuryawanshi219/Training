class Student{
    public constructor(
        public name:string,
        public studentId:number,
        public city:string,
        public department?:string,// ?means optional.should be the 
        public hobby:string='sports'){}// if u are using reg parameter after optional provid edefault value


//add a method
printDetails=()=>{
    console.log(`name:${this.name}`);
    console.log(`id:${this.studentId}`);
    console.log(`city:${this.city}`);
    console.log(`department:${this.department}`);
    console.log(`hobby:${this.hobby}`);
}
    showCourses=(...courses:string[]):void=>{
    courses.forEach(course=>console.log(`course ${course}`))

}

}
var student=new Student('joe',10,'Banglore','cs','football');
student.printDetails();
var student1=new Student('ram',6,'Bhopal','eee');
student1.printDetails();
student1.showCourses('java','spring');


///////
console.log(``);

class Employeee{
    name:string
    city:string

    printDetails=()=>{
        console.log(`name:${this.name}`);
        console.log(`city:${this.city}`);
    }
    show=(msg:string)=>{console.log(`${msg}`);
        
    }
}

class Manager{
    public constructor(
        public name:string,
        public city:string,
        public salary:number
         ){}

    calcBonus=(amount:number)=>
}