package p000;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;

public class hle extends FrameLayout {
    public final hlh f10591f;

    public hle(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f10591f = new hlh(this, context, googleMapOptions);
        setClickable(true);
    }

    public void m12754a(hlj hlj) {
        gwb.m1430N("getMapAsync() must be called on the main thread");
        this.f10591f.m20026a(hlj);
    }
}
