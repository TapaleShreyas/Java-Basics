import java.io.*;

import org.apache.commons.io.FileUtils;
public class Files {

	public static void main(String[] args) {
		
		try {
			File f1=new File("source.txt");
			File f2=new File("target.txt");
			
			FileUtils.copyFile(f1, f2);
			
			/*InputStream in =new FileInputStream(f1);
			OutputStream out=new FileOutputStream(f2);
			
			byte[] buf=new byte[1024];
			int len;
			
			while((len=in.read(buf))>0){
				out.write(buf,0,len);
			System.out.println("Length is : "+len);
			}
			in.close();
			out.close();*/
			
			System.out.println(" File is SuccessFuly Copied..");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
