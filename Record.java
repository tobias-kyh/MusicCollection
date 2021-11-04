public class Record {
    protected String format;
    protected String year;

    public Record(String inFormat, String inYear) {
        format = inFormat;
        year = inYear;
    }

    public String getFormat() {return format;}
    public String getYear() {return year;}

    public void setFormat(String inFormat) {format = inFormat;}
    public void setYear(String inYear) {year = inYear;}
}
