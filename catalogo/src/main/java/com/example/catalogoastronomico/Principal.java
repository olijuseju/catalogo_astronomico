package com.example.catalogoastronomico;
/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
class Principal {
   public static void main(String[] main) {
      Astro marte , otro;
      marte = new Astro("marte", 2.3, 0.5);
      otro = new Astro();
      Astro extra = new Astro("Sirius", -1.42, 8.7);
      System.out.println(otro.equals(extra));
      System.out.println(marte.toString());
      System.out.println(otro.toString());
   }
}