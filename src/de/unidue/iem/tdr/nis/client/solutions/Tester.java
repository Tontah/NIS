package de.unidue.iem.tdr.nis.client.solutions;

import static de.unidue.iem.tdr.nis.client.solutions.Helper.*;

public class Tester {
    public String Subkeys(String a,int round){
        String returnString="";
        String[] rCon={"00000001000000000000000000000000","00000010000000000000000000000000","00000100000000000000000000000000",
                "00001000000000000000000000000000","00010000000000000000000000000000","00100000000000000000000000000000",
                "01000000000000000000000000000000","10000000000000000000000000000000","00011011000000000000000000000000","00110110000000000000000000000000"};
        String[] w={a.substring(0,8),a.substring(8,16),a.substring(16,24),a.substring(24)};
        String[] subKeys=new String[4];
        for (int i = 0; i <round ; i++) {
            subKeys[0]=XOR(rCon[i],XOR(w[0],w[3]));
            subKeys[1]=XOR(subKeys[0],w[1]);
            subKeys[2]=XOR(subKeys[1],w[2]);
            subKeys[3]=XOR(subKeys[2],w[3]);
            w[0]=subKeys[0];
            w[1]=subKeys[1];
            w[2]=subKeys[2];
            w[3]=subKeys[3];
            if(i!=2){
                returnString=returnString+subKeys[0]+subKeys[1]+subKeys[2]+subKeys[3]+"_";
            }
        }
        return returnString;
    }
    public static void main(String[] args){
        HexToBinary("00");
        String a="00001110110100101010010111011101";
            String returnString="";
            String[] b={a.substring(0,8),a.substring(8,16),a.substring(16,24),a.substring(24)};
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
            for (int i = 0; i < b.length ; i++) {
                String row=b[i].substring(0,4);
                String column=b[i].substring(4);
                int number=BinaryToDecimal(column);
                if(row.equals("0000")){
                    b[i]=""+sBox[number];
                }
                else if(row.equals("0001")){
                    b[i]=""+sBox[number+16];
                }
                else if(row.equals("0010")){
                    b[i]=""+sBox[number+32];
                }
                else if(row.equals("0011")){
                    b[i]=""+sBox[number+48];
                }
                else if(row.equals("0100")){
                    b[i]=""+sBox[number+64];
                }
                else if(row.equals("0101")){
                    b[i]=""+sBox[number+80];
                }
                else if(row.equals("0110")){
                    b[i]=""+sBox[number+96];
                }
                else if(row.equals("0111")){
                    b[i]=""+sBox[number+112];
                }
                else if(row.equals("1000")){
                    b[i]=""+sBox[number+128];
                }
                else if(row.equals("1001")){
                    b[i]=""+sBox[number+144];
                }
                else if(row.equals("1010")){
                    b[i]=""+sBox[number+160];
                }
                else if(row.equals("1011")){
                    b[i]=""+sBox[number+176];
                }
                else if(row.equals("1100")){
                    b[i]=""+sBox[number+192];
                }
                else if(row.equals("1101")){
                    b[i]=""+sBox[number+208];
                }
                else if(row.equals("1110")){
                    b[i]=""+sBox[number+224];
                }
                else if(row.equals("1111")){
                    b[i]=""+sBox[number+240];
                }
                System.out.println(b[i]);
            }
        }
       /* String key="t";
        String encryptedText="S";
        String decryptedText="";
        String decryptionAid="";
        int lengthOfKey=key.length();
        for (int i = 0; i <encryptedText.length() ; i++) {
            decryptionAid=decryptionAid + key.charAt(i%lengthOfKey);
        }
        for (int i = 0; i <encryptedText.length() ; i++) {
            decryptedText=decryptedText + StringValueOf(modulo((IntegerValueOf(encryptedText.charAt(i))-IntegerValueOf(decryptionAid.charAt(i))),26));
        }
        //System.out.println("key=" +task.getStringArray()[1]);
        //System.out.println("encryptedText=" +task.getStringArray()[0]);
        System.out.println(decryptedText);
        //return decryptedText;
        */
       /* int runde=BinaryToDecimal("110001");
        while(a > 0){
            if( (a & 1) ==  1 ){
                output = output + b;S
            }
            a = a >> 1;
            b = b << 1;

        System.out.println(runde);*/


}
