# 🏫 Okul Yönetim Sistemi

## 📝 Proje Açıklaması
Bu proje, Spring Boot tabanlı bir okul yönetim sistemidir. Öğrenci 🧑‍🎓, öğretmen 🧑‍🏫 ve sınıf 📚 bilgilerini yönetmek için temel CRUD (Oluşturma, Okuma, Güncelleme, Silme) işlemleri sunar. Uygulama, kullanıcı dostu arayüzler ve otomatik alan atamaları ile yönetim süreçlerini kolaylaştırmayı hedefler.

## 🚀 Kullanılan Teknolojiler
*   **Backend:**
    *   Java 21.0.2 ☕
    *   Spring Boot (Popüler Java Kütüphaneleri ve Frameworkler) 🍃
    *   Maven (Popüler Java Kütüphaneleri ve Frameworkler) 📦
    *   H2 Database (Veritabanı Bağlantısı Kurma) 💾
    *   Tomcat (J2EE Temelleri, Web Programlama) 🐱
*   **Frontend:**
    *   HTML, CSS (Web Programlama) 🌐
    *   Thymeleaf (Spring Boot ile entegre şablon motoru) 🌿

## ✨ Özellikler
*   **Öğrenci Yönetimi:** Öğrenci ekleme ➕, listeleme 📋, düzenleme ✏️ ve silme 🗑️ işlemleri. Öğrenci numarası otomatik ve salt okunur. Veli telefon numarası için doğrulama.
*   **Öğretmen Yönetimi:** Öğretmen ekleme ➕, listeleme 📋, düzenleme ✏️ ve silme 🗑️ işlemleri. Sicil numarası (T001'den başlayarak) otomatik ve salt okunur. E-posta, ad ve soyada göre otomatik oluşturulur ve salt okunur.
*   **Sınıf Yönetimi:** Sınıf ekleme ➕, listeleme 📋, düzenleme ✏️ ve silme 🗑️ işlemleri. Sadece seviye ve şube alanları bulunur.
*   **Kullanıcı Dostu Arayüzler:** Sade ve anlaşılır formlar ile kolay kullanım. 👍

## 📂 Proje Yapısı
Proje, standart bir Spring Boot katmanlı mimarisiyle tasarlanmıştır:
*   `src/main/java/com/okulyonetimsistemi/okulyonetimsistemi/controller`: Web isteklerini yöneten ve View'lara yönlendiren controller sınıfları. 🌐
*   `src/main/java/com/okulyonetimsistemi/okulyonetimsistemi/service`: İş mantığını içeren servis sınıfları. ⚙️
*   `src/main/java/com/okulyonetimsistemi/okulyonetimsistemi/repository`: Veritabanı işlemleri için repository arayüzleri (Spring Data JPA). 🗄️
*   `src/main/java/com/okulyonetimsistemi/okulyonetimsistemi/model`: Veritabanı varlıklarını temsil eden entity sınıfları. 🧩
*   `src/main/resources/templates`: HTML şablonları (Thymeleaf). 📄
*   `src/main/resources/application.properties`: Uygulama yapılandırma dosyası. 🔧
*   `frontend`: Frontend geliştirme için ayrı bir klasör. 💻
*   `okulyonetim`: Diğer yardımcı modüller veya eski proje yapısı. 📦

## ⚙️ Kurulum Talimatları (Yerel Ortam)

1.  **Projeyi Klonlayın:**
    ```bash
    git clone https://github.com/YildizKadir10/okul-yonetim-sistemi.git
    ```
2.  **Proje Dizini'ne Gidin:**
    ```bash
    cd okul-yonetim-sistemi
    ```
3.  **Maven Bağımlılıklarını Yükleyin:**
    ```bash
    mvn clean install
    ```
4.  **Uygulamayı Çalıştırın:**
    Spring Boot uygulamasını `OkulyonetimsistemiApplication.java` sınıfını IDE'nizden çalıştırabilir veya terminalden aşağıdaki komutu kullanabilirsiniz:
    ```bash
    mvn spring-boot:run
    ```
5.  **Tarayıcıda Açın:**
    Uygulama varsayılan olarak `http://localhost:8080` adresinde çalışacaktır. 🚀

## 🌐 Deploy Durumu
Proje henüz bir deploy ortamına yüklenmemiştir sebebi railway sunucularındaki arızalardan dolayı deploy edilmiyor geçici süreliğine. Deploy edildiğinde domain adresi buraya eklenecektir. ⏳

## 🔗 GitHub Repo
Bu projenin kaynak kodlarına aşağıdaki GitHub adresinden ulaşabilirsiniz:
[https://github.com/YildizKadir10/okul-yonetim-sistemi.git](https://github.com/YildizKadir10/okul-yonetim-sistemi.git)

---

## 👨‍💻 Geliştiren
Kadir Yıldız
