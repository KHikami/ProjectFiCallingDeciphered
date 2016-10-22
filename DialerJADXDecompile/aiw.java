import java.util.ArrayList;

/* compiled from: PG */
public final class aiw {
    public final String a;
    public final ArrayList b;
    public final ArrayList c;

    public aiw(String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = str;
        a("");
    }

    public final void a(String str) {
        this.b.add(Long.valueOf(System.currentTimeMillis()));
        this.c.add(str);
    }
}
