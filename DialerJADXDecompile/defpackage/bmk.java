package defpackage;

import android.os.Handler;

/* renamed from: bmk */
final class bmk implements Runnable {
    private /* synthetic */ bot a;
    private /* synthetic */ Handler b;
    private /* synthetic */ int c;
    private /* synthetic */ bmi d;

    bmk(bmi bmi, bot bot, Handler handler, int i) {
        this.d = bmi;
        this.a = bot;
        this.b = handler;
        this.c = i;
    }

    public final void run() {
        this.d.a(this.a, this.b, this.c);
    }
}
