
public class Main {
	
	public static void main(String[] args) {
		
		
		AudioCall a=new AudioCall();
		VedioCall v=new VedioCall();
		
		
		a.call();
		a.mute();
		a.disconnect();
		
		v.call();
		v.mute();
		v.disconnect();
	}

}
