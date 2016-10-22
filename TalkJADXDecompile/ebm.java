import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ebm extends ecw {
    static ebp c;
    final String a;
    final String b;

    private ebm(Context context, int i, eap eap, boolean z) {
        super(context, i, eap, z);
        this.a = ((ear) eap.b.get(0)).a;
        this.b = ((ebs) ((ear) eap.b.get(0)).h.get(0)).k;
    }

    protected boolean b() {
        return false;
    }

    protected void c() {
    }

    protected String d() {
        return ecm.b(this.r, this.s, this.a, this.b);
    }

    protected int f() {
        return 16;
    }

    protected Intent h() {
        return new ebn().a(this.r, this.s, this.a, this.b);
    }

    public static void a(Context context, int i, boolean z, boolean z2) {
        ebw ebw = ebs.o;
        for (ear ear : ebs.a(context, i, z2, ebu.b).b) {
            for (ecj ecj : ear.h) {
                ebs ebs = (ebs) ecj;
                if (((eci) jyn.a(context, eci.class)).a(new ech(16, i).a(ear.a).b(ebs.k).a())) {
                    ear ear2 = new ear(ear.a, ear.b, ear.e, ear.f, ear.g, ear.j, ear.d, ear.k, ear.l, ear.m);
                    ear2.h.add(ebs);
                    ear2.i = 1;
                    List arrayList = new ArrayList(1);
                    arrayList.add(ear2);
                    new ebm(context, i, new eap(1, arrayList), z2).a(z);
                    ((bmq) jyn.a(context, bmq.class)).a(context, i).a(glj.b(), new ArrayList(Arrays.asList(new String[]{String.valueOf(ebs.j)})));
                }
            }
        }
    }

    public static void a(Context context, int i, String str, String str2) {
        blo a = ((bmq) jyn.a(context, bmq.class)).a(context, i);
        String b = ecm.b(context, i, str, str2);
        if (((eci) jyn.a(context, eci.class)).b(new ech(16, i).a(str).b(str2).a()).size() != 0) {
            ebp.a(context, b, 16);
            a.a(str, str2, -1);
        }
    }

    public static void a(Context context, int i) {
        List<ecg> b = ((eci) jyn.a(context, eci.class)).b(new ech(16, i).a());
        for (ecg ecg : b) {
            ebp.a(context, ecm.b(context, i, ecg.c, ecg.d), 16);
        }
        try {
            blo a = ((bmq) jyn.a(context, bmq.class)).a(context, i);
            for (ecg ecg2 : b) {
                a.a(ecg2.c, ecg2.d, -1);
            }
        } catch (bmu e) {
            glk.a("Babel", "Ignoring NotificationService intent for invalid account id: " + i, new Object[0]);
        }
    }

    static {
        c = new ebp();
    }
}
