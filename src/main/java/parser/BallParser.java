package parser;

import exception.BallException;
import validator.BallValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BallParser {
    public static List<double[]> parseStringToArray(List<String> stringList) throws BallException {
       List<double[]> doubleList = new ArrayList<>();
       for(String i : stringList) {
           if (!BallValidator.chechInputLine(i)) {
               continue;
           }
           List<String> splitStringList = List.of(i.split(" "));
           double[] doubleArray = new double[splitStringList.size()];
           for(int j = 0; j < splitStringList.size(); j++) {
               doubleArray[j] = Double.parseDouble(splitStringList.get(j));
           }
           doubleList.add(doubleArray);
       }
       return doubleList;
    }
}
