package p000;

import android.content.Context;

final class bkr implements Runnable {
    final /* synthetic */ Integer[] f3661a;
    final /* synthetic */ Context f3662b;

    bkr(Integer[] numArr, Context context) {
        this.f3661a = numArr;
        this.f3662b = context;
    }

    public void run() {
        for (Integer a : this.f3661a) {
            bmr.m6176b(this.f3662b, gwb.m1508a(a, -1));
        }
    }
}
