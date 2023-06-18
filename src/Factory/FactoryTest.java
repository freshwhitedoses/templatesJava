package Factory;

///Используется, когда у нас есть суперкласс с несколькими подклассами и на основе ввода, нам нужно вернуть один из подкласса.
// Класс не знает какого типа объект он должен создать. Объекты создаются в зависимости от входящих данных.
class Factory {
    public OS getCurrentOS(String inputs) {
        return switch (inputs) {
            case "windows" -> new windowsOS();
            case "linux" -> new linuxOS();
            case "mac" -> new macOS();
            default -> null;
        };
    }
}
interface OS {
    void getOS();
}
class windowsOS implements OS {
    public void getOS () {
        System.out.println("применить для виндовс");
    }
}
class linuxOS implements OS {
    public void getOS () {
        System.out.println("применить для линукс");
    }
}
class macOS implements OS {
    public void getOS () {
        System.out.println("применить для мак");
    }
}

public class FactoryTest {

    public static void main(String[] args) {
        String lin = "linux";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(lin);
        os.getOS();
    }
}
