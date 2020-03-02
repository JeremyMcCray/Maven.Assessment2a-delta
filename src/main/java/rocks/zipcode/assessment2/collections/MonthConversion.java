package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */


    Map<Integer,String> test = new HashMap<>();

    public void add(Integer monthNumber, String monthName) {
    test.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        for (Integer num: test.keySet()) {
            if(num.equals(monthNumber)){
                return test.get(monthNumber);

            }        }
        return null;
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        return (Integer)null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return null;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return null;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return test.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

    }
}
