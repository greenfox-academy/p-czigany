/**
 * Created by peter on 2017.04.04..
 */
public class Sponsor extends Person {

//  Create a Sponsor class that has the same fields and methods as the Personclass, and has the following additional
//
//          fields:
//  company: name of the company
//  hiredStudents: number of students hired
//  method:
//  introduce(): "Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far."
//  hire(): increase hiredStudents by 1
//  getGoal(): prints out "Hire brilliant junior software developers."
//  The Sponsor class has the following constructors:
//
//  Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
//  Sponsor(): sets name to Jane Doe, age to 30, gender to female, company to Google and hiredStudents to 0

  String name;
  int age;
  String gender;

  String company;
  int hiredStudents;

  void hire() {
    hiredStudents++;
  }

  void introduce() {
    System.out.println(
            "Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company
                    + " and hired " + hiredStudents + " students so far.");
  }

  void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
  }

  Sponsor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    company = "Google";
    hiredStudents = 0;
  }
}
