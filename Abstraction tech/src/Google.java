
public abstract class Google {
	
	abstract void search();
	
	void message() {
		
		
		System.out.println("thankyou for using google");
	}

}

class searchAll extends Google{
	
	void search() {
		System.out.println("All search Results");
		
		
	}
}

class searchImage extends Google{
	
	void search() {
		
		System.out.println("Image Results");
	}
}

class searchVedio extends Google{
	
	void search() {
		
		System.out.println("Vedio Results");
	}
}


