package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Map;

class iem {
    private Map<iea, guk> a = new ky();
    private Map<ieb, gul> b = new ky();

    public <O> gtz a(idw<O> idw_O) {
        if (idw_O instanceof iek) {
            return ((iek) idw_O).a();
        }
        return null;
    }

    public guk a(iea iea) {
        if (this.a.containsKey(iea)) {
            return (guk) this.a.get(iea);
        }
        guk ien = new ien(this, iea);
        this.a.put(iea, ien);
        return ien;
    }

    public gul a(ieb ieb) {
        if (this.b.containsKey(ieb)) {
            return (gul) this.b.get(ieb);
        }
        gul ieo = new ieo(this, ieb);
        this.b.put(ieb, ieo);
        return ieo;
    }

    public gui a(idx idx) {
        if (idx instanceof ieu) {
            return ((ieu) idx).d();
        }
        return null;
    }

    public idr a(ConnectionResult connectionResult) {
        return new iel(connectionResult);
    }

    public iec<ied> a(gum<Status> gum_com_google_android_gms_common_api_Status) {
        return new iec(gum_com_google_android_gms_common_api_Status, ier.a);
    }
}
