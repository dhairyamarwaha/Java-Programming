package MyClasses.MyPrograms;

public class StringUtils {

    public String reverseString(String name){
        String reversedString = "";
        for (int index = name.length() - 1; index >= 0; index--){
            reversedString += name.charAt(index);
        } return reversedString;
    }


}
