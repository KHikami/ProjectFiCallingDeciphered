import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class zk {
    private static final List n;
    public final View a;
    public int b;
    public int c;
    public long d;
    public int e;
    int f;
    public zk g;
    public zk h;
    int i;
    zc j;
    boolean k;
    int l;
    RecyclerView m;
    private List o;
    private List p;
    private int q;

    static {
        n = Collections.EMPTY_LIST;
    }

    public zk(View view) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = null;
        this.h = null;
        this.o = null;
        this.p = null;
        this.q = 0;
        this.j = null;
        this.k = false;
        this.l = 0;
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final void a(int i, boolean z) {
        if (this.c == -1) {
            this.c = this.b;
        }
        if (this.f == -1) {
            this.f = this.b;
        }
        if (z) {
            this.f += i;
        }
        this.b += i;
        if (this.a.getLayoutParams() != null) {
            ((za) this.a.getLayoutParams()).c = true;
        }
    }

    public final void a() {
        this.c = -1;
        this.f = -1;
    }

    public final boolean b() {
        return (this.i & 128) != 0;
    }

    public final int c() {
        return this.f == -1 ? this.b : this.f;
    }

    public final int d() {
        if (this.m == null) {
            return -1;
        }
        return this.m.b(this);
    }

    final boolean e() {
        return this.j != null;
    }

    final void f() {
        this.j.b(this);
    }

    final boolean g() {
        return (this.i & 32) != 0;
    }

    final void h() {
        this.i &= -33;
    }

    public final void i() {
        this.i &= -257;
    }

    final void a(zc zcVar, boolean z) {
        this.j = zcVar;
        this.k = z;
    }

    public final boolean j() {
        return (this.i & 4) != 0;
    }

    final boolean k() {
        return (this.i & 2) != 0;
    }

    public final boolean l() {
        return (this.i & 1) != 0;
    }

    public final boolean m() {
        return (this.i & 8) != 0;
    }

    public final boolean a(int i) {
        return (this.i & i) != 0;
    }

    public final boolean n() {
        return (this.i & 256) != 0;
    }

    public final void a(int i, int i2) {
        this.i = (this.i & (i2 ^ -1)) | (i & i2);
    }

    public final void b(int i) {
        this.i |= i;
    }

    public final void a(Object obj) {
        if (obj == null) {
            b(1024);
        } else if ((this.i & 1024) == 0) {
            if (this.o == null) {
                this.o = new ArrayList();
                this.p = Collections.unmodifiableList(this.o);
            }
            this.o.add(obj);
        }
    }

    final void o() {
        if (this.o != null) {
            this.o.clear();
        }
        this.i &= -1025;
    }

    public final List p() {
        if ((this.i & 1024) != 0) {
            return n;
        }
        if (this.o == null || this.o.size() == 0) {
            return n;
        }
        return this.p;
    }

    final void q() {
        this.i = 0;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = -1;
        this.q = 0;
        this.g = null;
        this.h = null;
        o();
        this.l = 0;
    }

    public String toString() {
        Object obj;
        StringBuilder stringBuilder = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.b + " id=" + this.d + ", oldPos=" + this.c + ", pLpos:" + this.f);
        if (e()) {
            stringBuilder.append(" scrap ").append(this.k ? "[changeScrap]" : "[attachedScrap]");
        }
        if (j()) {
            stringBuilder.append(" invalid");
        }
        if (!l()) {
            stringBuilder.append(" unbound");
        }
        if (k()) {
            stringBuilder.append(" update");
        }
        if (m()) {
            stringBuilder.append(" removed");
        }
        if (b()) {
            stringBuilder.append(" ignored");
        }
        if (n()) {
            stringBuilder.append(" tmpDetached");
        }
        if (!r()) {
            stringBuilder.append(" not recyclable(" + this.q + ")");
        }
        if ((this.i & 512) != 0 || j()) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            stringBuilder.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            stringBuilder.append(" no parent");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void a(boolean z) {
        this.q = z ? this.q - 1 : this.q + 1;
        if (this.q < 0) {
            this.q = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && this.q == 1) {
            this.i |= 16;
        } else if (z && this.q == 0) {
            this.i &= -17;
        }
    }

    public final boolean r() {
        return (this.i & 16) == 0 && !kn.b(this.a);
    }

    public final boolean s() {
        return (this.i & 2) != 0;
    }
}
