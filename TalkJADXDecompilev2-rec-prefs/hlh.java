package p000;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.List;

public final class hlh extends gye<hlf> {
    public gyn<hlf> f17072d;
    private final ViewGroup f17073e;
    private final Context f17074f;
    private final GoogleMapOptions f17075g;
    private final List<hlj> f17076h = new ArrayList();

    hlh(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f17073e = viewGroup;
        this.f17074f = context;
        this.f17075g = googleMapOptions;
    }

    private void m20024e() {
        if (this.f17072d != null && m18948a() == null) {
            try {
                hli.m20027a(this.f17074f);
                hlw a = hmu.m20360a(this.f17074f).mo2776a(gym.m18961a(this.f17074f), this.f17075g);
                if (a != null) {
                    this.f17072d.m18963a(new hlf(this.f17073e, a));
                    for (hlj a2 : this.f17076h) {
                        ((hlf) m18948a()).m20018a(a2);
                    }
                    this.f17076h.clear();
                }
            } catch (RemoteException e) {
                throw new dt(e);
            } catch (gtr e2) {
            }
        }
    }

    protected void mo2608a(gyn<hlf> gyn_hlf) {
        this.f17072d = gyn_hlf;
        m20024e();
    }

    public void m20026a(hlj hlj) {
        if (m18948a() != null) {
            ((hlf) m18948a()).m20018a(hlj);
        } else {
            this.f17076h.add(hlj);
        }
    }
}
