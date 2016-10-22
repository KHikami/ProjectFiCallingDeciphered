package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: aac */
public abstract class aac extends yv {
    private boolean a;

    public abstract boolean a(zk zkVar);

    public abstract boolean a(zk zkVar, int i, int i2, int i3, int i4);

    public abstract boolean a(zk zkVar, zk zkVar2, int i, int i2, int i3, int i4);

    public abstract boolean b(zk zkVar);

    public aac() {
        this.a = true;
    }

    public final boolean f(zk zkVar) {
        return !this.a || zkVar.j();
    }

    public final boolean a(zk zkVar, yx yxVar, yx yxVar2) {
        int i = yxVar.a;
        int i2 = yxVar.b;
        View view = zkVar.a;
        int left = yxVar2 == null ? view.getLeft() : yxVar2.a;
        int top = yxVar2 == null ? view.getTop() : yxVar2.b;
        if (zkVar.m() || (i == left && i2 == top)) {
            return a(zkVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return a(zkVar, i, i2, left, top);
    }

    public final boolean b(zk zkVar, yx yxVar, yx yxVar2) {
        if (yxVar == null || (yxVar.a == yxVar2.a && yxVar.b == yxVar2.b)) {
            return b(zkVar);
        }
        return a(zkVar, yxVar.a, yxVar.b, yxVar2.a, yxVar2.b);
    }

    public final boolean c(zk zkVar, yx yxVar, yx yxVar2) {
        if (yxVar.a == yxVar2.a && yxVar.b == yxVar2.b) {
            e(zkVar);
            return false;
        }
        return a(zkVar, yxVar.a, yxVar.b, yxVar2.a, yxVar2.b);
    }

    public final boolean a(zk zkVar, zk zkVar2, yx yxVar, yx yxVar2) {
        int i;
        int i2;
        int i3 = yxVar.a;
        int i4 = yxVar.b;
        if (zkVar2.b()) {
            i = yxVar.a;
            i2 = yxVar.b;
        } else {
            i = yxVar2.a;
            i2 = yxVar2.b;
        }
        return a(zkVar, zkVar2, i3, i4, i, i2);
    }
}
