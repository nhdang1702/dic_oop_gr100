import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        ArrayList<Word> myDic = new ArrayList<Word>();

        DictionaryManagement manage = new DictionaryManagement();
        DictionaryCommandLine command = new DictionaryCommandLine();
        command.dictionaryAdvanced();



        }
}
/**

        System.out.println("=============== TỪ ĐIỂN ANH VIỆT ==============");
        System.out.println(" 1. Them tu moi");
        System.out.println(" 2. In ra tat ca cac tu");
        System.out.println(" 3. Them tu moi tu file");
        System.out.println(" 4. Tra tu");
        System.out.println(" 5. Xoa tu");

        boolean check = true;
        int option = -1;
        while(check);
        switch (option) {
            case 1: {
                manage.insertFromCommandline();
                break;
            }
            case 2: {
                command.showAllWords();
            }
            case 3: {
                manage.insertFromFile();
            }
            case 4: {
                manage.dictionaryLookup();
            }


        }
    }*/

