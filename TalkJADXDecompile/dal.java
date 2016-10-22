import java.io.Serializable;

public final class dal extends dam implements Serializable {
    public final String a;

    public dal(String str) {
        this.a = str;
    }

    public String toString() {
        return this.a;
    }

    public String a() {
        return this.a;
    }
}
