public class Hero {
    String name;
    float hp;
    float armor;
    int movespead;
    void keng(){
        System.out.println("坑队友");
    }
    public static void main(String[] args){
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.movespead = 350;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.movespead = 330;
    }
}
