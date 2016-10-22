import java.io.Serializable;

public final class fbk implements Serializable {
    private static final long serialVersionUID = 1;
    private final String a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final String f;

    fbk(String str, boolean z, boolean z2, boolean z3, int i, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i;
        this.f = str2;
    }
}
