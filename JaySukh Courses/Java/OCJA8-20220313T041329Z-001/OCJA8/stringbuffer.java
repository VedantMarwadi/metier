//<--  EXAMPLE ON STRINGBUFFER CLASS  -->

class stringbuffer
{
	public static void main(String ar[])
	{
		String s="ssi" +"5"  + "6" + Integer.toString(47);
		System.out.println(s);

		StringBuffer sb=new StringBuffer("ssi");
		//StringBuilder sb2=new StringBuilder("ssi");
		sb.append("vadapalani");
		sb.append("chennai");
		sb.append('6');
		sb.append(Integer.toString(47));
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		System.out.println(sb.insert(4,"india"));
		System.out.println(sb.delete(4,9));
		System.out.println(sb);
		String str=sb.toString();
		System.out.println(str);

		//System.out.println(sb2.insert(0,3,"india"));

	}
}
