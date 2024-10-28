import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      /*Animal деген класс тузунуз жана бир метод кошунуз.
        Анын 3 наследнигин тузунуз.
        Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
        Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин кошунуз.
                instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
        чыгарыныз.
                Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды болуп оз озунун массивине салыныз.

                Создайте класс Animal с одним методом которые есть 3 наследника такие как
        Shark, с методом attack(), Turtle с методом swim(), Eagle с методом fly().
                Создайте массив используя Animal и положите туда всех наследников.
        Используя instanceOf и getClass() вызовите свои методы животных из массива Animal.
                Для каждого объекта по отдельности создайте массив и разделите животных из Animal massiva и положите в свои массивы.*/

      Eagle eagle = new Eagle();
      Shark shark =new Shark();
      Turtle turtle = new Turtle();

      Animal [] animals = {eagle,shark,turtle};

      for (Animal animal:animals){
          if (animal instanceof Shark){
              ((Shark) animal).attack();
          } if (animal instanceof  Eagle){
              ((Eagle) animal).fly();
          }if (animal instanceof Turtle){
              ((Turtle) animal).swim();
          }
      }
      Eagle [] eagles = new Eagle[animals.length];
      Shark [] sharks = new  Shark[animals.length];
      Turtle [] turtles= new Turtle[animals.length];

      int eagleCount = 0, sharkCount=0, turtleCount = 0;

      for (Animal animal:animals){
          if (animal instanceof Shark){
              sharks[sharkCount++]= (Shark) animal;
          } else if (animal instanceof Turtle){
              turtles[turtleCount++]= (Turtle) animal;
          }else if (animal instanceof Eagle){
              eagles[eagleCount++]=(Eagle) animal;
          }else {
              System.out.println("Error");
          }
      }
        System.out.println(turtleCount);
        System.out.println(sharkCount);
        System.out.println(eagleCount);



    }
}