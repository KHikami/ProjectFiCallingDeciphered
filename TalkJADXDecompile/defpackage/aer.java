package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import oa;

/* renamed from: aer */
public class aer {
    private static final List<Object> p;
    public final View a;
    public int b;
    int c;
    public long d;
    int e;
    int f;
    public aer g;
    public aer h;
    int i;
    List<Object> j;
    List<Object> k;
    aek l;
    boolean m;
    int n;
    RecyclerView o;
    private int q;

    static {
        p = Collections.EMPTY_LIST;
    }

    public aer(View view) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = null;
        this.h = null;
        this.j = null;
        this.k = null;
        this.q = 0;
        this.l = null;
        this.m = false;
        this.n = 0;
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public void a(int i, int i2, boolean z) {
        b(8);
        a(i2, z);
        this.b = i;
    }

    public void a(int i, boolean z) {
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
            ((aeg) this.a.getLayoutParams()).e = true;
        }
    }

    public void a() {
        this.c = -1;
        this.f = -1;
    }

    public void b() {
        if (this.c == -1) {
            this.c = this.b;
        }
    }

    public boolean c() {
        return (this.i & 128) != 0;
    }

    public final int d() {
        return this.f == -1 ? this.b : this.f;
    }

    public final int e() {
        if (this.o == null) {
            return -1;
        }
        return this.o.c(this);
    }

    boolean f() {
        return this.l != null;
    }

    void g() {
        this.l.b(this);
    }

    boolean h() {
        return (this.i & 32) != 0;
    }

    void i() {
        this.i &= -33;
    }

    public void j() {
        this.i &= -257;
    }

    void a(aek aek, boolean z) {
        this.l = aek;
        this.m = z;
    }

    public boolean k() {
        return (this.i & 4) != 0;
    }

    boolean l() {
        return (this.i & 2) != 0;
    }

    public boolean m() {
        return (this.i & 1) != 0;
    }

    public boolean n() {
        return (this.i & 8) != 0;
    }

    public boolean a(int i) {
        return (this.i & i) != 0;
    }

    public boolean o() {
        return (this.i & 256) != 0;
    }

    boolean p() {
        return (this.i & 512) != 0 || k();
    }

    public void a(int i, int i2) {
        this.i = (this.i & (i2 ^ -1)) | (i & i2);
    }

    public void b(int i) {
        this.i |= i;
    }

    public void a(Object obj) {
        if (obj == null) {
            b(1024);
        } else if ((this.i & 1024) == 0) {
            if (this.j == null) {
                this.j = new ArrayList();
                this.k = Collections.unmodifiableList(this.j);
            }
            this.j.add(obj);
        }
    }

    void q() {
        if (this.j != null) {
            this.j.clear();
        }
        this.i &= -1025;
    }

    public List<Object> r() {
        if ((this.i & 1024) != 0) {
            return p;
        }
        if (this.j == null || this.j.size() == 0) {
            return p;
        }
        return this.k;
    }

    void s() {
        this.i = 0;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = -1;
        this.q = 0;
        this.g = null;
        this.h = null;
        q();
        this.n = 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.b + " id=" + this.d + ", oldPos=" + this.c + ", pLpos:" + this.f);
        if (f()) {
            stringBuilder.append(" scrap ").append(this.m ? "[changeScrap]" : "[attachedScrap]");
        }
        if (k()) {
            stringBuilder.append(" invalid");
        }
        if (!m()) {
            stringBuilder.append(" unbound");
        }
        if (l()) {
            stringBuilder.append(" update");
        }
        if (n()) {
            stringBuilder.append(" removed");
        }
        if (c()) {
            stringBuilder.append(" ignored");
        }
        if (o()) {
            stringBuilder.append(" tmpDetached");
        }
        if (!t()) {
            stringBuilder.append(" not recyclable(" + this.q + ")");
        }
        if (p()) {
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

    public final boolean t() {
        return (this.i & 16) == 0 && !oa.a(this.a);
    }

    public boolean u() {
        return (this.i & 2) != 0;
    }
}
