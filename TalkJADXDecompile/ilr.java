public final class ilr {
    private iiu a;
    private int b;
    private int c;

    public ilr() {
        this.b = 0;
        this.c = 0;
    }

    void a(iiu iiu) {
        iil.a("Expected null", this.a);
        this.a = iiu;
    }

    int a() {
        return this.b;
    }

    void a(int i) {
        iil.a(i, 0, 3);
        this.b = i;
        if (i == 0) {
            this.a = null;
        }
    }

    void b(int i) {
        boolean z;
        if (this.b == 3) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        this.c = 0;
    }
}
