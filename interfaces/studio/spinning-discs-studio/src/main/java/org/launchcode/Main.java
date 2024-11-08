package org.launchcode;

public class Main {
    public static void main(String[] args) {


        CD rocksongs = new CD("Classic Rock Songs", true);
        DVD friendsSEason3 = new DVD("Friends Season 3");

        Data thunderstruck = new Data("Thunderstruck",50);
        Data sevennationarmy = new Data("SevenNationArmy",61);
        Data dreamon = new Data("DreamOn",57);

        rocksongs.writeDisc(thunderstruck);
        rocksongs.writeDisc(sevennationarmy);
        rocksongs.writeDisc(dreamon);



        Data s3e1 = new Data("S3:E1 ",420);
        Data s3e2 = new Data("S3:E2 ",420);
        Data s3e3 = new Data("S3:E3 ",420);
        Data s3e4 = new Data("S3:E4 ",420);

        friendsSEason3.writeDisc(s3e1);
        friendsSEason3.writeDisc(s3e2);
        friendsSEason3.writeDisc(s3e3);
        friendsSEason3.writeDisc(s3e4);

        System.out.println(rocksongs);
        System.out.println(friendsSEason3);

        rocksongs.readDisc(thunderstruck);


        friendsSEason3.writeDisc(s3e2);

        rocksongs.formatDisc();
        rocksongs.readDisc(dreamon);





    }
}