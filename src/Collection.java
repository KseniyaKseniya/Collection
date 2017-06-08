import java.util.ArrayList;

/**
 * Created by zzzxxx on 07.06.2017.
 */
class Collection extends Interface {
    ArrayList<Integer>arrayListInteger=new ArrayList<Integer>();

    @Override
    void AddElement() {
        arrayListInteger.add(30);
        arrayListInteger.add(40);
        arrayListInteger.add(50);

    }

    @Override
    void RemoveElement(int index) {
        arrayListInteger.remove(2);
    }

    @Override
    void ClearCollection() {
        arrayListInteger.clear();
    }


    void SizeCollection() {
        arrayListInteger.size();
    }

    @Override
    void Contains() {
        if( arrayListInteger.contains(28)){
            System.out.println("List contains number 28");

        }

        else {

            System.out.println("There is no number 28");
        }
    }

    @Override
    void toArray() {
        Integer[]arrayList={};
        arrayList=arrayListInteger.toArray(new Integer[arrayListInteger.size()]);
        System.out.println(arrayListInteger.toArray(new Integer[arrayListInteger.size()]));
    }

    @Override
    void GetElement() {
        arrayListInteger.get(0);
    }

    @Override
    void LastIndexOf() {
        arrayListInteger.lastIndexOf(2);
    }

    @Override
    void FirstIndexOf() {
        arrayListInteger.get(1);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    void AddElementIndex(int index, int element) {
        arrayListInteger.add(0,38);

    }
}


