import android.widget.Toast;

final class cfn implements Runnable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ cdn d;

    cfn(cdn cdn, CharSequence charSequence, String str, boolean z) {
        this.d = cdn;
        this.a = charSequence;
        this.b = str;
        this.c = z;
    }

    public void run() {
        boolean z;
        cdr cdr = this.d.a;
        CharSequence charSequence = this.a;
        String str = this.b;
        boolean z2 = this.c;
        bpd a = cdr.i.a();
        boolean G = cdr.G();
        String str2 = "variant null: %s. reachability null: %s.";
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(a == null);
        if (cdr.bA == null) {
            z = true;
        } else {
            z = false;
        }
        objArr[1] = Boolean.valueOf(z);
        ba.b(G, str2, objArr);
        if (!cdr.bA.a()) {
            cdr.bA.a(cdr.context, null, false);
            cdr.a(str, 1001);
        } else if (cdr.E()) {
            cdr.a(a, charSequence, null, str, z2);
        } else {
            if (cdr.getActivity() != null) {
                Toast.makeText(cdr.context, bc.kd, 0).show();
            }
            cdr.a(str, 1002);
        }
    }
}
