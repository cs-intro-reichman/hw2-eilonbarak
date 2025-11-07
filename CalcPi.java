// Computes an approximation of PI.
public class CalcPi {
    public static void main(String [] args) { 
        
        // 1. קליטת N (מספר האיברים)
        int N = Integer.parseInt(args[0]);

        // 2. משתנים לצבירה וניהול הטור
        double piSum = 0.0;     // סכום הטור, חייב להיות double
        int denominator = 1;    // מתחיל ב-1, יקפוץ ב-2
        int sign = 1;           // מתחיל ב- +1, יתהפך ל- -1, וכן הלאה

        // 3. לולאה שרצה בדיוק N פעמים
        for (int i = 0; i < N; i++){

            // חישוב האיבר הנוכחי: (הסימן * המונה / המכנה)
            // שימוש ב-1.0 מבטיח חלוקה עשרונית
            double term = sign * (1.0 / denominator);

            // הוספת האיבר לסכום הכללי
            piSum += term;
            
            // עדכון המשתנים לקראת האיטרציה הבאה
            denominator += 2; // קפיצה למכנה הבא (3, 5, 7, ...)
            sign *= -1;       // היפוך הסימן (+1 הופך ל-1, ו-1 הופך ל-+1)
        }

        // 4. הכפלת הסכום ב-4 כדי לקבל את הקירוב של PI
        double piApproximated = 4.0 * piSum;

        // 5. הדפסת הפלט בפורמט הנדרש
        System.out.println("pi according to Java: " + Math.PI);
        System.out.print("pi, approximated:     "); // שים לב שהערך מוצג בשורה נפרדת
        System.out.println(piApproximated);


    }
}