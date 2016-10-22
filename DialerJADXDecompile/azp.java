/* compiled from: PG */
final class azp implements Runnable {
    private /* synthetic */ azo a;

    azp(azo azo) {
        this.a = azo;
    }

    public final void run() {
        bdj bdj = this.a;
        azq azq = (azq) bdj.i;
        if (azq == null) {
            bdj.f.a();
        } else if (bdj.e()) {
            azq.a(true, System.currentTimeMillis() - bdj.c.g());
        } else {
            azq.a(false, 0);
            bdj.f.a();
        }
    }
}
