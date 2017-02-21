/**
 * Title:
 * Description:
 * Copyright: 2017 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: huo
 * Create User: TRS-ZhangCheng
 * Create Time:2017/2/21 21:22
 */
public class Huo {

    public static void main(String[] args) {
        String quanxian[]={"1000","11111100","1001010100"};
        System.out.println("最终权限是："+quanxian(quanxian));
        
    }
    public static String quanxian(String[] quanxian){
        //确定数组的长度
        int length=quanxian.length;
        //判断权限数组里最长的长度
        int maxLength=0;
        for(int i=0;i<length;i++){
            if(quanxian[i].length()>maxLength){
                maxLength=quanxian[i].length();
            }
        }
        //给小于最长长度的权限后面加零
        for(int i=0;i<length;i++){
            //判断与最长长度的相差的位数在后面加相应位数的0
            int a=maxLength-quanxian[i].length();
            if(a>0){
                for(int j=0;j<a;j++){
                    quanxian[i]=quanxian[i]+"0";
                }
            }
        }
        //从权限数组挨个取值用“”拆开按位进行比较
        String q=quanxian[0];
        for(int i=1;i<length;i++){
            String[] a=q.split("");
            String[] b=quanxian[i].split("");
            for(int j=0;j<maxLength;j++){
                if(a[j].equals("1")||b[j].equals("1"))
                    a[j]= "1";
            }
            q="";
            for(int k=0;k<maxLength;k++){
                q+=a[k];
            }
        }
        return q;
    }
}
