import java.util.Scanner

fun main(){
    //Input The Obtained Marks
    var sc= Scanner(System.`in`)
    var marks=sc.nextInt();
    if (marks in 95..100){
        println("Grade: Exceptional")
        println("Code: A+")
        println("Points: 4.00")
    }
    else if (marks in 90..94){
        println("Grade: Excelent")
        println("Code: A")
        println("Points: 3.75")
    }
    else if (marks in 85..89){
        println("Grade: Superior")
        println("Code: B+")
        println("Points: 3.50")
    }
    else if (marks in 80..84){
        println("Grade: Very Good")
        println("Code: B")
        println("Points: 3.00")
    }
    else if (marks in 75..79){
        println("Grade: Above Average")
        println("Code: C+")
        println("Points: 2.50")
    }
    else if (marks in 70..74){
        println("Grade: Good")
        println("Code: C")
        println("Points: 2.00")
    }
    else if (marks in 65..69){
        println("Grade: High Pass")
        println("Code: D+")
        println("Points: 1.50")
    }
    else if (marks in 60..64){
        println("Grade: Pass")
        println("Code: D")
        println("Points: 1.00")
    }
    else if (marks in 0..59){
        println("Grade: Fail")
        println("Code: F")
        println("Points: 0.00")
    }
    else{
        println("Please Provide Your Real Marks Which is not more Than 100")
    }



}