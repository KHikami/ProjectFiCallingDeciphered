import java.io.Serializable;

public final class bhc implements Serializable {
    private final String a;

    public bhc(String str) {
        this.a = str;
    }

    public boolean a(bhc bhc) {
        return this.a.equals(bhc.a);
    }

    public String toString() {
        return this.a;
    }
}
