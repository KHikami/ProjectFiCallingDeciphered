package defpackage;

public final class izd<E> {
    private int a;
    private int[] b;
    private Object[] c;
    private int d;

    public izd() {
        c();
    }

    public void a() {
        c();
    }

    private void c() {
        this.a = 0;
        this.b = new int[izb.a[this.a]];
        this.c = new Object[izb.a[this.a]];
    }

    public E a(int i, E e) {
        boolean z = false;
        ba.a((Object) e);
        int c = c(i);
        if (this.c[c] != null) {
            return this.c[c];
        }
        this.b[c] = i;
        this.d++;
        this.c[c] = e;
        if (this.d > this.b.length / 2) {
            if (this.a < izb.a.length - 1) {
                int[] iArr = this.b;
                Object[] objArr = this.c;
                this.a++;
                this.b = new int[izb.a[this.a]];
                this.c = new Object[izb.a[this.a]];
                int i2 = this.d;
                int length = iArr.length;
                this.d = 0;
                for (c = 0; c < length; c++) {
                    if (objArr[c] != null) {
                        a(iArr[c], objArr[c]);
                    }
                }
                if (i2 == this.d) {
                    z = true;
                }
                ba.b(z);
            } else {
                throw new IllegalStateException("Too many items, you'd better use array map instead.");
            }
        }
        return null;
    }

    public E a(int i) {
        return this.c[c(i)];
    }

    private int c(int i) {
        int length = this.b.length;
        int a = (izb.a(i) & Integer.MAX_VALUE) % length;
        while (this.c[a] != null && this.b[a] != i) {
            a++;
            if (a >= length) {
                a = 0;
            }
        }
        return a;
    }

    public boolean b(int i) {
        return a(i) != null;
    }

    public ize<E> b() {
        return new ize(this.b, this.c);
    }
}
