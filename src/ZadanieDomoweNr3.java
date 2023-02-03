public class ZadanieDomoweNr3 {
    public static void main(String[] args) {
        int sto = 100;

        for(int i=0; i<sto;i++){
            if(i%3==0 && i>0){
                System.out.println(i);
            }
        }

        int[] numery = new int[] {1,3,5};

        int zmienna = numery[0];
        numery[0] = numery[2];
        numery[2] = zmienna;

        for(int i=0;i<numery.length;i++){
            System.out.println(numery[i]);
        }

        System.out.println("zadanie od instruktora");
        //rozwiązanie zamiany miejsc tablicy przez instruktora

        int[] numbers = new int[] {1,3,5,7,0};

        for(int k=0;k<(numbers.length/2);k++){

        int temp = numbers[k]; // dla i=0 1 i=1 3
        numbers[k]= numbers[numbers.length-1-k]; // 4 -> 0 3=>7
        numbers[numbers.length-1-k] = temp; //1 // number[3] = 3

            System.out.println("Teraz odwrócona tablica");
        for(int j=0; j< numbers.length;j++){
            System.out.println(numbers[j]);
        }
        }

    }
}
