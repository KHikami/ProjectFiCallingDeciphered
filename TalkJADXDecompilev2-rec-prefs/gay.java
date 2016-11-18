package p000;

import android.content.Context;
import android.text.Html;

final class gay extends erm {
    final /* synthetic */ gaw f14573a;

    public gay(gaw gaw, Context context, kbu kbu, int i) {
        this.f14573a = gaw;
        super(context, kbu, i, gaw.f14566a);
    }

    protected void mo983c() {
        gaw gaw = this.f14573a;
        if (null != null) {
            gaw.f14568c = gld.m17922a(Html.fromHtml(null));
            if (gaw.f14569d != null) {
                gld.m17934a(gaw.f14569d, true);
                gaw.f14569d.setOnClickListener(gaw.f14570e);
            }
        } else {
            gaw.f14568c = null;
            if (gaw.f14569d != null) {
                gld.m17934a(gaw.f14569d, false);
                gaw.f14569d.setOnClickListener(null);
            }
        }
        gaw.mo2175b();
    }

    public void mo982a(etu etu) {
        gaw gaw = this.f14573a;
        String a = etu.m14512a();
        if (a != null) {
            gaw.f14568c = gld.m17922a(Html.fromHtml(a));
            if (gaw.f14569d != null) {
                gld.m17934a(gaw.f14569d, true);
                gaw.f14569d.setOnClickListener(gaw.f14570e);
            }
        } else {
            gaw.f14568c = null;
            if (gaw.f14569d != null) {
                gld.m17934a(gaw.f14569d, false);
                gaw.f14569d.setOnClickListener(null);
            }
        }
        gaw.mo2175b();
    }
}
