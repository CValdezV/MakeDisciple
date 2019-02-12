package edu.cwu.makedisciple.Database;

public class TextContent {
    public static final String TABLE_NAME ="bookContent";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_TEXT ="content";
    public static final String COLUMN_TITLE="title";
    public static final String COLUMN_SECT ="section";

    private int id;
    private String text;
    private String title;
    private String section;

public TextContent(){

}

public TextContent(int id,String text, String title, String section){
    this.id = id;
    this.text = text;
    this.title = title;
    this.section = section;
}
public int getId(){
    return id;
}

public void setId(int id){
    this.id = id;
}
public String getText(){
    return text;
}
public void setText(String text){
    this.text = text;
}
public String getTitle(){
        return title;
    }

public String getSection(){
        return section;
    }



}


