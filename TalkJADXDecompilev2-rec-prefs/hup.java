package p000;

import android.database.MatrixCursor;

final class hup extends Thread {
    final /* synthetic */ huo f17335a;

    public hup(huo huo) {
        this.f17335a = huo;
        super("PeopleAggregator-aggregator");
    }

    public final void run() {
        try {
            huo huo = this.f17335a;
            gwb.m2047b(huo.f17325j.m9653b());
            huo.f17324i.mo3029a("agg start");
            hwl a = huo.mo2952a(new hur(huo.f17326k), new hur(huo.f17327l), huo.f17328m != null ? huo.f17328m : new MatrixCursor(hul.f17297a));
            huo.f17324i.mo3029a("agg finish");
            huo.f17324i.mo3030a("PeopleAggregator", 0);
            huo.f17317b.m20896a(0, null, a);
        } catch (Throwable e) {
            gwb.m2044b("PeopleAggregator", "Unknown exception during aggregation", e);
            this.f17335a.m20889d();
        }
    }
}
