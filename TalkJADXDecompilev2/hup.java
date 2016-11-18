package defpackage;

import android.database.MatrixCursor;

final class hup extends Thread {
    final /* synthetic */ huo a;

    public hup(huo huo) {
        this.a = huo;
        super("PeopleAggregator-aggregator");
    }

    public final void run() {
        try {
            huo huo = this.a;
            gwb.b(huo.j.b());
            huo.i.a("agg start");
            hwl a = huo.a(new hur(huo.k), new hur(huo.l), huo.m != null ? huo.m : new MatrixCursor(hul.a));
            huo.i.a("agg finish");
            huo.i.a("PeopleAggregator", 0);
            huo.b.a(0, null, a);
        } catch (Throwable e) {
            gwb.b("PeopleAggregator", "Unknown exception during aggregation", e);
            this.a.d();
        }
    }
}
