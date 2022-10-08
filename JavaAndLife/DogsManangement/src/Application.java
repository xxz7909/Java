import com.ycptu.bean.Human;
import com.ycptu.bean.Pet;

public class Application {
    public static void main(String[] args) {
        new Human() {
            @Override
            public void eat() {
                System.out.println("中国人吃中国菜");
            }

            @Override
            public void sleep() {

            }
        }.eat();

        System.out.println(Pet.getCommunity());
        Pet pet = new Pet() {
            @Override
            public Pet Barking() {
                System.out.println("abaaba");
                return null;
            }
        }.Barking();

        System.out.println(Object.class);
    }
}


