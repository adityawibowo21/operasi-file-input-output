import java.io.FileNotFoundException;
import java.util.Scanner;

class tokosepatu {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int tempId=0;
            String tempNama = "";
            String tempAlamat = "";
            int tempKodeBarang = 0;
            int tempHarga = 0;
            String tempNamaBarang ="";
            int tempKodeTransaksi = 0;
            int tempBanyak = 0;

            System.out.println("Selamat Datang Di Toko Sepatu Kami");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Customer");
            System.out.print("\npilih: ");
            int n = input.nextInt();
            switch (n) {
                case 1:
                    loginuser in = new loginuser();

                    in.data = 1;
                    System.out.println("---------");
                    System.out.println("| Login |");
                    System.out.println("---------");
                    System.out.print("\nUsername: ");
                    String a = input.nextLine();
                    in.setUsername(a);
                    System.out.println(in.getUsername());
                    System.out.print("Password: ");
                    String b = input.nextLine();
                    in.setPassword(b);
                    System.out.println(in.getPassword());
                    in.cek();

                    admin ad = new admin();

                    System.out.print("\nId Admin: ");
                    ad.id_admin = input.nextInt();
                    System.out.print("Nama: ");
                    ad.Nama = input.nextLine();
                    System.out.print("Alamat: ");
                    ad.Alamat = input.nextLine();
                    break;
                case 2:
                    loginuser log = new loginuser();

                    log.data = 2;
                    System.out.println("---------");
                    System.out.println("| Login |");
                    System.out.println("---------");
                    System.out.print("\nUsername: ");
                    String x = input.nextLine();
                    log.setUsername(x);
                    System.out.println(log.getUsername());
                    System.out.print("Password: ");
                    String y = input.nextLine();
                    log.setPassword(y);
                    System.out.println(log.getPassword());
                    log.cek();

                    customer cus = new customer();

                    java.io.File file = new java.io.File("Struct.txt");
                    try{
                        Scanner inp = new Scanner(file);
                        inp.useDelimiter("; ");
                        while(inp.hasNext()){
                            System.out.print("Id Pelanggan : ");
                            tempId = inp.nextInt();

                            System.out.print("Nama Pelanggan : ");
                            tempNama = inp.nextLine();

                            System.out.print("Alamat Pelanggan : ");
                            tempAlamat = inp.nextLine();

                            System.out.print("Kode Barang : ");
                            tempKodeBarang = inp.nextInt();

                            System.out.print("Nama Barang : ");
                            tempNamaBarang = inp.nextLine();

                            System.out.print("Harga Barang : ");
                            tempHarga = inp.nextInt();

                            System.out.print("Kode Transaksi : ");
                            tempKodeTransaksi = inp.nextInt();

                            System.out.print("Banyak Barang : ");
                            tempBanyak = inp.nextInt();

                            System.out.println("ID Pembeli      : " + tempId);
                            System.out.println("Nama Pembeli    : " + tempNama);
                            System.out.println("Alamat          : " + tempAlamat);
                            System.out.println("Kode Barang     : " + tempKodeBarang);
                            System.out.println("Nama Barang     : " + tempNamaBarang);
                            System.out.println("Harga           : " + tempHarga);
                            System.out.println("Kode transaksi  : " + tempKodeTransaksi);
                            System.out.println("Banyak          : " + tempBanyak);
                        }
                        input.close();
                    }catch(FileNotFoundException e){
                        e.printStackTrace();
                    }
                    //eksekusi
                    transaksi t = new transaksi(tempId, tempNama, tempAlamat);
                    t.setBarang(tempKodeBarang, tempNamaBarang, tempHarga);
                    t.setTransaksi(tempKodeTransaksi, tempBanyak);
                    t.cetakStruk();
            }
        }
    }