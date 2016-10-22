import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

public final class cpp extends cos {
    public final cpl f;

    public cpp(Context context, Looper looper, brf brf, brg brg, String str, bue bue) {
        super(context, looper, brf, brg, str, bue);
        this.f = new cpl(context, this.e);
    }

    public final void a() {
        synchronized (this.f) {
            if (b()) {
                try {
                    cpl cpl = this.f;
                    try {
                        synchronized (cpl.c) {
                            for (cpo cpo : cpl.c.values()) {
                                if (cpo != null) {
                                    ((cpf) cpl.a.a()).a(LocationRequestUpdateData.a(cpo, null));
                                }
                            }
                            cpl.c.clear();
                        }
                        synchronized (cpl.d) {
                            for (cpm cpm : cpl.d.values()) {
                                if (cpm != null) {
                                    ((cpf) cpl.a.a()).a(new LocationRequestUpdateData(1, 2, null, null, null, cpm.asBinder(), null));
                                }
                            }
                            cpl.d.clear();
                        }
                        cpl cpl2 = this.f;
                        if (cpl2.b) {
                            cpl2.a.b();
                            ((cpf) cpl2.a.a()).a(false);
                            cpl2.b = false;
                        }
                    } catch (Throwable e) {
                        throw new IllegalStateException(e);
                    }
                } catch (Throwable e2) {
                    throw new IllegalStateException(e2);
                } catch (Throwable e22) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e22);
                }
            }
            super.a();
        }
    }
}
