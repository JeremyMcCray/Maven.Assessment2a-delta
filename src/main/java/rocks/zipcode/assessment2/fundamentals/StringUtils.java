package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String answer = "";
        for (int i = 0; i < amountOfPadding-stringToBePadded.length() ; i++) {
            answer+= " ";
        }
        answer+= stringToBePadded;
        return answer;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String answer = stringToBePadded;
        for (int i = 0; i <amountOfPadding-stringToBePadded.length() ; i++) {
            answer+= " ";

        }
        return answer;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String answer = "";
        for (int i = 0; i < numberOfTimeToRepeat ; i++) {
            answer+=stringToBeRepeated;
        }
        return answer;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {

      if(string.matches("[a-z A-z]+")){
          return true;

        }
      return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {

        return string.matches( "[0-9]+");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        return !isAlphaString(string) && !isNumericString(string);
    }
}
