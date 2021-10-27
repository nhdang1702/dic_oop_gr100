import java.util.ArrayList;

public class Dictionary {
    public static ArrayList<Word> list = new ArrayList<Word>();

    public ArrayList<Word> getList() {
        return list;
    }

    public void setList(ArrayList<Word> list) {
        Dictionary.list = list;
    }
}
