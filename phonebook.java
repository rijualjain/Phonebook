public class phonebook {
    private phonebookentry[] entries;
    private int size;
    final private static int MAX_ENTRIES = 10;
    
    public phonebook() {
        entries = new phonebookentry[MAX_ENTRIES];
    }
    
    public void add(String name, String number) {
        System.out.println("Size: " + size);
        if (size != MAX_ENTRIES) {
            entries[size] = new phonebookentry(name, number);
            size++;
            System.out.println("Added: " + name);
            System.out.println("Size: " + size);
        }
    }
    
    public String toString() {
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < size; i++) {
            temp.append(entries[i].toString() + "\n");
        }
        return temp.toString();
    }
 }
 