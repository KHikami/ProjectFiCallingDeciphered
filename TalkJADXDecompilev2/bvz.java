package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.google.api.client.http.HttpStatusCodes;

final class bvz implements OnMenuItemClickListener, OnCreateContextMenuListener {
    final /* synthetic */ bvu a;

    bvz(bvu bvu) {
        this.a = bvu;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        contextMenu.setHeaderTitle(this.a.d().getText(ba.hT));
        this.a.a.getActivity().getMenuInflater().inflate(gwb.kr, contextMenu);
        if (!TextUtils.isEmpty(this.a.j)) {
            contextMenu.findItem(bm.d).setVisible(true);
        }
        btc a = this.a.e.s.a(this.a.c());
        if (a == btc.PHOTO || a == btc.VIDEO || a == btc.VIDEO_MMS) {
            contextMenu.findItem(bm.z).setVisible(true);
        }
        if (this.a.e.t.i == 0 || this.a.e.t.i == 1 || (this.a.e.o == 2 && TextUtils.isEmpty(this.a.e.s.a()))) {
            contextMenu.findItem(bm.k).setVisible(true);
        }
        contextMenu.findItem(bm.h).setVisible(true);
        boolean z = fdq.u.b(this.a.b().g()) && this.a.e.t.i == -1;
        if (z) {
            MenuItem findItem = contextMenu.findItem(bm.f);
            findItem.setVisible(true);
            CharSequence spannableString = new SpannableString(this.a.d().getString(ba.hV));
            spannableString.setSpan(new ForegroundColorSpan(-16776961), 0, spannableString.length(), 0);
            findItem.setTitle(spannableString);
        }
        if (this.a.e.h != fwx.ON_SERVER) {
            contextMenu.findItem(bm.g).setVisible(true);
            contextMenu.findItem(bm.g).setTitle(ba.hU);
        } else if (this.a.e.t.i == 0 || this.a.e.t.i == 1) {
            contextMenu.findItem(bm.g).setVisible(true);
            contextMenu.findItem(bm.g).setTitle(ba.hS);
        }
        if (!(this.a.g || jyn.a(this.a.c(), fxa.class) == null)) {
            contextMenu.findItem(bm.D).setVisible(true);
        }
        if (!TextUtils.isEmpty(this.a.j)) {
            for (URLSpan url : (URLSpan[]) this.a.j.getSpans(0, this.a.j.length() - 1, URLSpan.class)) {
                String[] split = url.getURL().split(":", 2);
                if (split.length == 2) {
                    String str;
                    String str2 = split[0];
                    String str3 = split[1];
                    if ("mailto".equalsIgnoreCase(str2)) {
                        str = str3;
                    } else if ("tel".equalsIgnoreCase(str2)) {
                        str = glq.i(this.a.c(), str3);
                    }
                    contextMenu.add(0, bm.p, 0, this.a.c().getString(ba.hR, new Object[]{str})).setIntent(gwb.A(str3)).setVisible(true);
                }
            }
        }
        for (int i = 0; i < contextMenu.size(); i++) {
            MenuItem item = contextMenu.getItem(i);
            if (item.isVisible()) {
                item.setOnMenuItemClickListener(this.a.d);
            }
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        String str = null;
        boolean z = false;
        bvu bvu;
        if (menuItem.getItemId() == bm.d) {
            bvu = this.a;
            ((ClipboardManager) bvu.c().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(bvu.d().getText(ba.hG), bvu.j));
        } else if (menuItem.getItemId() == bm.z) {
            bvu = this.a;
            new bws(bvu.c()).a((eia) jyn.a(bvu.c(), eia.class), bvu.e.s);
        } else if (menuItem.getItemId() == bm.k) {
            String b;
            bvu bvu2 = this.a;
            boolean b2 = bvu2.e.s.b(bvu2.c());
            String obj = bvu2.j.toString();
            if (bvu2.e.t.i == 1) {
                z = true;
            }
            String str2 = bvu2.e.t.d;
            if (b2) {
                b = bvu2.e.s.b();
            } else {
                b = null;
            }
            if (b2) {
                str = bvu2.e.s.j;
            }
            bvu2.c().startActivity(gwb.a(obj, z, str2, b, str));
        } else if (menuItem.getItemId() == bm.h) {
            bvu bvu3 = this.a;
            switch (bvu3.e.t.i) {
                case -1:
                    if (bvu3.e.o == 2) {
                        if (!bvu3.g) {
                            int i;
                            StringBuilder stringBuilder = new StringBuilder();
                            Resources d = bvu3.d();
                            if (bvu3.b().M()) {
                                i = ba.iO;
                            } else {
                                i = ba.hN;
                            }
                            CharSequence text = d.getText(i);
                            stringBuilder.append(bvu3.d().getString(ba.hZ, new Object[]{text}));
                            bvu3.i = bvu3.f.f();
                            gwb.a(bvu3.c(), stringBuilder, bvu3.e.b(), bvu3.i, null);
                            break;
                        }
                        int i2;
                        dw activity = bvu3.a.getActivity();
                        StringBuilder stringBuilder2 = new StringBuilder();
                        Resources d2 = bvu3.d();
                        if (bvu3.b().M()) {
                            i2 = ba.iO;
                        } else {
                            i2 = ba.hN;
                        }
                        CharSequence text2 = d2.getText(i2);
                        stringBuilder2.append(bvu3.d().getString(ba.hZ, new Object[]{text2}));
                        if (bvu3.h == null) {
                            String str3 = "Outbound GV SMS messages must have a Conversation ID";
                            if (!TextUtils.isEmpty(bvu3.e.c)) {
                                z = true;
                            }
                            iil.a(str3, z);
                            activity.f().b(bm.o, null, new bwb(bvu3, bvu3.c(), stringBuilder2)).v();
                            break;
                        }
                        gwb.a(bvu3.c(), stringBuilder2, bvu3.e.b(), null, bvu3.h);
                        break;
                    }
                    Context c = bvu3.c();
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(bvu3.d().getString(ba.hZ, new Object[]{bvu3.d().getString(ba.hO)}));
                    if (!(bvu3.f == null || TextUtils.isEmpty(bvu3.f.e))) {
                        stringBuilder3.append('\n');
                        if (bvu3.g && bvu3.f()) {
                            stringBuilder3.append(bvu3.d().getString(ba.iN, new Object[]{bvu3.f.e}));
                        } else {
                            stringBuilder3.append(bvu3.d().getString(ba.hM, new Object[]{bvu3.f.e}));
                        }
                    }
                    stringBuilder3.append('\n');
                    stringBuilder3.append(bvu3.d().getString(ba.iy, new Object[]{glj.a(bvu3.e.b()).toString()}));
                    gwb.c(c, stringBuilder3.toString());
                    break;
                    break;
                case 0:
                    gwb.c(bvu3.c(), gwb.a(bvu3.c(), bvu3.e));
                    break;
                case 1:
                    gwb.c(bvu3.c(), gwb.b(bvu3.c(), bvu3.e));
                    break;
                case 2:
                    break;
                default:
                    iil.a("Unexpected SMS type: " + bvu3.e.t.i);
                    break;
            }
        } else if (menuItem.getItemId() == bm.f) {
            cps.a(this.a.k);
        } else if (menuItem.getItemId() == bm.g) {
            bvu = this.a;
            dvm a = ba.c().a(bvu.e.c);
            if (blo.a(bvu.e.b)) {
                a.b(bvu.e.b);
            } else {
                a.c(bvu.e.b);
            }
            ba.a(bvu.b().g(), glj.b(), 10, a.a((int) HttpStatusCodes.STATUS_CODE_SEE_OTHER));
            ((cnt) jyn.a(bvu.c(), cnt.class)).a(bvu.b().g(), bvu.e.c, bvu.e.a);
            ((iih) jyn.a(bvu.c(), iih.class)).a(bvu.b().g()).b().a(Integer.valueOf(bvu.e.h.ordinal())).c(2937);
        } else if (menuItem.getItemId() != bm.D) {
            return false;
        } else {
            this.a.g();
        }
        return true;
    }
}
