package p000;

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
    final /* synthetic */ bvu f4616a;

    bvz(bvu bvu) {
        this.f4616a = bvu;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        contextMenu.setHeaderTitle(this.f4616a.m6596d().getText(ba.hT));
        this.f4616a.a.getActivity().getMenuInflater().inflate(gwb.kr, contextMenu);
        if (!TextUtils.isEmpty(this.f4616a.f4596j)) {
            contextMenu.findItem(bm.f3828d).setVisible(true);
        }
        btc a = this.f4616a.f4591e.f4406s.m6573a(this.f4616a.m6595c());
        if (a == btc.PHOTO || a == btc.VIDEO || a == btc.VIDEO_MMS) {
            contextMenu.findItem(bm.f3850z).setVisible(true);
        }
        if (this.f4616a.f4591e.f4407t.f4425i == 0 || this.f4616a.f4591e.f4407t.f4425i == 1 || (this.f4616a.f4591e.f4402o == 2 && TextUtils.isEmpty(this.f4616a.f4591e.f4406s.m6574a()))) {
            contextMenu.findItem(bm.f3835k).setVisible(true);
        }
        contextMenu.findItem(bm.f3832h).setVisible(true);
        boolean z = fdq.f12805u.m14370b(this.f4616a.m6593b().m5638g()) && this.f4616a.f4591e.f4407t.f4425i == -1;
        if (z) {
            MenuItem findItem = contextMenu.findItem(bm.f3830f);
            findItem.setVisible(true);
            CharSequence spannableString = new SpannableString(this.f4616a.m6596d().getString(ba.hV));
            spannableString.setSpan(new ForegroundColorSpan(-16776961), 0, spannableString.length(), 0);
            findItem.setTitle(spannableString);
        }
        if (this.f4616a.f4591e.f4395h != fwx.ON_SERVER) {
            contextMenu.findItem(bm.f3831g).setVisible(true);
            contextMenu.findItem(bm.f3831g).setTitle(ba.hU);
        } else if (this.f4616a.f4591e.f4407t.f4425i == 0 || this.f4616a.f4591e.f4407t.f4425i == 1) {
            contextMenu.findItem(bm.f3831g).setVisible(true);
            contextMenu.findItem(bm.f3831g).setTitle(ba.hS);
        }
        if (!(this.f4616a.f4593g || jyn.m25426a(this.f4616a.m6595c(), fxa.class) == null)) {
            contextMenu.findItem(bm.f3802D).setVisible(true);
        }
        if (!TextUtils.isEmpty(this.f4616a.f4596j)) {
            for (URLSpan url : (URLSpan[]) this.f4616a.f4596j.getSpans(0, this.f4616a.f4596j.length() - 1, URLSpan.class)) {
                String[] split = url.getURL().split(":", 2);
                if (split.length == 2) {
                    String str;
                    String str2 = split[0];
                    String str3 = split[1];
                    if ("mailto".equalsIgnoreCase(str2)) {
                        str = str3;
                    } else if ("tel".equalsIgnoreCase(str2)) {
                        str = glq.m18038i(this.f4616a.m6595c(), str3);
                    }
                    contextMenu.add(0, bm.f3840p, 0, this.f4616a.m6595c().getString(ba.hR, new Object[]{str})).setIntent(gwb.m1362A(str3)).setVisible(true);
                }
            }
        }
        for (int i = 0; i < contextMenu.size(); i++) {
            MenuItem item = contextMenu.getItem(i);
            if (item.isVisible()) {
                item.setOnMenuItemClickListener(this.f4616a.f4590d);
            }
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        String str = null;
        boolean z = false;
        bvu bvu;
        if (menuItem.getItemId() == bm.f3828d) {
            bvu = this.f4616a;
            ((ClipboardManager) bvu.m6595c().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(bvu.m6596d().getText(ba.hG), bvu.f4596j));
        } else if (menuItem.getItemId() == bm.f3850z) {
            bvu = this.f4616a;
            new bws(bvu.m6595c()).m6833a((eia) jyn.m25426a(bvu.m6595c(), eia.class), bvu.f4591e.f4406s);
        } else if (menuItem.getItemId() == bm.f3835k) {
            String b;
            bvu bvu2 = this.f4616a;
            boolean b2 = bvu2.f4591e.f4406s.m6576b(bvu2.m6595c());
            String obj = bvu2.f4596j.toString();
            if (bvu2.f4591e.f4407t.f4425i == 1) {
                z = true;
            }
            String str2 = bvu2.f4591e.f4407t.f4420d;
            if (b2) {
                b = bvu2.f4591e.f4406s.m6575b();
            } else {
                b = null;
            }
            if (b2) {
                str = bvu2.f4591e.f4406s.f4367j;
            }
            bvu2.m6595c().startActivity(gwb.m1554a(obj, z, str2, b, str));
        } else if (menuItem.getItemId() == bm.f3832h) {
            bvu bvu3 = this.f4616a;
            switch (bvu3.f4591e.f4407t.f4425i) {
                case -1:
                    if (bvu3.f4591e.f4402o == 2) {
                        if (!bvu3.f4593g) {
                            int i;
                            StringBuilder stringBuilder = new StringBuilder();
                            Resources d = bvu3.m6596d();
                            if (bvu3.m6593b().m5626M()) {
                                i = ba.iO;
                            } else {
                                i = ba.hN;
                            }
                            CharSequence text = d.getText(i);
                            stringBuilder.append(bvu3.m6596d().getString(ba.hZ, new Object[]{text}));
                            bvu3.f4595i = bvu3.f4592f.m13596f();
                            gwb.m1756a(bvu3.m6595c(), stringBuilder, bvu3.f4591e.m6587b(), bvu3.f4595i, null);
                            break;
                        }
                        int i2;
                        dw activity = bvu3.a.getActivity();
                        StringBuilder stringBuilder2 = new StringBuilder();
                        Resources d2 = bvu3.m6596d();
                        if (bvu3.m6593b().m5626M()) {
                            i2 = ba.iO;
                        } else {
                            i2 = ba.hN;
                        }
                        CharSequence text2 = d2.getText(i2);
                        stringBuilder2.append(bvu3.m6596d().getString(ba.hZ, new Object[]{text2}));
                        if (bvu3.f4594h == null) {
                            String str3 = "Outbound GV SMS messages must have a Conversation ID";
                            if (!TextUtils.isEmpty(bvu3.f4591e.f4390c)) {
                                z = true;
                            }
                            iil.m21874a(str3, z);
                            activity.m1095f().mo1998b(bm.f3839o, null, new bwb(bvu3, bvu3.m6595c(), stringBuilder2)).m1293v();
                            break;
                        }
                        gwb.m1756a(bvu3.m6595c(), stringBuilder2, bvu3.f4591e.m6587b(), null, bvu3.f4594h);
                        break;
                    }
                    Context c = bvu3.m6595c();
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(bvu3.m6596d().getString(ba.hZ, new Object[]{bvu3.m6596d().getString(ba.hO)}));
                    if (!(bvu3.f4592f == null || TextUtils.isEmpty(bvu3.f4592f.f11216e))) {
                        stringBuilder3.append('\n');
                        if (bvu3.f4593g && bvu3.m6803f()) {
                            stringBuilder3.append(bvu3.m6596d().getString(ba.iN, new Object[]{bvu3.f4592f.f11216e}));
                        } else {
                            stringBuilder3.append(bvu3.m6596d().getString(ba.hM, new Object[]{bvu3.f4592f.f11216e}));
                        }
                    }
                    stringBuilder3.append('\n');
                    stringBuilder3.append(bvu3.m6596d().getString(ba.iy, new Object[]{glj.m17957a(bvu3.f4591e.m6587b()).toString()}));
                    gwb.m2093c(c, stringBuilder3.toString());
                    break;
                    break;
                case 0:
                    gwb.m2093c(bvu3.m6595c(), gwb.m1647a(bvu3.m6595c(), bvu3.f4591e));
                    break;
                case 1:
                    gwb.m2093c(bvu3.m6595c(), gwb.m1997b(bvu3.m6595c(), bvu3.f4591e));
                    break;
                case 2:
                    break;
                default:
                    iil.m21870a("Unexpected SMS type: " + bvu3.f4591e.f4407t.f4425i);
                    break;
            }
        } else if (menuItem.getItemId() == bm.f3830f) {
            cps.m10656a(this.f4616a.f4597k);
        } else if (menuItem.getItemId() == bm.f3831g) {
            bvu = this.f4616a;
            dvm a = ba.m4618c().m12789a(bvu.f4591e.f4390c);
            if (blo.m5871a(bvu.f4591e.f4389b)) {
                a.m12794b(bvu.f4591e.f4389b);
            } else {
                a.m12798c(bvu.f4591e.f4389b);
            }
            ba.m4548a(bvu.m6593b().m5638g(), glj.m17963b(), 10, a.m12786a((int) HttpStatusCodes.STATUS_CODE_SEE_OTHER));
            ((cnt) jyn.m25426a(bvu.m6595c(), cnt.class)).mo1026a(bvu.m6593b().m5638g(), bvu.f4591e.f4390c, bvu.f4591e.f4388a);
            ((iih) jyn.m25426a(bvu.m6595c(), iih.class)).mo1979a(bvu.m6593b().m5638g()).mo1693b().mo1698a(Integer.valueOf(bvu.f4591e.f4395h.ordinal())).mo1714c(2937);
        } else if (menuItem.getItemId() != bm.f3802D) {
            return false;
        } else {
            this.f4616a.m6804g();
        }
        return true;
    }
}
