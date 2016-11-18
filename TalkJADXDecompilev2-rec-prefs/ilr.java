package p000;

public final class ilr {
    private iiu f18000a;
    private int f18001b = 0;
    private int f18002c = 0;

    void m22256a(iiu iiu) {
        iil.m21872a("Expected null", this.f18000a);
        this.f18000a = iiu;
    }

    int m22254a() {
        return this.f18001b;
    }

    void m22255a(int i) {
        iil.m21868a(i, 0, 3);
        this.f18001b = i;
        if (i == 0) {
            this.f18000a = null;
        }
    }

    void m22257b(int i) {
        boolean z;
        if (this.f18001b == 3) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        this.f18002c = 0;
    }
}
