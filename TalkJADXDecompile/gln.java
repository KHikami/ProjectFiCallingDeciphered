import java.util.Observable;

public class gln extends Observable {
    public String a;

    public String a() {
        return this.a;
    }

    public gln(byte b) {
        this();
    }

    public void a(String str) {
        if (!gwb.g(this.a, (Object) str)) {
            this.a = str;
            setChanged();
            notifyObservers();
        }
    }
}
