/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Umer
 */
public class LocalDatabase  {

    public static final ArrayList<String> username_ids = new ArrayList<>();

    static {
        username_ids.add("Umer");
        username_ids.add("Usman");
        username_ids.add("Noor");
    }
    public static final ArrayList<String> passwords = new ArrayList<>();

    static {
        passwords.add("123");
        passwords.add("1234");
        passwords.add("12345");

    }
    public static final ArrayList<String> skils= new ArrayList<>();{
 
}

    public static boolean validatecrd(final String username, final String pass) {
        for (int i = 0; i < username_ids.size(); i++) {
            if (username_ids.get(i).equals(username) && passwords.get(i).equals(pass)) {
                return true;
            }
        }
        return false;
        
    }
public static boolean Add(final String skill){
   int i=0;
    skils.add(skill);
    i++;
    return true;
}
public static final ArrayList<String> User= new ArrayList<>();
static{
    User.add( 0,"omerjh5004@gmail.com");
   User.add(1,"Umer");
}
  

public static boolean Validate( final String skill){
     skils.add("Photograper");
skils.add("software Developer");
skils.add("Web Designer");
    for(int a=0 ; a<skils.size();a++){
    if(skils.get(a).equals(skill)){
        return true;}
    }
    return false;
}
public static int size(){
int s=0;
s=skils.size();
return s;

}
public static boolean Save(String a,String b){
   User.add("Umer");
     User.add(a);
    User.add(b);
    return true;
}
public static boolean addfeedback(String name,String fb){
    
    User.add(name);
    User.add(fb);
    return true;
}}
