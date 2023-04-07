package den1;

public class Soru1 
  {
    public static void main(String[] args) 
      {
		    String path=args[0];
		    Student[] kisiler=Student.readCSV(path);
		    int kisiSayisi=kisiler.length;
		    double toplam=0,gecici=0,ortalama=0;
		    for(Student kisi:kisiler)
		      {
			     gecici=kisi.getGPA();
			     toplam+=gecici;
		      }
		    if(kisiSayisi>0)
			  ortalama=toplam/kisiSayisi;
		    System.out.println(ortalama);
	    }
  }
