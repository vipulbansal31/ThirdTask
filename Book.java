
public class Book {
    private int id;
    private String name;
    private String author;
    public boolean issue;
    
    public Book(int id , String name , String author){
        this.id=id;
        this.name=name;
        this.author=author;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public void bookIssue(){
        issue=true;
    }
    
    public void bookReturn(){
        issue=false;
    }
    
    public String toString(){
        return ("Id ="+id+"\nName ="+name+"\nAuthor ="+author+(issue ? "\nAlready Issue":"\nNot Issue"));
    }
    
}
