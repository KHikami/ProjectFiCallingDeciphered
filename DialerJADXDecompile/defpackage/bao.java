package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: bao */
public final class bao extends Fragment {
    Point a;
    bas b;
    private boolean c;

    public bao(Point point, bas bas) {
        this.a = point;
        this.b = bas;
    }

    public final void onResume() {
        super.onResume();
        if (!this.c) {
            air air = bcj.b().y;
            Activity activity = getActivity();
            if (activity == null) {
                bdf.e(this, "Asked to do outgoing call animation when not attached");
            } else {
                View decorView = activity.getWindow().getDecorView();
                decorView.setOutlineProvider(new bap(this));
                decorView.setClipToOutline(true);
                if (air != null) {
                    decorView.findViewById(az.ak).setBackgroundColor(air.a);
                    activity.getWindow().setStatusBarColor(air.b);
                }
                decorView.getViewTreeObserver().addOnPreDrawListener(new baq(this, decorView));
            }
        }
        this.c = true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(buf.kY, viewGroup, false);
    }
}
