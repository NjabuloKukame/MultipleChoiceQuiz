/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplechoicequiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Tikkun
 */
public class AllQuestions {

    private List<Question> questions;   

    // Inner class to represent a question
    public class Question {

        private String question;
        private String option1;
        private String option2;
        private String option3;
        private String option4;
        private String answer;
        private String fullAnswer;

        // Constructor to initialize a question
        public Question(String question, String option1, String option2, String option3, String option4, String answer, String fullAnswer) {
            this.question = question;
            this.option1 = option1;
            this.option2 = option2;
            this.option3 = option3;
            this.option4 = option4;
            this.answer = answer;
            this.fullAnswer = fullAnswer;
        }

        // Getter method for retrieving the question
        public String getQuestion() {
            return question;
        }

        // Getter methods for retrieving options
        public String getOption1() {
            return option1;
        }

        public String getOption2() {
            return option2;
        }

        public String getOption3() {
            return option3;
        }

        public String getOption4() {
            return option4;
        }

        // Getter method for retrieving the correct answer
        public String getAnswer() {
            return answer;
        }

        public String getFullAnswer() {
            return fullAnswer;
        }
    }
    
    // Method to add a question to the list
    private void addQuestion(String question, String option1, String option2, String option3, String option4, String answer, String fullAnswer) {
        Question q = new Question(question, option1, option2, option3, option4, answer, fullAnswer);
        questions.add(q);
    }

    // Method to retrieve the list of questions
    public List<Question> getQuestions() {
        return questions;
    }

