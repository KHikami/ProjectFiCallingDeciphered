import java.io.Serializable;

public final class bhu implements Serializable {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public boolean a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public boolean c() {
        return this.a;
    }

    bhu(bhv bhv) {
        this.a = bhv.a;
        this.b = bhv.b;
        this.c = bhv.c;
    }
}
