
public class Main {

	public static void main(String[] args) {
		 	MyList myList=new MyList();
			
			myList.add("istanbul");
			myList.add("ankara");
			myList.add("izmir");
			myList.add("adana");
			
			myList.list();
			
			myList.remove("istanbul");
			myList.list();
			
			myList.remove(2);
			myList.list();
	}

}
