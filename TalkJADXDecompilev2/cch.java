package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public final class cch {
    final Context a;
    bko b;
    bpd c;
    edk d;
    String e;

    public cch(Context context) {
        this.a = (Context) bm.a((Object) context);
    }

    public cch a(bko bko) {
        this.b = (bko) bm.a((Object) bko);
        return this;
    }

    public cch a(bpd bpd) {
        this.c = (bpd) bm.a((Object) bpd);
        return this;
    }

    public cch a(edk edk) {
        this.d = edk;
        return this;
    }

    public cch a(String str) {
        this.e = (String) bm.a((Object) str);
        return this;
    }

    public AlertDialog a() {
        bm.a(this.b);
        bm.a(this.c);
        bm.a(this.e);
        Builder builder = new Builder(this.a);
        ListAdapter arrayAdapter = new ArrayAdapter(this.a, 17367043);
        a(this.b.g(), arrayAdapter);
        builder.setAdapter(arrayAdapter, new cci(this, arrayAdapter));
        return builder.create();
    }

    private void a(int i, ArrayAdapter<emv> arrayAdapter) {
        arrayAdapter.add(new ccr(this.a, this.c.a, i, true));
        arrayAdapter.add(new ccr(this.a, this.c.a, i, false));
        arrayAdapter.add(new ccj(this, "Remove conversation", i));
        arrayAdapter.add(new ccl(this, "Inspect conversation"));
        arrayAdapter.add(new ccm(this, "Email conversation"));
        arrayAdapter.add(new cco(this, "Show SMS target", i));
        arrayAdapter.add(new cct(this, "Debug contact info"));
    }
}
