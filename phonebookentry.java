public class phonebookentry {
    private String name;
    private String number;

    //contrsuctor 
    public phonebookentry(String inName, String inNumber){
    name =inName;
    number=inNumber;
    }
    //getter
    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }
    //setter
    public setNumber( String inNumber){
        number = inNumber;
    }
    //overiding to get a leggable output using tosring method
    public String toString(){
        String s= name + "\t(" + number + ")";
        return s;
    } 
}
