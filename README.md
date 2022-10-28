## Pemrograman Berorientasi Objek 10: Java Class, Object, Property, Method, Constructor, dan Visibility
> Created by Ahmad Reginald Syahiran &nbsp;&middot;&nbsp;
> NIM: 21343039 &nbsp;&middot;&nbsp;
> Teknik Informatika &nbsp;&middot;&nbsp;
> Fakultas Teknik &nbsp;&middot;&nbsp;
> Universitas Negeri Padang
---

# #1 Kelas/Objek Java
Segala sesuatu di Java dikaitkan dengan kelas dan objek, bersama dengan atribut dan metodenya. Sebagai contoh: dalam kehidupan nyata, mobil adalah sebuah objek. Mobil memiliki atribut, seperti berat dan warna, dan metode, seperti drive dan rem.

Kelas seperti konstruktor objek, atau "cetak biru" untuk membuat objek.

### Buat Kelas
Untuk membuat kelas, gunakan kata kunci kelas:
> Buat kelas bernama "Utama" dengan variabel x:
```
public class Main {
  int x = 5;
}
```

### Buat Objek
Di Java, sebuah objek dibuat dari sebuah kelas. Kami telah membuat kelas bernama Main, jadi sekarang kami dapat menggunakan ini untuk membuat objek.

Untuk membuat objek Main, tentukan nama kelas, diikuti dengan nama objek, dan gunakan kata kunci new:
> Buat objek bernama "myObj" dan cetak nilai x:
```
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```
---

# #2 Atribut/Properti Kelas Java
Dalam bab sebelumnya, kami menggunakan istilah "variabel" untuk x dalam contoh (seperti yang ditunjukkan di bawah). Ini sebenarnya adalah atribut dari kelas. Atau Anda bisa mengatakan bahwa atribut kelas adalah variabel di dalam kelas:
> Buat kelas bernama "Utama" dengan dua atribut: x dan y:
```
public class Main {
  int x = 5;
  int y = 3;
}
```
### Mengakses Atribut
Anda dapat mengakses atribut dengan membuat objek kelas, dan dengan menggunakan sintaks titik (.):

Contoh berikut akan membuat objek dari kelas Main, dengan nama myObj. Kami menggunakan atribut x pada objek untuk mencetak nilainya:
> Buat objek bernama "myObj" dan cetak nilai x:
```
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```
---

# #3 Metode Kelas Java
> Buat metode bernama myMethod() di Main:
```
public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }
}
```

myMethod() mencetak teks (tindakan), saat dipanggil. Untuk memanggil metode, tulis nama metode diikuti oleh dua tanda kurung () dan titik koma;
> Di dalam main, panggil myMethod():
```
public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "Hello World!"
```
---

# #4 Konstruktor Java
Konstruktor di Java adalah metode khusus yang digunakan untuk menginisialisasi objek. Konstruktor dipanggil ketika objek kelas dibuat. Ini dapat digunakan untuk menetapkan nilai awal untuk atribut objek.
> Buat konstruktor:
```
// Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
```

### Parameter Konstruktor
Konstruktor juga dapat mengambil parameter, yang digunakan untuk menginisialisasi atribut.

Contoh berikut menambahkan parameter int y ke konstruktor. Di dalam konstruktor kita set x ke y (x=y). Saat kita memanggil konstruktor, kita meneruskan parameter ke konstruktor (5), yang akan menetapkan nilai x menjadi 5:
```
public class Main {
  int x;

  public Main(int y) {
    x = y;
  }

  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println(myObj.x);
  }
}

// Outputs 5
```

# #5 Pengubah/Visibilitas Java
Kami membagi pengubah menjadi dua kelompok:
- Pengubah Akses - mengontrol tingkat akses
- Non-Access Modifiers - tidak mengontrol tingkat akses, tetapi menyediakan fungsionalitas lain

### Akses Pengubah
Untuk kelas, Anda dapat menggunakan publik atau default:
![image](https://user-images.githubusercontent.com/112265105/198632628-7ad37cfe-0272-42c2-a15d-b1cbf47839af.png)

Untuk atribut, metode, dan konstruktor, Anda dapat menggunakan salah satu dari berikut ini:
![image](https://user-images.githubusercontent.com/112265105/198632873-4ecc0433-fbed-4b69-88e0-fc3af20dd6a3.png)

### Pengubah Non-Akses
Untuk kelas, Anda dapat menggunakan final atau abstrak:
![image](https://user-images.githubusercontent.com/112265105/198633230-ee314edb-bcf3-478a-9808-f4c53a2b117d.png)

Untuk atribut dan metode, Anda dapat menggunakan salah satu dari berikut ini:
![image](https://user-images.githubusercontent.com/112265105/198633461-68dba591-cbb9-45b5-9bcd-8f2dab0ef291.png)

### Akhir
Jika Anda tidak ingin kemampuan untuk mengganti nilai atribut yang ada, nyatakan atribut sebagai final:
```
public class Main {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 50; // will generate an error: cannot assign a value to a final variable
    myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
```
### Statis
Metode statis berarti dapat diakses tanpa membuat objek kelas, tidak seperti publik:
```
public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method
  }
}
```

### Abstrak
Sebuah metode abstrak milik kelas abstrak, dan tidak memiliki tubuh. Tubuh disediakan oleh subclass:
```
// Code from filename: Main.java
// abstract class
abstract class Main {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
// End code from filename: Main.java

// Code from filename: Second.java
class Second {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}
```
---

## Sumber
> https://www.w3schools.com/java/java_classes.asp
> https://www.w3schools.com/java/java_class_attributes.asp
> https://www.w3schools.com/java/java_class_methods.asp
> https://www.w3schools.com/java/java_constructors.asp
> https://www.w3schools.com/java/java_modifiers.asp
---
