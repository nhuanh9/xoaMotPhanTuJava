package bttonghop;

import java.util.*;

public class Manager {
    public Map<Integer, Student> listStudent = new HashMap<Integer, Student>();

    public void add(int id, Student student) {
        listStudent.put(id, student);
    }

    public void display() {
        for (Map.Entry<Integer, Student> studentMap : listStudent.entrySet()) {
            System.out.println(studentMap);
        }
    }

    public Student delete(int id) {
        return listStudent.remove(id);
    }


    public boolean check(int id) {
        if (listStudent.containsKey(id)) {
            return true;
        }
        return false;
    }

    public Student searh(Integer id) {
        if (check(id)) {
            return listStudent.get(id);
        }
        return new Student();
    }

    public void sort() {
        List<Map.Entry<Integer, Student>> list = new LinkedList<>(listStudent.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Student>>() {
            @Override
            public int compare(Map.Entry<Integer, Student> o1, Map.Entry<Integer, Student> o2) {
                return o1.getValue().getAge() - o2.getValue().getAge();
            }
        });
        Map<Integer, Student> listStudent = new LinkedHashMap<>();
        for (Map.Entry<Integer, Student> entry : list) {
            listStudent.put(entry.getKey(), entry.getValue());
        }

        this.listStudent = listStudent;
    }
}







