package maximaDz;

public class maximaDzMetod {
   static class Cat{
        String name;

       public Cat(String name) {
           this.name = name;
       }

       public void nameCat(){
           System.out.println("Имя кота: " + name );
       }
   }

    public static String passyByString(String string){
        string = "Всем пока";
        return string;
    }

    public static void passyByCat(Cat cat){
        cat.name = "Рыжик";
        System.out.println("Новое имя кота");


    }


    public static void main(String[] args) {
        String str = "Всем привет";
        System.out.println("Начальный текст: " + str );
        str = passyByString(str);
        System.out.println("Измененый текст: " + str);
        System.out.println();
        Cat cat = new Cat("Барсик");
        cat.nameCat();
        passyByCat(cat);
        cat.nameCat();
    }
}
