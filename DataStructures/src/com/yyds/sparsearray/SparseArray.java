package com.yyds.sparsearray;

public class SparseArray {
    public static void main(String[] args) {
        //创建原始的二维数组 11 * 11
        //0表示没有棋子,1表示黑子,2表示蓝子
        int[][] chessArr1 = new int[11][11];
        //给数组指定位置赋值
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        //输出打印原始的二维数组
        System.out.println("原始的二维数组:");
        for (int[] ints : chessArr1) {
            for (int data : ints) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }

        //二维数组转成稀疏数组
        //1.先遍历二维数组,得到非0数据的个数
        int sum = 0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[i].length; j++) {
                if(chessArr1[i][j] != 0){
                    sum++;
                }
            }
        }
        //创建稀疏数组
        int[][] sparseArr = new int[sum+1][3];
        //给稀疏数组赋值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        //把原二维数组中的非0数组取出添加到稀疏数组中
        int count = 0; //count 用于记录是第几个非0数据
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[i].length; j++) {
                if(chessArr1[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        }

        //打印稀疏数组
        System.out.println("稀疏数组:");
        for (int[] ints : sparseArr) {
            for (int data : ints) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }

        //把稀疏数组转成二维数组
        //1.创建一个新的二维数组
        int[][] chessArr2 = new int[sparseArr[0][0]][sparseArr[0][1]];

        //将稀疏数组中的元素取出放入新的二维数组,从第二行开始取
        for (int i = 1; i < sparseArr.length; i++) {
            for (int j = 0; j < sparseArr[i].length; j++) {
                chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
            }
        }

        //打印此二位数组
        System.out.println("新的二维数组:");
        for (int[] ints : chessArr2) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
