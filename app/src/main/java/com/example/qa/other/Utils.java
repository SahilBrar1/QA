package com.example.qa.other;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;

import com.example.qa.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Utils {

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    public static String formatDate(long time){
        SimpleDateFormat formatter = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return formatter.format(calendar.getTime());
    }

    public static Map<String,String> getMathQuestions(){
        HashMap<String,String> questions = new HashMap<>();
        questions.put("1+1","2");
        questions.put("2+2","4");
        questions.put("3+3","6");
        questions.put("4+4","8");
        questions.put("5+5","10");
        questions.put("6+6","12");
        questions.put("7+7","14");
        questions.put("8+8","16");
        questions.put("9+9","18");
        questions.put("10+10","20");
        questions.put("11+11","22");
        questions.put("12+12","24");
        questions.put("13+13","26");
        questions.put("14+14","28");
        questions.put("15+15","30");

        return questions;
    }

    public static Map<String,String> getRandomMathQuestions(int SIZE){
        HashMap<String,String> questionsMap = new HashMap<>();
        Map<String,String> originalQuestion = getMathQuestions();
        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }



    public static Map<String,Map<String,Boolean>> getLiteratureQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("#include<userdefined>",false);
        answer1.put("#include \"userdefined.h\" ",false);
        answer1.put("<include> \"userdefined.h\"",false);
        answer1.put("Both A and B",true);
        questions.put("Which of the following is the correct syntax to add the header file in the C++ program?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("cout <<\"Hello world!\";",true);
        answer2.put("Cout << Hello world! ;",false);
        answer2.put("Out <<\"Hello world!;",false);
        answer2.put("None of the above",false);
        questions.put("Which of the following is the correct syntax to print the message in C++ language?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("$var_name",false);
        answer3.put("VAR_123",true);
        answer3.put("varname@",false);
        answer3.put("None of the above\n",false);
        questions.put("Which of the following is the correct identifier?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("@",false);
        answer4.put("#",false);
        answer4.put("&",true);
        answer4.put("%",false);
        questions.put("Which of the following is the address operator?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("Encapsulation",false);
        answer5.put("Inheritance",false);
        answer5.put("Polymorphism",false);
        answer5.put("All of the above",true);
        questions.put(" Which of the following features must be supported by any programming language to become a pure object-oriented programming language?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("Overloaded",false);
        answer6.put("Encapsulated",false);
        answer6.put("Reprehensible",false);
        answer6.put("Extensible",true);
        questions.put("The programming language that has the ability to create new data types is called___.",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("Dennis Ritchie",false);
        answer7.put("Ken Thompson",false);
        answer7.put("Bjarne Stroustrup",true);
        answer7.put("Brian Kernighan",false);
        questions.put("Which of the following is the original creator of the C++ language?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("Read ch()",false);
        answer8.put("Getline vh()",false);
        answer8.put("get(ch)",true);
        answer8.put("Scanf(ch)",false);
        questions.put("Which of the following is the correct syntax to read the single character to console in the C++ language?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Parameters with which functions are called",true);
        answer9.put("Parameters which are used in the definition of the function",false);
        answer9.put("Variables other than passed parameters in a function",false);
        answer9.put("Variables that are never used in the function",false);
        questions.put("Which of the following statements is correct about the formal parameters in C++?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("Pure Object oriented",false);
        answer10.put("Not Object oriented",false);
        answer10.put("Semi Object-oriented or Partial Object-oriented",true);
        answer10.put("None of the above",false);
        questions.put("The C++ language is ______ object-oriented language.",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("Encapsulation",false);
        answer11.put("Inheritance",false);
        answer11.put("Polymorphism",false);
        answer11.put("All of the above",true);
        questions.put("Which of the following features is required to be supported by the programming language to become a pure object-oriented programming language?",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("//Comment",true);
        answer12.put("/Comment/",false);
        answer12.put("Comment//",false);
        answer12.put("None of the above",false);
        questions.put("Which of the following comment syntax is correct to create a single-line comment in the C++ program?",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("High-level Language",false);
        answer13.put("Low-level language",false);
        answer13.put("Middle-level language",true);
        answer13.put("None of the above",false);
        questions.put("C++ is a ___ type of language.",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("\n",true);
        answer14.put("\r",false);
        answer14.put("PG ON",false);
        answer14.put("None of the above",false);
        questions.put("For inserting a new line in C++ program, which one of the following statements can be used?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("\n",false);
        answer15.put("\t",true);
        answer15.put("both",false);
        answer15.put("None of the above",false);
        questions.put("Which one of the following represents the tab?",answer15);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getGeographyQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("16",false);
        answer1.put("32",false);
        answer1.put("64 ",false);
        answer1.put("None of these above",true);
        questions.put("What is the maximum possible length of an identifier?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("Zim Den",false);
        answer2.put("Guido van Rossum",true);
        answer2.put("Niene Stom",false);
        answer2.put("Wick van Rossum",false);
        questions.put("Who developed the Python language?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("1995",false);
        answer3.put("1989",true);
        answer3.put("1972",false);
        answer3.put("1981",false);
        questions.put("In which year was the Python language developed?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("English",false);
        answer4.put("PHP",false);
        answer4.put("C",true);
        answer4.put("All of the above",false);
        questions.put("In which language is Python written?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put(".py",true);
        answer5.put(".python",false);
        answer5.put(".p",false);
        answer5.put("None of these",false);
        questions.put("Which one of the following is the correct extension of the Python file?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("2000",false);
        answer6.put("2008",true);
        answer6.put("2010",false);
        answer6.put("2005",false);
        questions.put("In which year was the Python 3.0 version developed?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("Key",false);
        answer7.put("Brackets",false);
        answer7.put("Indentation",true);
        answer7.put("None of these",false);
        questions.put("What do we use to define a block of code in Python language?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("/",false);
        answer8.put("//",false);
        answer8.put("#",true);
        answer8.put("!",false);
        questions.put("Which character is used in Python to make a single line comment?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Classes are real-world entities while objects are not real",false);
        answer9.put("Objects are real-world entities while classes are not real",true);
        answer9.put("Both objects and classes are real-world entities",false);
        answer9.put("All of the above",false);
        questions.put("Which of the following statements is correct regarding the object-oriented programming concept in Python?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("Function",true);
        answer10.put("Object",false);
        answer10.put("Attribute",false);
        answer10.put("Argument",false);
        questions.put("What is the method inside the class in python language?",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("_x = 2",true);
        answer11.put("__x = 3",false);
        answer11.put("__xyz__ = 5",false);
        answer11.put("None of these",false);
        questions.put("Which of the following declarations is incorrect?",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("To identify the variable",false);
        answer12.put("It confuses the interpreter",false);
        answer12.put("It indicates a private variable of a class",true);
        answer12.put("None of these",false);
        questions.put("Why does the name of local variables start with an underscore discouraged?",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("val",true);
        answer13.put("raise",false);
        answer13.put("try",false);
        answer13.put("with",false);
        questions.put("Which of the following is not a keyword in Python language?",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("All variable names must begin with an underscore.",true);
        answer14.put("Unlimited length",false);
        answer14.put("The variable name length is a maximum of 2.",false);
        answer14.put("All of the above",false);
        questions.put("Which of the following statements is correct for variable names in Python language?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("xyzp = 5,000,000",true);
        answer15.put("x y z p = 5000 6000 7000 8000",false);
        answer15.put("x,y,z,p = 5000, 6000, 7000, 8000",false);
        answer15.put("x_y_z_p = 5,000,000",false);
        questions.put("Which of the following declarations is incorrect in python language?",answer15);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getRandomLiteratureAndGeographyQuestions(Context context, String subject, int SIZE){
        Map<String,Map<String,Boolean>> questionsMap = new HashMap<>();
        Map<String, Map<String, Boolean>> originalQuestion;
        if (subject.equals(context.getString(R.string.geography))){
            originalQuestion = getGeographyQuestions();
        }else{
            originalQuestion = getLiteratureQuestions();
        }

        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }

}
