import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Base64;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class cmo extends bui {
    private static final int g;
    private static final int h;
    private final bur e;
    private volatile int f;

    static {
        g = (int) TimeUnit.SECONDS.toMillis(10);
        h = (int) TimeUnit.SECONDS.toMillis(60);
    }

    public cmo(Context context) {
        super(context, context.getMainLooper(), 25, new brd(context).a());
        this.f = h;
        this.e = new bur(context.getMainLooper(), this);
    }

    static String a(String str) {
        return Base64.encodeToString(("ERROR : " + str).getBytes(), 11);
    }

    static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final String a(String str, Map map, DroidGuardResultsRequest droidGuardResultsRequest) {
        buf.p("getResults() must not be called on the main thread.");
        BlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        cjy cmp = new cmp(this, new cmu(this, linkedBlockingQueue));
        brf cms = new cms(this, new cmq(this, cmp), str, map, droidGuardResultsRequest, cmp);
        brg cmt = new cmt(this, cmp);
        this.e.a(cms);
        this.e.a(cmt);
        i_();
        try {
            Object poll = linkedBlockingQueue.poll((long) g, TimeUnit.MILLISECONDS);
            if (poll == null) {
                int i = this.f - g;
                poll = i > 0 ? linkedBlockingQueue.poll((long) i, TimeUnit.MILLISECONDS) : null;
            }
            String str2 = (String) poll;
            return str2 == null ? a("Timeout: " + this.f + "ms") : str2;
        } catch (InterruptedException e) {
            return a("Interrupted: " + e);
        }
    }

    public final void a() {
        this.e.a();
        super.a();
    }

    public final void a(int i) {
        super.a(i);
        this.e.a(i);
    }

    public final /* synthetic */ void a(IInterface iInterface) {
        super.a((cnb) iInterface);
        this.e.a(null);
    }

    public final void a(ConnectionResult connectionResult) {
        super.a(connectionResult);
        this.e.a(connectionResult);
    }

    protected final String f() {
        return "com.google.android.gms.droidguard.service.START";
    }

    protected final String g() {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    public final void i_() {
        this.e.d = true;
        super.i_();
    }

    protected final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof cnb)) ? new cnd(iBinder) : (cnb) queryLocalInterface;
    }

    static /* synthetic */ void a(cmo cmo) {
        try {
            cmo.f = ((cnb) cmo.l()).b();
        } catch (Exception e) {
            cmo.f = h;
        }
    }
}
