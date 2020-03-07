package patterns.behavioral.command;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileOperationPerformer {
    private final List<FileOperation> fileOperations = new ArrayList<>();

    public String executeOperation(FileOperation operation, String content) {
        fileOperations.add(operation);
        return operation.performOperation(content);
    }

    public List<FileOperation> getFileOperations() {
        return fileOperations;
    }
}
