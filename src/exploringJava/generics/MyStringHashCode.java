package exploringJava.generics;

public class MyStringHashCode {
    public static void main(String[] args) {
        String myString = "Averylongword";
        for (int i = 1; i <= 10; i++) {
            System.out.println("Haschcode of `" + myString + "`: " + myString.hashCode());
            char tmpchar = myString.charAt(0);
            tmpchar++;
            myString = String.valueOf(tmpchar) + myString.substring(1);
        }

        // Output:
        // Haschcode of `Averylongword`: 987311485
        // Haschcode of `Bverylongword`: 693908478
        // Haschcode of `Cverylongword`: 400505471
        // Haschcode of `Dverylongword`: 107102464
        // Haschcode of `Everylongword`: -186300543
        // Haschcode of `Fverylongword`: -479703550
        // Haschcode of `Gverylongword`: -773106557
        // Haschcode of `Hverylongword`: -1066509564
        // Haschcode of `Iverylongword`: -1359912571
        // Haschcode of `Jverylongword`: -1653315578

        // Small changes in the string result in a vastly different hashcode,
        // exactly how it should be! ^-^
    }
}

