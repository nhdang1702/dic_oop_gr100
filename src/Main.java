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


