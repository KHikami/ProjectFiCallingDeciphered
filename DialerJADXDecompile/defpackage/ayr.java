package defpackage;

/* compiled from: PG */
/* renamed from: ayr */
public final class ayr {
    int a;

    public ayr() {
        this.a = -1;
    }

    public final void a(int i) {
        if (i == 0 || i == 1) {
            this.a = i;
        } else {
            this.a = -1;
        }
    }

    public final String toString() {
        return "(CameraDir:" + this.a + ")";
    }
}
