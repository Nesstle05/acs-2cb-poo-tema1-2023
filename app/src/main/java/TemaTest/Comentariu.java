package TemaTest;
import java.util.*;

public class Comentariu{
    private String text; //textul comentariului
    private int idComment = 0; //id-ul comentariului
    private String username; //username-ul persoanei care a facut comentariul
    private int nrLikeuriCom = 0; //numarul de likeuri al comentariului
    private static int count  = 0; //variabila de tip static in care este retinut numarul total al comentariilor
    private int idPostare; //id-ul postarii la care a fost facut comentariul
    Date dateComentariu; //data la care a fost facut comentariul
    public Comentariu() {} //constructorul fara parametrii
    public Comentariu(int idPostare, String text, String username) {
        //constructorul cu parametrii
        this.text = text;
        this.idPostare = idPostare;
        this.username = username;
        this.dateComentariu = new Date();
        count++; //incrementam id-ul la fiecare instantiere a obiectului
        this.idComment = count;
    }
    public String getUsername() {
        //metoda de tip getter pentru a obtine numele utilizatorului care a facut comentariul
        return this.username;
    }
    public int getIdCom() {
        //metoda de tip getter ptr a obtine id-ul unui comentariu
        return idComment;
    }
    public static void resetIdComent() {
        //resetam numarul comentariilor pe 0
        //folosim aceasta metoda atunci cand facem clean up la date
        count = 0;
    }
    public void like() {
        //metoda like() face ca numarul de like-uri al comentariului sa creasca
        nrLikeuriCom++;
    }
    public int getIdPostare() {
        //metoda de tip getter care returneaza id-ul postarii la care a fost facut comentariul
        return this.idPostare;
    }
    public int getNrLikeuriComent() {
        //metoda de tip getter ptr a obtine id-ul unui
        return this.nrLikeuriCom;
    }
    public Date getDataComentariu() {
        //metoda de tip getter pentru a returna data la care a fost facut comentariul
        return this.dateComentariu;
    }
    public String getText() {
        //metoda de tip getter pentru a returna textul comentariului
        return this.text;
    }
    public void unlike() {
        //metoda like() face ca numarul de like-uri al comentariului sa scada
        nrLikeuriCom--;
    }
}
