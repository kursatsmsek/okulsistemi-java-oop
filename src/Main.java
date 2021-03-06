import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Idareci mudur = new Idareci("Murat","Aktay",01,"Müdür");
        Idareci myard = new Idareci("Kadir","Bilgin",02,"Müdür Yardımcısı");
        Ogretmen tarihci = new Ogretmen("Servet","Kartal",11,"Tarih");
        Ogretmen matematikci = new Ogretmen("Cihan","Şahin",12,"Matematik");
        Sınıf dokuz = new Sınıf("A",9,32);
        Sınıf oniki = new Sınıf("B",12,28);
        Ogrenci kursatSimsek = new Ogrenci("Kürşat","Şimşek",111,oniki);
        Ogrenci ahmet_yilmaz = new Ogrenci("Ahmet","Yılmaz",112,dokuz);
        System.out.println("HOŞ GELDİNİZ\n*****************************************");
        Scanner scanner;
        while (true) {
            System.out.print("\nİŞLEM MENÜSÜ\n" +
                    "1.İdareci İşlemleri\n" +
                    "2.Öğretmen İşlemleri\n" +
                    "3.Öğrenci İşlemleri\n" +
                    "Çıkış için q'ya basınız.\n" +
                    "İşlem giriniz: ");
            scanner = new Scanner(System.in);
            String islem1 = scanner.nextLine();
            if (islem1.equals("q")) {
                System.out.println("Program kapatılıyor.");
                break;
            }
            else if (islem1.equals("1")) {
                System.out.println("\n\nİDARECİ İŞLEMLERİ\n***************************");
                while (true) {
                    System.out.print("\nİşlem Menüsü\n" +
                            "1.Bilgileri Göster\n" +
                            "2.Tatile Çıkar\n" +
                            "3.Birine İzin Ver\n" +
                            "4.Birine Görev Ata\n" +
                            "İdareci İşlemlerinden Çıkış İçin q'ya Basınız." +
                            "İşlem giriniz: ");
                    scanner = new Scanner(System.in);
                    String islem2 = scanner.nextLine();
                    if (islem2.equals("q")) {
                        System.out.println("İdareci işlemlerinden çıkış yapılıyor.");
                        break;
                    }
                    else if (islem2.equals("1")) {
                        System.out.println("\n\n");
                        mudur.bilgileriGoster();
                        System.out.println("\n\n");
                        myard.bilgileriGoster();
                    }
                    else if (islem2.equals("2")) {
                        System.out.println("\nKimi tatile çıkaralım ? (müdür/müdür yardımcısı)  ");
                        scanner = new Scanner(System.in);
                        String tatilci = scanner.nextLine();
                        if (tatilci.equals("müdür")) {
                            System.out.print("\nKaç gün: ");
                            scanner = new Scanner(System.in);
                            int tgun = scanner.nextInt();
                            mudur.tatileCikar(tgun);
                        }
                        else if (tatilci.equals("müdür yardımcısı")) {
                            scanner = new Scanner(System.in);
                            System.out.print("\nKaç gün: ");
                            int tgun2 = scanner.nextInt();
                            myard.tatileCikar(tgun2);
                        }
                        else {
                            System.out.println("Geçersiz işlem.");
                        }
                    }
                    else if (islem2.equals("3")) {
                        System.out.print("\nKime izin verilsin: ");
                        scanner = new Scanner(System.in);
                        String izinli = scanner.nextLine();
                        System.out.print("\nKaç gün: ");
                        scanner = new Scanner(System.in);
                        int igun = scanner.nextInt();
                        myard.izineCikar(izinli,igun);
                    }
                    else if (islem2.equals("4")) {
                        System.out.print("\nKime görev atansın: ");
                        scanner = new Scanner(System.in);
                        String gorevli = scanner.nextLine();
                        myard.gorevAta(gorevli);
                    }
                    else {
                        System.out.println("Geçersiz işlem.");
                    }
                }
            }
            else if (islem1.equals("2")) {
                System.out.print("\n\nHangi öğretmenle işlem yapılsın ? (tarihçi/matematikçi): ");
                String iteacher = scanner.nextLine();
                while (true) {
                    if (iteacher.equals("tarihçi")) {
                        System.out.println("\nİşlem Menüsü\n" +
                                "1.Bilgileri Göster\n" +
                                "2.Ders Anlat\n" +
                                "3.Not Ver\n" +
                                "Çıkış yapmak için q'ya basınız.\n" +
                                "İşlem giriniz: ");
                        scanner = new Scanner(System.in);
                        String tarihcislem = scanner.nextLine();
                        if (tarihcislem.equals("q")) {
                            System.out.println("Öğretmen işlemlerinden çıkış yapılıyor.");
                            break;
                        }
                        else if (tarihcislem.equals("1")) {
                            tarihci.bilgileriGoster();
                        }
                        else if (tarihcislem.equals("2")) {
                            System.out.println("Hangi sınıfa ders anlatsın ? (9/12) : ");
                            scanner = new Scanner(System.in);
                            int sinifanlatim = scanner.nextInt();
                            if (sinifanlatim == 9) {
                                tarihci.dersAnlat(dokuz);
                            }
                            else if (sinifanlatim == 12) {
                                tarihci.dersAnlat(oniki);
                            }
                            else {
                                System.out.println("Geçersiz İşlem.");
                            }

                        }
                        else if (tarihcislem.equals("3")) {
                            System.out.print("Hangi öğrenciye not verilsin ? (kürşat/ahmet) : ");
                            scanner = new Scanner(System.in);
                            String nogrenci = scanner.nextLine();
                            if (nogrenci.equals("kürşat")) {
                                System.out.print("Kaç puan vermek istersiniz: ");
                                scanner = new Scanner(System.in);
                                int not = scanner.nextInt();
                                tarihci.notVer(kursatSimsek,not);
                            }
                            else if (nogrenci.equals("ahmet")) {
                                System.out.print("Kaç puan vermek istersiniz: ");
                                scanner = new Scanner(System.in);
                                int not2 = scanner.nextInt();
                                tarihci.notVer(ahmet_yilmaz,not2);

                            }
                            else {
                                System.out.println("Geçersiz işlem.");
                            }
                        }
                        else {
                            System.out.println("Geçersiz işlem.");
                        }
                    }
                    else if (iteacher.equals("matematikçi")) {
                        System.out.println("\nİşlem Menüsü\n" +
                                "1.Bilgileri Göster\n" +
                                "2.Ders Anlat\n" +
                                "3.Not Ver\n" +
                                "Çıkış yapmak için q'ya basınız.\n" +
                                "İşlem giriniz: ");
                        scanner = new Scanner(System.in);
                        String matetikciislem = scanner.nextLine();
                        if (matetikciislem.equals("q")) {
                            System.out.println("Öğretmen işlemlerinden çıkış yapılıyor.");
                            break;
                        }
                        else if (matetikciislem.equals("1")) {
                            matematikci.bilgileriGoster();
                        }
                        else if (matetikciislem.equals("2")) {
                            System.out.println("Hangi sınıfa ders anlatsın ? (9/12) : ");
                            scanner = new Scanner(System.in);
                            int sinifanlatim = scanner.nextInt();
                            if (sinifanlatim == 9) {
                                matematikci.dersAnlat(dokuz);
                            }
                            else if (sinifanlatim == 12) {
                                matematikci.dersAnlat(oniki);
                            }
                            else {
                                System.out.println("Geçersiz İşlem.");
                            }

                        }
                        else if (matetikciislem.equals("3")) {
                            System.out.print("Hangi öğrenciye not verilsin ? (kürşat/ahmet) : ");
                            scanner = new Scanner(System.in);
                            String nogrenci = scanner.nextLine();
                            if (nogrenci.equals("kürşat")) {
                                System.out.print("Kaç puan vermek istersiniz: ");
                                scanner = new Scanner(System.in);
                                int not = scanner.nextInt();
                                matematikci.notVer(kursatSimsek,not);
                            }
                            else if (nogrenci.equals("ahmet")) {
                                System.out.print("Kaç puan vermek istersiniz: ");
                                scanner = new Scanner(System.in);
                                int not2 = scanner.nextInt();
                                matematikci.notVer(ahmet_yilmaz,not2);

                            }
                            else {
                                System.out.println("Geçersiz işlem.");
                            }
                        }
                    }
                    else {
                        System.out.println("Geçersiz işlem.");
                        break;
                    }

                }
            }
            else if (islem1.equals("3")) {
                System.out.println("\n\nHangi öğrenci ile işlem yapmak istersin ? (kürşat/ahmet): ");
                String istudent = scanner.nextLine();
                while (true) {
                    if (istudent.equals("kürşat")) {
                        System.out.println("\nİşlem Menüsü\n" +
                                "1.Bilgileri Göster\n" +
                                "2.Ders Çalış\n" +
                                "Çıkış yapmak için q'ya basınız.\n" +
                                "İşlem giriniz: ");
                        String ikursat = scanner.nextLine();
                        if (ikursat.equals("q")) {
                            System.out.println("Öğrenci işlemlerinden çıkış yapılıyor.");
                            break;
                        }
                        else if (ikursat.equals("1")) {
                            kursatSimsek.bilgileriGoster();
                        }
                        else if (ikursat.equals("2")) {
                            System.out.println("Hangi derse çalışsın: ");
                            String ders = scanner.nextLine();
                            kursatSimsek.dersCalis(ders);
                        }
                        else {
                            System.out.println("Geçersiz işlem");
                        }
                    }
                    else if (istudent.equals("ahmet")) {
                        System.out.println("\nİşlem Menüsü\n" +
                                "1.Bilgileri Göster\n" +
                                "2.Ders Çalış\n" +
                                "Çıkış yapmak için q'ya basınız.\n" +
                                "İşlem giriniz: ");
                        String iahmet = scanner.nextLine();
                        if (iahmet.equals("q")) {
                            System.out.println("Öğrenci işlemlerinden çıkış yapılıyor.");
                            break;
                        }
                        else if (iahmet.equals("1")) {
                            ahmet_yilmaz.bilgileriGoster();
                        }
                        else if (iahmet.equals("2")) {
                            System.out.println("Hangi derse çalışsın: ");
                            String ders = scanner.nextLine();
                            ahmet_yilmaz.dersCalis(ders);
                        }
                        else {
                            System.out.println("Geçersiz işlem");
                        }
                    }
                    else {
                        System.out.println("Geçersiz işlem.");
                        break;
                    }

                }

            }
            else {
                System.out.println("Geçersiz işlem.");
            }
        }
    }
}
