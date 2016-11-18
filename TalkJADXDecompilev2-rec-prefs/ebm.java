package p000;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ebm extends ecw {
    static ebp f11107c = new ebp();
    final String f11108a;
    final String f11109b;

    private ebm(Context context, int i, eap eap, boolean z) {
        super(context, i, eap, z);
        this.f11108a = ((ear) eap.f11060b.get(0)).f11061a;
        this.f11109b = ((ebs) ((ear) eap.f11060b.get(0)).f11068h.get(0)).f11133k;
    }

    protected boolean mo1808b() {
        return false;
    }

    protected void mo1809c() {
    }

    protected String mo1819d() {
        return ecm.m13302b(this.r, this.s, this.f11108a, this.f11109b);
    }

    protected int mo1810f() {
        return 16;
    }

    protected Intent mo1812h() {
        return new ebn().m13465a(this.r, this.s, this.f11108a, this.f11109b);
    }

    public static void m13459a(Context context, int i, boolean z, boolean z2) {
        ebw ebw = ebs.f11121o;
        for (ear ear : ebs.m13477a(context, i, z2, ebu.f11140b).f11060b) {
            for (ecj ecj : ear.f11068h) {
                ebs ebs = (ebs) ecj;
                if (((eci) jyn.m25426a(context, eci.class)).mo1824a(new ech(16, i).m13511a(ear.f11061a).m13512b(ebs.f11133k).m13510a())) {
                    ear ear2 = new ear(ear.f11061a, ear.f11062b, ear.f11065e, ear.f11066f, ear.f11067g, ear.f11070j, ear.f11064d, ear.f11071k, ear.f11072l, ear.f11073m);
                    ear2.f11068h.add(ebs);
                    ear2.f11069i = 1;
                    List arrayList = new ArrayList(1);
                    arrayList.add(ear2);
                    new ebm(context, i, new eap(1, arrayList), z2).mo1807a(z);
                    ((bmq) jyn.m25426a(context, bmq.class)).mo613a(context, i).m5966a(glj.m17963b(), new ArrayList(Arrays.asList(new String[]{String.valueOf(ebs.f11132j)})));
                }
            }
        }
    }

    public static void m13458a(Context context, int i, String str, String str2) {
        blo a = ((bmq) jyn.m25426a(context, bmq.class)).mo613a(context, i);
        String b = ecm.m13302b(context, i, str, str2);
        if (((eci) jyn.m25426a(context, eci.class)).mo1825b(new ech(16, i).m13511a(str).m13512b(str2).m13510a()).size() != 0) {
            ebp.m13471a(context, b, 16);
            a.m5989a(str, str2, -1);
        }
    }

    public static void m13457a(Context context, int i) {
        List<ecg> b = ((eci) jyn.m25426a(context, eci.class)).mo1825b(new ech(16, i).m13510a());
        for (ecg ecg : b) {
            ebp.m13471a(context, ecm.m13302b(context, i, ecg.f11167c, ecg.f11168d), 16);
        }
        try {
            blo a = ((bmq) jyn.m25426a(context, bmq.class)).mo613a(context, i);
            for (ecg ecg2 : b) {
                a.m5989a(ecg2.f11167c, ecg2.f11168d, -1);
            }
        } catch (bmu e) {
            glk.m17970a("Babel", "Ignoring NotificationService intent for invalid account id: " + i, new Object[0]);
        }
    }
}
