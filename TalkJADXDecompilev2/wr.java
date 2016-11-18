package defpackage;

public final class wr implements ws {
    final ws a;
    int b = 0;
    int c = -1;
    int d = -1;
    Object e = null;

    public wr(ws wsVar) {
        this.a = wsVar;
    }

    public void a() {
        if (this.b != 0) {
            switch (this.b) {
                case 1:
                    this.a.a(this.c, this.d);
                    break;
                case 2:
                    this.a.b(this.c, this.d);
                    break;
                case 3:
                    this.a.a(this.c, this.d, this.e);
                    break;
            }
            this.e = null;
            this.b = 0;
        }
    }

    public void a(int i, int i2) {
        if (this.b != 1 || i < this.c || i > this.c + this.d) {
            a();
            this.c = i;
            this.d = i2;
            this.b = 1;
            return;
        }
        this.d += i2;
        this.c = Math.min(i, this.c);
    }

    public void b(int i, int i2) {
        if (this.b != 2 || this.c < i || this.c > i + i2) {
            a();
            this.c = i;
            this.d = i2;
            this.b = 2;
            return;
        }
        this.d += i2;
        this.c = i;
    }

    public void c(int i, int i2) {
        a();
        this.a.c(i, i2);
    }

    public void a(int i, int i2, Object obj) {
        if (this.b != 3 || i > this.c + this.d || i + i2 < this.c || this.e != obj) {
            a();
            this.c = i;
            this.d = i2;
            this.e = obj;
            this.b = 3;
            return;
        }
        int i3 = this.c + this.d;
        this.c = Math.min(i, this.c);
        this.d = Math.max(i3, i + i2) - this.c;
    }
}
