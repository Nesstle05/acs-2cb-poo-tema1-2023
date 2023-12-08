


    Aplicația App este un prototip al unei aplicații de socializare. Pentru implementarea acesteia am creat clasele
Utilizator, Comentariu și Postare, fiecare cu atribute (cu modificatori de acces public și private) și metode specifice.
Pentru a stoca informația pentru creare utilizatori, postări și comentarii, am creat trei Array List-uri în care reținem
instanțele fiecărei clase.
    Modificările în aplicație se realizează pe baza unor comenzi primite sub forma de Stringuri. Întrucât fiecare
comandă pentru o acțiune vine sub formă de String formatat am creat metode care extrag informațiile esențiale din acest
String. Numele tuturor aceste metode  incep cu “extrage”. Pe viitor, acest lucru poate fi îmbunătățit prin crearea unei
singure metode care primește un String și indiferent de format extrage datele esențiale.
    De asemenea, în clasa App avem și metode care caută în listele de utilizatori, comentarii sau postări, obiecte care
au un anumit username sau id, și în cazul în care acestea sunt găsite sunt returnate de metode. Aceste metode încep mereu
cu “găsește.
    Am creat și două metode de tip Boolean care indică dacă o postare/ comentariu au fost deja apreciate de către un user
primit drept parametru. În aceste metode parcurgem lista postărilor/ comentariilor apreciate de utilizator
(atribut specific clasei Utilizator) și dacă găsim postarea/ comentariul dat drept parametru returnăm true, atlfel
returnăm false.

Folosind aceste metode, în aplicație putem să facem mai multe operații:
-clean up total (șterge toate datele din aplicație)

-creare utilizator( se creează obiectul și se adaugă la lista de utilizatori)

-creare postare( se creează obiectul și se adaugă la lista de postări)

-ștergere postare ( se elimină obiectul din lista de postări)

-follow utilizator ( se adaugă la lista de following al utilizatorului curent, crește numărul de followers al
utilizatorului urmărit)

-unfollow utilizator (se elimină utilizatorul din lista de following a utilizatorului curent, scade numărul de followers
al urmăritorului unfolllowed)

-like la postare (postarea este adaugată în lista de postări apreciate de utilizator, crește numărul de like-uri al
postării, crește numărul de like-uri totale ale postărilor făcute de utilizator)

-unlike la postare(postarea este eliminată din lista de postări apreciate de utilizator, scade numărul de like-uri al
postării, scade numărul de like-uri totale ale postărilor făcute de utilizator)

-comentariu la postare (comentariul este adăugat la lista de comentarii, crește numărul de comentarii la postarea
respectivă)

-ștergere comentariu (comentariul este eliminat din lista de comentarii, scade numărul de comentarii la postarea
respectivă)

-like comentariu (crește numărul de like-uri la comentariu, este adăugat în lista de comentarii apreciate de către
utilizator, crește numărul total de like-uri la comentariile utilizatorului)

-unlike comentariu (scade numărul de like-uri la comentariu, este eliminat din lista de comentarii apreciate de către
utilizator, scade numărul total de like-uri la comentariile utilizatorului)

-afișează postarile utilizatorilor urmăriți de utilizatorul curent (parcurgem lista de postări și daca creatorul
postării se află în lista de persoane urmărite de utilizatorul curent, afișăm datele postării)

-afișează persoanele urmărite de utilizatorul curent (parcurgem lista de persoane urmărite de utilizatorul curent și
afisăm datele fiecărui user)

-afișează urmăritorii utilizatorului curent( parcurgem lista de utilizatori și daca utilizatorul curent se află în lista
de utilizatori urmăriți a persoanelor din listă, atunci afișăm datele persoanei)

-afișează postările utilizatorului ( parcurgem lista de postări, și dacă creatorul postării este utilizatorul curent,
afișăm datele postării)

-top 5 cei mai urmăriți utilizatori (sortăm lista de utilizatori în ordine descrescătoare după numărul de urmăritori
și afișăm datele primilor 5 utilizatori)

-top 5 cele mai apreciate postări (sortăm o copie a listei de postări în ordine descrescătoare după numărul de aprecieri
și afișăm datele primelor 5 postări)

-top 5 postări cu cele mai multe comentarii (sortăm o copie a listei de postări în ordine descrescătoare după numărul de
comentarii și afișăm datele primelor 5 postări)

-top 5 cei mai apreciați utilizatori(sortăm lista de utilizatori în ordine descrescătoare după suma numărului total de
like-uri la postările și comentariile utilizatorului și afișăm datele primilor 5 utilizatori)

-afișează detaliile postărilor (parcurgem toate postările și afișăm detaliile acestora, inclusiv toate comentariile de
la fiecare postare, cu detaliile aferente)

BONUS
Ce alte cazuri limită ați mai trata în această aplicație?
    1.	Un utilizator vrea să creeze un cont cu un username utilizat deja, dar cu parolă diferită. În acest caz
        aplicația va da mesajul de eroare: ‘User already exists’, ceea ce nu este adevărat, deoarece nu avem un user cu
        aceeași parolă. Pentru a remedia acest caz limită, căutarea utilizatorilor în sistem ar trebui făcută atât după
        username, cât și după parolă. Atunci când găsim username-ul în sistem, dar nu și parola vom afișa mesajul de
         eroare : ‘Username already used’.

    2.	Aplicația nu ar trebui să permită ca un utilizator să își dea follow / unfollow singur. Pentru rezolva acest caz
        limită, punem condiția că dacă utilizatorul de urmărit este același cu utilizatorul curent, se va afișa un mesaj
        de eroare.

    3.	Un utilizaror nu poate comenta la o postare a unui utilizator pe care nu îl urmărește sau nu este el însuși.
        Putem acoperi acest edge case prin a verfica dacă creatorul postării este utilizatorul curent sau se află în
        lista de persoane urmărite de utilizatorul curent. Daca raspunsul căutării este afirmativ, atunci vom genera un
        mesaj de eroare ‘You are unable to comment to this post’.

Cum ati refactoriza răspunsurile și comenzile din aplicație?
    1. Utilizatorul se va loga o singură dată în aplicație, astfel nu va mai trebui să își scrie username-ul și parola
       de fiecare dată când vrea să realizeze anumite acțiuni
    2. Utilizatorul se va putea deloga din aplicație fără a trebui să își șteargă contul.
    3. Aplicația va putea să recunoască atunci când un utilizator introduce limbaj licențios în textul comentariilor
       sau al postărilor
    4. Răspunsurile la comenzi le-aș formata într-un mod mai plăcut privirii. Spre exemplu atunci când afișăm lista de
       postări ale unui utilizator le-aș afișa una sub alta, fără acoladele și parantezele pătrate prin răspunsul inițial
    5. Pentru a scurta numărul liniilor de cod aș crea o singură metodă care să extragă datele esențiale din input-ul dat
       sub forma de String. (username, parola, id etc), aceasta metodă transformând cuvintele extrase în tipul de date
       specific( de exemplu id-ul in int)