    // Constructor to initialize the list of questions
    public AllQuestions() {
        questions = new ArrayList<>();

        //Art Questions
        //Question 1
        addQuestion("Who Painted The Mona Lisa?",
                "A. Leonardo da Vinci",
                "B. Vincent van Gogh",
                "C. Pablo Picasso",
                "D. Michelangelo",
                "A",
                "A. Leonardo da Vinci");

        //Question 2
        addQuestion("Who Painted The Starry Night?",
                "A. Leonardo da Vinci",
                "B. Vincent van Gogh",
                "C. Pablo Picasso",
                "D. Michelangelo",
                "B",
                "B. Vincent van Gogh");

        //Question 3
        addQuestion("Who Sculpted The Statue of David?",
                "A. Leonardo da Vinci",
                "B. Donatello",
                "C. Raphael",
                "D. Michelangelo",
                "D",
                "D. Michelangelo");

        //Question 4
        addQuestion("Which Artist Is Known for His Paintings of Soup Cans?",
                "A. Jackson Pollock",
                "B. Wassily Kandinsky",
                "C. Andy Warhol",
                "D. Frida Kahlo",
                "C",
                "C. Andy Warhol");

        //Question 5
        addQuestion("Who Painted The Ceiling of The Sistine Chapel?",
                "A. Michelangelo",
                "B. Donatello",
                "C. Raphael",
                "D. Jean-Michel Basquiat",
                "A",
                "A. Michelangelo");

        //Question 6
        addQuestion("Which Artist Is Known For His \"Cut-Out\" Technique In Creating Colorful Paper Compositions?",
                "A. Piet Mondrian",
                "B. Henri Matisse",
                "C. Georgia O'Keeffe",
                "D. Paul Cézanne",
                "B",
                "B. Henri Matisse");

        //Question 7
        addQuestion("Who Painted The Scream, Depicting A Figure With A Contorted Expression?",
                "A. Wassily Kandinsky",
                "B. Pierre-Auguste Renoir",
                "C. Paul Gauguin",
                "D. Edvard Munch",
                "D",
                "D. Edvard Munch");

        //Question 8
        addQuestion("Who Painted The Persistence of Memory, Featuring Melting Clocks?",
                "A. Salvador Dalí",
                "B. Claude Monet",
                "C. Paul Gauguin",
                "D. Jackson Pollock",
                "A",
                "A. Salvador Dalí");

        //Question 9
        addQuestion("Which Artist Is Known For His Neo-expressionist Paintings and Collaborated With Andy Warhol?",
                "A. Keith Haring",
                "B. Banksy",
                "C. Jean-Michel Basquiat",
                "D. Shepard Fairey",
                "C",
                "C. Jean-Michel Basquiat");

        //Question 10
        addQuestion("Which Art Movement Is Characterized By Its Use of Geometric Shapes And Primary Colors?",
                "A. Impressionism",
                "B. Abstract Expressionism",
                "C. Surrealism",
                "D. Cubism",
                "D",
                "D. Cubism");

        
        //Sport Questions
        //Q1
        addQuestion("Which Player Has The Most Career Goals?",
                "A. Lionel Messi",
                "B. Ronaldinho",
                "C. Cristiano Ronaldo",
                "D. Kylian Mbappe",
                "C",
                "C. Cristiano Ronaldo");

        addQuestion("Which Goalkeeper Has The Most Golden Gloves?",
                "A. Petr Cech",
                "B. Manuel Neur",
                "C. Ederson",
                "D. Iker Casillas",
                "A",
                "A. Petr Cech");

        addQuestion("Which Country Has Won The Most Rugby World Cups?",
                "A. New Zealand",
                "B. Australia",
                "C. England",
                "D. South Africa",
                "D",
                "D. South Africa");

        addQuestion("Which Player Scored The Most Tries In The 2023 World Cup?",
                "A. Handre Pollard",
                "B. Ox Nthse",
                "C. Will Jordan",
                "D. Bryan Habana",
                "C",
                "C. Willl Jordan");

        addQuestion("How Many Gold Olympic Medals Has Chad le Clos Won?",
                "A. 1",
                "B. 3",
                "C. 5",
                "D. 0",
                "A",
                "C. 1");

        addQuestion("Which Heat Did Tajana Schoenmaker win at the Olympics?",
                "A. 50m Breaststroke",
                "B. 100m Breaststroke",
                "C. 200m Breaststroke",
                "D. None of the above",
                "C",
                "C. 200m Breaststroke");

        addQuestion("How Many Tournaments Has Tiger Woods Won?",
                "A. 34 PGA tournaments",
                "B. 60 PGA tournaments",
                "C. 82 PGA tournaments",
                "D. 1 PGA tournament",
                "C",
                "C. 82 PGA tournaments");

        addQuestion("Who Is Tiger Woods' All Time Rival?",
                "A. Chris DiMarco",
                "B. David Duval",
                "C. Phil Mickelson",
                "D. Rory McIlroy",
                "D",
                "D. Rory McIlroy");

        addQuestion("How Many Australian Opens Did Rafael Nadal Win?",
                "A. 25 Australian Opens",
                "B. 2 Australian Opens",
                "C. 7 Australian Open",
                "D. 1 Australian Opens",
                "B",
                "B. 2 Australian Opens");

        addQuestion("How Many US Open Did Novak Djokovic Win?",
                "A. 1 US Open",
                "B. 2 US Open",
                "C. 4 US Open",
                "D. 9 US Open",
                "C",
                "C. 4 US Open");

        //Food Questions
        //Q1
        addQuestion("Which Is Considered A Fruit Amongst These Options:",
                "A. Apple",
                "B. Carrot",
                "C. Grain",
                "D. Onion",
                "A",
                "A. Apple");
        //Q2
        addQuestion("What Is The Most Popular Beverage in SA?",
                "A. Fanta",
                "B. Cold Drink",
                "C. Coca Cola",
                "D. Beer",
                "D",
                "D. Beer");
        //Q3
        addQuestion("What Is The Most Successfull Fast Food Resturant from SA?",
                "A. KFC",
                "B. Shopprite",
                "C. Nandos",
                "D. McDonalds",
                "C",
                "C. Nandos");
        //Q4
        addQuestion("Which Is Considered A Vegetable Amoungst These Options:",
                "A. Potatoes",
                "B. Watermelon",
                "C. Avocados",
                "D. Kiwi",
                "A",
                "A. Potatoes ");
        //Q5
        addQuestion("What Is The Only Fruit With Seeds On The Outside?",
                "A. Kiwi",
                "B. Raspberry",
                "C. Pineapple",
                "D. Strawberry",
                "D",
                "D. Strawberry");
        //Q6
        addQuestion("Animal That Produces The Most Dairy Products?",
                "A. Mountain Goats",
                "B. Goat",
                "C. Cow",
                "D. Buffalo",
                "C",
                "C. Cow");
        //Q7
        addQuestion("Where Did French Fries Originate",
                "A. French",
                "B. Britain",
                "C. Belguim",
                "D. Germany",
                "C",
                "C. Belguim");
        //Q8
        addQuestion("What Is The Most Consumed Meat In The World?",
                "A. Chiken",
                "B. Pork",
                "C. Beef",
                "D. Fish",
                "B",
                "B. Pork");
        //Q9
        addQuestion("What Do Vegetarians Typically Eat?",
                "A. Meat",
                "B. Fuits & Vegetable",
                "C. Fruit, Vegetable & Dairy",
                "D. Vegetable",
                "C",
                "C. Fruit, Vegetable & Dairy");
        //Q10
        addQuestion("Maize Derives From...",
                "A. Meat",
                "B. Fruit",
                "C. Corn",
                "D. Dairy",
                "C",
                "C. Corn");

        //Pop Culture Questions
        addQuestion(
                "What Is The Name of Michelle Obama’s Autobiography?",
                "A. Life of Michelle obama",
                "B. Not becoming",
                "C. Becoming",
                "D. Changing",
                "C",
                "C. Becoming"
        );

        addQuestion(
                "What Is Rihanna’s Real Name?",
                "A. Robyn", 
                "B. Rihanna", 
                "C. Ranesha", 
                "D. Fenty",
                "A",
                "A. Robyn"
        );

        addQuestion(
                "Who Is The Lead Actress in Salt?",
                "A. Scarlet Johansson", 
                "B. Angelina Jolie", 
                "C. Jennier Lawrence", 
                "D. Jennifer Lopez",
                "B",
                "B. Angelina Jolie"
        );

        addQuestion(
                "How Many Harry Potter Movies Are There?",
                "A. 4", 
                "B. 15", 
                "C. 1", 
                "D. 8",
                "D",
                "D. 8"
        );

        addQuestion(
                "Who Is The Oldest Kardashian Sister",
                "A. Kourtney", 
                "B. Kim", 
                "C. Kylie", 
                "D. Khloe",
                "A",
                "A. Kourtney"
        );

        addQuestion(
                "In What Movie Does Superman Die In?",
                "A. Man of Steel", 
                "B. Superman returns", 
                "C. Batman vs. Superman: Dawn of Justice", 
                "D. Justice League",
                "C",
                "C. Batman vs. Superman: Dawn of Justice"
        );

        addQuestion(
                "What Is The Most Viewed YouTube Video?",
                "A. Cocomelon", 
                "B. Despacito", 
                "C. Uptown funk", 
                "D. Baby Shark",
                "D",
                "D. Baby Shark"
        );

        addQuestion(
                "What Is The Name of J.Cole’s First Studio Album?",
                "A. Cole world: The Sideline Story", 
                "B. Born Sinner", 
                "C. 4 Your Eyez Only", 
                "D. 2014 Forest Hill Drive",
                "A",
                "A. Cole world: The Sideline Story"
        );

        addQuestion(
                "Who Has The Most Followers On Instagram?",
                "A. Taylor Swift", 
                "B. Cristiano Ronaldo", 
                "C. Dwayne Johnson", 
                "D. Kylie Jenner",
                "B",
                "B. Cristiano Ronaldo"
        );

        addQuestion(
                "What Is The Last Book In The Twilight Novel Series?",
                "A. New Moon", 
                "B. Breaking Dawn", 
                "C. Midnight Sun", 
                "D. Life and Death: Twilight Reimagined",
                "C",
                "C. Midnight Sun"
        );
        
        //History Questions
        //Question 1
        addQuestion("When Do South Africans Celebrate 67 mintes?", 
                     "A. 17 January",
                     "B. 10 February",
                     "C. 18 July",
                     "D. 25 December",
                     "C",
                     "C. 18 July");
        
        //Question 2
        addQuestion("How Many Colours Are There In The South African National Flag?", 
                     "A. 3",
                     "B. 14",
                     "C. 6",
                     "D. 23",
                     "C",
                     "C. 6");
        
        //Question 3
        addQuestion("When Were The First Democratic Elections In South Africa?", 
                      "A. 9 August 2001",
                      "B. 27 April 1994",
                      "C. 5 September 1950",
                      "D. 4 May 1997",
                      "B",
                      "B. 27 April 1994");
       
       
        //Question 4
        addQuestion("How Many Languages Does The South African National Anthem Have?",
                      "A. 11",
                      "B. 5",
                      "C. 3",
                      "D. 21",
                      "B",
                      "B. 5");
                
         
       
        //Question 5 
        addQuestion("Who Was The First Black President in South Africa?", 
                       "A. Jacob Zuma",
                       "B. Winne Mandela",
                       "C. Julius Malema",
                       "D. Nelson Mandela",
                       "D",
                       "D. Nelson Mandela");
                      
                
                
       
         //Question 6
        addQuestion("The Hospital Baragwanath Hospital, Was Named After WHich Political Activist?", 
                      "A. Joe Slovo",
                      "B. Helen Joseph",
                      "C. Michael Jackson",
                      "D. Chris Hani",
                      "D",
                      "D. Chris Hani");
       
                
         //Question 7
        addQuestion("Steve Biko Influenced Which Behaivor in Black South Africans?", 
                     "A. Unity and Independency",
                     "B. To Have Money",
                     "C. To Be Rude To Whites",
                     "D. To Love Slavery",
                     "A",
                     "A. Unity and Independency");
                
         //Question 8
        addQuestion("When Do South Africans Celebrate The Youth Annually?", 
                      "A. 16 June",
                      "B. 21 March",
                      "C. 24 September",
                      "D. 31 July,",
                      "A",
                      "A. 16 June");
                
         //Question 9
        addQuestion("Name The Political Party That Has Been Winning The Elections Since The First Democratic Elections?",
                      "A. IFP",
                      "B. ANC",
                      "C. EFF",
                      "D. DA",
                      "B",
                      "B. ANC");
                
       //Question 10
        addQuestion("Which Race Experienced More Oppression During Aparthied?",  
                      "A. Indians",
                      "B. Blacks / Africans",
                      "C. Whites",
                      "D. Coloureds",
                      "B",
                      "B. Blacks / Africans");
        
        Collections.shuffle(questions);
    }
}
