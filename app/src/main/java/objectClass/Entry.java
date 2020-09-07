package objectClass;

public class Entry {
    private final String entryName;
    private final int entryPrice;
    private final String entryDate;

    public Entry(String entryName, int entryPrice, String entryDate)
    {
        this.entryName = entryName;
        this.entryPrice = entryPrice;
        this.entryDate = entryDate;
    }

    public String getEntryName()
    {
        return entryName;
    }

    public int getEntryPrice()
    {
        return entryPrice;
    }

    public String getEntryDate()
    {
        return entryDate;
    }

}
