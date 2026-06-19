<<<<<<< HEAD
Student.java
package com.abes.javawithnitin;
public class Student {
 private int id;
 private String name;
 private String course;
 public Student(int id, String name, String course) {
 this.id = id;
 this.name = name;
 this.course = course;
 }
 public int getId() { return id; }
 public void setId(int id) { this.id = id; }
 public String getName() { return name; }
 public void setName(String name) { this.name = name; }
 public String getCourse() { return course; }
 public void setCourse(String course) { this.course = course; }
}
StudentController.java
package com.abes.javawithnitin;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
public class StudentController {
 @GetMapping("/welcome")
 public String welcome() {
 return "Welcome to Student Management REST API!";
 }
 @GetMapping("/student")
 public Student getStudent() {
 return new Student(1, "Aarav Sharma", "B.Tech Computer Science");
 }
 @PostMapping("/student")
 public String addStudent(@RequestBody Student student) {
 return "Student added: " + student.getName() + " | Course: " + student.getCourse();
 }
=======
Student.java
package com.abes.javawithnitin;
public class Student {
 private int id;
 private String name;
 private String course;
 public Student(int id, String name, String course) {
 this.id = id;
 this.name = name;
 this.course = course;
 }
 public int getId() { return id; }
 public void setId(int id) { this.id = id; }
 public String getName() { return name; }
 public void setName(String name) { this.name = name; }
 public String getCourse() { return course; }
 public void setCourse(String course) { this.course = course; }
}
StudentController.java
package com.abes.javawithnitin;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
public class StudentController {
 @GetMapping("/welcome")
 public String welcome() {
 return "Welcome to Student Management REST API!";
 }
 @GetMapping("/student")
 public Student getStudent() {
 return new Student(1, "Aarav Sharma", "B.Tech Computer Science");
 }
 @PostMapping("/student")
 public String addStudent(@RequestBody Student student) {
 return "Student added: " + student.getName() + " | Course: " + student.getCourse();
 }
>>>>>>> 043ef7aa77db17a4585f3897c0a5ff8417f55b4c
}