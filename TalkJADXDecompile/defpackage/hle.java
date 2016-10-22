package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: hle */
public class hle extends FrameLayout {
    public final hlh f;

    public hle(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f = new hlh(this, context, googleMapOptions);
        setClickable(true);
    }

    public void a(hlj hlj) {
        gwb.N("getMapAsync() must be called on the main thread");
        this.f.a(hlj);
    }
}
