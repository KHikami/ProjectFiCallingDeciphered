package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.hangouts.views.OverlayedAvatarView;
import java.util.List;

/* renamed from: bxj */
public final class bxj implements bxi {
    private final View a;
    private final cgr b;
    private final bto c;
    private final ViewGroup d;

    public bxj(Context context, View view) {
        this.a = view;
        this.b = (cgr) jyn.a(context, cgr.class);
        this.c = (bto) jyn.a(context, bto.class);
        this.d = (ViewGroup) view.findViewById(bm.E);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.List<defpackage.edo> r13, boolean r14, java.lang.String r15) {
        /*
        r12 = this;
        if (r14 != 0) goto L_0x0007;
    L_0x0002:
        r0 = r12.d;
        r0.removeAllViews();
    L_0x0007:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r6 = r12.a(r13);
        r7 = new gkq;
        r7.<init>();
        r0 = 0;
        r1 = "Babel_MsgListWatermark";
        r2 = 2;
        r1 = defpackage.glk.a(r1, r2);
        if (r1 == 0) goto L_0x0177;
    L_0x001f:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r3 = r0;
    L_0x0025:
        r0 = r12.d;
        r8 = r0.getChildCount();
        r0 = 0;
        r4 = r0;
    L_0x002d:
        if (r4 >= r8) goto L_0x0080;
    L_0x002f:
        r0 = r12.d;
        r0 = r0.getChildAt(r4);
        r0 = (com.google.android.apps.hangouts.views.OverlayedAvatarView) r0;
        r1 = r0.getTag();
        r1 = (defpackage.edk) r1;
        r9 = r1.b;
        r2 = r6.containsKey(r9);
        if (r2 == 0) goto L_0x0062;
    L_0x0045:
        r10 = new bxk;
        r2 = r6.get(r9);
        r2 = (java.lang.Boolean) r2;
        r2 = defpackage.gwb.b(r2);
        r11 = r8 - r4;
        r10.<init>(r1, r2, r11);
        r5.add(r10);
        r6.remove(r9);
        r12.a(r0);
        r7.put(r9, r0);
    L_0x0062:
        if (r3 == 0) goto L_0x007a;
    L_0x0064:
        r2 = new bxk;
        r9 = r0.d();
        if (r9 != 0) goto L_0x0072;
    L_0x006c:
        r0 = r0.e();
        if (r0 == 0) goto L_0x007e;
    L_0x0072:
        r0 = 1;
    L_0x0073:
        r9 = -1;
        r2.<init>(r1, r0, r9);
        r3.add(r2);
    L_0x007a:
        r0 = r4 + 1;
        r4 = r0;
        goto L_0x002d;
    L_0x007e:
        r0 = 0;
        goto L_0x0073;
    L_0x0080:
        r0 = r6.keySet();
        r1 = r0.iterator();
    L_0x0088:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x00b4;
    L_0x008e:
        r0 = r1.next();
        r0 = (defpackage.edo) r0;
        r2 = r12.b;
        r2 = r2.k();
        r2 = r2.b(r0);
        if (r2 == 0) goto L_0x0088;
    L_0x00a0:
        r4 = new bxk;
        r0 = r6.get(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = defpackage.gwb.b(r0);
        r9 = 0;
        r4.<init>(r2, r0, r9);
        r5.add(r4);
        goto L_0x0088;
    L_0x00b4:
        java.util.Collections.sort(r5);
        if (r3 == 0) goto L_0x00d1;
    L_0x00b9:
        r0 = r3.isEmpty();
        if (r0 == 0) goto L_0x00c5;
    L_0x00bf:
        r0 = r5.isEmpty();
        if (r0 != 0) goto L_0x00d1;
    L_0x00c5:
        r0 = 3;
        r0 = new java.lang.Object[r0];
        r1 = 0;
        r0[r1] = r15;
        r1 = 1;
        r0[r1] = r3;
        r1 = 2;
        r0[r1] = r5;
    L_0x00d1:
        r0 = 0;
        r2 = r0;
    L_0x00d3:
        r0 = r12.d;
        r0 = r0.getChildCount();
        if (r2 < r0) goto L_0x00e1;
    L_0x00db:
        r0 = r5.size();
        if (r2 >= r0) goto L_0x0116;
    L_0x00e1:
        r0 = r12.d;
        r0 = r0.getChildCount();
        if (r2 < r0) goto L_0x0104;
    L_0x00e9:
        r0 = r5.size();
        if (r2 >= r0) goto L_0x0116;
    L_0x00ef:
        r1 = r2 + 1;
        r0 = r5.get(r2);
        r0 = (defpackage.bxk) r0;
        r0 = r0.a;
        r2 = r12.d;
        r0 = r12.a(r0);
        r2.addView(r0);
        r2 = r1;
        goto L_0x00e9;
    L_0x0104:
        r0 = r5.size();
        if (r2 < r0) goto L_0x0122;
    L_0x010a:
        r0 = r12.d;
        r1 = r12.d;
        r1 = r1.getChildCount();
        r1 = r1 - r2;
        r0.removeViews(r2, r1);
    L_0x0116:
        r0 = r5.size();
        if (r8 == r0) goto L_0x0121;
    L_0x011c:
        r0 = r12.d;
        r0.requestLayout();
    L_0x0121:
        return;
    L_0x0122:
        r0 = r12.d;
        r0 = r0.getChildAt(r2);
        r0 = r0.getTag();
        r0 = (defpackage.edk) r0;
        r1 = r5.get(r2);
        r1 = (defpackage.bxk) r1;
        r1 = r1.a;
        r3 = r0.equals(r1);
        if (r3 == 0) goto L_0x0140;
    L_0x013c:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x00d3;
    L_0x0140:
        r0 = r0.b;
        r0 = r7.containsKey(r0);
        if (r0 != 0) goto L_0x014e;
    L_0x0148:
        r0 = r12.d;
        r0.removeViewAt(r2);
        goto L_0x00d3;
    L_0x014e:
        r0 = r1.b;
        r0 = r7.containsKey(r0);
        if (r0 == 0) goto L_0x016d;
    L_0x0156:
        r0 = r1.b;
        r0 = r7.get(r0);
        r0 = (com.google.android.apps.hangouts.views.OverlayedAvatarView) r0;
        r1 = r12.d;
        r1.removeView(r0);
        r1 = r12.d;
        r1.addView(r0, r2);
    L_0x0168:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x00d3;
    L_0x016d:
        r0 = r12.a(r1);
        r1 = r12.d;
        r1.addView(r0, r2);
        goto L_0x0168;
    L_0x0177:
        r3 = r0;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: bxj.a(java.util.List, boolean, java.lang.String):void");
    }

    public CharSequence a() {
        if (this.d.getChildCount() == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.d.getChildCount(); i++) {
            gld.a(stringBuilder, this.d.getChildAt(i).getContentDescription());
        }
        return this.a.getResources().getQuantityString(ba.hE, this.d.getChildCount(), new Object[]{stringBuilder.toString()});
    }

    private gkq<Boolean> a(List<edo> list) {
        gkq<Boolean> gkq = new gkq();
        for (edo edo : list) {
            if (!b().a(edo)) {
                gkq.put(edo, Boolean.valueOf(this.c.c(edo)));
            }
        }
        return gkq;
    }

    private OverlayedAvatarView a(edk edk) {
        boolean z = false;
        OverlayedAvatarView a = OverlayedAvatarView.a(LayoutInflater.from(this.a.getContext()), edk.e, edk.b, false, false, 2, null);
        if (this.b.e() == 1) {
            z = true;
        }
        a.a(z);
        a.a(edk.h, edk.e, b());
        a.setTag(edk);
        a(a);
        return a;
    }

    private void a(OverlayedAvatarView overlayedAvatarView) {
        edo edo = ((edk) overlayedAvatarView.getTag()).b;
        int b = overlayedAvatarView.b() | 1;
        if (this.c.a(edo)) {
            b |= 2;
        } else {
            b &= -3;
        }
        if (this.c.b(edo)) {
            b |= 4;
        } else {
            b &= -5;
        }
        overlayedAvatarView.e(b);
    }

    private bko b() {
        return this.b.k().h();
    }

    public ViewGroup v() {
        return this.d;
    }
}
