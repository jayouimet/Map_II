package obj;

import java.util.ArrayList;

public class Route {
    private ArrayList<Section> sections = new ArrayList<Section>();

    public Section getSection(int index){ return sections.get(index); }
}
