package tut2;

public class Movie {

    private String title;
    private String category;
    private int numberOfAwards;
    public Director director;

    public Movie(String title,String category,Director director) {
        this.title=title;
        this.category=category;
        this.director=director;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }


    public Director getDirector() {
        return director;
    }

    public void setNumberOfAwards(int numberOfAwards) {
        this.numberOfAwards = numberOfAwards;
    }

    public int getNumberOfAwards() {
        return numberOfAwards;
    }
    @Override
    public String toString()
    {
        return "Movie[title = "+this.title+"category = "+this.category+" director name = "+this.director.getName() +"director surname =" +
                this.director.getSurName()+" number of awards = "+this.getNumberOfAwards()+" ]";
    }



}
