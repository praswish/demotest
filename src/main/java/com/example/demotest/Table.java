package com.example.demotest;

import java.util.ArrayList;

public class Table {
    int row = 5 ;
    int col = 5;
    int [][] data = new int[row][col];

   public Table(){
        for (int i=0; i<row;i++){
            for (int j=0;j <col; j++){
                data[i][j] = i+j;
            }
        }
    }
    public void print(){
        for (int i=0; i<row;i++){
            for (int j=0;j <col; j++){
                System.out.print(data[i][j]+"\t");
            }
            System.out.print("\n");
        }

    }

}
