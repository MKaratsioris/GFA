public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it in more than one way using different String functions!

        // adding the missing ":"

        if (url.indexOf("//") != 6) {
            String http = url.substring(0,5);
            String www = url.substring(5,url.length());
            url = http.concat(":").concat(www);
        }

        // ---------- METHOD #1 -----------
        // substituting "bots" with "odds"
        int index = url.indexOf('b');
        String url1 = url.substring(0,index).concat("odds");
        System.out.println("Mathod #1 : " + url);

        // ---------- METHOD #2 -----------
        String url2 = url.substring(0,(url.length()-"bots".length())).concat("odds");
        System.out.println("Mathod #2 : " + url);

        boolean equal = url1.equals(url2);
        System.out.println("Method #1 and Method #2 results are equal : " + equal);




//        System.out.println(url);
    }
}
