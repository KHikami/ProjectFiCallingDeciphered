package p000;

public final class aey {
    private int f488a = 0;
    private int f489b = 0;
    private int f490c = nzf.UNSET_ENUM_VALUE;
    private int f491d = nzf.UNSET_ENUM_VALUE;
    private int f492e = 0;
    private int f493f = 0;
    private boolean f494g = false;
    private boolean f495h = false;

    public int m901a() {
        return this.f494g ? this.f489b : this.f488a;
    }

    public int m904b() {
        return this.f494g ? this.f488a : this.f489b;
    }

    public void m902a(int i, int i2) {
        this.f490c = i;
        this.f491d = i2;
        this.f495h = true;
        if (this.f494g) {
            if (i2 != nzf.UNSET_ENUM_VALUE) {
                this.f488a = i2;
            }
            if (i != nzf.UNSET_ENUM_VALUE) {
                this.f489b = i;
                return;
            }
            return;
        }
        if (i != nzf.UNSET_ENUM_VALUE) {
            this.f488a = i;
        }
        if (i2 != nzf.UNSET_ENUM_VALUE) {
            this.f489b = i2;
        }
    }

    public void m905b(int i, int i2) {
        this.f495h = false;
        if (i != nzf.UNSET_ENUM_VALUE) {
            this.f492e = i;
            this.f488a = i;
        }
        if (i2 != nzf.UNSET_ENUM_VALUE) {
            this.f493f = i2;
            this.f489b = i2;
        }
    }

    public void m903a(boolean z) {
        if (z != this.f494g) {
            this.f494g = z;
            if (!this.f495h) {
                this.f488a = this.f492e;
                this.f489b = this.f493f;
            } else if (z) {
                this.f488a = this.f491d != nzf.UNSET_ENUM_VALUE ? this.f491d : this.f492e;
                this.f489b = this.f490c != nzf.UNSET_ENUM_VALUE ? this.f490c : this.f493f;
            } else {
                this.f488a = this.f490c != nzf.UNSET_ENUM_VALUE ? this.f490c : this.f492e;
                this.f489b = this.f491d != nzf.UNSET_ENUM_VALUE ? this.f491d : this.f493f;
            }
        }
    }
}
