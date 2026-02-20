/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet;
	private char[] shifted;
	private int shift;
    private String alpha = ("abcdefghijklmnopqrstuvwxyz");
    
    

    public CaesarCipher() 
    {
        alphabet = new char[26];
        shifted = new char[26];
        shift = 0;
        shifter(shift);
    }

    public CaesarCipher(int num)
    {
        alphabet = new char[26];
        shifted = new char[26];
        shift = num;
        shifter(shift);
    }

    public String encrypt(String message)
    {
        boolean add = true;
        String encrypted = "";
        for(int i = 0; i<26; i++)
        {
            for(int y = 0; y < alphabet.length; y++)
            {
                if(message.charAt(i) != alphabet[i])
                    add = false;

                if(add == true)
                    encrypted += shifted[y];
                else
                    encrypted += message.charAt(i);
            }
        }
        return encrypted;
    }

    public String decrypt(String message)
    {
        boolean add = true;
        String decrypted = "";
        for(int i = 0; i<26; i++)
        {
            for(int y = 0; y < shifted.length; y++)
            {
                if(message.charAt(i) != alphabet[i])
                    add = false;

                if(add == true)
                    decrypted += shifted[y];
                if(add == false)
                    decrypted += message.charAt(i);
            }
        }
        return decrypted;
    }

    public void shifter(int num)
    {
        for(int i = 0; i < alphabet.length; i++)
            alphabet[i] = alpha.charAt(i);
        
        for(int i = 0; i<shifted.length;i++)
            shifted[i] = alphabet[(i+num)%26];
        
    
            
        
    }



}
