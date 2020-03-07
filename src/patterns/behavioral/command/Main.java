package patterns.behavioral.command;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        MyFile myFile = new MyFile("SampleFile.txt");
        FileOperationPerformer performer = new FileOperationPerformer();
        performer.executeOperation(new CreateFileOperation(myFile), "First entery ");
        System.out.println(myFile.getContent());

        performer.executeOperation(new UpdateFileOperation(myFile), " Second entery");
        System.out.println(myFile.getContent());
    }
}
