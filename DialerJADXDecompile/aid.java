/* compiled from: PG */
final class aid implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ aic b;

    aid(aic aic, String str) {
        this.b = aic;
        this.a = str;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
