package com.example.cw6;

public class Movie {

    private String title;
   private String moinActe;
   private Double movieRote;
   private int pgRote;
   private String genre;

    public Movie(String title, String moinActe, Double movieRote, int pgRote, String genre) {
        this.title = title;
        this.moinActe = moinActe;
        this.movieRote = movieRote;
        this.pgRote = pgRote;
        this.genre = genre;
    }

    public Movie(String harry_potter, String daniel_radcliffe, int i, int i1, int i2, String my) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMoinActe() {
        return moinActe;
    }

    public void setMoinActe(String moinActe) {
        this.moinActe = moinActe;
    }

    public Double getMovieRote() {
        return movieRote;
    }

    public void setMovieRote(Double movieRote) {
        this.movieRote = movieRote;
    }

    public int getPgRote() {
        return pgRote;
    }

    public void setPgRote(int pgRote) {
        this.pgRote = pgRote;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
