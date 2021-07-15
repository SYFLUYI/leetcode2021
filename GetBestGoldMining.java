package com.company;

public class GetBestGoldMining {
    public static int getBestGoldMining(int w, int[] p, int[] g){
        //创建当前结果
        int[] results = new int[w+1];
        //填充一维数组
        for(int i=1; i<=g.length; i++){
            for(int j=w; j>=1; j--){
                if(j>=p[i-1]){
                    results[j] = Math.max(results[j],
                            results[j-p[i-1]]+ g[i-1]);
                }
            }
        }
        //返回最后1个格子的值
        return results[w];

        /*
        public static int getBestGoldMiningV2(int w, int[] p, int[] g){
    //创建表格
    int[][] resultTable = new int[g.length+1][w+1];
    //填充表格
    for(int i=1; i<=g.length; i++){
        for(int j=1; j<=w; j++){
            if(j<p[i-1]){
                resultTable[i][j] = resultTable[i-1][j];
            } else {
                resultTable[i][j] = Math.max(resultTable[i-1]
                [j], resultTable[i-1][j-p[i-1]]+ g[i-1]);
            }
        }
    }
    //返回最后1个格子的值
    return resultTable[g.length][w];
}

         */


   }
}
