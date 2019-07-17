package content;

public class Games {
    private String title, series, platform, developer, publisher;
    private int publishingDate, partInSeries;
    private boolean mainSpinoff;

    Games(String title, String series, String platform, int publishingDate,
          boolean mainSpinoff, int partInSeries, String developer,
          String publisher){
        this(title, series, platform, publishingDate, developer, publisher);
        this.partInSeries = partInSeries;
        this.mainSpinoff = mainSpinoff;
    }
    Games(String title, String series, String platform, int publishingDate,
          String developer, String publisher){
        this.title = title;
        this.series = series;
        this.platform = platform;
        this.publishingDate = publishingDate;
        this.developer = developer;
        this.publisher = publisher;
    }
    Games(){
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getSeries(){
        return series;
    }
    public void setSeries(String series) {
        this.series = series;
    }

    public String getPlatform(){
        return platform;
    }
    public void setPlatform(String platform){
        this.platform = platform;
    }

    public int getPublishingDate(){
        return publishingDate;
    }
    public void setPublishingDate(int publishingDate){
        this.publishingDate = publishingDate;
    }

    public boolean isMainSpinoff(){
        return mainSpinoff;
    }
    public void setMainSpinoff(boolean mainSpinoff){
        this.mainSpinoff = mainSpinoff;
    }

    public int getPartInSeries(){
        return partInSeries;
    }
    public void setPartInSeries(int partInSeries){
        this.partInSeries = partInSeries;
    }

    public String getDeveloper(){
        return developer;
    }
    public  void setDeveloper(String developer){
        this.developer = developer;
    }

    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
}
