class Student {
    constructor(name, studentId, city, department, // ?means optional.should be the 
    hobby = 'sports') {
        this.name = name;
        this.studentId = studentId;
        this.city = city;
        this.department = department;
        this.hobby = hobby;
        //add a method
        this.printDetails = () => {
            console.log(`name:${this.name}`);
            console.log(`id:${this.studentId}`);
            console.log(`city:${this.city}`);
            console.log(`department:${this.department}`);
            console.log(`hobby:${this.hobby}`);
        };
        this.showCourses = (...courses) => {
            courses.forEach(course => console.log(`course ${course}`));
        };
    } // if u are using reg parameter after optional provid edefault value
}
var student = new Student('joe', 10, 'Banglore', 'cs', 'football');
student.printDetails();
var student1 = new Student('ram', 6, 'Bhopal', 'eee');
student1.printDetails();
student1.showCourses('java', 'spring');
