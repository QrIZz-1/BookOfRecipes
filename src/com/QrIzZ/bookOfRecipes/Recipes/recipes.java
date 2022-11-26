package com.QrIzZ.bookOfRecipes.Recipes;
import java.io.*;

public class recipes {

   public void recept (){
       File file = new File("recipes.txt");
       System.out.println(readFile(file));
   }

    String readFile(File file){
        String TextFiles = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("recipes.txt"));
            String line;
            while ((line = br.readLine()) != null )
            {
                TextFiles += line + "\n";
            }

        }catch (IOException e){
            System.out.println("Error: " + e);

        }finally {
            try{
                br.close();
            }catch (IOException e){
                System.out.println("Error: " + e);

            }
        }
        return TextFiles;
    }

}
