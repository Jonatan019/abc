package tool;

import tool.Tool;
import java.util.ArrayList;
import java.util.List;


public class Worker {
    public static void main(String[] args) {
        Tool mlotek = new Tool("mlotek");
        mlotek.useTool();

    List<Tool> narzedia = new ArrayList<>();
        narzedia.add(mlotek);
        narzedia.add(new Tool("wiertara"));
        narzedia.add(new Tool("srubokret"));
        narzedia.add(new Tool("klucz"));

        for(Tool t: narzedia){
            t.useTool();
        }
    }
}
