class regular {
    public regular(int a ) {
        super();
        System.out.println("this is regular class");
    }
public regular( ) {
        super();
        System.out.println("this is regular class222");
    }
}

class normal {
      public static void main(String[] args) {
        regular r = new regular(12);

        System.out.println("this is normal class");
    }
}