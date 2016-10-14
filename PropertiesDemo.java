import java.util.*;;
import java.io.*;
public class PropertiesDemo {   
  static  File f=new File("D:/abc.txt"); 
  static Properties pps=new Properties(); 
	public static void main(String[] args)throws Exception {
		PropertiesDemo p=new PropertiesDemo();
    FileInputStream fis=new FileInputStream(f);
		// p.load(new FileInputStream("D:/abc.txt"));
		// System.out.println(p);
		// System.out.println(p.getProperty("size"));
		// p.setProperty("size","200");
		// System.out.println(p);
		// p.store(new FileOutputStream("D:/abc.txt"),"my sofawar config file");
    int time=0;
    if(!f.exists()){
     f.createNewFile();
     p.setProperty("Time",time+"");
     p.store(new     (f),"");
   } 
  //         Properties p=new Properties();
   p.load(fis);
   System.out.println(p.getProperty("Time",""));
   long currentTime=System.currentTimeMillis();
   time=Integer.parseInt(p.getProperty("Time",""));
   System.out.println("欢迎使用"+time);   
   if(time<3){
     Thread.sleep(3000);
     long currentTime1=System.currentTimeMillis();
     time=(int)((currentTime1-currentTime)/1000);
     p.setProperty("Time",time+"");
     System.out.println(time);
     p.store(new FileOutputStream(f),"");
   }else{
    System.out.println("请购买正版");
  }          
}
public static void load(InputStream ips)throws IOException{ 
 InputStreamReader frd=new InputStreamReader(ips);
 BufferedReader bfr=new BufferedReader(frd);
 String line="";
 String[] arr=null;
 while((line=bfr.readLine())!=null){ 
   if(line.startsWith("#")){
    continue;
  } 
  arr=line.split("="); 
  pps.put(arr[0],arr[1]); 
  // bfr.close();                 
}
}
public static String getProperty(String key,String defaultValu){
  // if(pps.containsKey(key)){
    String value=(String)pps.get(key); 
   return value;
} 
public static void setProperty(String key,String value){
  pps.put(key,value);
}
public static void store(OutputStream ops,String comments)throws IOException{
  FileInputStream fis=new FileInputStream(f);
  OutputStreamWriter osw=new OutputStreamWriter(ops);
  InputStreamReader is=new InputStreamReader(fis,"ISO 8859-1");
  // BufferedReader bfr=new BufferedReader(new InputStreamReader(fis));
  BufferedWriter bfw=new BufferedWriter(osw);
  char[] b=new char[1024*10];
  int len=0;
  while((len=is.read(b))!=-1){
    bfw.write(b,0,len);
  }
}
}