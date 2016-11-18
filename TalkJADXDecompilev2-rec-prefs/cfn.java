package p000;

import android.widget.Toast;

final class cfn implements Runnable {
    final /* synthetic */ CharSequence f5189a;
    final /* synthetic */ String f5190b;
    final /* synthetic */ boolean f5191c;
    final /* synthetic */ cdn f5192d;

    cfn(cdn cdn, CharSequence charSequence, String str, boolean z) {
        this.f5192d = cdn;
        this.f5189a = charSequence;
        this.f5190b = str;
        this.f5191c = z;
    }

    public void run() {
        boolean z;
        cdr cdr = this.f5192d.f5078a;
        CharSequence charSequence = this.f5189a;
        String str = this.f5190b;
        boolean z2 = this.f5191c;
        bpd a = cdr.f5106i.mo931a();
        boolean G = cdr.m7354G();
        String str2 = "variant null: %s. reachability null: %s.";
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(a == null);
        if (cdr.bA == null) {
            z = true;
        } else {
            z = false;
        }
        objArr[1] = Boolean.valueOf(z);
        ba.m4611b(G, str2, objArr);
        if (!cdr.bA.m14964a()) {
            cdr.bA.m14963a(cdr.context, null, false);
            cdr.m7388a(str, 1001);
        } else if (cdr.m7352E()) {
            cdr.m7379a(a, charSequence, null, str, z2);
        } else {
            if (cdr.getActivity() != null) {
                Toast.makeText(cdr.context, bc.kd, 0).show();
            }
            cdr.m7388a(str, 1002);
        }
    }
}
