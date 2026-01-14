
    import java.util.*;

public class ATSResumeScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== ATS Resume Keyword Scanner ===");

        System.out.println("\nEnter Resume Text:");
        String resume = sc.nextLine().toLowerCase();

        System.out.println("\nEnter Job Keywords (comma separated):");
        String keywordInput = sc.nextLine().toLowerCase();

        String[] keywords = keywordInput.split(",");
        int matchCount = 0;

        System.out.println("\nMatched Keywords:");

        for (String key : keywords) {
            key = key.trim();
            if (resume.contains(key)) {
                matchCount++;
                System.out.println("- " + key);
            }
        }

        int totalKeywords = keywords.length;
        int score = (matchCount * 100) / totalKeywords;

        System.out.println("\nTotal Keywords: " + totalKeywords);
        System.out.println("Matched Keywords: " + matchCount);
        System.out.println("ATS Score: " + score + "%");

        sc.close();
    }
}


