package demoQuanLy;

public interface QuanLy<T> {
    void add(T t);
    void edit(T t);
    void delete(T t);
    T[] getAll();
}
