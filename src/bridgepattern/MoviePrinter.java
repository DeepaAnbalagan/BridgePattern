package bridgepattern;

import java.util.ArrayList;
import java.util.List;

class MoviePrinter extends Printer {
    Movie mov;
    public MoviePrinter(Movie movie){
        this.mov = movie;
    }
    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add(new Detail("Title", mov.getTitle()));
        details.add(new Detail("Duration", mov.getDuration()));
        details.add(new Detail("Year", mov.getYear()));
        return details;
    }

    @Override
    protected String getHeader() {
        return mov.getClassification();
    }
}
