package com.yyds.sparsearray;

import java.io.*;
import java.util.ArrayList;

public class SparseArray2 {
    public static void main(String[] args) throws IOException {
        //创建原始的二维数组 11 * 11
        //0表示没有棋子,1表示黑子,2表示蓝子
//        int[][] chessArr1 = new int[11][11];
//        //给数组指定位置赋值
//        chessArr1[0][0] = 1;
//        chessArr1[1][2] = 1;
//        chessArr1[2][3] = 2;
//        //输出打印原始的二维数组
//        System.out.println("原始的二维数组:");
//        for (int[] ints : chessArr1) {
//            for (int data : ints) {
//                System.out.print(data + "\t");
//            }
//            System.out.println();
//        }
//
//        //二维数组转成稀疏数组
//        //1.先遍历二维数组,得到非0数据的个数
//        int sum = 0;
//        for (int i = 0; i < chessArr1.length; i++) {
//            for (int j = 0; j < chessArr1[i].length; j++) {
//                if(chessArr1[i][j] != 0){
//                    sum++;
//                }
//            }
//        }
//        //创建稀疏数组
//        int[][] sparseArr = new int[sum+1][3];
//        //给稀疏数组赋值
//        sparseArr[0][0] = 11;
//        sparseArr[0][1] = 11;
//        sparseArr[0][2] = sum;
//
//        //把原二维数组中的非0数组取出添加到稀疏数组中
//        int count = 0; //count 用于记录是第几个非0数据
//        for (int i = 0; i < chessArr1.length; i++) {
//            for (int j = 0; j < chessArr1[i].length; j++) {
//                if(chessArr1[i][j] != 0){
//                    count++;
//                    sparseArr[count][0] = i;
//                    sparseArr[count][1] = j;
//                    sparseArr[count][2] = chessArr1[i][j];
//                }
//            }
//        }
//
//        //打印稀疏数组
//        System.out.println("稀疏数组:");
//        for (int[] ints : sparseArr) {
//            for (int data : ints) {
//                System.out.print(data + "\t");
//            }
//            System.out.println();
//        }
//
//        //将稀疏数组保存到磁盘中
//        writeSparse(sparseArr);

        //从磁盘中读取稀疏数组的数据
        int[][] sparseArr = readSparse();

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
    //把稀疏数组的数据写入到磁盘中的方法
    public static void writeSparse(int[][] sparseArr) throws IOException {
        File file = new File("DataStructures\\map.properties");
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        for (int i = 0; i < sparseArr.length; i++) {
            //数据前n-1列尾部加入"\t"
            for (int j = 0; j < sparseArr[0].length - 1; j++) {
                fw.write(sparseArr[i][j] + "\t");
            }
            //数组最后一列后面不加"\t"
            fw.write(sparseArr[i][sparseArr[0].length-1] + "");
            //换行
            fw.write("\n");
        }
        fw.flush();
        fw.close();
    }
    //把磁盘中的数组读到内存,并创建原始二维数组的方法
    public static int[][] readSparse() throws IOException {
        File file = new File("DataStructures\\map.properties");
        FileReader fr = new FileReader(file);
        //通过BufferedReader包装字符输入流
        BufferedReader br = new BufferedReader(fr);
        //创建一个集合,用来存放读取的文件的数据
        ArrayList<String> list = new ArrayList<>();
        //用来存放读取一行的数据
        String lineStr;
        //逐行读取文件中的内容
        while((lineStr = br.readLine()) != null){
            //把读取的行添加到list中
            list.add(lineStr);
        }
        //获取文件有多少行
        int lineNum = list.size();
        //根据文件行数创建对应的数组
        int[][] sparseArr = new int[lineNum][3];
        //记录输出当前行
        int count = 0;
        //循环遍历集合,将集合中的数据放入数组中
        for (String str : list) {
            //将读取到的str按","分割,用字符串数组来接收
            String[] split = str.split("\t");
            sparseArr[count][0] = Integer.valueOf(split[0]);
            sparseArr[count][1] = Integer.valueOf(split[1]);
            sparseArr[count][2] = Integer.valueOf(split[2]);
            //将行数加1
            count++;
        }
        //关闭输入流,释放连接
        fr.close();
        //关闭字符输入缓冲流
        br.close();
        //返回稀疏数组
        return sparseArr;
    }
}
