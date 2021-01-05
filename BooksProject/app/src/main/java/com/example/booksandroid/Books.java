package com.example.booksandroid;


import java.util.Date;

public class Books {
    private String name;
    private int publicRating;
    private int ratingCount;
    private String maturityRating;

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public String getMaturityRating() {
        return maturityRating;
    }

    public void setMaturityRating(String maturityRating) {
        this.maturityRating = maturityRating;
    }

    private int myRating;
    private int pages;
    private Author author;
    private Date dateCompleted;
    private Date lastRead;

    public Books() {
    }

    public Books(String name, int publicRating, int ratingCount, String maturityRating, int myRating, int pages, Author author, Date dateCompleted, Date lastRead) {
        this.name = name;
        this.publicRating = publicRating;
        this.ratingCount = ratingCount;
        this.maturityRating = maturityRating;
        this.myRating = myRating;
        this.pages = pages;
        this.author = author;
        this.dateCompleted = dateCompleted;
        this.lastRead = lastRead;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", publicRating=" + publicRating +
                ", ratingCount=" + ratingCount +
                ", maturityRating='" + maturityRating + '\'' +
                ", myRating=" + myRating +
                ", pages=" + pages +
                ", author=" + author +
                ", dateCompleted=" + dateCompleted +
                ", lastRead=" + lastRead +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicRating() {
        return publicRating;
    }

    public void setPublicRating(int publicRating) {
        this.publicRating = publicRating;
    }

    public int getMyRating() {
        return myRating;
    }

    public void setMyRating(int myRating) {
        this.myRating = myRating;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public Date getLastRead() {
        return lastRead;
    }

    public void setLastRead(Date lastRead) {
        this.lastRead = lastRead;
    }
}
