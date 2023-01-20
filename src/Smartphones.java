
public interface Smartphones {
    void call();
    void sms();
    void internet();
}
interface LinuxOS {
    void okGoogle();
}

interface iOS {
    void siri();
}

class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Дзвінок (Андроїд)");
    }

    @Override
    public void sms() {
        System.out.println("Надіслати смс (Андроїд)");
    }

    @Override
    public void internet() {
        System.out.println("Користування інтернетом (Андроїд)");
    }
    @Override
    public void okGoogle() {
        System.out.println("Функція <OK Google>");
    }
}

class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("Дзвінок (Айфон)");
    }

    @Override
    public void sms() {
        System.out.println("Надіслати смс (Айфон)");
    }

    @Override
    public void internet() {
        System.out.println("Користування інтернетом (Айфон)");
    }

    @Override
    public void siri() {
        System.out.println("Функція <Привіт, Siri>");
    }
}

class Main {
    public static void main(String[] args) {
        Androids androids = new Androids();
        System.out.println("Основні функції Android: ");
        System.out.println("------------------------");
        androids.call();
        androids.sms();
        androids.internet();
        androids.okGoogle();

        System.out.println("");

        iPhones iPhones = new iPhones();
        System.out.println("Основні функції iPhone: ");
        System.out.println("------------------------");
        iPhones.call();;
        iPhones.sms();
        iPhones.internet();
        iPhones.siri();
    }
}

