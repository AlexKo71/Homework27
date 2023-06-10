
public interface StringList {

    public String add(String item);

    public String add(int index, String item);

    public String set(int index, String item);

    public String remove(String item);

    public String remove(int index);

    public boolean contains(String item);

    public int indexOf(String item);

   public int lastIndexOf(String item);

    public String get(int index);

    public boolean equals(StringList otherList);

    public int size();

    public boolean isEmpty();

    public void clear();

    // Создать новый массив
    // из строк в списке
    // и вернуть его.
    public String[] toArray();

}
