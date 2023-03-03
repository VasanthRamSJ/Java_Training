package Ex5.FlyWeight;

public class FlyWeightPattern {
    
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		Store st=new Store();
		
		st.storeBook("bookname1",1200,"novel","ar","adventorous");
		st.storeBook("bookname2",1400,"novel","ar","adventorous");
		st.storeBook("bookname3",1600,"novel","arr","adventorous");
		
		st.storeBook("bookname5",1600,"book","arc","crime");
	}
}