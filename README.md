# 计182 2018310792 林洁肯
## java实验四 字符串实验
### 1.实验目的
掌握字符串String及其方法的使用
### 2.实验要求（做什么）
利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：
1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.允许提供输入参数，统计古诗中某个字或词出现的次数
3.考虑操作中可能出现的异常，在程序中设计异常处理程序
### 3.实验过程（怎么做）
1.实验要求在每七个汉字后加入一个标点符号。于是第一步先将每七个字后面全都加上逗号，运行程序如下：
![images](https://github.com/Linjieken/java-4/blob/master/images/微信截图_20191117211200.png)
2.将每隔十五字后的逗号替换成句号，即能满足“奇数时加逗号，偶数时加句号”的要求。运行程序如下：
### 4.核心代码	
        for(int i = 7; i <= str.length(); i=i+8) {
         str.insert(i,',');
        }
        
        
        for(int k = 15; k <= str.length(); k=k+16) {
         str.deleteCharAt(k);
            str.insert(k,'。');
        }
        for(int j = 16; j <= str.length(); j=j+17) {
         str.insert(j,"\n");
        }
以上代码运行后，可达成“每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。””的要求。




        System.out.println(key + " 在这段话中出现的次数为 " + num);
        }

        public static int GetFrequency(String source,String key){
        int i, j, count = 0;
        int len1 = source.length(); //这段话的长度
        int len2 = key.length(); //待统计词语的长度

        for(i=0; i<len1-len2; i++){
            for(j=0; j<len2; j++){ //统计词语和这段话逐字符进行比较
        		if(key.charAt(j) != source.charAt(j + i)){
        			break;
        }
        }
        if(j>=key.length()){
        count++;
        }
        }
以上代码运行后，可达成“统计古诗中某个字或词出现频率”的要求。
### 5.实验结果
![images](https://github.com/Linjieken/java-4/blob/master/images/微信图片_20191117200925.png)

### 6.实验感想
在本次实验中，我学习到了字符串String及其方法的使用。但对于异常处理结构的掌握还较为欠佳，希望在接下来的学习中，能够再接再厉，对于java这门语言有更近一步的了解与认识。
