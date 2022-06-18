package PruebaEX1;

public class NoGenericMethodsPrueba {
    public static void main(String[] args) {

        String string1 = "Sóc l'objecte número 1";
        String string2 = "Sóc l'objecte número 2";
        String string3 = "Sóc l'objecte número 3";

        NoGenericObjectPrueba noGenericObjectPrueba1 = new NoGenericObjectPrueba(string1, string2, string3);
        NoGenericObjectPrueba noGenericObjectPrueba2 = new NoGenericObjectPrueba(string2, string3, string1);

    //    NoGenericObject noGenericObject1 = buildNoGenericObject1(object1, object2, object3);
      //  NoGenericObject noGenericObject2 = buildNoGenericObject2(object2, object3, object1);

        System.out.println("Els objectes de NoGenericObject1 son: " + noGenericObjectPrueba1);
        System.out.println("Els objectes de NoGenericObject2 son: " + noGenericObjectPrueba2);

    }


  /*  private static NoGenericObject buildNoGenericObject1(Object object1, Object object2, Object object3) {
        return buildNoGenericObject(object1, object2, object3);
    }

    private static NoGenericObject buildNoGenericObject2(Object object2, Object object3, Object object1) {
        return buildNoGenericObject(object2, object3, object1);
    }*/

   /* private static NoGenericObjectPrueba buildNoGenericObjectPrueba(Object object, Object object, Object object){
        return new NoGenericObject();*/
    }

