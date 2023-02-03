// Stwórz 3 obiekty klasy Student. Przypisz wartości do pól. Stwórz tablice i dodaj studentów do tablicy.
// Przejdź przez studentów w tablicy i wywołaj wszystkie 4 metody z klasy Student.
public class ZadanieDomoweNr4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.imie = "Kasia";
        student1.nazwisko = "Posiatowska";
        student1.nick = "Szybka";
        student1.email = "szybka01@gmail.com";
        student1.numerIndeksu = 123455;

        Student student2 = new Student();
        student2.imie = "Tomek";
        student2.nazwisko = "Korek";
        student2.nick = "Duży";
        student2.email = "duzy012@gmail.com";
        student2.numerIndeksu = 123451235;

        Student student3 = new Student();
        student3.imie = "Bartek";
        student3.nazwisko = "Lewndowski";
        student3.nick = "Bid Daddy";
        student3.email = "daddycool@gmail.com";
        student3.numerIndeksu = 3451235;


        Student[] studenci = new Student[3];

        studenci[0] = student1;
        studenci[1] = student2;
        studenci[2] = student3;

        for(int i=0; i<studenci.length;i++){
            studenci[i].przedstawSie();
            studenci[i].zalogujSie();
            studenci[i].podajNrIndeksu();
            studenci[i].podajEmail();
        }
    }
}
