package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.List;

public final class hlh extends gye<hlf> {
    public gyn<hlf> d;
    private final ViewGroup e;
    private final Context f;
    private final GoogleMapOptions g;
    private final List<hlj> h = new ArrayList();

    hlh(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.e = viewGroup;
        this.f = context;
        this.g = googleMapOptions;
    }

    private void e() {
        if (this.d != null && a() == null) {
            try {
                hli.a(this.f);
                hlw a = hmu.a(this.f).a(gym.a(this.f), this.g);
                if (a != null) {
                    this.d.a(new hlf(this.e, a));
                    for (hlj a2 : this.h) {
                        ((hlf) a()).a(a2);
                    }
                    this.h.clear();
                }
            } catch (RemoteException e) {
                throw new dt(e);
            } catch (gtr e2) {
            }
        }
    }

    protected void a(gyn<hlf> gyn_hlf) {
        this.d = gyn_hlf;
        e();
    }

    public void a(hlj hlj) {
        if (a() != null) {
            ((hlf) a()).a(hlj);
        } else {
            this.h.add(hlj);
        }
    }
}
