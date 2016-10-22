import java.io.Serializable;

public final class etz implements Serializable {
    private static final long serialVersionUID = 1;
    private final String a;
    private final String b;
    private final long c;
    private final boolean d;

    public etz(String str, String str2, long j, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
    }

    public String a() {
        return this.b;
    }
}
