package exception;

import utils.FilePathConstants;
import utils.DateTimeGenerator;

import java.io.*;

public class BaseException extends Exception{

    public BaseException(){
        super("시스템에 오류가 발생했습니다. 다시 시도해주세요.");
    }

    public BaseException(String message) throws BaseException {
        super(message);
        log();
    }

    private void log() throws BaseException {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            printStackTrace(printWriter);
            String stackTraceAsString = stringWriter.toString();
            printWriter.close();
            stringWriter.close();

            fileWriter =  new FileWriter(FilePathConstants.LOG_PATH, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("[" + DateTimeGenerator.getDateTimeNow() + "] " + stackTraceAsString);
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new BaseException();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new BaseException();
            }
        }
    }
}
