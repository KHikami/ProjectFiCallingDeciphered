import java.util.Observable;

public class glm extends Observable {
    public boolean a;

    public boolean a() {
        return this.a;
    }

    public glm(byte b) {
        this();
    }

    public void a(boolean z) {
        if (!gwb.g(Boolean.valueOf(this.a), Boolean.valueOf(z))) {
            this.a = z;
            setChanged();
            notifyObservers();
        }
    }
}
