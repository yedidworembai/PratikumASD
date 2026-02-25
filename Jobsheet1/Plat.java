public class Plat {

    public static void main(String[] args) {

        char[] KODE = {'B','D','N','L','M','A','F','T','H','K'};

        char[][] KOTA = {
            {'J','a','k','a','r','t','a'},
            {'B','a','n','d','u','n','g'},
            {'M','a','l','a','n','g'},
            {'S','u','r','a','b','a','y','a'},
            {'M','e','d','a','n'},
            {'A','c','e','h'},
            {'B','o','g','o','r'},
            {'T','a','n','g','e','r','a','n','g'},
            {'S','e','m','a','r','a','n','g'},
            {'K','a','r','a','w','a','n','g'}
        };

        System.out.println("Kode Plat Mobil dan Kota:");

        for (int i = 0; i < KODE.length; i++) {

            System.out.print(KODE[i] + " -> ");

            for (int j = 0; j < KOTA[i].length; j++) {
                System.out.print(KOTA[i][j]);
            }

            System.out.println();
        }
    }
}