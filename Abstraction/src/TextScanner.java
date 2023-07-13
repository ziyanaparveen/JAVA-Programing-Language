
public class TextScanner {
	
	Hello obj;
	
	
	TextScanner(Hello obj){
		
		this.obj=obj;
		
		
	}
	void scan() {
		
		String text="ScannedText";
		
		obj.onText(text);
		
	}
	

}
