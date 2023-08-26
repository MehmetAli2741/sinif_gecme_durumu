import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int mat,fizik,turkce,kimya,muzik,hesapla=1;

      Scanner input = new Scanner(System.in);

      System.out.print("Matematik Notunuz: ");
      mat = input.nextInt();

      if ((mat < 0) || (mat > 100)){
          int mat1 = 0;
          mat = mat1;

      }

      System.out.print("Fizik Notunuz: ");
      fizik = input.nextInt();

      if ((fizik < 0) || (fizik > 100)){
          int fizik1 = 0;
          fizik = fizik1;

      }

      System.out.print("Türkçe Notunuz: ");
      turkce = input.nextInt();
      if ((turkce < 0) || (turkce > 100)){
          int turkce1 = 0;
          turkce = turkce1;
      }

      System.out.print("Kimya Notunuz: ");
      kimya = input.nextInt();
      if ((kimya < 0) || (kimya > 100)){
          int kimya1 = 0;
          kimya = kimya1;
      }

      System.out.print("Müzik Notunuz: ");
      muzik = input.nextInt();
      if ((muzik < 0) || (muzik > 100)){
          int muzik1 = 0;
          muzik = muzik1;
      }

      double avarage = (mat + fizik + turkce + kimya + muzik) / 5;

      if (avarage >= 55){
          System.out.println("Sınıfı Geçtiniz Ortalamanız: " + avarage);
      }else {
          System.out.println("Sınıfı Geçemediniz Ortalamanız: " + avarage);
      }
    }
}