package de.telran.averchenko.elena.homework12.users;

import java.util.*;

public class UserService {

    Map<String ,User> usersInfo = new HashMap<>();

    public UserService(Map<String , User> usersInfo) {
        this.usersInfo = usersInfo;
    }

    public UserService() {
    }

    public boolean checkThePassword(String password){
        boolean result = true;

        char[] tempCharsOfPassword = password.toCharArray();
        List<Character> charsOfPassword  = new ArrayList<>();
        for (int i = 0; i < tempCharsOfPassword.length; i++) {
            charsOfPassword.add(tempCharsOfPassword[i]);
        }
        List<Character> charsOfLowerCase  = Arrays.asList('q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m');
        List<Character> charsOfUpperCase  = Arrays.asList('Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M');
        List<Character> charsOfSpecialSymbols  = Arrays.asList('!','@','#','$','%','^','&','*','(',')','_','+');

        if (charsOfPassword.size() >=8) {
            int counterOfLowerCase = 0;
            int counterOfUpperCase = 0;
            int counterOfSpecialSymbols = 0;
            for (int j = 0; j < charsOfLowerCase.size(); j++){
                if (charsOfPassword.contains(charsOfLowerCase.get(j))){
                    counterOfLowerCase++;
                }
            }
            for (int i = 0; i < charsOfUpperCase.size(); i++) {
                if (charsOfPassword.contains(charsOfUpperCase.get(i))){
                    counterOfUpperCase++;
                }
            }
            for (int i = 0; i < charsOfSpecialSymbols.size(); i++) {
                if (charsOfPassword.contains(charsOfSpecialSymbols.get(i))){
                    counterOfSpecialSymbols++;
                }
            }
            if(counterOfLowerCase>0 && counterOfUpperCase>0 && counterOfSpecialSymbols>0){
                System.out.println("The password is correct.");
                result = true;
            }
            if (counterOfLowerCase <= 0){
                System.out.println("The password must include at least one letter in a Lower Case");
                result = false;
            }
            if (counterOfUpperCase <= 0){
                System.out.println("The password must include at least one letter in an Upper Case");
                result = false;
            }
            if (counterOfSpecialSymbols <= 0){
                System.out.println("The password must include at least one Special Symbol");
                result = false;
            }

        } else{
            System.out.println("The password can't be less then 8 symbols' long.");
            result = false;
        }
        return result;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "usersInfo=" + usersInfo +
                '}';
    }

    public boolean signUp(String login, String password){
        int tempHash = password.hashCode();
        boolean tempCheck = true;
        if (checkThePassword(password)){
            if (!usersInfo.isEmpty()){
                if (usersInfo.containsKey(tempHash)){
                    tempCheck = false;
                } else{
                    tempCheck = true;
                }
                }
            if (tempCheck){
                this.usersInfo.put(login, new User(tempHash,login));
            }
            } else{
            tempCheck = false;
        }
            return tempCheck;

        };

    public boolean signIn(String login, String password){
        boolean temp = true;
        Random random = new Random();
        List<Character> charsOfLowerCase  = Arrays.asList('q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m');
        List<Character> charsOfNumbers  = Arrays.asList('1','2','3','4','5','6','7','8','9','0');
        String someLogin = "";
          if (usersInfo.containsKey(login)){
              temp = false;
              do {
                  someLogin = login + charsOfLowerCase.get(random.nextInt(0,charsOfLowerCase.size()-1))+charsOfLowerCase.get(random.nextInt(0,charsOfLowerCase.size()-1))+charsOfNumbers.get(random.nextInt(0,charsOfNumbers.size()-1))+charsOfNumbers.get(random.nextInt(0,charsOfNumbers.size()-1));
              } while (!(usersInfo.containsKey(login)));

              System.out.println("This login is already exists. You can use: " + someLogin);
          }
         return temp;
    }

    public boolean enterTheAccount(String login, String password){
        boolean result = false;
        if (usersInfo.containsKey(login)){
            if (usersInfo.get(login).getLogin().equals(login) && Integer.compare(usersInfo.get(login).getPassword(), password.hashCode())==0){
                result = true;
                System.out.println("You've entered your account.");
            } else if ((usersInfo.get(login).getLogin().equals(login) && Integer.compare(usersInfo.get(login).getPassword(), password.hashCode())!=0)){
                result = false;
                System.out.println("You've entered the wrong password. Try again.");
            }
            }
        if (!usersInfo.containsKey(login)){
            result = false;
            System.out.println("This username doesn't exist. Try again.");
        }
        return result;
        }
    }







