package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        for(int i = 0; i < 10; i++) {
//            System.out.print("labas");
//
//            for (int j = 0; j < 3; j++){
//                System.out.print(" rytas");
//            }
//            System.out.println();
//        }
//        while(true){
//            System.out.println("tiesa"); ///begalinis ciklas
//        }
//        do{ ///su do gali while ir if skirtingi buti false ir true. suveiks viena karta ciklas
//            System.out.println("tiesiog bando daryti");
//        }while(true); ///abu turi true arba false buti skliaustuose. jei be do bus. o jei su while tai vienodos reiksmes
//        ///turi buti arba fale arba true;

//        Scanner scannner = new Scanner(System.in);
//        int num = 7;
//        boolean badNumber = true;
//        while(badNumber) {
//            int input = scannner.nextInt();
//            if(input >0 && input <5){
//                badNumber = false;
//                System.out.println("pagaliau, aciu");
//            }else{
//                System.out.println("ivesk skaiciu teisingai. Tarp 0 ir 5");
//            }
//        }
//        System.out.println("skaicius priimtas");
//        String tekstas = "labas rytas";
//        for (int i = 0; i < tekstas.length(); i++) {
//            System.out.println(tekstas.charAt(i));
//        }

        ////UZDAVINIAI - CIKLAI
        ///3 .1 Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300,
        // atspausdinkite juos atskirtus tarpais
        // ir suskaičiuokite kiek tarp jų yra didesnių už 150.
        // Skaičiai didesni nei 275 turi būti atspausdinti skliausteliuose” [ ] “.


//        int count = 0;
//        for (int i = 0; i < 300; i++) {
//            int randomNumber = (int) (Math.random() * 301);
//            if (randomNumber > 150) {
//                count++;
//            }
//            if (randomNumber > 275) {
//                    System.out.print("[" + randomNumber + "] ");
//            } else {
//                System.out.print(randomNumber + ", ");
//            }
//        }

        // 3.2 Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000, kurie dalijasi iš 77 be liekanos.
        // Skaičius atskirkite kableliais.
        // Po paskutinio skaičiaus kablelio neturi būti.
//        int min = 77;
//        int max = 3000;
//        String numbers = "";
//        for (int i = min ; i < max; i +=77) {
//            numbers += i+",";
//        }
//        System.out.print(numbers.substring(0, numbers.length() -1 ) );

        /// 3.3 Nupieškite kvadratą iš “*”, kurio kraštines sudaro 100 “*”.
                                //* * * * * * * * * * *
                                //* * * * * * * * * * *
                                //* * * * * * * * * * *
                                //* * * * * * * * * * *
                                //* * * * * * * * * * *
                                //* * * * * * * * * * *
                                //* * * * * * * * * * *

//        int countRed = 0;
//        int coutRed2 = 100;
//        for (int i =0; i<101; i++) {
//            System.out.print("");
//            for (int y = 0; y < 101; y++) {
//                if(countRed==y || coutRed2==y) {
////                    System.out.print("0");
//                } else {
//                    System.out.print("*");
//                }
//            }
//            countRed++;
//            coutRed2--;
//        }
//
//        float myFloatNum = 5.99f;
//        System.out.println(myFloatNum);
//
//3.5 Metam monetą. Monetos kritimo rezultatą imituojam Math.random() funkcija, kur 0 yra herbas, o 1 - skaičius.
// Monetos metimo rezultatus išvedame į ekraną atskiroje eilutėje: “S” jeigu iškrito skaičius ir “H” jeigu herbas.
// Suprogramuokite tris skirtingus scenarijus kai monetos metimą stabdome:
//        Iškritus herbui;
//        Tris kartus iškritus herbui;
//        Tris kartus iš eilės iškritus herbui;

//        int count = 0;
//        while(count < 3){
//            int metu = (int) Math.round( Math.random() );
//            System.out.println(metu > 0.5);
//            if(metu > 0.5){
//                count++;
//            }
//        }


// 3. 8 Sumodeliuokite vinies kalimą. Įkalimo gylį sumodeliuokite pasinaudodami Math.random() funkcija. Vinies ilgis 8.5cm (pilnai sulenda į lentą).
//“Įkalkite” 5 vinis mažais smūgiais. Vienas smūgis vinį įkala 5-20 mm. Suskaičiuokite kiek reikia smūgių.
//“Įkalkite” 5 vinis dideliais smūgiais. Vienas smūgis vinį įkala 20-30 mm, bet yra 50% tikimybė (pasinaudokite Math.random() funkcija tikimybei sumodeliuoti), kad smūgis nepataikys į vinį. Suskaičiuokite kiek reikia smūgių.

//        for ( int i =0; i < 5; i++) {
//            System.out.println("kalu "+(i+1)+" vini");
//            int nailed = 0;
//            while(nailed < 85) {
//               int swing = (int) ( Math.random() * 16) + 5; // vieno smugio gylis
//               nailed += swing; // didinam verte
//                System.out.println("taukst"+swing+"milimetru"); //
//            }
//            System.out.println("vini sukaliau");
//        }

//        MASYVAI

//        int [] randomNumbers = {5454,4,54,54,44,54451,456};
////        System.out.println(randomNumbers); // kur gyvena masyve
////        randomNumbers.size(); // nurodysim size masyve
////        for (int i = 0; i < randomNumbers.length; i++) {
////            System.out.println(randomNumbers[i]+ " ");
////        }
////        for (int i = 0; i < randomNumbers.length; i++) {
////            randomNumbers[i]= 17;
////        }
//        for (int i = 0; i < randomNumbers.length; i++) {
//            System.out.print(randomNumbers[i]+ " ");
//        }
////
////        int [] newArr = new int[5];
////        for (int i = 0; i < 5; i++) {
////            newArr[i] = (int) (Math.random() *16) +5;
////        }
//          PVZ

        int [] randomNumbers = {5454,4,54,54,44,54451,456};
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i]+ " ");
        }
        for (int i = 0; i < randomNumbers.length - 1; i++) {
            if (randomNumbers[i] > randomNumbers[ i + 1 ]) {
            int tmp = randomNumbers[i];
            randomNumbers[i] = randomNumbers[i + 1];
            randomNumbers[i + 1] = tmp;
            }
        }
        count = 0;
        for (int a = 0; a < randomNumbers.length; a++) { //10
            for (int i = 0; i < randomNumbers.length - 1; i++) { //11-15
                if (randomNumbers[i] > randomNumbers[i + 1]) {
                    int tmp = randomNumbers[i];
                    randomNumbers[i] = randomNumbers[i + 1];
                    randomNumbers[i + 1] = tmp;
                }
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i]+ " ");
        }
















































    }
}
