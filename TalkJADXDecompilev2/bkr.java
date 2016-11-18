package defpackage;

import android.content.Context;

final class bkr implements Runnable {
    final /* synthetic */ Integer[] a;
    final /* synthetic */ Context b;

    bkr(Integer[] numArr, Context context) {
        this.a = numArr;
        this.b = context;
    }

    public void run() {
        for (Integer a : this.a) {
            bmr.b(this.b, gwb.a(a, -1));
        }
    }
}
