package com.company;

public class Main {

    public static void main(String[] args) {
        String directory ="C:\\Users\\чпок\\Desktop\\джава";

        try {
            System.out.println();
            WorkingDirectory direc_ = WorkingDirectory.getInstance(directory);
            System.out.println(); System.out.println(1);
            System.out.println(direc_.getDirName());
            System.out.println(1);
//            System.out.println();
//            System.out.println(direc_.getParentCategory());
//            System.out.println();
//            direc_.insides();
//            System.out.println();
//            System.out.println(direc_.newDirect("aaaa"));
//            direc_.insides();
//            System.out.println(direc_.setParentDirectory());
//            direc_.insides();
//            System.out.println();
             System.out.println(direc_.ParentName());


        }
        catch (Exception exc){
            System.out.println(exc.getMessage());
            return;
        }



    }
}
