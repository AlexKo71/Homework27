
public interface IntegerList {

    public Integer add(Integer item);

    public Integer add(int index, Integer item);

    public Integer set(int index, Integer item);

    public Integer remove(Integer item);

    public Integer remove(int index);

    public boolean contains(Integer item);

    public int indexOf(Integer item);

   public int lastIndexOf(Integer item);

    public Integer get(int index);

    public boolean equals(IntegerList otherList);

    public int size();

    public boolean isEmpty();

    public void clear();

    // Создать новый массив
    // из строк в списке
    // и вернуть его.
    public Integer[] toArray();

}
