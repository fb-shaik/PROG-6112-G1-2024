
package lu1_jagged_array;
//Simple app to exlpore the use of Jagged Array
//Jagged Array is an array that has different lengths for the R/C combination
//Also know as an array of arrays
//2D array where each row can have a different length

public class LU1_Jagged_Array {

    public static void main(String[] args) {
        //create a jagged array that will represent student results for different assessments
        //dataType [R][C] arrayName = {{},{},{}}
        
        int [][] studentScores = 
            {
                {85, 90, 92}, //Student 1 - completed all 3 assessments    
                {71, 82}, //Student 2 - completed only 2 assessments
                {70, 60, 55, 90}, //Student 3 - completed all 4 assessments
                {80} //Student 4 - completed only 1 assessment 
            };
        
        //print out the scores for each student
        for(int i = 0; i <studentScores.length; i++)
        {//Outer Loop
            System.out.println("Student " + (i + 1) + " scores: ");
            
            for(int j = 0; j < studentScores[i].length; j++)
            {//Inner Loop
                System.out.println(studentScores[i][j] + " ");
            }
            System.out.println();
        }
        
        //Calculate & print the average scores for each student
        for(int i = 0; i < studentScores.length; i++)
        {
            //this method call we are only passing the Row of the jagged array
            double average = calculateAverage(studentScores[i]);  
            System.out.println("Student " + ( i + 1) + " average score: " + average);
        }
        
    }
    
    //method to calculate the average score for a student
    public static double calculateAverage(int [] scores)
    {
        int sum = 0;
        //for ( element : arrayName){LoopBody}
        for (int score : scores)
        {
            sum += score;
        }
        //casting to convert the int sum to match the double return data-type
        return (double) sum / scores.length; //each row will have a different length
    }
    
    
    
    
}
