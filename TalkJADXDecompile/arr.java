import android.graphics.Bitmap.Config;

final class arr implements aro {
    int a;
    private final ars b;
    private Config c;

    public arr(ars ars) {
        this.b = ars;
    }

    public void a(int i, Config config) {
        this.a = i;
        this.c = config;
    }

    public void a() {
        this.b.a(this);
    }

    public String toString() {
        return arp.a(this.a, this.c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof arr)) {
            return false;
        }
        arr arr = (arr) obj;
        if (this.a == arr.a && baq.a(this.c, arr.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.c != null ? this.c.hashCode() : 0) + (this.a * 31);
    }
}
