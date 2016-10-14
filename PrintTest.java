import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class PrintTest{
	public static void main(String[] args) throws IOException{
		// BufferedReader bw=new BufferedReader(new InputStreamReader(new FileInputStream("D:a.txt"),"GBK"));
		// PrintWriter pw=new PrintWriter(new FileOutputStream("D:/abc.txt"),true);
		// String line=null;
		// while((line=bw.readLine())!=null){  
		// 	if(line.equals("over")){
		// 		break;
		// 	}
		// 	pw.println(line);
		// }
		// pw.close();
		// int a=8;
		// a<<=2;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		Date date=new Date();
		System.out.println(sdf.format(date));
		String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(new Date()); 
		Calendar rightNow = Calendar.getInstance();
		System.out.println(rightNow.get(Calendar.YEAR));
		
System.out.println(str);
		int[] a=new int[]{222,31,2,43,3};
			Arrays.sort(a);
		int index=Arrays.binarySearch(a,3);
	System.out.println(index);
	System.out.println(Arrays.toString(a));
	int[] copy=Arrays.copyOf(a,1);
	System.out.println(Arrays.toString(copy));

	}

}