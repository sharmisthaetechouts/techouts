package CJ5.Garbage_Collector;

public class GarbageCollectorDemo {
    String name;
    public void finalize() {
        System.out.println("Garbage Collector called");
    }

    public static void main(String[] args) {

        GarbageCollectorDemo obj1 = new GarbageCollectorDemo();
        GarbageCollectorDemo obj2 = new GarbageCollectorDemo();
        obj1.name="Sharmistha";
        obj2 = null;//The second object now has no reference, so it becomes eligible for Garbage Collection.

        System.gc(); // Request JVM to run Garbage Collector and it Call the finalize() method before removing it
    }
}
