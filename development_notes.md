All questions category shall be loaded into a a multidimension 
string array that will have the category name and the path to the text file withh questions
The array shall be created during the main method

I am breaking up the application into multiple methods

Method 1: readQuestions

This method will read questions and return an array of string
it will accept question file path as a string

Method 2: addQuestionsToPowerPoint()

Thsis method will iterate over the question array returned by read question while writing the
the questions to the powerpoint

Method 3: addQuestionCategory
This method will add the question category to the powerpoint file just before adding the questions in method two
 
Project Flow:

1. Loop through the collection of categories
2. Open the text file with the question from path with the collection
3. read to an array
4. add the category slide to the powerpoint slide
5. loop and add each question to the powerpoint slide after the category
6. End the project with all questions added to the slide