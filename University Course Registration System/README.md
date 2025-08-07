# University Course Registration System (Java OOP)

This Java project demonstrates key Object-Oriented Programming (OOP) principles — **Encapsulation, Inheritance, Polymorphism, Abstraction**, and **Interfaces** — through a simple university course registration system.

## 📌 Features

### ✅ Part 1: Encapsulation
- **Class: `Course`**
  - Fields: `courseCode`, `courseTitle`, `creditHours`, and a list of `enrolledStudents`.
  - Validation: `creditHours` must be between 1 and 5.
  - Methods: `addStudent(Student student)`, `removeStudent(Student student)`, `getEnrolledStudents()`.

### ✅ Part 2: Inheritance
- **Base Class: `Person`** (abstract)
  - Subclasses:
    - `Student`: adds `studentId`, `major`, and a list of `registeredCourses`.
    - `Professor`: adds `professorId`, `department`, and a list of `teachingCourses`.

### ✅ Part 3: Polymorphism
- Both `Student` and `Professor` override the `getDetails()` method to print their specific information.

### ✅ Part 4: Abstraction & Interfaces
- **Interface: `Registrable`**
  - Defines: `boolean registerCourse(Course course)`, `boolean dropCourse(Course course)`.
- `Student` implements `Registrable` with:
  - Duplicate course check before registering.
  - Ability to drop registered courses.
