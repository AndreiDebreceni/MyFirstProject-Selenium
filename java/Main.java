public class Main {
    public static void main(String[] args) {




        LoginTest lt = new LoginTest();
        //lt.loginWithValidCredentials();
//6.Adăugati un test(o noua metoda) prin care să deschideți homepage-ul site-ului, apoi să navigați la categoria "Sale",
// apoi să deschideți pagina de detalii a primului produs și să încercați să îl adăugați în WishList,
// apăsând butonul Add to Wishlist. Pe viitor, după ce veți învăța să faceți și verificări,
// veți putea reveni pentru a vă asigura că adăugarea în wishlist poate fi realizată doar de utilizatorii autentificați.
// Apelati metoda aceasta in metoda main pentru a rula testul.

        AddToWishList add = new AddToWishList();
        //add.addToWish();
//7.În pachetul test, creați o clasă RegisterTest în care veți adăuga teste referitoare la înregistrarea utilizatorilor noi.

        Register reg = new Register();
        reg.register();
//8.Adăugați în clasa RegisterTest un test(o noua metoda) în care să automatizați pașii necesari
// pentru înregistrarea cu succes a unui utilizator nou
// (deschideți homepage-ul, apăsați pe Account, apăsați pe Register, completați toate câmpurile de pe pagina Register
// - atenție ca email-ul să fie unic, bifați opțiunea pentru primirea newsleterr-ului).
// Folosiți identificatori diferiți pentru câmpurile de pe pagina Register (id, name, className).
// Pe viitor, după învățarea altor identificatori, veți reveni pentru a apăsa și butonul Register.
// Apelati metoda aceasta in metoda main din clasa pentru a rula testul.


    }
}
