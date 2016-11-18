package defpackage;

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
    private Context a;
    private jca b;
    private iih c;
    private cgr d;

    cbx(Context context, kbu kbu) {
        this.a = context;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (jca) jyn.a(jca.class);
        this.c = (iih) jyn.a(iih.class);
        this.d = (cgr) jyn.a(cgr.class);
    }

    public boolean a(Menu menu) {
        String c = this.d.c();
        if (VERSION.SDK_INT < 19 || c == null || blo.a(c)) {
            return false;
        }
        menu.add(0, gwb.ld, menu.size(), gwb.le);
        glk.a("Babel_ConversationPin", "Adding pinning menu item.", new Object[0]);
        return true;
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.ld) {
            return false;
        }
        int i;
        if (this.d.e() == 2) {
            i = 2954;
        } else {
            i = 2747;
        }
        this.c.a(this.b.a()).b().c(i);
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        Collection<edk> c = this.d.k().c();
        for (edk edk : c) {
            if (edk.h != null) {
                arrayList.add(edk.h);
            } else {
                arrayList2.add(edk.e);
            }
        }
        glk.a("Babel_ConversationPin", "Pinning conversation with " + c.size() + " participants", new Object[0]);
        if (c.isEmpty()) {
            a(null);
        } else {
            frj a = bjw.a(arrayList, arrayList2.size(), arrayList2, this.b.c().b("account_name"), ((boz) jyn.a(this.a, boz.class)).a(), null, new cby(this), null, null, false, bjy.NONE, true);
            if (a != null) {
                ((fsi) jyn.a(this.a, fsi.class)).c(a);
            }
        }
        return true;
    }

    void a(gkt gkt) {
        Parcelable b;
        String str = "android.intent.action.VIEW";
        Context context = this.a;
        String c = this.d.c();
        jch c2 = ((jca) jyn.a(context, jca.class)).c();
        String b2 = c2.b("effective_gaia_id");
        if (TextUtils.isEmpty(b2)) {
            b2 = c2.b("gaia_id");
        }
        Parcelable intent = new Intent(str, new Builder().scheme("https").authority("hangouts.google.com").appendPath("chat").appendPath(c).appendQueryParameter("a", b2).appendQueryParameter("css", Integer.toString(2746)).build());
        Intent intent2 = new Intent();
        intent2.putExtra("android.intent.extra.shortcut.NAME", this.d.f());
        if (gkt == null) {
            b = ((boz) jyn.a(this.a, boz.class)).b();
        } else {
            Bitmap e = gkt.e();
            b = e.copy(e.getConfig(), false);
            gkt.b();
        }
        intent2.putExtra("android.intent.extra.shortcut.ICON", b);
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        this.a.sendBroadcast(intent2);
        this.c.a(this.b.a()).b().c(2748);
        ((Vibrator) this.a.getSystemService("vibrator")).vibrate(30);
    }
}
