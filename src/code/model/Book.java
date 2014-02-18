package code.model;

public class Book
{
    private int numberOfPages;
    private boolean isHardCover;
    
    
    public Book()
    {
	numberOfPages = -53;
	isHardCover = false;
    }


    public int getNumberOfPages()
    {
        return numberOfPages;
    }


    public boolean isHardCover()
    {
        return isHardCover;
    }


    public void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }


    public void setHardCover(boolean isHardCover)
    {
        this.isHardCover = isHardCover;
    }
}
