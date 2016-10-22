package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.incallui.GlowPadWrapper;

/* compiled from: PG */
/* renamed from: bbx */
public final class bbx extends ayc {
    private GlowPadWrapper a;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = (GlowPadWrapper) layoutInflater.inflate(buf.kP, viewGroup, false);
        bdf.a((Object) this, "Creating view for answer fragment ", (Object) this);
        bdf.a((Object) this, "Created from activity", getActivity());
        this.a.a = this;
        return this.a;
    }

    public final void onResume() {
        super.onResume();
        this.a.requestFocus();
    }

    public final void onDestroyView() {
        bdf.a((Object) this, "onDestroyView");
        if (this.a != null) {
            this.a.b();
            this.a = null;
        }
        super.onDestroyView();
    }

    public final void a(boolean z) {
        bdf.a((Object) this, "Show answer UI: " + z);
        if (z) {
            this.a.a();
        } else {
            this.a.b();
        }
    }

    public final void a(int i) {
        a(i, 3);
    }

    public final void a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        this.a.b = i2;
        switch (i) {
            case rq.b /*1*/:
                i3 = buf.jD;
                i4 = buf.jC;
                i5 = buf.jB;
                i6 = buf.kr;
                break;
            case rq.c /*2*/:
                i3 = buf.jP;
                i4 = buf.jO;
                i5 = buf.jN;
                i6 = buf.ks;
                break;
            case rl.e /*3*/:
                i3 = buf.jM;
                i4 = buf.jL;
                i5 = buf.jK;
                i6 = buf.ks;
                break;
            case rl.f /*4*/:
                i3 = buf.jJ;
                i4 = buf.jH;
                i5 = buf.jI;
                i6 = buf.ks;
                break;
            default:
                i3 = buf.jG;
                i4 = buf.jF;
                i5 = buf.jE;
                i6 = buf.kr;
                break;
        }
        if (i3 != this.a.getTargetResourceId()) {
            this.a.setTargetResources(i3);
            this.a.setTargetDescriptionsResourceId(i4);
            this.a.setDirectionDescriptionsResourceId(i5);
            this.a.setHandleDrawable(i6);
            this.a.reset(false);
        }
    }

    protected final void f() {
        if (this.a != null) {
            this.a.a();
        }
    }
}
