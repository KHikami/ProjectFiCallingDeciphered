package defpackage;

public final class iin<E> {
    Object[] a;
    private int b;
    private boolean c;
    private int d;

    public iin(int i) {
        this.d = i;
        c();
    }

    private void c() {
        this.b = 0;
        this.c = false;
        this.a = new Object[this.d];
    }

    public void a(E e) {
        this.a[this.b] = e;
        this.b++;
        if (this.b == this.d) {
            this.b = 0;
            this.c = true;
        }
    }

    public int a() {
        if (this.c) {
            return this.d;
        }
        return this.b;
    }

    public E b() {
        if (this.c) {
            return this.a[this.b];
        }
        return null;
    }

    public E a(int i) {
        if (!this.c) {
            return this.a[i];
        }
        int i2 = this.b + i;
        if (i2 >= this.d) {
            i2 -= this.d;
        }
        return this.a[i2];
    }
}
