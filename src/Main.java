/**
 * Created by zzzxxx on 07.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Collection col1 = new Collection();

        //добавление трех элементов 30.40.50
        col1.AddElement();
        for (int a : col1.arrayListInteger) {
            System.out.print(a + "; ");
        }
        System.out.print("  ");
        //почему??
        col1.AddElementIndex(0,38);
        for (int a : col1.arrayListInteger) {
            System.out.print(a + "; ");
        }

        System.out.print("  ");
      //удаляем єлемент по индексу
        col1.RemoveElement(2);
        for (int a : col1.arrayListInteger) {
            System.out.print(a + "; ");
        }
       // col1.ClearCollection();
        //for (int a : col1.arrayListInteger) {
            //System.out.print(a + "; ");
      //  }
        col1.Contains();
        if( col1.arrayListInteger.contains(28)){
            System.out.println("List contains number 28");

        }

        else {

            System.out.println("There is no number 28");
        }

      col1.SizeCollection();
        for (int a : col1.arrayListInteger) {
           System.out.print(a + "; ");
      }
      col1.toArray();
        for (int a : col1.arrayListInteger) {
            System.out.print(a + "; ");
        }
       System.out.println();
        col1.GetElement();
        System.out.println();
  col1.equals(40);
    }
}