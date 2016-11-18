package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class dvd implements dut {
    public Intent mo1683a(Activity activity) {
        try {
            hkl hkl = new hkl();
            Resources resources = activity.getResources();
            hkl.m20005a(((jca) jyn.m25426a((Context) activity, jca.class)).mo2320c().mo3440b("account_name"));
            hkl.m20004a(resources.getColor(gwb.dU), resources.getColor(gwb.dV), resources.getColor(gwb.ec));
            return hkl.mo2601a(activity);
        } catch (Throwable e) {
            glk.m17980d("Babel", "GooglePlayServicesRepairableException", e);
            return null;
        } catch (Throwable e2) {
            glk.m17980d("Babel", "GooglePlayServicesNotAvailableException", e2);
            return null;
        }
    }

    public dur mo1684a(Context context) {
        return new dva(context);
    }

    public duq mo1688b(Context context) {
        return new duy(context);
    }

    public String mo1685a(hkh hkh) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://maps.googleapis.com/maps/api/staticmap");
        String a = dvd.m12769a(hkh.mo1286d());
        stringBuilder.append("?center=").append(a);
        stringBuilder.append("&markers=color:red%7C").append(a);
        int a2 = gwb.m1492a(gwb.m1400H(), "babel_location_static_map_size", 400);
        stringBuilder.append("&size=").append(a2).append("x").append(a2);
        return stringBuilder.toString();
    }

    public String mo1689b(hkh hkh) {
        String valueOf = String.valueOf("https://maps.google.com/maps?q=");
        String valueOf2 = String.valueOf(dvd.m12769a(hkh.mo1286d()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private static String m12769a(LatLng latLng) {
        return String.format(Locale.US, "%.7f,%.7f", new Object[]{Double.valueOf(latLng.f7681a), Double.valueOf(latLng.f7682b)});
    }

    public void mo1687a(Context context, int i, duu duu) {
        ((eia) jyn.m25426a(context, eia.class)).mo1884a(i, new dve(this, duu));
    }

    public void mo1686a(Context context, int i, int i2) {
        eia eia = (eia) jyn.m25426a(context, eia.class);
        List arrayList = new ArrayList();
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        eia.mo1886a(new eie(i, i2), arrayList);
    }
}
