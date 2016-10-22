public final class aey {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;

    public aey() {
        this.a = 0;
        this.b = 0;
        this.c = nzf.UNSET_ENUM_VALUE;
        this.d = nzf.UNSET_ENUM_VALUE;
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = false;
    }

    public int a() {
        return this.g ? this.b : this.a;
    }

    public int b() {
        return this.g ? this.a : this.b;
    }

    public void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != nzf.UNSET_ENUM_VALUE) {
                this.a = i2;
            }
            if (i != nzf.UNSET_ENUM_VALUE) {
                this.b = i;
                return;
            }
            return;
        }
        if (i != nzf.UNSET_ENUM_VALUE) {
            this.a = i;
        }
        if (i2 != nzf.UNSET_ENUM_VALUE) {
            this.b = i2;
        }
    }

    public void b(int i, int i2) {
        this.h = false;
        if (i != nzf.UNSET_ENUM_VALUE) {
            this.e = i;
            this.a = i;
        }
        if (i2 != nzf.UNSET_ENUM_VALUE) {
            this.f = i2;
            this.b = i2;
        }
    }

    public void a(boolean z) {
        if (z != this.g) {
            this.g = z;
            if (!this.h) {
                this.a = this.e;
                this.b = this.f;
            } else if (z) {
                this.a = this.d != nzf.UNSET_ENUM_VALUE ? this.d : this.e;
                this.b = this.c != nzf.UNSET_ENUM_VALUE ? this.c : this.f;
            } else {
                this.a = this.c != nzf.UNSET_ENUM_VALUE ? this.c : this.e;
                this.b = this.d != nzf.UNSET_ENUM_VALUE ? this.d : this.f;
            }
        }
    }
}
