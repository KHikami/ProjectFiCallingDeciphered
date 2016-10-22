/* compiled from: PG */
public final class zr {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    public zr() {
        this.a = 0;
        this.b = 0;
        this.c = oe.INVALID_ID;
        this.d = oe.INVALID_ID;
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = false;
    }

    public final void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != oe.INVALID_ID) {
                this.a = i2;
            }
            if (i != oe.INVALID_ID) {
                this.b = i;
                return;
            }
            return;
        }
        if (i != oe.INVALID_ID) {
            this.a = i;
        }
        if (i2 != oe.INVALID_ID) {
            this.b = i2;
        }
    }
}
