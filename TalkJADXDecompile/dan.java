import java.io.Serializable;

public final class dan extends dam implements Serializable {
    public final String a;
    public final String b;

    public dan(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String toString() {
        return this.a;
    }
}
