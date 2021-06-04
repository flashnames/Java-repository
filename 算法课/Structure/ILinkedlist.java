package Structure;

public interface ILinkedlist<T> {
    public void Initial(T var);
    public void Delete(int index);
    public void Insert(T var);
    public void InsertMiddle(int index,T var);
    public void InsertHead(T var);
    public void Reverse(Linkedlist<T> list);
    public void Show(Linkedlist<T> list);
}
