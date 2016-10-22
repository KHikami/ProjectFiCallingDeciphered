package defpackage;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.incallui.InCallActivity;

/* compiled from: PG */
/* renamed from: axw */
public class axw extends ayc {
    static final String a;
    GestureDetector b;
    private View f;
    private View g;
    private View h;
    private ayb i;

    static {
        a = axw.class.getSimpleName();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(buf.kO, viewGroup, false);
        this.i = new ayb(this);
        this.b = new GestureDetector(getContext(), new axx(this));
        this.f = viewGroup2.findViewById(az.a);
        this.f.setOnClickListener(new axy(this));
        this.g = viewGroup2.findViewById(az.b);
        this.g.setOnClickListener(new axz(this));
        this.h = viewGroup2.findViewById(az.c);
        this.h.setOnClickListener(new aya(this));
        return viewGroup2;
    }

    public void onResume() {
        super.onResume();
        ((InCallActivity) getActivity()).g = this.i;
    }

    public void onPause() {
        super.onPause();
        ((InCallActivity) getActivity()).g = null;
    }
}
