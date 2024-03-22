package repository;

import exception.DataLoadingException;
import exception.DataSavingException;

import java.io.*;
import java.util.ArrayList;

public abstract class Repository<E> {
    protected ArrayList<E> dataList;
    protected String path;

    protected Repository() {
        this.dataList = new ArrayList<>();
        this.path = "data\\";
    }

    protected final ArrayList<E> load() throws DataLoadingException {
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            objectInputStream = new ObjectInputStream(bufferedInputStream);
            Object object = null;
            while ((object = objectInputStream.readObject()) != null)
                dataList = (ArrayList<E>) object;
        } catch (EOFException e) {
        } catch (Exception e) {
            // 로깅 작업
            throw new DataLoadingException();
        } finally {
            try {
                objectInputStream.close();
                bufferedInputStream.close();
                fileInputStream.close();
            } catch (Exception e) {
                // 로깅 작업
                throw new DataLoadingException();
            }
        }
        return dataList;
    }

    protected final void save() throws DataSavingException {
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

            objectOutputStream.writeObject(dataList);
        } catch (Exception e) {
            // 로깅 작업
            throw new DataSavingException();
        } finally {
            try {
                objectOutputStream.close();
                bufferedOutputStream.close();
                fileOutputStream.close();
            } catch (Exception e) {
                // 로깅 작업
                throw new DataSavingException();
            }
        }
    }
}