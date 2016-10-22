package defpackage;

/* renamed from: huq */
final class huq extends Thread {
    final /* synthetic */ huo a;

    public huq(huo huo) {
        this.a = huo;
        super("PeopleAggregator-contacts");
    }

    public final void run() {
        this.a.i.a("contacts query start");
        try {
            this.a.a(this.a.c(), null);
        } catch (Exception e) {
            gwb.b("PeopleAggregator", "Error while quering contacts", (Throwable) e);
            this.a.a(null, e);
        }
    }
}
