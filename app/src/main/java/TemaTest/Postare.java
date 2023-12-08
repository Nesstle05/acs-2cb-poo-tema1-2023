package TemaTest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Postare implements Comparable<Postare>{
    private String text; //textul postarii
    private String username; //username-ul persoanei care a facut postarea
    private  int id = 0; //id-ul postarii
    public static int count = 0; //numar postari

    private int nrLikeuri = 0; //numarul de like-iri ale postarii
    private int nrComments = 0; //numarul de comentarii ale postarii
    private Date datePostare; // data la care a fost facuta postarea
    public Postare() {} //constructorul fara parametrii
    public Postare(String text, String username) {
        //constructorul cu un parametrii
        this.text = text;
        this.username = username;
        datePostare = new Date();
        count++;
        this.id = count;
    }
    public String getText() {
        //metoda de tip getter care returneaza text-ul postarii
        return this.text;
    }
    public String getUsername() {
        //metoda de tip getter pentru a obtine numele utilizatorului care a facut postarea
        return this.username;
    }

    public Date getDate() {
        //metoda de tip getter care returneaza data la care a fost facuta postarea
       return this.datePostare;
    }

    public int getId() {
        //metoda de tip getter care returneaza id-ul postarii
        return id;
    }
    public static void resetId() {
        //aceasta metoda reseteaza count-ul postarilor pe 0
        //este folosita atunci cand se face clean up la datele aplicatiei
        count = 0;
    }
    public void like() {
        //incrementeaza numarul de like-uri ale postarii
        this.nrLikeuri++;
    }
    public int getNrLikeuri() {
        //metoda de tip getter care returneaza numarul de like-uri ale postarii
        return this.nrLikeuri;
    }
    public void unlike() {
        //decrementeaza numarul de like-uri
        //este folosita atunci cand un utilizator isi retrage numarul de like-uri
        this.nrLikeuri--;
    }
    public void cresteNrCom() {
        //metoda care incrementeaza numarul de comentarii la o postare
        this.nrComments++;
    }
    public void scadeNrCom() {
        //metoda care scade numarul de comentarii la o postare
        //folosita atunci cand un utilizator isi sterge comentariul
        if(this.nrComments > 0) {
            this.nrComments--;
        }
    }
    public int getNrComentarii() {
        //metoda de tip getter care returneaza numarul de comentarii ale unei postari
        return this.nrComments;
    }

    @Override
    public int compareTo(Postare o) {
        //am suprascris metoda compareTo din interfata Comparable pentru a putea sorta lista de postari in functie de
        //numarul de like-uri
        //sortarea se va face in ordinea descrescatoare a numarului de like-uri ale postarilor
        if(this.nrLikeuri > o.nrLikeuri) {
            return -1;
        } else if(this.nrLikeuri == o.nrLikeuri) {
            return 0;
        }
        return 1;
    }
}
