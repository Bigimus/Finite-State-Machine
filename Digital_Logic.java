import java.util.Scanner;
public class digital_Logic{
	public static void main(String[] args){
		//green 00, yellow 01, red 10
		//S0 00, S1 01, S2 10, S3 11
		Scanner k = new Scanner(System.in);
		String desc = "This is an interpretation of the Finite State Machine of a 2 traffic light intersection.";
		String auth = "This program was typed by Brian Hockenjos.";
		String o1 = "Input the state of traffic crossing Light A. 0 for no traffic, 1 for traffic.";
		String o2 = "Input the state of traffic crossing Light B. 0 for no traffic, 1 for traffic.";
		String o3 = "You didn't input a proper number.";
		String o4 = "There is still traffic flowing, input a 0 when there is no more traffic flowing.";
		String o5 = "If you are done running this simulation type any negative number to close out of the program.";
		String dLightA = "00";
		String dLightB = "10";
		String State = "00"
		String LightA = " ";
		String LightB = " ";
		System.out.println(desc + "\n" + auth);
		System.out.println(o1);
		System.out.println(o5);
		input = k.next();
		while(input >= 0){
			if(input > 1){
				System.out.println(o3);
				System.exit();
			}
		while(input = 0){
			if(int input = 0){
				State = "01";
			}
				else{
					System.out.println(o4);
					System.out.println(o1);
					input = k.next();
					LightA = dLightA;
					LightB = dLightB;
					System.out.println(LightA + LightB);
						if(input > 1){
							System.out.println(o3);
							System.exit();
						}
				}
		}
		if(State == "00"{
			LightA == dLightA;
			LightB == dLightB;
			System.out.println(LightA + LightB);
		}
			if(State == "01"){
				LightA = "01";
				LightB = "10";
				System.out.println(LightA + LightB);
				State = "10";
			}
				else{
					System.out.println(LightA + LightB);
				}
				if(State = "10"){
					LightA = "10";
					LightB = "00";
					System.out.println(LightA + LightB);
					System.out.println(o2);
					input = k.next();
				}
					if(input > 1){
						System.out.println(o3);
						System.exit();
					}
		while(input = 0){
			if(int input = 0){
				State = "11";
			}
				else{
					System.out.println(o4);
					System.out.println(o2);
					input = k.next();
				}
				if(input > 1){
					System.out.println(o3);
					System.exit();
				}
		}
					if(State = "11"){
						LightA = "10";
						LightB = "01";
						System.out.println(LightA + LightB);
						State = "00";
					}
			}
		}			
	}