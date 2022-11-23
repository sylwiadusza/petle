public class For {
    public static void main(String[] args) {
//        String[] cats = new String[]{"Burek", "Mruczek", "Iskierka", "Pussy"};
//        for (int i=0; i< cats.length; i++) {
//            System.out.println(cats[i]);
//        }

        /**
         * komentarz dokumentacyjny
         */

        int x=3;
        int y;
        System.out.println(x++);//3
                                //4
        System.out.println(++x);//5
        System.out.println(x);//5
        y = x++;
        System.out.println (y);//6
        y = ++x;
        System.out.println (y); //7
        System.out.println (++y); //8
    }
}

