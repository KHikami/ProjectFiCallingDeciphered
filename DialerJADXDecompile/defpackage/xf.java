package defpackage;

/* compiled from: PG */
/* renamed from: xf */
final class xf {
    public zk a;
    public zk b;
    public int c;
    public int d;
    public int e;
    public int f;

    private xf(zk zkVar, zk zkVar2) {
        this.a = zkVar;
        this.b = zkVar2;
    }

    xf(zk zkVar, zk zkVar2, int i, int i2, int i3, int i4) {
        this(zkVar, zkVar2);
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String toString() {
        return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
    }
}
