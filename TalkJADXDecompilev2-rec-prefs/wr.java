package p000;

public final class wr implements ws {
    final ws f35604a;
    int f35605b = 0;
    int f35606c = -1;
    int f35607d = -1;
    Object f35608e = null;

    public wr(ws wsVar) {
        this.f35604a = wsVar;
    }

    public void m41211a() {
        if (this.f35605b != 0) {
            switch (this.f35605b) {
                case 1:
                    this.f35604a.mo4501a(this.f35606c, this.f35607d);
                    break;
                case 2:
                    this.f35604a.mo4503b(this.f35606c, this.f35607d);
                    break;
                case 3:
                    this.f35604a.mo4502a(this.f35606c, this.f35607d, this.f35608e);
                    break;
            }
            this.f35608e = null;
            this.f35605b = 0;
        }
    }

    public void mo4501a(int i, int i2) {
        if (this.f35605b != 1 || i < this.f35606c || i > this.f35606c + this.f35607d) {
            m41211a();
            this.f35606c = i;
            this.f35607d = i2;
            this.f35605b = 1;
            return;
        }
        this.f35607d += i2;
        this.f35606c = Math.min(i, this.f35606c);
    }

    public void mo4503b(int i, int i2) {
        if (this.f35605b != 2 || this.f35606c < i || this.f35606c > i + i2) {
            m41211a();
            this.f35606c = i;
            this.f35607d = i2;
            this.f35605b = 2;
            return;
        }
        this.f35607d += i2;
        this.f35606c = i;
    }

    public void mo4504c(int i, int i2) {
        m41211a();
        this.f35604a.mo4504c(i, i2);
    }

    public void mo4502a(int i, int i2, Object obj) {
        if (this.f35605b != 3 || i > this.f35606c + this.f35607d || i + i2 < this.f35606c || this.f35608e != obj) {
            m41211a();
            this.f35606c = i;
            this.f35607d = i2;
            this.f35608e = obj;
            this.f35605b = 3;
            return;
        }
        int i3 = this.f35606c + this.f35607d;
        this.f35606c = Math.min(i, this.f35606c);
        this.f35607d = Math.max(i3, i + i2) - this.f35606c;
    }
}
