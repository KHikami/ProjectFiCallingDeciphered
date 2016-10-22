import java.util.concurrent.TimeUnit;

/* compiled from: PG */
final class cus implements cue {
    final /* synthetic */ cur a;

    cus(cur cur) {
        this.a = cur;
    }

    public final void a() {
        this.a.a(Integer.valueOf(2));
        cur cur = this.a;
        if (cur.a != null) {
            cur.a.cancel(true);
            cur.a = null;
        }
        if (cur.b != null) {
            cur.b.cancel(true);
            cur.b = null;
        }
        this.a.b = this.a.c.schedule(new cut(this), 10, TimeUnit.SECONDS);
    }
}
