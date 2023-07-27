# UYGULAMA GEREKSİNİMLERİ VE AÇIKLAMALAR

## 1. Gereksinimler

    - docker mongodb kurulum komutları
    docker run -d -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=root -p 27017:27017 mongo
    - mongoDB yönetim tool'u indirme linki
    https://www.mongodb.com/try/download/compass
    https://downloads.mongodb.com/compass/mongodb-compass-1.38.2-win32-x64.exe?_ga=2.46670631.1628980262.1688715643-2060589691.1686571783
    - mongodb compas tool açıldıktan sonra 
    * Advanced Connection Options a tıklayıp açın
    * Host kısmına bağlantı yapılacak bilgisayar ve mongodb nin çalıştığı portu yazın
      localhost:27017
    * Authentication kısmına tıklayın ve burada Username/Password seçeneğini seçin
    * Username kısmına admin yazın ve password kısmına root yazın neden böyle yazıyoruz,
    çünkü mongodb yi docker üzerinde çalıştırırken username ve password bilgisini bu şekilde
    girmiştik.
    * Authentication Database kısmını boş bırakıyoruz nedeni ise, yönetici kullanıcısının
    herhangi bir DB ye bağlanması gerekmez tüm sistemi yönetebilir. Ancak eğer bir kullanıcı
    ekler ve ona bir DB tanımlar iseniz o zaman bu kısma giriş yapmanız gereklidir.
    * Connect butonuna tıklayın ve bağlantıyı sağlayın.
    * açılan pencerede + butonuna basarak yeeni bir DB ekleyin, DB adı ve örnek bir collection
    adı girmeniz yeterlidir.
    *** DİKKAT: buradan itibaren oluşturduğumuz DB için onu yönetecek bir kullanıcıoluşturaccağız.
    * ilk olarak mongodb compass in sol alt köşesinde bulunan MONGOSH a tıklayıp consol ekranını açıyoruz
    * burada üzerinse işlem yapmak istediğimiz DB nin adı ile birlikte;
    - use <DB ADI> yazıp enter a basıyoruz.
    * ilgili db ye geçtikten sonra;
    - db.createUser({user:"bilgeadmin",pwd:"bilge33**",roles:["readWrite","dbAdmin"]})
    * artık bu kullanıcı ile bu veritanbanına bağlanabilir ve işlem yapabiliriz.

# RabbitMQ için işlemler

    - Docker'a kurulum için gerekli işlemleri yapalım. Önemli mutlaka portlar eklenmeli(5672 ve 15672)
    docker run -d  --name bilgejava8-rabbit -e RABBITMQ_DEFAULT_USER=admin -e RABBITMQ_DEFAULT_PASS=root -p 5672:5672 -p 15672:15672 rabbitmq:3-management
    - RabbitMQ'ya JAVA içinden bağlanmak için aşağıdaki linki kullanabilirsiniz
    localhost:15672

# PROJENİN DEPLOY ADIMLARI

    1- UYgulamanın gradle ile build edilmesi gereklidir.
        1.1- sağ taraftan gradle sekmesine tıklayın
        1.2- çoklu yapı olduğu için projenin adını seçin "config-server-git"
        1.3- Tasks>build>build çift tıklayıp projeyi oluşturun
        1.4- Tasks>build>buildDependents çift tıklayın
    2- Bu işlemden sonra proje dosyasının altında oluşan build klasörünün içindeki libs
        klasörünün içine projenizin jar dosyası eklenmiş olur. Bu dosya direkt çalıştırılabilir 
        bir dosyadır.
    3- Dockerfile oluşturuyoruz.
    4- consol(Terminal) ekranından bu dockerfile ile imajı oluşturuyoruz.
        docker build -t config-server-git .  -> DİKKAT bu imajı buluta atmak için, repo adını kullanın
        docker build -t ysnslk/java8configservergit:v01 .
        docker build -t ysnslk/java8authservice:v03 .
        docker build -t ysnslk/java8userservice:v03 .
        docker  build -t ysnslk/java8apigatewayservice:v01 .

    