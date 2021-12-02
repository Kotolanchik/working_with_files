package com.company;
import java.io.File;

public class WorkingDirectory {
    private static WorkingDirectory instance;
    private String directoryName;

    private WorkingDirectory(String directoryName) {
        this.directoryName = directoryName;
    }

    public static WorkingDirectory getInstance(String directoryName) throws Exception {  // singleton
        if (!new File(directoryName).exists())
            throw new Exception("Нет такого каталога или файла!");

        if (instance == null)
            instance = new WorkingDirectory(directoryName);

        return instance;
    }

    public void  insides() { // получаем внутренности каталога
        String[] FileList = new File(directoryName).list();
        if (FileList == null)
            throw new NullPointerException();

        if(FileList.length == 0)
            return;
        int i = 0;
        for(String OneFile : FileList)
            System.out.println(OneFile);
    }
    public String getDirName(){ return this.directoryName; } //получаем имя директории

    public String getParentCategory(){ // получаем данные родителя
        File directory = new File(directoryName);
        return directory.getParent();
    }

    public String setParentDirectory(){ // устанавливаем родителя
        directoryName = instance.getParentCategory();
        instance = new WorkingDirectory(directoryName);
        return directoryName;
    }
    public boolean newDirect(String nameSubCategory) // создаем каталог как можно было еще это реализовать
    {
        return new File(directoryName + "//" + nameSubCategory).mkdir();
    }
    public String ParentName(){ // имя родительского каталога
        return getParentCategory().substring(getParentCategory().lastIndexOf('\\')+1);
    }


}


