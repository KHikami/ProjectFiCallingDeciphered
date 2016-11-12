import android.content.Context;
import android.content.ServiceConnection;
import android.os.AsyncTask;

public final class iri {//used for hangout id creation.
    private static boolean h;//has account mapper perhaps?
    final Context a;
    iti b; //URL for connection?
    ijn c;
    ikc d;
    final ServiceConnection e;//new call service connection for the hangouts session
    private final iko f;//hangouts support checker
    private final iiv g;//stores the account mapper for hangouts

    static {
        h = false;
    }

    public iri(Context context) {
        this.e = new irj(this);//creates a related service connection for hangout session (not worth looking into)
        this.a = context;
        this.f = new iko();//hash set that takes into account the hardware etc. for hangouts
        if (!this.f.a(context)) {
            itx.a(6, "vclib", "Hangouts not supported by this device");//error! hangouts not supported by device
        }
        if (!h) {
            jyn.b(this.a).a(iiv.class, new iiv());//creates an Account mapper for the session if h not true yet.
            h = true;
        }
        this.g = (iiv) jyn.b(context).a(iiv.class);
        this.b = new iti(context);//URL for connection???
    }

    public void a(iti iti) {
        this.b = (iti) ba.a((Object) iti);
    }

    public void finalize() {
        c();
    }

    private void c() {
        if (this.c != null) {
            this.c.a(10030);
            this.c = null;
        }
        a();
    }

    void a() {//disconnects the call service
        if (this.d != null) {
            try {
                this.d.a();
                this.a.unbindService(this.e);
                this.d = null;
            } catch (Throwable e) {
                itx.a("vclib", "Error disconnecting CallService", e);
            }
        }
    }

    public void a(String str, irl irl) {//used in creating a hangout id
        new irm(this, this.g.a(str), irl).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public ite a(itf itf) {
        iil.a("Expected null", this.c);
        this.c = new ijn(this.a, this.b, itf);
        this.c.a(new irk(this));
        return this.c;
    }

    public ite b() {
        return this.c;
    }

    public ijh a(String str, itg itg) {
        ijh ipg = new ipg(this.a, this.b, null);
        ipg.a(this.g.a(str), itg);
        return ipg;
    }
}
