package defpackage;

/* compiled from: PG */
/* renamed from: xn */
final class xn implements Runnable {
    private /* synthetic */ xm a;

    xn(xm xmVar) {
        this.a = xmVar;
    }

    public final void run() {
        this.a.a.getParent().requestDisallowInterceptTouchEvent(true);
    }
}
