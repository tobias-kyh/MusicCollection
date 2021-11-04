public class CD extends Record {
    private String title;


    public CD(String inTitle, String inFormat, String inYear) {
        super(inFormat, inYear);

        title = inTitle;
    }

    public String getTitle() {return title;}

    public void setTitle(String inTitle) {title = inTitle;}
}
