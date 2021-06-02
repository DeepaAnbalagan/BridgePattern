package bridgepattern;

class Movie {
    String classification;
    String title;
    String duration;
    String year;

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public String getClassification() {
        return classification;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public String getYear() {
        return year;
    }
}
