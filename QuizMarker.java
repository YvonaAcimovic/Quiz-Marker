import java.util.Scanner;
import java.io.*;
public class QuizMarker{
    File f = new File("quiz responses.csv");
    public void calculateScore(){
        try{
            Scanner input = new Scanner(f);
            if(input.hasNext()){
                String[] answerKey = input.nextLine().split(",");
                while(input.hasNext()){
                    String str = input.nextLine();
                    int score = 0;
                    String[] line = str.split(",");
                    for(int i = 1; i < line.length; i++){
                        if(line[i].equals(answerKey[i])) score++;
                    }
                    System.out.println(line[0] + " " + score + "/" + (line.length-1));
                }
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
