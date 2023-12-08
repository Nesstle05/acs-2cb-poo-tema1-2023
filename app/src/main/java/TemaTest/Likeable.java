package TemaTest;

public interface Likeable {
    //interfata Likeable contine cele doua metode specifice claselor Postare si Comentariu
    default void like() {};
    default void unlike() {};
}
