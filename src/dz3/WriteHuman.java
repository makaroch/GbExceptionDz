package dz3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteHuman {
    public boolean write(Human human){
        try(FileWriter fileWriter = new FileWriter(new File("./Humans/"+human.getSurname()+".txt"), true)) {
            fileWriter.write(human.toString());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
