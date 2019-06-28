
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc123def4352fgh";
		String regex = "\\D+";
		str = str.replaceAll(regex, ",").trim();
		//str.replace(target, replacement)

		String[] str2 = str.split(",");
		if(str2[0] == "") {
			str2[0] = null;
		}
		int maxLength = 0;
		String longestString = null;
		for (String s : str2) {
			if (s.length() > maxLength) {
				maxLength = s.length();
				longestString = s;
			}
		}
		System.out.println(longestString);

		// System.out.println(str + "\n"+ str1+"\n"+ str1.indexOf(0));
	}

}
