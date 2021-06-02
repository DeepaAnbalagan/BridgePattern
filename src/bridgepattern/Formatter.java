package bridgepattern;

import java.util.List;

interface Formatter {
    String format(String header, List<Detail> details);
}
