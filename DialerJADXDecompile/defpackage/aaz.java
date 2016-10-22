package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: aaz */
public abstract class aaz implements ComponentCallbacks2 {
    public static final Uri a;
    private static abb b;
    private static Drawable c;
    private static aaz d;

    public abstract void a();

    public abstract void a(View view);

    public abstract void a(ImageView imageView, long j, boolean z, boolean z2, abc abc, abb abb);

    public abstract void a(ImageView imageView, Uri uri, int i, boolean z, boolean z2, abc abc, abb abb);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    static {
        aba aba = new aba();
        a = Uri.parse("defaultimage://");
        b = new abd();
        c = null;
    }

    public static Drawable a(Resources resources, abc abc) {
        return abd.a(resources, abc);
    }

    public static String a(String str) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.encodedFragment("2");
        return buildUpon.build().toString();
    }

    public static Uri a(Uri uri) {
        if (TextUtils.isEmpty(uri.getEncodedFragment())) {
            return uri;
        }
        Builder buildUpon = uri.buildUpon();
        buildUpon.encodedFragment(null);
        return buildUpon.build();
    }

    public static boolean b(Uri uri) {
        if (uri == null) {
            return false;
        }
        Object encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.equals("2")) {
            return false;
        }
        return true;
    }

    protected static abc c(Uri uri) {
        abc abc = new abc(uri.getQueryParameter("display_name"), uri.getQueryParameter("identifier"), false);
        try {
            Object queryParameter = uri.getQueryParameter("contact_type");
            if (!TextUtils.isEmpty(queryParameter)) {
                abc.g = Integer.valueOf(queryParameter).intValue();
            }
            queryParameter = uri.getQueryParameter("scale");
            if (!TextUtils.isEmpty(queryParameter)) {
                abc.h = Float.valueOf(queryParameter).floatValue();
            }
            queryParameter = uri.getQueryParameter("offset");
            if (!TextUtils.isEmpty(queryParameter)) {
                abc.i = Float.valueOf(queryParameter).floatValue();
            }
            queryParameter = uri.getQueryParameter("is_circular");
            if (!TextUtils.isEmpty(queryParameter)) {
                abc.j = Boolean.valueOf(queryParameter).booleanValue();
            }
        } catch (NumberFormatException e) {
            Log.w("ContactPhotoManager", "Invalid DefaultImageRequest image parameters provided, ignoring and using defaults.");
        }
        return abc;
    }

    public static aaz a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = aaz.b(applicationContext);
            applicationContext.registerComponentCallbacks(d);
            if (buf.i(context)) {
                d.d();
            }
        }
        return d;
    }

    private static synchronized aaz b(Context context) {
        aaz abe;
        synchronized (aaz.class) {
            abe = new abe(context);
        }
        return abe;
    }

    public final void a(ImageView imageView, long j, boolean z, boolean z2, abc abc) {
        a(imageView, j, z, z2, abc, b);
    }

    public final void a(ImageView imageView, Uri uri, int i, boolean z, boolean z2, abc abc) {
        a(imageView, uri, i, z, z2, abc, b);
    }

    public final void a(ImageView imageView, Uri uri, boolean z, boolean z2, abc abc) {
        a(imageView, uri, -1, false, z2, abc, b);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
    }
}
