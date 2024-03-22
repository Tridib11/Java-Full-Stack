package Comparable_api;

public class Songs {
    private String title;
    private String artist;
    private Integer year;

    public Songs(String title, String artist, Integer year) {
        this.title=title;
        this.artist=artist;
        this.year=year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
