public class Test{
  String name;

  public static void main(String[] args){
    Test test = new Test();

    System.out.println(test.name + " was here!");

    test.name = "Erdal";
    System.out.println(test.name + " was here!");
  }
}
