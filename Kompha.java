import java.util.Scanner;

public class Kom_Aufgabe {
	static void wandleBinInDez() {

	}

	public static void main(String[] args) {

		wandleBinInDez();
		String bin = "";
		int dezZahl, i = 364, count = 0;
		char menu, dezimal, ITrechner = 0;
		
		
		int anzahlVerschiebung = 0;
		int dezZahl1 = 0;
		int restWert = 0;

		String hex = Integer.toHexString(i);
		System.out.println("Was Möchten sie Rechnen," 
		        + " \n ╭─━━━━━━━━━━━━━━━━━━━━━━━━━━─╮ "
				+ " \n |Dez --> Bin|Bitte D Eigeben,|  (⌐■_■)--︻╦╤─ - - - - - -      ̿ ̿ ̿ ̿'\\̵͇̿̿\\з=(◕_◕) "
				+ " \n |Bin --> Dez|Bitte B Eigeben,|" + " \n |Dez --> Hex|Bitte H Eigeben.|"
				+ " \n ╰─━━━━━━━━━━━━━━━━━━━━━━━━━━─╯");
		ITrechner = Kon.readChar();
		switch (ITrechner) {
		case 'D': {

			System.out.println("Bitte Dezimalzahl eingeben: ");
			dezZahl = Kon.readInt();
			while (dezZahl != 0) {
				if (dezZahl % 2 == 0) {
					bin = "0" + bin;
				} else {
					bin = "1" + bin;
				}

				dezZahl = dezZahl / 2;
				count++;
				if (count == 4) {
					bin = " " + bin;
					count = 0;
				}
			}

			System.out.println("Ihre Binäre Zahl lautet: " + bin);
			break;
		}
		case 'B': {
			Scanner eingabe = new Scanner(System.in);
			System.out.println(" ╭─━━━━━━━━━━━━━━━━━━━━━━━─╮");
			System.out.println(" |Bitte Dualzahl eingeben! |");
			System.out.println(" ╰─━━━━━━━━━━━━━━━━━━━━━━━─╯");
			int binZahl = eingabe.nextInt();
			while (binZahl != 0) {
				restWert = binZahl % 10;
				dezZahl1 = dezZahl1 + (int) (restWert * (Math.pow(2, anzahlVerschiebung)));
				binZahl = binZahl / 10;
				anzahlVerschiebung = anzahlVerschiebung + 1;
			}
			System.out.println(" ╭─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━─╮");
			System.out.println(" |" + "Ihre DezZahl lautet"+ dezZahl1 + "|");
			System.out.println(" ╰─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━─╯");
			
			System.out.println();
			break;
		}

		case 'H': {
			System.out.println("Bitte Dezimalzahl eingeben: ");
			dezZahl = Kon.readInt();
			System.out.println("Hexwert: 0x" + hex);
			Integer in = Integer.parseInt(hex, 16);
			System.out.println("Dezimalwert: " + in);

			break;
		}
		default: {
			System.out.println("Fehler, Error 69");
		}

		}

	}
}