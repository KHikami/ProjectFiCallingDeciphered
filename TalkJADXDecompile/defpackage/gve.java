package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: gve */
public class gve {
    public final DataHolder a;
    public int b;
    private int c;

    public gve(DataHolder dataHolder, int i) {
        this.a = (DataHolder) gwb.L((Object) dataHolder);
        a(i);
    }

    public int a(String str) {
        return this.a.a(str, this.b, this.c);
    }

    protected void a(int i) {
        boolean z = i >= 0 && i < this.a.g();
        gwb.a(z);
        this.b = i;
        this.c = this.a.a(this.b);
    }

    public String b(String str) {
        return this.a.b(str, this.b, this.c);
    }

    public byte[] c(String str) {
        return this.a.c(str, this.b, this.c);
    }

    public boolean e() {
        return !this.a.h();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof gve)) {
            return false;
        }
        gve gve = (gve) obj;
        return gwb.e(Integer.valueOf(gve.b), Integer.valueOf(this.b)) && gwb.e(Integer.valueOf(gve.c), Integer.valueOf(this.c)) && gve.a == this.a;
    }

    public int hashCode() {
        return gwb.a(Integer.valueOf(this.b), Integer.valueOf(this.c), this.a);
    }
}
