package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* renamed from: va */
public class va {
    final /* synthetic */ RecyclerView a;

    public zk a(int i) {
        zk b;
        RecyclerView recyclerView = this.a;
        int b2 = recyclerView.e.b();
        int i2 = 0;
        zk zkVar = null;
        while (i2 < b2) {
            b = RecyclerView.b(recyclerView.e.c(i2));
            if (b != null && !b.m() && b.b == i) {
                if (!recyclerView.e.d(b.a)) {
                    break;
                }
            } else {
                b = zkVar;
            }
            i2++;
            zkVar = b;
        }
        b = zkVar;
        if (b == null) {
            return null;
        }
        if (this.a.e.d(b.a)) {
            return null;
        }
        return b;
    }

    public void a(int i, int i2) {
        this.a.a(i, i2, true);
        this.a.B = true;
        zi ziVar = this.a.A;
        ziVar.e += i2;
    }

    public void b(int i, int i2) {
        this.a.a(i, i2, false);
        this.a.B = true;
    }

    public void a(int i, int i2, Object obj) {
        int i3;
        RecyclerView recyclerView = this.a;
        int b = recyclerView.e.b();
        int i4 = i + i2;
        for (i3 = 0; i3 < b; i3++) {
            View c = recyclerView.e.c(i3);
            zk b2 = RecyclerView.b(c);
            if (b2 != null && !b2.b() && b2.b >= i && b2.b < i4) {
                b2.b(2);
                b2.a(obj);
                ((za) c.getLayoutParams()).c = true;
            }
        }
        zc zcVar = recyclerView.c;
        b = i + i2;
        for (i3 = zcVar.c.size() - 1; i3 >= 0; i3--) {
            zk zkVar = (zk) zcVar.c.get(i3);
            if (zkVar != null) {
                i4 = zkVar.c();
                if (i4 >= i && i4 < b) {
                    zkVar.b(2);
                    zcVar.a(i3);
                }
            }
        }
        this.a.C = true;
    }

    public void a(vb vbVar) {
        c(vbVar);
    }

    public void b(vb vbVar) {
        c(vbVar);
    }

    public void c(int i, int i2) {
        int i3;
        RecyclerView recyclerView = this.a;
        int b = recyclerView.e.b();
        for (i3 = 0; i3 < b; i3++) {
            zk b2 = RecyclerView.b(recyclerView.e.c(i3));
            if (!(b2 == null || b2.b() || b2.b < i)) {
                b2.a(i2, false);
                recyclerView.A.f = true;
            }
        }
        zc zcVar = recyclerView.c;
        int size = zcVar.c.size();
        for (i3 = 0; i3 < size; i3++) {
            zk zkVar = (zk) zcVar.c.get(i3);
            if (zkVar != null && zkVar.b >= i) {
                zkVar.a(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.a.B = true;
    }

    public void d(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = -1;
        RecyclerView recyclerView = this.a;
        int b = recyclerView.e.b();
        if (i < i2) {
            i3 = -1;
            i4 = i2;
            i5 = i;
        } else {
            i3 = 1;
            i4 = i;
            i5 = i2;
        }
        for (i6 = 0; i6 < b; i6++) {
            zk b2 = RecyclerView.b(recyclerView.e.c(i6));
            if (b2 != null && b2.b >= r4 && b2.b <= r3) {
                if (b2.b == i) {
                    b2.a(i2 - i, false);
                } else {
                    b2.a(i3, false);
                }
                recyclerView.A.f = true;
            }
        }
        zc zcVar = recyclerView.c;
        if (i < i2) {
            i4 = i2;
            i5 = i;
        } else {
            i7 = 1;
            i4 = i;
            i5 = i2;
        }
        int size = zcVar.c.size();
        for (i6 = 0; i6 < size; i6++) {
            zk zkVar = (zk) zcVar.c.get(i6);
            if (zkVar != null && zkVar.b >= r4 && zkVar.b <= r3) {
                if (zkVar.b == i) {
                    zkVar.a(i2 - i, false);
                } else {
                    zkVar.a(i7, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.a.B = true;
    }

    public va(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    void c(vb vbVar) {
        yz yzVar;
        switch (vbVar.a) {
            case rq.b /*1*/:
                yzVar = this.a.k;
            case rq.c /*2*/:
                yzVar = this.a.k;
            case rl.f /*4*/:
                yzVar = this.a.k;
            case rl.j /*8*/:
                yzVar = this.a.k;
            default:
        }
    }
}
