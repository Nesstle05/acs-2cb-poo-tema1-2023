package TemaTest;
import java.util.*;

public class Utilizator implements Comparable<Utilizator>{

    private String username; //care se va da in formatul "-u 'nume utilizator'"
    private String parola; // care se va da in formatul "-p 'parola'"
    private int nrFollowers = 0; // numarul de followers ai unui utilizator
    public ArrayList<Utilizator> utilizatoriUrmariti; // lista utiizatoritorul urmariti de un user
    public ArrayList<Postare> postariApreciate; //lista postarilor apreciate de catre un utilizator
    public ArrayList<Comentariu> comentariiApreciate; //lista comentariilor apreciate de catre un utilizator
    public ArrayList<Postare> postariFacute; //lista postarilor facute de catre un utilizator
    private int nrLikeuriPost = 0; //nr de like-uri stranse la postarile unui utilizator
    private int nrLikeuriCom = 0; //nr de like-uri stranse la comentariile unui utilizator

    public Utilizator() {}
    public Utilizator(String username, String parola) {
        //cream un constructor cu parametrii pentru utilizator
        this.username = username;
        this.parola = parola;
        this.utilizatoriUrmariti = new ArrayList<Utilizator>();
        this.postariApreciate = new ArrayList<Postare>();
        this.comentariiApreciate = new ArrayList<Comentariu>();
        this.postariFacute = new ArrayList<Postare>();
    }
    public String getUsername() {
        /*metoda de tip getter pentru a obtine username-ul unui utilizator*/
        return this.username;
    }
    public String getParola() {
        /*metoda de tip getter pentru a obtine parola unui utilizator*/
        return this.parola;
    }
    public int getNrLikeuriPost() {
        //metoda de tip getter care returneaza numarul total de like-uri la postarile facute de un utilizator
        return this.nrLikeuriPost;
    }
    public int getNrLikeuriCom() {
        //metoda de tip getter care returneaza numarul total de like-uri la comentariile facute de un utilizator
        return this.nrLikeuriCom;
    }
    public void cresteNrLikePost() {
        //incrementeaza numarul de like-uri postarile facuta de utilizator
        this.nrLikeuriPost++;
    }
    public void scadeNrLikePost() {
        //decrementeaza numarul de like-uri la postarile facuta de utilizator
        if(this.nrLikeuriPost > 0) {
            this.nrLikeuriPost--;
        }
    }
    public void cresteNrLikeCom() {
        //incrementeaza numarul de like-uri la comentariile  facuta de utilizator
        this.nrLikeuriCom++;
    }
    public void scadeNrLikeCom() {
        ////decrementeaza numarul de like-uri la comentariile facuta de utilizator
        if(this.nrLikeuriCom > 0) {
            this.nrLikeuriCom--;
        }
    }
    public int getNrFollowers() {
        /* metoda de tip getter care returneaza numarul de followeri ai unui utilizator
         */
        return this.nrFollowers;
    }
    public void follow(Utilizator u) {
        //aceasta metoda adauga un utilizator la lista de persoane urmarite de catre un utilizator
        utilizatoriUrmariti.add(u);
    }

    public void unfollow(Utilizator u) {
        //aceasta metoda scoate un utilizator din lista de persoane urmarite de catre utilizatorul curent
        utilizatoriUrmariti.remove(u);
    }
    public void cresteFollowers() {
        //metoda care incrementeaza numarul de followeri
        this.nrFollowers++;
    }
    public void scadeFollowers() {
        //metoda care decrementeaza numarul de followeri
        if(this.nrFollowers > 0) {
            this.nrFollowers--;
        }
    }
    public boolean cautaUrmaritor(Utilizator u) {
        //aceasta metoda caita daca utilizatorul u apare in lista de persoane urmarite de utilizatorul curent
        //in caz afirmativ, metoda va returna true, altfel false
        for(Utilizator util : utilizatoriUrmariti) {
            if(u.getUsername().equals(util.getUsername()) && u.getParola().equals(util.getParola())) {
                return true;
            }
        }
        return false;
    }


    @Override
    public int compareTo(Utilizator o) {
        //am suprascris metoda compareTo din clasa Comparable
        // pentru a putea sorta lista de utilizatori in ordine descrescatoare dupa numarul de followers
        if(this.nrFollowers > o.nrFollowers) {
            return -1;
        } else if(this.nrFollowers == o.nrFollowers) {
            return 0;
        }
        return 1;
    }
}
