package ljk1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java3 {
 public static void main(String[] args) throws IOException {
        StringBuffer str = new StringBuffer();
        str.append("������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���ʿ����������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ������������");

        for(int i = 7; i <= str.length(); i=i+8) {
         str.insert(i,',');
        }
        // �Ӻ���ǰÿ����λ���붺��
        
        
        for(int k = 15; k <= str.length(); k=k+16) {
         str.deleteCharAt(k);
            str.insert(k,'��');
        }
        for(int j = 16; j <= str.length(); j=j+18) {
         str.insert(j,"\r\n");
        }
        
        System.out.print(str);
        String source = "������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���ʿ����������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ������������";
        String key = "";
        //String find = "";
        //�Ӽ��̽��������һ�λ�
        System.out.println("�ڴ˴������ֻ���");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in)); 
        key = reader.readLine();
        // key = ""; //��ͳ�Ƴ���Ƶ�ȵĴ���

        int num = GetFrequency(source, key);

        System.out.println(key + " ����λ��г��ֵĴ���Ϊ " + num);
        }

        public static int GetFrequency(String source,String key){
        int i, j, count = 0;
        int len1 = source.length(); //��λ��ĳ���
        int len2 = key.length(); //��ͳ�ƴ���ĳ���

        for(i=0; i<len1-len2; i++){
         for(j=0; j<len2; j++){ //ͳ�ƴ������λ����ַ����бȽ�
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