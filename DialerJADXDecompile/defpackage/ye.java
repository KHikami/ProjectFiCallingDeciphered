package defpackage;

/* compiled from: PG */
/* renamed from: ye */
final class ye implements Runnable {
    private /* synthetic */ xx a;

    ye(xx xxVar) {
        this.a = xxVar;
    }

    public final void run() {
        if (this.a.e != null && kn.r(this.a.e) && this.a.e.getCount() > this.a.e.getChildCount() && this.a.e.getChildCount() <= this.a.i) {
            this.a.q.setInputMethodMode(2);
            this.a.b();
        }
    }
}
