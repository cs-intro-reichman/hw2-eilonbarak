public class TimeCalc {
    public static void main(String[] args) {

        String time = args[0];

        String minutesToAddStr = args[1];

        int minutesToAdd = Integer.parseInt(minutesToAddStr);

        String hourStr = time.substring(0, 2);
        int hour = Integer.parseInt(hourStr);

        String minutesStr = time.substring(3, 5);
        int minutes = Integer.parseInt(minutesStr);

        int minutesCounter = minutes + (hour * 60) + minutesToAdd;

        int newHour = (minutesCounter / 60) % 24;
        int newMinutes = minutesCounter % 60;

        String hourOut;
        if (newHour < 10) {
            hourOut = "0" + newHour;
        } else {
            hourOut = "" + newHour;
        }

        String minutesOut;
        if (newMinutes < 10) {
            minutesOut = "0" + newMinutes;
        } else {
            minutesOut = "" + newMinutes;
        }

        System.out.println(hourOut + ":" + minutesOut);

    }
}
