package p000;

final class msg<V> implements Runnable {
    final mrz<V> f28257a;
    final mti<? extends V> f28258b;

    msg(mrz<V> mrz_V, mti<? extends V> mti__extends_V) {
        this.f28257a = mrz_V;
        this.f28258b = mti__extends_V;
    }

    public void run() {
        if (this.f28257a.value == this) {
            if (mrz.f28241d.mo3934a(this.f28257a, (Object) this, mrz.m32815b(this.f28258b))) {
                mrz.m32813a(this.f28257a);
            }
        }
    }
}
