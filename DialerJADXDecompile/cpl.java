import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.HashMap;
import java.util.Map;

public final class cpl {
    final cpu a;
    boolean b;
    Map c;
    Map d;
    private final Context e;
    private ContentProviderClient f;

    public cpl(Context context, cpu cpu) {
        this.f = null;
        this.b = false;
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = context;
        this.a = cpu;
    }

    public final Location a() {
        this.a.b();
        try {
            return ((cpf) this.a.a()).b(this.e.getPackageName());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    final cpo a(com com, Looper looper) {
        cpo cpo;
        synchronized (this.c) {
            cpo = (cpo) this.c.get(com);
            if (cpo == null) {
                cpo = new cpo(com, looper);
            }
            this.c.put(com, cpo);
        }
        return cpo;
    }

    public final void a(com com, coz coz) {
        this.a.b();
        buf.d((Object) com, (Object) "Invalid null listener");
        synchronized (this.c) {
            cpo cpo = (cpo) this.c.remove(com);
            if (cpo != null) {
                cpo.a = null;
                ((cpf) this.a.a()).a(LocationRequestUpdateData.a(cpo, coz));
            }
        }
    }
}
