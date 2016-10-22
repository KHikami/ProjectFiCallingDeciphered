import android.content.Context;
import java.util.Objects;

/* compiled from: PG */
public final class bkk {
    public final avm a;
    public final bkz b;
    public final Context c;

    public bkk(Context context) {
        this(context, new bkz(context));
    }

    public bkk(Context context, bkz bkz) {
        this.c = context;
        this.b = bkz;
        this.a = avn.b();
    }

    public static int a(int i) {
        switch (i) {
            case rl.c /*0*/:
                return 0;
            case rq.b /*1*/:
                return 1;
            case rq.c /*2*/:
                return 2;
            default:
                throw new IllegalArgumentException(i + " does not match any ReportingLocation in the spam_report.proto");
        }
    }

    public final void a(bks bks, String str, String str2) {
        Objects.requireNonNull(bks);
        avm avm = this.a;
        bkv bkv = bkv.CHECK_SPAM_NUMBER;
        avm.a(new bkm(this, str, str2, bks), new Void[0]);
    }

    public final void a(bkt bkt, String str, String str2) {
        Objects.requireNonNull(bkt);
        avm avm = this.a;
        bkv bkv = bkv.CHECK_NUMBER_IN_USER_SPAM_LIST;
        avm.a(new bko(this, str, str2, bkt), new Void[0]);
    }
}
