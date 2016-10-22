/* compiled from: PG */
public class dko {
    public final /* synthetic */ bku a;
    public final /* synthetic */ bkk b;

    public void a(Throwable th) {
        buf.a("SpamAsyncTaskUtil, error while fetching list updates via gRPC", th);
        buf.H(this.b.c).a(100001);
        if (this.a != null) {
            this.a.a(false);
        }
    }

    public void a() {
        buf.a("SpamAsyncTaskUtil, gRPC blocked list fetching completed.", new Object[0]);
    }

    public dko(bkk bkk, bku bku) {
        this.b = bkk;
        this.a = bku;
    }

    public void a(dda dda) {
        buf.a("SpamAsyncTaskUtil, gRPC data received from server", new Object[0]);
        long j = dda.a;
        String[] strArr = dda.c;
        StringBuilder stringBuilder = new StringBuilder();
        for (String append : strArr) {
            stringBuilder.append(append);
            stringBuilder.append(" ");
        }
        String valueOf = String.valueOf(stringBuilder.toString());
        buf.a(new StringBuilder(String.valueOf(valueOf).length() + 93).append("SpamAsyncTaskUtil, updated spam list for countryIso: ").append(valueOf).append(" blacklist version: ").append(j).toString(), new Object[0]);
        ddb ddb = dda.b;
        if (ddb == null || j <= 0) {
            buf.a("SpamAsyncTaskUtil, spam list from server was empty", new Object[0]);
            buf.H(this.b.c).a(100007);
            if (this.a != null) {
                this.a.a(true);
                return;
            }
            return;
        }
        bkz bkz;
        if (ddb.a != null) {
            bkz = this.b.b;
            dcx dcx = ddb.a;
            avl.b();
            if (bkz.a.a(dcx, j, strArr)) {
                buf.H(this.b.c).a(100003);
                buf.a("SpamAsyncTaskUtil, updated spam list with complete list to blacklist version: " + j, new Object[0]);
                if (this.a != null) {
                    this.a.a(true);
                    return;
                }
                return;
            }
        }
        if (ddb.b != null) {
            bkz = this.b.b;
            dcy dcy = ddb.b;
            avl.b();
            if (bkz.a.a(dcy, j, strArr)) {
                buf.H(this.b.c).a(100004);
                buf.a("SpamAsyncTaskUtil, updated spam list with difference list to blacklist version: " + j, new Object[0]);
                if (this.a != null) {
                    this.a.a(true);
                    return;
                }
                return;
            }
        }
        buf.a("SpamAsyncTaskUtil, could not update spam list to blacklist version: " + j, new Object[0]);
        buf.H(this.b.c).a(100002);
        if (this.a != null) {
            this.a.a(false);
        }
    }
}
