Single Responsibility Principle (SRP)
I made sure every class has only one job. The Student class just holds student information, while the Builder class handles the work of putting the student object together. 
This keeps the code clean because the data and the building process are kept separate.

Open/Closed Principle (OCP)
My code is built so it can grow without breaking. 
It is "open" because I can easily add new types of students, like a PartTimeStudent. 
It is "closed" because I can add these new types without changing or touching the code that is already working in the original Student class.
