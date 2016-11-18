package p000;

public final class iin<E> {
    Object[] f17738a;
    private int f17739b;
    private boolean f17740c;
    private int f17741d;

    public iin(int i) {
        this.f17741d = i;
        m21887c();
    }

    private void m21887c() {
        this.f17739b = 0;
        this.f17740c = false;
        this.f17738a = new Object[this.f17741d];
    }

    public void m21890a(E e) {
        this.f17738a[this.f17739b] = e;
        this.f17739b++;
        if (this.f17739b == this.f17741d) {
            this.f17739b = 0;
            this.f17740c = true;
        }
    }

    public int m21888a() {
        if (this.f17740c) {
            return this.f17741d;
        }
        return this.f17739b;
    }

    public E m21891b() {
        if (this.f17740c) {
            return this.f17738a[this.f17739b];
        }
        return null;
    }

    public E m21889a(int i) {
        if (!this.f17740c) {
            return this.f17738a[i];
        }
        int i2 = this.f17739b + i;
        if (i2 >= this.f17741d) {
            i2 -= this.f17741d;
        }
        return this.f17738a[i2];
    }
}
