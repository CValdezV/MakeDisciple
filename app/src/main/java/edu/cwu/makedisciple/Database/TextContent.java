package edu.cwu.makedisciple.Database;

public class TextContent {

    private static int id;
    private static String title;
    private static String section;
    private static String content;


    public TextContent(){

    }

    public int getId(){
        return id;
    }
    public void  setId(int id){
        this.id = id;
    }
    public String getTitle(){
        return  title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getSection(){
        return section;
    }
    public void setSection(String section){
        this.section = section;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }



}
