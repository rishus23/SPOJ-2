import java.io.*;
import java.util.*;
class ACPC10A{
	public static void main(String[] args) throws Exception{
		Parser in = new Parser(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		while(a != 0 || b != 0 || c != 0){
			if(b - a == c - b){
				int num = (c + c) - b;
				System.out.println("AP " + num);
			}else{
				int num = (c * c) / b;
				System.out.println("GP " + num);
			}
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
		}
	}
}
	
	//you need to import java.io and throw exceptions in the methods that call nextInt()

	class Parser{
	   final private int BUFFER_SIZE = 1 << 16;
	 
	   private DataInputStream din;
	   private byte[] buffer;
	   private int bufferPointer, bytesRead;
	 
	   public Parser(InputStream in){
	      din = new DataInputStream(in);
	      buffer = new byte[BUFFER_SIZE];
	      bufferPointer = bytesRead = 0;
	   }
	 
	   public int nextInt() throws Exception{
	      int ret = 0;
	      byte c = read();
	      while (c <= ' ') c = read();
	      boolean neg = c == '-';
	      if (neg) c = read();
	      do
	      {
	         ret = ret * 10 + c - '0';
	         c = read();
	      } while (c > ' ');
	      if (neg) return -ret;
	      return ret;
	   }
	 
	   private void fillBuffer() throws Exception{
	      bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
	      if (bytesRead == -1) buffer[0] = -1;
	   }
	 
	   private byte read() throws Exception{
	      if (bufferPointer == bytesRead) fillBuffer();
	      return buffer[bufferPointer++];
	   }
	}


