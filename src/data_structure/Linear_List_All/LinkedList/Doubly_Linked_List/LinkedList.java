package data_structure.Linear_List_All.LinkedList.Doubly_Linked_List;

public interface LinkedList {
    // 查询链接表当前的规模
    public int getSize();

    // 判断链表是否为空
    public boolean isEmpty();

    // 返回第一个结点
    public Node first() throws OutOfBoundaryException;

    // 返回最后一个结点
    public Node last() throws OutOfBoundaryException;

    // 返回p之前的结点
    public Node getPrevious(Node p) throws InvalidNodeException, OutOfBoundaryException;

    // 返回p之后的结点
    public Node getNext(Node p) throws InvalidNodeException, OutOfBoundaryException;

    // 将e作为第一个元素插入链接表，并返回e所在结点
    public Node insertFirst(Object e);

    // 将e最为最后一个元素插入链接表，并返回e所在结点
    public Node insertLast(Object e);

    // 将e插入至p之后的位置，并返回e的结点
    public Node insertAfter(Node p, Object e) throws InvalidNodeException;

    // 将e插入p之前的位置，并返回e的结点
    public Node insertBefore(Node p, Object e) throws InvalidNodeException;

    // 删除给定位置处的元素，并返回之
    public Object remove(Node p) throws InvalidNodeException;

    // 删除首元素，并返回之
    public Object removeFirst() throws OutOfBoundaryException;

    // 删除末元素，并返回之
    public Object removeLast() throws OutOfBoundaryException;

    // 将给定位置的元素替换为新元素，并返回被替换的元素
    public Object replace(Node p, Object e) throws InvalidNodeException;

    // 元素迭代器
    public Iterator elements();
}


