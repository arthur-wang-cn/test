package SSD;

import java.util.ArrayList;

public class UserInnerInterface {
public static void main(String[] args) {
	final ArrayList<Object> arrayList = new ArrayList<>();
	new UserInnerInterface().testOperate(new InnerInterface() {
		
		@Override
		public void operate() {
			arrayList.add(1);
		}
	});
}
public void testOperate(InnerInterface innerInterface){
	
}
}
