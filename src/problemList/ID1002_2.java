package problemList;

import java.io.*;
import java.util.Scanner;
 
class ID1002_2 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
    	PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		try {
			int ct = in.nextInt();
			for(int k=0;k<ct;k++){
				String a = in.next();
				String b = in.next();
				out.println("Case "+(k+1)+":");
				out.println(a+" + "+b+" = "+add(a, b));
				if(k != ct-1)
					out.println();
			} 
				out.flush();
		} finally {
			out.close();
			in.close();
		}	
	}
	
	public static String add(String a,String b){
		int al = a.length();
		char[] as = new char[al];
		for(int k=0;k<al;k++){
			as[k] = a.charAt(al-1-k);
		}
		int bl = b.length();
		char[] bs = new char[bl];
		for(int k=0;k<bl;k++){
			bs[k] = b.charAt(bl-1-k);
		}
		
		int length = al;
		if(length < bl)
			length = bl;
		
		char[] res = new char[length+1];
		int jw = 0;
		for(int j=0;j<=length;j++){
			int aa = 0;
			int bb = 0;
			if(j<as.length) aa = as[j]-'0';
			if(j<bs.length) bb = bs[j]-'0';
			int s = aa + bb + jw;
			jw = 0;
			if(s>9){
				jw = 1;
				res[length-j] = (char) (s-10+'0');
			}else{
				res[length-j] = (char) (s+'0');
			}
		}
		String rs = String.valueOf(res);
		if(rs.startsWith("0")){
			rs = rs.substring(1, rs.length());
		}
		return rs;
	}
}