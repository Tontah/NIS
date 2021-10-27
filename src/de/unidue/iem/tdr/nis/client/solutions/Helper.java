package de.unidue.iem.tdr.nis.client.solutions;

public class Helper {
	/** Hier können Sie ihre allgemeinen Funktionen erstellen,
	 * welche in allen Lösungen verfügbar sind.
	 * Sie können auch statische Methoden oder Subklassen benutzen.
	 * Sie können jedoch NICHT die Signatur des Konstruktors verändern.
	 */
	public Helper() {

	}
	public static String XOR(String value1, String value2){
		String returnString="";
		if(value1.length()-value2.length()!=0) {
			String placeHolder="";
			if(value1.length()-value2.length()>0) {
				int difference = value1.length() - value2.length();
				for (int i = 0; i < difference; i++) {
					placeHolder = placeHolder + "0";
				}
				placeHolder=placeHolder+value2;
				value2=placeHolder;
			}
			else {
				int difference = value2.length() - value1.length();
				for (int i = 0; i < difference; i++) {
					placeHolder = placeHolder + "0";
				}
				placeHolder=placeHolder+value1;
				value1=placeHolder;
			}
		}
		for (int i = 0; i < value1.length(); i++) {
			if(value1.charAt(i)==value2.charAt(i)){
				returnString=returnString+"0";
			}
			else {
				returnString=returnString+"1";
			}
		}
		return returnString;
	}
	public static int HexToDecimal(String A){
		int val=0;
		int power;
		for (int j=A.length()-1;j>=0 ;j--) {
			int multiplicator=1;
			String value=A.charAt(j)+"";
			if(value.equals("A")||value.equals("a")){
				value="10";
			}
			else if(value.equals("B")||value.equals("b")){
				value="11";
			}
			else if(value.equals("C")||value.equals("c")){
				value="12";
			}
			else if(value.equals("D")||value.equals("d")){
				value="13";
			}
			else if(value.equals("E")||value.equals("e")){
				value="14";
			}
			else if(value.equals("F")||value.equals("f")){
				value="15";
			}
			power=A.length()-(j+1);
			while(power!=0){
				multiplicator=multiplicator*16;
				power--;
			}
			val=(Integer.parseInt(value)*multiplicator)+val;

		}
		return val;
	}
	public static String DecimalToBinary(int a){
		String revertedBinaryValue="";
		String binaryValue="";
		while(a!=0) {
			if (a % 2 == 1) {
				revertedBinaryValue = revertedBinaryValue + "1";
				a=a-1;
			}
			else{revertedBinaryValue=revertedBinaryValue+"0";}
			a=a/2;
		}
		for (int i =revertedBinaryValue.length()-1; i >=0 ; i--) {
			binaryValue=binaryValue+revertedBinaryValue.charAt(i);
		}
		return binaryValue;
	}
	public static int BinaryToDecimal(String binary){
		int val=0;
		for (int i =0; i <binary.length() ; i++) {
			int mult=0;
			if(binary.charAt(i)=='1'){
				if(i==binary.length()){
					val=val+1;
				}
				else {
					int j = (binary.length()-1)-i;
					mult=1;
					while (j != 0) {
						mult=mult*2;
						j--;
					}
				}
			}
			val=val+mult;
		}
		return val;
	}
	public static int IntegerValueOf(char letter){
		if(letter==('a')||letter==('A')){
			return 0;
		}
		else if(letter==('b')||letter==('B')){
			return 1;
		}
		else if(letter==('c')||letter==('C')){
			return 2;
		}
		else if(letter==('d')||letter==('D')){
			return 3;
		}
		else if(letter==('e')||letter==('E')){
			return 4;
		}
		else if(letter==('f')||letter==('F')){
			return 5;
		}
		else if(letter==('g')||letter==('G')){
			return 6;
		}
		else if(letter==('h')||letter==('H')){
			return 7;
		}
		else if(letter==('i')||letter==('I')){
			return 8;
		}
		else if(letter==('j')||letter==('J')){
			return 9;
		}
		else if(letter==('k')||letter==('K')){
			return 10;
		}
		else if(letter==('l')||letter==('L')){
			return 11;
		}
		else if(letter==('m')||letter==('M')){
			return 12;
		}
		else if(letter==('n')||letter==('N')){
			return 13;
		}
		else if(letter==('o')||letter==('O')){
			return 14;
		}
		else if(letter==('p')||letter==('P')){
			return 15;
		}
		else if(letter==('q')||letter==('Q')){
			return 16;
		}
		else if(letter==('r')||letter==('R')){
			return 17;
		}
		else if(letter==('s')||letter==('S')){
			return 18;
		}
		else if(letter==('t')||letter==('T')){
			return 19;
		}
		else if(letter==('u')||letter==('U')){
			return 20;
		}
		else if(letter==('v')||letter==('V')){
			return 21;
		}
		else if(letter==('w')||letter==('W')){
			return 22;
		}
		else if(letter==('x')||letter==('X')){
			return 23;
		}
		else if(letter==('y')||letter==('Y')){
			return 24;
		}
		else if(letter==('z')||letter==('Z')){
			return 25;
		}
		return-1;
	}
	public static int modulo(int num1, int num2){
		int modulo=0;
		if (num1==num2){
			modulo=0;
		}
		else if(num1>0 && num1<num2){
			modulo=num1;
		}
		else if(num1<0 ){
			for (int i = 1; i <=(-1*num1) ; i++) {
				int moduloNumber=num2*i;
				int moduloCalculation=num1+moduloNumber;
				if(moduloCalculation<num2 && moduloCalculation>0) {
					modulo = moduloCalculation;
					break;

				}	}
		}
		else{
			for (int i = 1; i <num1 ; i++) {
				int moduloNumber=num2*i;
				int moduloCalculation=num1-moduloNumber;
				if(moduloCalculation<num2){
					modulo=moduloCalculation;
					break;
				}
			}
		}
		return modulo;
	}
	public static String StringValueOf(int number) {
		if (number == 0) {
			return "A";
		}
		if (number == 1) {
			return "B";
		}
		if (number == 2) {
			return "C";
		}
		if (number == 3) {
			return "D";
		}
		if (number == 4) {
			return "E";
		}
		if (number == 5) {
			return "F";
		}
		if (number == 6) {
			return "G";
		}
		if (number == 7) {
			return "H";
		}
		if (number == 8) {
			return "I";
		}
		if (number == 9) {
			return "J";
		}
		if (number == 10) {
			return "K";
		}
		if (number == 11) {
			return "L";
		}
		if (number == 12) {
			return "M";
		}
		if (number == 13) {
			return "N";
		}
		if (number == 14) {
			return "O";
		}
		if (number == 15) {
			return "P";
		}
		if (number == 16) {
			return "Q";
		}
		if (number == 17) {
			return "R";
		}
		if (number == 18) {
			return "S";
		}
		if (number == 19) {
			return "T";
		}
		if (number == 20) {
			return "U";
		}
		if (number == 21) {
			return "V";
		}
		if (number == 22) {
			return "W";
		}
		if (number == 23) {
			return "X";
		}
		if (number == 24) {
			return "Y";
		}
		if (number == 25) {
			return "Z";
		}
		return"";
	}
	public static String PC1(String key){
		String permutedKey="";
		int[] permutation ={ 57, 49, 41, 33, 25, 17, 9,
				1, 58, 50, 42, 34, 26, 18,
				10, 2, 59, 51, 43, 35, 27,
				19, 11, 3, 60, 52, 44, 36,
				63, 55, 47, 39, 31, 23, 15,
				7, 62, 54, 46, 38, 30, 22,
				14, 6, 61, 53, 45, 37, 29,
				21, 13, 5, 28, 20, 12, 4};
		for (int i = 0; i <permutation.length ; i++) {
			permutedKey=permutedKey+key.charAt(permutation[i]-1);
		}
		return permutedKey;
	}

