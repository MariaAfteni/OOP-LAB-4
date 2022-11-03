 In this laboratory work I simulated an online university management system. To enter the system the user needs to 
 log in, and the program simulates if the logging process was successful or not. If the log in process failed, the 
 simulation is stopped and is outputed the message "Introduce correct username and password". If the log in  process 
 was successful, the simulation continues.

 The next stage shows either a student account or a teacher account. In both of them is displayed the information about 
 university and faculty, and is selected a course from the courses array, with a generated number of credits and students.
 
In the teacher account the simulation displays the possible action of the teacher user. A teacher can add an assignment
and check statistics of that assignment. The assignment is picked from an array of different types of 
assignments and is displayed the due date of the task that is generated randomly. The statistics of the assignment 
generate number of total students that submitted it  and how many of them submitted it after the deadline.
A teacher can, also check the statistics of the exams. This generates a random number of students that took the exam, 
how many of them failed and is generated an average grade per exam.

In the student account, the user can see the deadline of an assignment, submit that assignment, and the simulation will 
calculate if the assignment was submitted in time or not, and how many days, hours or minutes, it was late by. The 
student can check if the assignment was graded or not, and what grade it is. The user can take an exam, be absent at the
exam or the exam can be canceled. If he took the exam, he can check the grade and the status: failed or passed exam.

To introduce the polymorphism, I added 2 interfaces. First, is the Log interface, that has as method the verification 
of the log in process. The log_into class implements the Log interface, by overriding the verify_log method, where is 
randomized if the process of login was successful or failed.

The second interface is the Course_Interface with the name, nr_credits and nr_students methods. The Course class that 
implements this interface, is overriding these methods and selects a name for the course, ang generates a number of 
credits and of students that are taking the course this semester.
