package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.hangouts.views.OverlayedAvatarView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class bxj implements bxi {
    private final View f4729a;
    private final cgr f4730b;
    private final bto f4731c;
    private final ViewGroup f4732d;

    public bxj(Context context, View view) {
        this.f4729a = view;
        this.f4730b = (cgr) jyn.m25426a(context, cgr.class);
        this.f4731c = (bto) jyn.m25426a(context, bto.class);
        this.f4732d = (ViewGroup) view.findViewById(bm.f3803E);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m6888a(List<edo> list, boolean z, String str) {
        List arrayList;
        if (!z) {
            this.f4732d.removeAllViews();
        }
        List arrayList2 = new ArrayList();
        gkq a = m6884a((List) list);
        gkq gkq = new gkq();
        if (glk.m17973a("Babel_MsgListWatermark", 2)) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        int childCount = this.f4732d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            OverlayedAvatarView overlayedAvatarView = (OverlayedAvatarView) this.f4732d.getChildAt(i);
            edk edk = (edk) overlayedAvatarView.getTag();
            edo edo = edk.f11213b;
            if (a.containsKey(edo)) {
                arrayList2.add(new bxk(edk, gwb.m2061b((Boolean) a.get(edo)), childCount - i));
                a.remove(edo);
                m6885a(overlayedAvatarView);
                gkq.put(edo, overlayedAvatarView);
            }
            if (arrayList != null) {
                boolean z2 = overlayedAvatarView.m9556d() || overlayedAvatarView.m9558e();
                arrayList.add(new bxk(edk, z2, -1));
            }
        }
        for (edo edo2 : a.keySet()) {
            edk b = this.f4730b.mo954k().m5589b(edo2);
            if (b != null) {
                arrayList2.add(new bxk(b, gwb.m2061b((Boolean) a.get(edo2)), 0));
            }
        }
        Collections.sort(arrayList2);
        if (!(arrayList == null || (arrayList.isEmpty() && arrayList2.isEmpty()))) {
            Object[] objArr = new Object[]{str, arrayList, arrayList2};
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f4732d.getChildCount() && i2 >= arrayList2.size()) {
                break;
            } else if (i2 >= this.f4732d.getChildCount()) {
                break;
            } else if (i2 >= arrayList2.size()) {
                break;
            } else {
                edk edk2 = (edk) this.f4732d.getChildAt(i2).getTag();
                edk = ((bxk) arrayList2.get(i2)).f4733a;
                if (edk2.equals(edk)) {
                    i2++;
                } else if (gkq.containsKey(edk2.f11213b)) {
                    if (gkq.containsKey(edk.f11213b)) {
                        overlayedAvatarView = (OverlayedAvatarView) gkq.get(edk.f11213b);
                        this.f4732d.removeView(overlayedAvatarView);
                        this.f4732d.addView(overlayedAvatarView, i2);
                    } else {
                        this.f4732d.addView(m6883a(edk), i2);
                    }
                    i2++;
                } else {
                    this.f4732d.removeViewAt(i2);
                }
            }
        }
        if (childCount != arrayList2.size()) {
            this.f4732d.requestLayout();
        }
    }

    public CharSequence m6887a() {
        if (this.f4732d.getChildCount() == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.f4732d.getChildCount(); i++) {
            gld.m17929a(stringBuilder, this.f4732d.getChildAt(i).getContentDescription());
        }
        return this.f4729a.getResources().getQuantityString(ba.hE, this.f4732d.getChildCount(), new Object[]{stringBuilder.toString()});
    }

    private gkq<Boolean> m6884a(List<edo> list) {
        gkq<Boolean> gkq = new gkq();
        for (edo edo : list) {
            if (!m6886b().m5630a(edo)) {
                gkq.put(edo, Boolean.valueOf(this.f4731c.mo773c(edo)));
            }
        }
        return gkq;
    }

    private OverlayedAvatarView m6883a(edk edk) {
        boolean z = false;
        OverlayedAvatarView a = OverlayedAvatarView.m9542a(LayoutInflater.from(this.f4729a.getContext()), edk.f11216e, edk.f11213b, false, false, 2, null);
        if (this.f4730b.mo947e() == 1) {
            z = true;
        }
        a.m9551a(z);
        a.m9550a(edk.f11219h, edk.f11216e, m6886b());
        a.setTag(edk);
        m6885a(a);
        return a;
    }

    private void m6885a(OverlayedAvatarView overlayedAvatarView) {
        edo edo = ((edk) overlayedAvatarView.getTag()).f11213b;
        int b = overlayedAvatarView.m9552b() | 1;
        if (this.f4731c.mo771a(edo)) {
            b |= 2;
        } else {
            b &= -3;
        }
        if (this.f4731c.mo772b(edo)) {
            b |= 4;
        } else {
            b &= -5;
        }
        overlayedAvatarView.m9557e(b);
    }

    private bko m6886b() {
        return this.f4730b.mo954k().m5601h();
    }

    public ViewGroup mo710v() {
        return this.f4732d;
    }
}
