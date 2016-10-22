import android.content.Context;
import android.location.Location;
import android.net.Uri.Builder;

/* compiled from: PG */
final class biv {
    private static final String a;

    static {
        a = Integer.toString(16);
    }

    public static String a(Context context, Location location) {
        Builder builder = new Builder();
        Builder appendQueryParameter = builder.scheme("https").authority("maps.googleapis.com").appendPath("maps").appendPath("api").appendPath("staticmap").appendQueryParameter("center", b(location)).appendQueryParameter("zoom", a).appendQueryParameter("size", "598x360").appendQueryParameter("scale", Float.toString(context.getResources().getDisplayMetrics().density));
        String str = "markers";
        String valueOf = String.valueOf("color:red|");
        String valueOf2 = String.valueOf(b(location));
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        appendQueryParameter.appendQueryParameter(str, valueOf2).appendQueryParameter("key", "AIzaSyAXdDnif6B7sBYxU8hzw9qAp3pRPVHs060");
        return builder.build().toString();
    }

    public static String a(Location location) {
        Builder builder = new Builder();
        builder.scheme("https").authority("maps.googleapis.com").appendPath("maps").appendPath("api").appendPath("geocode").appendPath("json").appendQueryParameter("latlng", b(location)).appendQueryParameter("key", "AIzaSyBfLlvWYndiQ3RFEHli65qGQH36QIxdyCI");
        return builder.build().toString();
    }

    private static String b(Location location) {
        double latitude = location.getLatitude();
        String valueOf = String.valueOf(",");
        return new StringBuilder(String.valueOf(valueOf).length() + 48).append(latitude).append(valueOf).append(location.getLongitude()).toString();
    }
}
