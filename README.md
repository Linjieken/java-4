# 计182 2018310792 林洁肯
## java实验4
### 1.实验目的
掌握字符串String及其方法的使用
### 2.实验要求
利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：
1.	每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.	允许提供输入参数，统计古诗中某个字或词出现的次数
3.	考虑操作中可能出现的异常，在程序中设计异常处理程序
### 3.实验

### 4.核心代码
···
	public static void main(String[] args) throws IOException {
        StringBuffer str = new StringBuffer();
        str.append("汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行");

        for(int i = 7; i <= str.length(); i=i+8) {
        	str.insert(i,',');
        }
        // 从后往前每隔七位插入逗号
           
        for(int k = 15; k <= str.length(); k=k+16) {
        	str.deleteCharAt(k);
            str.insert(k,'。');
        }
        for(int j = 16; j <= str.length(); j=j+18) {
        	str.insert(j,"\r\n");
        }

···
以上代码运行后，可达成“每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。””的要求。
···
        int num = GetFrequency(source, key);

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
···
以上代码运行后，可达成“统计古诗中某个字或词出现频率”的要求。
### 5.实验结果
![images](https://github.com/Linjieken/java-4/blob/master/images/微信图片_20191117200925.png)
