# ProBot


## Inspiration 

We had to take mundane and repetitive online quizzes for our chemistry class and we thought that there had to be a more efficient way to take them. The quizzes were set up on an online site called Pro Profs and they were based off of a larger question bank, we realized that a machine learning robot would be able to learn all of the questions in the question bank and be able to get hundreds on the quizzes.  

## What it does

The ProBot utilizes the automation class in Java to create a robot object. The robot object interacts with the online quiz by using the peripherals of the computer. It goes to the URL of the quiz, copies the question, checks to see if the question is in our MySQL database hosted by Amazon Web Services, if it is in the database then it fetches the answer and selects the correct one, if it is not then it picks a random one and stores the correct answer in the database for future use. Once it has learned all of the questions it will be able to get every question correct. 

## How I built it

We first started by focusing on our backend, we set up an amazon server and formatted it to store the questions and answers. Then we researched the java automation class and decided to use the robot object to interact with the online quiz. Finally, we were able to leverage the complex object-oriented programming style of the Java programming  language to combine all of these parts into a cohesive program.

## Challenges I ran into

We ran into one main challenge, how to interact with the MySQL server from Java. This was because they are both different programming languages. After hours of research we discovered Java Database Connectivity or JDBC and were able to use the .execute() method to insert data in our table to send queries to the server.

## Accomplishments that we are proud of

The two biggest things that were are proud of are the MySQL database and the machine learning algorithm. The MySQL database is a large accomplishment because it not only interacts with our Java program and makes our idea scaleable, because it can hold a very large amount of data, but it is also hosted by Amazon Web Services. Because it is hosted by AWS it is redundant which means that it will never go down and it can be accessed from anywhere in the world because it is in the cloud. 

## What we learned

The two biggest things that we learned is how to work as a team on the same code project and how to utilize multiple resources together. This was our first hackathon for all of us and we learned a lot about teamwork. For example, we learned to listen to each other's ideas, we learned how to plan and create separate objects that fit together, and we learned how to appreciate each others skills. Also, we learned how to combine multiple resources together to create a great project. The ProBot is a combination of MySQL, Amazon Web Services Relational Database Service, and Java.

## What's next for ProBot

the technology behind ProBot is extremely robust, scaleable, and applicable towards many real world applications. For example, the MySQL database part could be used the store users data, the machine learning algorithm could be used to teach computers how to complete tasks with patterns own their own, and the Java automation program could help users with mundane tasks across their computing environment. The main vision for this technology is to be able to have computers interact with web elements and be able to learn from their experiences.
