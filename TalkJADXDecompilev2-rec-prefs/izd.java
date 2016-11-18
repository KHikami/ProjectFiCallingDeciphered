package p000;

public final class izd<E> {
    private int f19462a;
    private int[] f19463b;
    private Object[] f19464c;
    private int f19465d;

    public izd() {
        m23565c();
    }

    public void m23568a() {
        m23565c();
    }

    private void m23565c() {
        this.f19462a = 0;
        this.f19463b = new int[izb.f19450a[this.f19462a]];
        this.f19464c = new Object[izb.f19450a[this.f19462a]];
    }

    public E m23567a(int i, E e) {
        boolean z = false;
        ba.m4536a((Object) e);
        int c = m23564c(i);
        if (this.f19464c[c] != null) {
            return this.f19464c[c];
        }
        this.f19463b[c] = i;
        this.f19465d++;
        this.f19464c[c] = e;
        if (this.f19465d > this.f19463b.length / 2) {
            if (this.f19462a < izb.f19450a.length - 1) {
                int[] iArr = this.f19463b;
                Object[] objArr = this.f19464c;
                this.f19462a++;
                this.f19463b = new int[izb.f19450a[this.f19462a]];
                this.f19464c = new Object[izb.f19450a[this.f19462a]];
                int i2 = this.f19465d;
                int length = iArr.length;
                this.f19465d = 0;
                for (c = 0; c < length; c++) {
                    if (objArr[c] != null) {
                        m23567a(iArr[c], objArr[c]);
                    }
                }
                if (i2 == this.f19465d) {
                    z = true;
                }
                ba.m4609b(z);
            } else {
                throw new IllegalStateException("Too many items, you'd better use array map instead.");
            }
        }
        return null;
    }

    public E m23566a(int i) {
        return this.f19464c[m23564c(i)];
    }

    private int m23564c(int i) {
        int length = this.f19463b.length;
        int a = (izb.m23554a(i) & Integer.MAX_VALUE) % length;
        while (this.f19464c[a] != null && this.f19463b[a] != i) {
            a++;
            if (a >= length) {
                a = 0;
            }
        }
        return a;
    }

    public boolean m23570b(int i) {
        return m23566a(i) != null;
    }

    public ize<E> m23569b() {
        return new ize(this.f19463b, this.f19464c);
    }
}
