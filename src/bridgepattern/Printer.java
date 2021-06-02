package bridgepattern;

import java.util.List;

abstract class Printer {
    public String print(Formatter formatter){
        return formatter.format(getHeader(), getDetails());
    }
    abstract protected List<Detail> getDetails();
    abstract protected String getHeader();
}
