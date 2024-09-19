package messageGenie;

/**
 * Simulating chatbot app = Testing messageGenie Methods
 */

public class ChatBot {

	/**
	* Start point for app (Informal test)
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Chat Bot Start");
		
		
		// Instantiate MessageGenie object
		
		MessageGenie myBot = new MessageGenie();
		MessageGenie secondBot = new MessageGenie();
		
		myBot.afternoonGreeting();
		myBot.morningGreeting();

	}

}
