import com.google.android.gms.common.data.DataHolder;

public final class hur {
    public final DataHolder a;
    private final int b;
    private int c;

    public hur(DataHolder dataHolder) {
        this.c = -1;
        this.a = dataHolder;
        this.b = dataHolder.g();
    }

    public int a() {
        return this.b;
    }

    public String a(String str) {
        return this.a.b(str, this.c, this.a.a(this.c));
    }

    public void a(int i) {
        this.c = i;
    }

    public int b() {
        return this.c;
    }

    public boolean c() {
        this.c++;
        return this.c >= 0 && this.c < this.b;
    }

    public boolean d() {
        return this.c >= this.b;
    }
}
