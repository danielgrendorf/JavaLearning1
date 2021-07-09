package com.company;

public class Main {
    public static void main(String[] Args) {

        /*int x = 1;
        while (x < 10) {
            int z = 10;
            System.out.println("now i am " + x);
            x++;
        }
        x = 2;
        System.out.println(x);
        z = 11;



       /*int y = 1;

        do{
            System.out.println("now i am "+y);
            y++;
        }while(y < 1);

        for(int i=0; i<10; i++){
            System.out.println(i);

        }

        /*Mennyi az osszege a harommal oszthato szamoknak 1 es 157 kozott?*/

        /*int sum = 0;
        int count = 0;
        for(int x = 1; x<158; x++)
        {
            if(x%3 == 0){

                sum = sum + x;
                count = count + 1;


            }
        }
        System.out.println(sum);
        System.out.println(count);

        int a = 1;
        int count = 0;
        while (a < 21);{
            if(a%4 == 0){
                count = count + 1;
            }
            System.out.println(count);
        }


    }
}
/*
irjuk ki a 4el oszthato szamokat 1tol 20ig-while
-irjuk ki a 157 és 244 legnagyobb kozos oszto és legkisebb kozos tobbszoroset-
irjuk ki az elso 30 primszam osszeget
hogy lehetne optimalizalni?
*/

        //305 az elso szam ami oszthato e 19el...
    /*int x = 305;
    //...417 az utolso amit megnezek, addig minden szamot egyenkent nezek...
    while(x < 418){
        //...megnezem oszthato e 19el...
        if(x%19 == 0) {
            System.out.println(x);
            //...innen 19essevel nezem...
            x+=19;
        }else{
            //...nem oszthato, tehat keresem a kovetkezot
            x++;
        }
    }

    for( int y = 305; y < 418 ; y++ ){
        if(y%19 == 0){
            System.out.println(y);
        }

    }*/
/*
    int actualNumber = 0;
    int sum = 0;
    int primCounter = 0;

    while(primCounter < 30){
        //megnezzuk az aktualis szamok alatti szamok valamelyike osztja e az aktualis szamunkat...
        for(int numberBelowActualNumber = 2; numberBelowActualNumber < actualNumber ; numberBelowActualNumber++ ){
            if(actualNumber%numberBelowActualNumber == 0){
                //...ha igen, kilepunk a ciklusbol mert tudjuk hogy nem prim es...
                break;
            }
            //ha nem, megnezzuk hogy elertunk e a ciklus vegere, vagyis az alattalevo szamot az aktualis szam koveti
            if(numberBelowActualNumber + 1 == actualNumber){
                //ha a numberBelowActualNumberhoz hozzadva egyet az aktualis szamot kapjuk,
                // az azt jelenti,
                // hogy eljutottunk a ciklus vege anelkul hogy barmelyik szam osztotta volna az aktualis szamot
                sum = sum + actualNumber;
                primCounter++;
            }
        }
        //...hozzaadunk egyet es megnezzuk hogy a kovetkezo prim-e
        actualNumber++;
    }

    System.out.println(sum);
        System.out.println(primCounter);
        System.out.println(actualNumber);*/

        /*int commonDivider = 1;
        int x = 5;
        int y = 10;
        int sum = 0;
        while(commonDivider < 26){
            if(x % commonDivider == 0 && y % commonDivider == 0){
                sum = sum + commonDivider;

            }
            commonDivider++;


            }
        System.out.println(sum);



            }
        }
*/
        /*
        int sum = 0;
        for (int x = 12; int y = 20; x++) {
            if (12%x == 0 && !20%y == 0) ||(x % 12 == 0 && x % 20 == 0) {
                sum = sum + x;
                System.out.println(x);
            }


        }*/

        int num = 22;
        while(num < 30){
            if(num%2 == 0 && 2 <= num && num <= 5){
                System.out.println("Not Weird");
            }else{
                System.out.println("Weird");
                break;
            }
            if(num%2 == 0 && 6 <= num && num <= 20){
                System.out.println("Weird");
            }
            if(num%2 == 0 && num > 20){
                System.out.println("Not Weird");
            }
        }


    }
}


//irjuk ki a 25 es a 37 kozos osztoinak az osszeget, (minden kozos osztot osszeadva)
//ciklus 25ig megy mert annal nagyobb kozos oszto biztos nincs
//essel osszekotni a szazalekot, kozos oszto sum = adott szam amire teljesul a feltetel
//whileal es forral is
//a primeshez: minden adat legyen nulla kezdeskor