	public static String DESBitShift(String key, int runde){
		String C=key.substring(0,28);
		String C1="";
		String D=key.substring(28);
		String D1="";
		String placeholder="";
		for (int i = 1; i <=runde; i++) {

			if (i == 1 || i == 2 || i == 9 || i == 16) {
				placeholder = ""+C.charAt(0);
				C1 = C.substring(1) + placeholder;
				placeholder =""+D.charAt(0);
				D1 = D.substring(1) + placeholder;
			} else {
				placeholder = C.substring(0,2);
				C1 = C.substring(2) + placeholder;
				placeholder = D.substring(0,2);
				D1 = D.substring(2) + placeholder;
			}
			C=C1;
			D=D1;
		}
		return C+D;
	}
	public static String PC2(String key){
		String finalPermutedKey="";
		int[] keyPermutation= { 14, 17, 11, 24, 1, 5,
				3, 28, 15, 6, 21, 10,
				23, 19, 12, 4, 26, 8,
				16, 7, 27, 20, 13, 2,
				41, 52, 31, 37, 47, 55,
				30, 40, 51, 45, 33, 48,
				44, 49, 39, 56, 34, 53,
				46, 42, 50, 36, 29, 32 };
		for (int i = 0; i <keyPermutation.length ; i++) {
			finalPermutedKey=finalPermutedKey+key.charAt(keyPermutation[i]-1);
		}
		return finalPermutedKey;
	}
	public static String ExpansionForRBlock(String R_Block){
		String finalR_Block="";
		int[] expansion= { 32, 1, 2, 3, 4, 5, 4, 5,
				6, 7, 8, 9, 8, 9, 10, 11,
				12, 13, 12, 13, 14, 15, 16, 17,
				16, 17, 18, 19, 20, 21, 20, 21,
				22, 23, 24, 25, 24, 25, 26, 27,
				28, 29, 28, 29, 30, 31, 32, 1 };
		for (int i = 0; i <expansion.length ; i++) {
			finalR_Block=finalR_Block+R_Block.charAt(expansion[i]-1);
		}
		return finalR_Block;
	}
	public static String initialPermutationLBlock(String klarText) {
		int[] initialPermutationLBlock= { 58, 50, 42, 34, 26, 18, 10, 2,
				60, 52, 44, 36, 28, 20, 12, 4,
				62, 54, 46, 38, 30, 22, 14, 6,
				64, 56, 48, 40, 32, 24, 16, 8};
		String L_Block="";
		for (int i = 0; i <initialPermutationLBlock.length ; i++) {
			L_Block=L_Block+klarText.charAt(initialPermutationLBlock[i]-1);
		}
		return L_Block;
	}
	public static String initialPermutationRBlock(String klarText) {
		int[] initialPermutationRBlock= {57, 49, 41, 33, 25, 17, 9, 1,
				59, 51, 43, 35, 27, 19, 11, 3,
				61, 53, 45, 37, 29, 21, 13, 5,
				63, 55, 47, 39, 31, 23, 15, 7 };
		String R_Block ="";
		for (int i = 0; i <initialPermutationRBlock.length ; i++) {
			R_Block=R_Block+klarText.charAt(initialPermutationRBlock[i]-1);
		}
		return R_Block;
	}
	 static int[][] sBoxes = { { 14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7,
			0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8,
			4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0,
			15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13 },

		{ 15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10,
				3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5,
				0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15,
				13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9 },

		{ 10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8,
				13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1,
				13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7,
				1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12 },

		{ 7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15,
				13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9,
				10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4,
				3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14 },

		{ 2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9,
				14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6,
				4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14,
				11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3 },

		{ 12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11,
				10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8,
				9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6,
				4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13 },

		{ 4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1,
				13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6,
				1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2,
				6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12 },

		{ 13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7,
				1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2,
				7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8,
				2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11 } };

