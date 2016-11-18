package p000;

final class huq extends Thread {
    final /* synthetic */ huo f17336a;

    public huq(huo huo) {
        this.f17336a = huo;
        super("PeopleAggregator-contacts");
    }

    public final void run() {
        this.f17336a.f17324i.mo3029a("contacts query start");
        try {
            this.f17336a.m20884a(this.f17336a.mo2953c(), null);
        } catch (Exception e) {
            gwb.m2044b("PeopleAggregator", "Error while quering contacts", (Throwable) e);
            this.f17336a.m20884a(null, e);
        }
    }
}
