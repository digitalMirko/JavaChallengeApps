package app02_megabytes_converter;

public class MegaBytesConverter {

    /*  Challenge: Megabytes Converter
        Write a method called printMegaBytesAndKiloBytes that has
        1 parameter of type int with the name kiloBytes

        The method should not return anything (void) and it needs
        to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

        Then it needs to print a message in the format "XX KB = YY MB and ZZ KB"
        XX represents the original value in kiloBytes. YY represents the calculated
        megabytes. ZZ represents the calculated remaining kilobytes.

        if the parameter kiloBytes is <0 then print instead the text "Invalid Value"

        - Example: printMegaBytesAndKiloBytes(2050) should print "2050 KB = 2 MB and 2 KB"
        - Tip: Be careful about spaces in the printed message
        - Tip: Use the remainder operator
        - Tip: 1 MB = 1024 KB

        Note: The printMegaBytesAndKiloBytes method needs to be defined as public static

     */

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2050);  // 2050 KB = 2 MB and 2 KB

        printMegaBytesAndKiloBytes(-5);    // Invalid Value
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes/1024;
            int kiloBytesLeft = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesLeft + " KB");
        }
    }
}
