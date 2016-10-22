final class msg<V> implements Runnable {
    final mrz<V> a;
    final mti<? extends V> b;

    msg(mrz<V> mrz_V, mti<? extends V> mti__extends_V) {
        this.a = mrz_V;
        this.b = mti__extends_V;
    }

    public void run() {
        if (this.a.value == this) {
            if (mrz.d.a(this.a, (Object) this, mrz.b(this.b))) {
                mrz.a(this.a);
            }
        }
    }
}
