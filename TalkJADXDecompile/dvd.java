import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class dvd implements dut {
    public Intent a(Activity activity) {
        try {
            hkl hkl = new hkl();
            Resources resources = activity.getResources();
            hkl.a(((jca) jyn.a((Context) activity, jca.class)).c().b("account_name"));
            hkl.a(resources.getColor(gwb.dU), resources.getColor(gwb.dV), resources.getColor(gwb.ec));
            return hkl.a(activity);
        } catch (Throwable e) {
            glk.d("Babel", "GooglePlayServicesRepairableException", e);
            return null;
        } catch (Throwable e2) {
            glk.d("Babel", "GooglePlayServicesNotAvailableException", e2);
            return null;
        }
    }

    public dur a(Context context) {
        return new dva(context);
    }

    public duq b(Context context) {
        return new duy(context);
    }

    public String a(hkh hkh) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://maps.googleapis.com/maps/api/staticmap");
        String a = a(hkh.d());
        stringBuilder.append("?center=").append(a);
        stringBuilder.append("&markers=color:red%7C").append(a);
        int a2 = gwb.a(gwb.H(), "babel_location_static_map_size", 400);
        stringBuilder.append("&size=").append(a2).append("x").append(a2);
        return stringBuilder.toString();
    }

    public String b(hkh hkh) {
        String valueOf = String.valueOf("https://maps.google.com/maps?q=");
        String valueOf2 = String.valueOf(a(hkh.d()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private static String a(LatLng latLng) {
        return String.format(Locale.US, "%.7f,%.7f", new Object[]{Double.valueOf(latLng.a), Double.valueOf(latLng.b)});
    }

    public void a(Context context, int i, duu duu) {
        ((eia) jyn.a(context, eia.class)).a(i, new dve(this, duu));
    }

    public void a(Context context, int i, int i2) {
        eia eia = (eia) jyn.a(context, eia.class);
        List arrayList = new ArrayList();
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        eia.a(new eie(i, i2), arrayList);
    }
}
