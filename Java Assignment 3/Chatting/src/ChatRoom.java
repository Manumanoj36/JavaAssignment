import java.util.*;

class ChatRoom {
	String name;
	Map<String, String> usersDetails = new HashMap<String, String>();
	ArrayList<String> messages = new ArrayList<String>();
	public ChatRoom(String name){
		this.name = name;
	}
	public void addUser(String username, String password){
		usersDetails.put(username, password);
	}
	public void displayUser(){
		Set<String> userNames = usersDetails.keySet();
		//System.out.println(usersDetails.size());
		Iterator<String> itr = userNames.iterator();
		for(int i=0;i<usersDetails.size();i++){
			System.out.println(itr.next());
		}
	}
	public boolean checkCredentials(String username, String password) {
		if(password.equals(this.usersDetails.get(username))){
			return true;
		}
		else{
			return false;
		}
	}
	public void removeUser(String username) {
		usersDetails.remove(username);
	}
	public void addMessage(String message) {
		this.messages.add(message);
	}
	public void displayMessages() {
		for(int i=0;i<this.messages.size();i++){
			System.out.println(messages.get(i));
		}
	}
}