package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Map;

class iem {
    private Map<iea, guk> f17611a = new ky();
    private Map<ieb, gul> f17612b = new ky();

    public <O> gtz mo3159a(idw<O> idw_O) {
        if (idw_O instanceof iek) {
            return ((iek) idw_O).mo3149a();
        }
        return null;
    }

    public guk mo3161a(iea iea) {
        if (this.f17611a.containsKey(iea)) {
            return (guk) this.f17611a.get(iea);
        }
        guk ien = new ien(this, iea);
        this.f17611a.put(iea, ien);
        return ien;
    }

    public gul mo3162a(ieb ieb) {
        if (this.f17612b.containsKey(ieb)) {
            return (gul) this.f17612b.get(ieb);
        }
        gul ieo = new ieo(this, ieb);
        this.f17612b.put(ieb, ieo);
        return ieo;
    }

    public gui mo3160a(idx idx) {
        if (idx instanceof ieu) {
            return ((ieu) idx).m21679d();
        }
        return null;
    }

    public idr mo3163a(ConnectionResult connectionResult) {
        return new iel(connectionResult);
    }

    public iec<ied> mo3164a(gum<Status> gum_com_google_android_gms_common_api_Status) {
        return new iec(gum_com_google_android_gms_common_api_Status, ier.f17620a);
    }
}
