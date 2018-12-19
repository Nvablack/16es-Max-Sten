import java.util.Scanner;

public class Main {


public static void main(String[] args){




Scanner keyboard = new Scanner(System.In);

System.out.print('something ');

String fromKeyboard = keyboard.nextLine();

Sytem.out.println('Orginal:'+ fromKeyboard);

System.out.println('VERSALER:'+ fromKeyboard.toUpperCase());

System.out.println('Gemener:'+ fromKeyboard.toLowerCase());

System.out.println('Stränglängd'+ fromKeyboard.lenght()+ 'tecken');



for (int i=0; i<fromKeyboard.lenght(); i++){
	System.out.println(fromKeyboard.charAt(i));


}
for (int position = fromKeyboard.lenght(); position >= 0; position--){
	System.out.print(fromKeyboard.charAt(position));

	
}

Sysyen.out.println();










}
}