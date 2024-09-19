/**
 * 
 */
package messageGenie_Revision;

/**
 * 
 */
public class ChatBot2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ChatBot app start");
		
		//Instantiate MessageGenie
		
		MessageGenie2 mg = new MessageGenie2();
		
		// test the morning message
		
		mg.morningGreeting();
		
		// test the afternoon message
		
		mg.afternoonGreeting();
		
		// test the evening message
		
		mg.eveningGreeting();
		
		// test the night time message
		
		mg.goodnightGreeting();
		
		System.out.println("ChatBot app end");

	}

}
