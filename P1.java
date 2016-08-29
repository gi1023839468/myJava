import java.io.*;
class P1{
	public static void main (String [] args) throws IOException {

		String s1 = "ab#12#453";
		String regex1 = "#";
		String s2 = "a?b?gf#e";
		String regex2 = "?#";
		
		String [] strArray1 = split(s1,regex1);
		String [] strArray2 = split(s2,regex2);
		
		for (int i = 0; i < strArray1.length; i++) {
			System.out.print(strArray1[i] + ",");
		}
		System.out.println();
		for (int k = 0; k < strArray2.length; k++) {
			System.out.print(strArray2[k] + ",");
		}
		
	}
	public static String[] split(String s, String regex) {
		int Pos = 0;
		String strArray [] = new String [s.length()];

		
		Outer:
		for (int i = 0; i < s.length(); i ++) {
			Inner:
			for (int l = 0; l < regex.length(); l ++) {
				if (s.charAt(i) == regex.charAt(l)) {
					if (strArray [Pos] != null) {
						Pos ++;
					}
					strArray [Pos] = Character.toString(s.charAt(i));
					Pos ++;
					continue Outer;
				}
				else {
					continue Inner;
				}
				
			}
			if (strArray [Pos] == null) {
				strArray [Pos] = "";
			}
			strArray [Pos] += s.charAt(i);
		}
		
		String Split_List [] = new String [Pos + 1];
		for (int k = 0; k <= Pos; k ++){
			Split_List [k] = strArray[k];
		}
		return Split_List;
	}

}