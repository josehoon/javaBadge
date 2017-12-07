import java.util.ArrayList;

public class VirtualMethod {

    interface Language {
         public String welcome();
    }

    public static class English implements Language {
        public String welcome() {
            return "Welcome from English!";
        }
    }

    public static class Korean implements Language {
        public String welcome() {
            return "안녕하세요 in Korean!";
        }
    }

    public static class German implements Language {
        public String welcome() {
            return "Wilcommen in German!";

        }
    }

    public static void main(String args[]) {
        ArrayList<Language> languages = new ArrayList<Language>();
        languages.add(new English());
        languages.add(new Korean());
        languages.add(new German());

        for(Language temp: languages) {
            System.out.println(temp.welcome());
        }

        Language myKorean = new Korean();
        System.out.println(myKorean.welcome());
    }

}
