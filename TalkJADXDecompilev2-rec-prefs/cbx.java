package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class cbx implements jza, kcf, kci, kcq {
    private Context f4973a;
    private jca f4974b;
    private iih f4975c;
    private cgr f4976d;

    cbx(Context context, kbu kbu) {
        this.f4973a = context;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4974b = (jca) jyn.m25443a(jca.class);
        this.f4975c = (iih) jyn.m25443a(iih.class);
        this.f4976d = (cgr) jyn.m25443a(cgr.class);
    }

    public boolean mo670a(Menu menu) {
        String c = this.f4976d.mo943c();
        if (VERSION.SDK_INT < 19 || c == null || blo.m5871a(c)) {
            return false;
        }
        menu.add(0, gwb.ld, menu.size(), gwb.le);
        glk.m17970a("Babel_ConversationPin", "Adding pinning menu item.", new Object[0]);
        return true;
    }

    public boolean mo671a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.ld) {
            return false;
        }
        int i;
        if (this.f4976d.mo947e() == 2) {
            i = 2954;
        } else {
            i = 2747;
        }
        this.f4975c.mo1979a(this.f4974b.mo2317a()).mo1693b().mo1714c(i);
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        Collection<edk> c = this.f4976d.mo954k().m5592c();
        for (edk edk : c) {
            if (edk.f11219h != null) {
                arrayList.add(edk.f11219h);
            } else {
                arrayList2.add(edk.f11216e);
            }
        }
        glk.m17970a("Babel_ConversationPin", "Pinning conversation with " + c.size() + " participants", new Object[0]);
        if (c.isEmpty()) {
            m7170a(null);
        } else {
            frj a = bjw.m5528a(arrayList, arrayList2.size(), arrayList2, this.f4974b.mo2320c().mo3440b("account_name"), ((boz) jyn.m25426a(this.f4973a, boz.class)).mo636a(), null, new cby(this), null, null, false, bjy.NONE, true);
            if (a != null) {
                ((fsi) jyn.m25426a(this.f4973a, fsi.class)).m12718c(a);
            }
        }
        return true;
    }

    void m7170a(gkt gkt) {
        Parcelable b;
        String str = "android.intent.action.VIEW";
        Context context = this.f4973a;
        String c = this.f4976d.mo943c();
        jch c2 = ((jca) jyn.m25426a(context, jca.class)).mo2320c();
        String b2 = c2.mo3440b("effective_gaia_id");
        if (TextUtils.isEmpty(b2)) {
            b2 = c2.mo3440b("gaia_id");
        }
        Parcelable intent = new Intent(str, new Builder().scheme("https").authority("hangouts.google.com").appendPath("chat").appendPath(c).appendQueryParameter("a", b2).appendQueryParameter("css", Integer.toString(2746)).build());
        Intent intent2 = new Intent();
        intent2.putExtra("android.intent.extra.shortcut.NAME", this.f4976d.mo949f());
        if (gkt == null) {
            b = ((boz) jyn.m25426a(this.f4973a, boz.class)).mo638b();
        } else {
            Bitmap e = gkt.m17898e();
            b = e.copy(e.getConfig(), false);
            gkt.mo2292b();
        }
        intent2.putExtra("android.intent.extra.shortcut.ICON", b);
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        this.f4973a.sendBroadcast(intent2);
        this.f4975c.mo1979a(this.f4974b.mo2317a()).mo1693b().mo1714c(2748);
        ((Vibrator) this.f4973a.getSystemService("vibrator")).vibrate(30);
    }
}
