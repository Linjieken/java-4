package ljk1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java3 {
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
        
        System.out.print(str);
        String source = "汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行";
        String key = "";
        //String find = "";
        //从键盘接受输入的一段话
        System.out.println("在此处输入字或词语：");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in)); 
        key = reader.readLine();
        // key = ""; //待统计出现频度的词语

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

        return count;

    }
}