	public static String SBlock(String expanded) {
		String[] expandedRBlock = {expanded.substring(0, 6), expanded.substring(6, 12), expanded.substring(12, 18), expanded.substring(18, 24), expanded.substring(24, 30),
				expanded.substring(30, 36), expanded.substring(36, 42), expanded.substring(42, 48)};
		String RBlock = "";
		for (int i = 0; i < expandedRBlock.length; i++) {
			int[] sBox=sBoxes[i];
			String bitsToUse = expandedRBlock[i];
			String row = "" + bitsToUse.charAt(0) + bitsToUse.charAt(5);
			String column = bitsToUse.substring(1, 5);
			if(row.equals("00")){
					RBlock=RBlock+TwoToFour(DecimalToBinary(sBox[BinaryToDecimal(column)]));
			}
			else if(row.equals("01")){
				RBlock=RBlock+TwoToFour(DecimalToBinary(sBox[(BinaryToDecimal(column)+16)]));
			}
			else if(row.equals("10")){
				RBlock=RBlock+TwoToFour(DecimalToBinary(sBox[(BinaryToDecimal(column)+32)]));
			}
			else if(row.equals("11")){
				RBlock=RBlock+TwoToFour(DecimalToBinary(sBox[(BinaryToDecimal(column)+48)]));
			}
		}
		return RBlock;
	}
	public static String TwoToFour(String binary){
		String returnValue="";
		if(binary.length()<4){
			for (int i = 0; i <4-binary.length() ; i++) {
				returnValue=returnValue+"0";
			}
			returnValue=returnValue+binary;
		}
		else {
			returnValue=binary;
		}
		return  returnValue;
	}
	public static String BitPermutation(String R_Block){
		String finalR_Block="";
		int[] permutation = { 16, 7, 20, 21,
				29, 12, 28, 17,
				1, 15, 23, 26,
				5, 18, 31, 10,
				2, 8, 24, 14,
				32, 27, 3, 9,
				19, 13, 30, 6,
				22, 11, 4, 25 };
		for (int i = 0; i <permutation.length ; i++) {
			finalR_Block=finalR_Block+R_Block.charAt(permutation[i]-1);
		}
		return finalR_Block;
	}
	public static String EncodingPermutation(String text){
		String encodedText="";
		int[] permutation = { 40, 8, 48, 16, 56, 24, 64, 32,
				39, 7, 47, 15, 55, 23, 63, 31,
				38, 6, 46, 14, 54, 22, 62, 30,
				37, 5, 45, 13, 53, 21, 61, 29,
				36, 4, 44, 12, 52, 20, 60, 28,
				35, 3, 43, 11, 51, 19, 59, 27,
				34, 2, 42, 10, 50, 18, 58, 26,
				33, 1, 41, 9, 49, 17, 57, 25 };
		for (int i = 0; i <permutation.length ; i++) {
			encodedText=encodedText+text.charAt(permutation[i]-1);
		}
		return encodedText;
	}
	public static  String GFMult(String a) {
		String ruductive="100011011";
		int diff=a.length()-ruductive.length();
		while(diff!=0 && diff>0) {
			ruductive=ruductive+0;
			diff--;
		}if (diff<0){
			ruductive="00000000";
		}
		return XOR(a,ruductive);
	}
	public static  String BinaryToHex(String a){
		String[] b=new String[a.length()/4];
		for (int i = 0; i < b.length ; i++) {
			b[i]=a.substring((i*4),(4+i*4));
		}
		String returnString="";
		for (int i = 0; i <b.length ; i++) {
			if(b[i].equals("0000")){
				returnString=returnString+0;
			}
			else if(b[i].equals("0001")){
				returnString=returnString+1;
			}
			else if(b[i].equals("0010")){
				returnString=returnString+2;
			}
			else if(b[i].equals("0011")){
				returnString=returnString+3;
			}
			else if(b[i].equals("0100")){
				returnString=returnString+4;
			}
			else if(b[i].equals("0101")){
				returnString=returnString+5;
			}
			else if(b[i].equals("0110")){
				returnString=returnString+6;
			}
			else if(b[i].equals("0111")){
				returnString=returnString+7;
			}
			else if(b[i].equals("1000")){
				returnString=returnString+8;
			}
			else if(b[i].equals("1001")){
				returnString=returnString+9;
			}
			else if(b[i].equals("1010")){
				returnString=returnString+"A";
			}
			else if(b[i].equals("1011")){
				returnString=returnString+"B";
			}
			else if(b[i].equals("1100")){
				returnString=returnString+"C";
			}
			else if(b[i].equals("1101")){
				returnString=returnString+"D";
			}
			else if(b[i].equals("1110")){
				returnString=returnString+"E";
			}
			else if(b[i].equals("1111")){
				returnString=returnString+"F";
			}
		}
		return returnString;
	}
	public static  String HexToBinary(String a){
		String returnString="";
		for (int i = 0; i <a.length() ; i++) {
			if(a.charAt(i)=='0'){
				returnString=returnString+"0000";
			}
			else if(a.charAt(i)=='1'){
				returnString=returnString+"0001";
			}
			else if(a.charAt(i)=='2'){
				returnString=returnString+"0010";
			}
			else if(a.charAt(i)=='3'){
				returnString=returnString+"0011";
			}
			else if(a.charAt(i)=='4'){
				returnString=returnString+"0100";
			}
			else if(a.charAt(i)=='5'){
				returnString=returnString+"0101";
			}
			else if(a.charAt(i)=='6'){
				returnString=returnString+"0110";
			}
			else if(a.charAt(i)=='7'){
				returnString=returnString+"0111";
			}
			else if(a.charAt(i)=='8'){
				returnString=returnString+"1000";
			}
			else if(a.charAt(i)=='9'){
				returnString=returnString+"1001";
			}
			else if(a.charAt(i)=='A'|| a.charAt(i)=='a'){
				returnString=returnString+"1010";
			}
			else if(a.charAt(i)=='B'|| a.charAt(i)=='b'){
				returnString=returnString+"1011";
			}
			else if(a.charAt(i)=='C'|| a.charAt(i)=='c'){
				returnString=returnString+"1100";
			}
			else if(a.charAt(i)=='D'|| a.charAt(i)=='d'){
				returnString=returnString+"1101";
			}
			else if(a.charAt(i)=='E'|| a.charAt(i)=='e'){
				returnString=returnString+"1110";
			}
			else if(a.charAt(i)=='F'|| a.charAt(i)=='f'){
				returnString=returnString+"1111";
			}
		}
		return returnString;
	}
	public static  String BinaryMult(String a,String b){
 		String returnString="";
		int lenght=0;
		int j=0;
		int f=0;
		int positon=0;
		if(a.equals("00000000")||b.equals("00000000")){
			return "00";
		}
		String[] mult=new String[b.length()];
		for (int i =b.length()-1; i >=0; i--) {
			if(b.charAt(i)=='1'){
				lenght++;
				j=f;
				mult[positon]=a;
				while (j!=0){
					mult[positon]=mult[positon]+0;
					j--;
				}
				positon++;
			}
			f++;
		}
		returnString=mult[0];
		for (int i = 1; i <lenght ; i++) {
			returnString=XOR(returnString,mult[i]);
		}
		for (int i = 0; i <returnString.length() ; i++) {
			j=0;
			if (returnString.charAt(j)=='0'){
				returnString=returnString.substring(1);
			}
			else {break;}

		}
		for (int i = 0; i < returnString.length(); i++) {
			returnString=GFMult(returnString);
			if (returnString.length()==9 && returnString.charAt(0)=='0'){
				returnString=returnString.substring(1);
				break;
			}
		}
		return BinaryToHex(  returnString);

	}
	public static String RotWord(String w3){
		String returnString="";
		String b0=w3.substring(0,2);
		String b1=w3.substring(2,4);
		String b2=w3.substring(4,6);
		String b3=w3.substring(6);
		returnString=b1+b2+b3+b0;
		return returnString;
	}
	public static String SubBytes(String a){
		String returnString="";
		String[] w =new String[a.length()/2];
		for (int i = 0; i < w.length ; i++) {
			w[i]=a.substring((i*2),((i*2)+2));
		}
		String[] sBox= {"63" ,"7c" ,"77" ,"7b" ,"f2" ,"6b" ,"6f" ,"c5" ,"30" ,"01" ,"67" ,"2b" ,"fe" ,"d7" ,"ab" ,"76"
				,"ca" ,"82" ,"c9" ,"7d" ,"fa" ,"59" ,"47" ,"f0" ,"ad" ,"d4" ,"a2" ,"af" ,"9c" ,"a4" ,"72" ,"c0"
				,"b7" ,"fd" ,"93" ,"26" ,"36" ,"3f" ,"f7" ,"cc" ,"34" ,"a5" ,"e5" ,"f1" ,"71" ,"d8" ,"31" ,"15"
				,"04" ,"c7" ,"23" ,"c3" ,"18" ,"96" ,"05" ,"9a" ,"07" ,"12" ,"80" ,"e2" ,"eb" ,"27" ,"b2" ,"75"
				,"09" ,"83" ,"2c" ,"1a" ,"1b" ,"6e" ,"5a" ,"a0" ,"52" ,"3b" ,"d6" ,"b3" ,"29" ,"e3" ,"2f" ,"84"
				,"53" ,"d1" ,"00" ,"ed" ,"20" ,"fc" ,"b1" ,"5b" ,"6a" ,"cb" ,"be" ,"39" ,"4a" ,"4c" ,"58" ,"cf"
				,"d0" ,"ef" ,"aa" ,"fb" ,"43" ,"4d" ,"33" ,"85" ,"45" ,"f9" ,"02" ,"7f" ,"50" ,"3c" ,"9f" ,"a8"
				,"51" ,"a3" ,"40" ,"8f" ,"92" ,"9d" ,"38" ,"f5" ,"bc" ,"b6" ,"da" ,"21" ,"10" ,"ff" ,"f3" ,"d2"
				,"cd" ,"0c" ,"13" ,"ec" ,"5f" ,"97" ,"44" ,"17" ,"c4" ,"a7" ,"7e" ,"3d" ,"64" ,"5d" ,"19" ,"73"
				,"60" ,"81" ,"4f" ,"dc" ,"22" ,"2a" ,"90" ,"88" ,"46" ,"ee" ,"b8" ,"14" ,"de" ,"5e" ,"0b" ,"db"
				,"e0" ,"32" ,"3a" ,"0a" ,"49" ,"06" ,"24" ,"5c" ,"c2" ,"d3" ,"ac" ,"62" ,"91" ,"95" ,"e4" ,"79"
				,"e7" ,"c8" ,"37" ,"6d" ,"8d" ,"d5" ,"4e" ,"a9" ,"6c" ,"56" ,"f4" ,"ea" ,"65" ,"7a" ,"ae" ,"08"
				,"ba" ,"78" ,"25" ,"2e" ,"1c" ,"a6" ,"b4" ,"c6" ,"e8" ,"dd" ,"74" ,"1f" ,"4b" ,"bd" ,"8b" ,"8a"
				,"70" ,"3e" ,"b5" ,"66" ,"48" ,"03" ,"f6" ,"0e" ,"61" ,"35" ,"57" ,"b9" ,"86" ,"c1" ,"1d" ,"9e"
				,"e1" ,"f8" ,"98" ,"11" ,"69" ,"d9" ,"8e" ,"94" ,"9b" ,"1e" ,"87" ,"e9" ,"ce" ,"55" ,"28" ,"df"
				,"8c" ,"a1" ,"89" ,"0d" ,"bf" ,"e6" ,"42" ,"68" ,"41" ,"99" ,"2d" ,"0f" ,"b0" ,"54" ,"bb" ,"16"};

		for (int i = 0; i < w.length ; i++) {
			String row=""+w[i].charAt(0);
			String column=""+w[i].charAt(1);
			int number=BinaryToDecimal(HexToBinary(column));
			if(row.equals("0")){
				w[i]=""+sBox[number];
				//w[i]=HexToBinary(w[i]);
			}
			else if(row.equals("1")){
				w[i]=""+sBox[number+16];
				//w[i]=HexToBinary(w[i]);
			}
			else if(row.equals("2")){
				w[i]=""+sBox[number+32];
				//w[i]=HexToBinary(w[i]);
			}
			else if(row.equals("3")){
				w[i]=""+sBox[number+48];
				//w[i]=HexToBinary(w[i]);
			}
			else if(row.equals("4")){
				w[i]=""+sBox[number+64];
				//w[i]=HexToBinary(w[i]);
			}
			else if(row.equals("5")){
				w[i]=""+sBox[number+80];
				//w[i]=HexToBinary(w[i]);
			}
			else if(row.equals("6")){
				w[i]=""+sBox[number+96];
				//w[i]=HexToBinary(w[i]);
			}
			else if(row.equals("7")){
				w[i]=""+sBox[number+112];
				//w[i]=HexToBinary(w[i]);
			}
			else if(row.equals("8")){
				w[i]=""+sBox[number+128];
				//w[i]=HexToBinary(w[i]);
			}
			else if(row.equals("9")){
				w[i]=""+sBox[number+144];
				//w[i]=HexToBinary(w[i]);
			}
			else if(row.equals("a")  || row.equals("A")){
				w[i]=""+sBox[number+160];
				//w[i]=HexToBinary(w[i]);
			}
			else if(row.equals("b")  || row.equals("B")){
				w[i]=""+sBox[number+176];
				//w[i]=HexToBinary(w[i]);
			}
			else if(row.equals("c")  || row.equals("C")){
				w[i]=""+sBox[number+192];
				//w[i]=HexToBinary(w[i]);
			}
			else if(row.equals("d")  || row.equals("D")){
				w[i]=""+sBox[number+208];
				//w[i]=HexToBinary(w[i]);
			}
			else if(row.equals("e")  || row.equals("E")){
				w[i]=""+sBox[number+224];
				//w[i]=HexToBinary(w[i]);
			}
			else if(row.equals("f")  || row.equals("F")){
				w[i]=""+sBox[number+240];
				//w[i]=HexToBinary(w[i]);
			}
		}
		for (int i = 0; i < w.length ; i++) {
			returnString=returnString+w[i];
		}
		return returnString;
	}
	public static String AESGFunction(String a, int runde){
		String[] words={a.substring(0,8),a.substring(8,16),a.substring(16,24),a.substring(24)};
		String w3=RotWord(words[3]);
		w3=SubBytes(w3);
		String[] rCon={"01000000","02000000","04000000",
				"08000000","10000000","20000000", "40000000"
				,"80000000","1b000000","36000000"};
		words[0]=XOR(HexToBinary(words[0]),XOR(HexToBinary(w3),HexToBinary(rCon[runde])));
		words[1]=XOR(HexToBinary(words[1]),words[0]);
		words[2]=XOR(HexToBinary(words[2]),words[1]);
		words[3]=XOR(HexToBinary(words[3]),words[2]);
		return BinaryToHex(words[0]+words[1]+words[2]+words[3]);
	}
	public static String MixColumns(String a){
		String returnString="";
		String[][] sX={{a.substring(0,2),a.substring(2,4),a.substring(4,6), a.substring(6,8)},{a.substring(8,10),a.substring(10,12),a.substring(12,14),a.substring(14,16)}
				,{a.substring(16,18),a.substring(18,20),a.substring(20,22), a.substring(22,24)},{a.substring(24,26),a.substring(26,28),a.substring(28,30),a.substring(30)}};
		String[] cX={"00000010","00000011","00000001","00000001"
				,"00000001","00000010","00000011","00000001"
				,"00000001","00000001","00000010","00000011"
				,"00000011","00000001","00000001","00000010"};
		String[][] solutionMatrix=new String[4][4];
		for (int i = 0; i < sX.length ; i++) {
			for (int j = 0; j <sX[0].length ; j++) {
				String b00=HexToBinary(BinaryMult(cX[j*4],HexToBinary(sX[i][0])));
				String b10=HexToBinary(BinaryMult(cX[(j*4)+1],HexToBinary(sX[i][1])));
				String b20=HexToBinary(BinaryMult(cX[(j*4)+2],HexToBinary(sX[i][2])));
				String b30=HexToBinary(BinaryMult(cX[(j*4)+3],HexToBinary(sX[i][3])));
				solutionMatrix[i][j]=XOR(b30,XOR(b20,XOR(b00,b10)));
				returnString=returnString+BinaryToHex(solutionMatrix[i][j]);
			}

		}
		return returnString;
	}
	public static String ShiftRows(String a){
		String placeholder="";
		String returnString="";
		String[][] sX={{a.substring(0,2),a.substring(8,10),a.substring(16,18), a.substring(24,26)},{a.substring(2,4),a.substring(10,12),a.substring(18,20),a.substring(26,28)}
				,{a.substring(4,6),a.substring(12,14),a.substring(20,22), a.substring(28,30)},{a.substring(6,8),a.substring(14,16),a.substring(22,24),a.substring(30)}};
		for (int i = 0; i <sX.length ; i++) {
			placeholder=placeholder+sX[i][i%4];
			placeholder=placeholder+sX[i][(i+1 )%4];
			placeholder=placeholder+sX[i][(i+2)%4];
			placeholder=placeholder+sX[i][(i+3)%4];
		}
		returnString=placeholder.substring(0,2)+placeholder.substring(8,10)+placeholder.substring(16,18)+placeholder.substring(24,26)+placeholder.substring(2,4)+placeholder.substring(10,12)+
				placeholder.substring(18,20)+placeholder.substring(26,28)+placeholder.substring(4,6)+placeholder.substring(12,14)+placeholder.substring(20,22)+placeholder.substring(28,30)+
				placeholder.substring(6,8)+placeholder.substring(14,16)+placeholder.substring(22,24)+placeholder.substring(30);

		return returnString;
	}
}
