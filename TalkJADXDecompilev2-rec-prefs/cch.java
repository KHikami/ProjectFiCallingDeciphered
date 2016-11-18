package p000;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public final class cch {
    final Context f4999a;
    bko f5000b;
    bpd f5001c;
    edk f5002d;
    String f5003e;

    public cch(Context context) {
        this.f4999a = (Context) bm.m6122a((Object) context);
    }

    public cch m7201a(bko bko) {
        this.f5000b = (bko) bm.m6122a((Object) bko);
        return this;
    }

    public cch m7202a(bpd bpd) {
        this.f5001c = (bpd) bm.m6122a((Object) bpd);
        return this;
    }

    public cch m7203a(edk edk) {
        this.f5002d = edk;
        return this;
    }

    public cch m7204a(String str) {
        this.f5003e = (String) bm.m6122a((Object) str);
        return this;
    }

    public AlertDialog m7200a() {
        bm.m6122a(this.f5000b);
        bm.m6122a(this.f5001c);
        bm.m6122a(this.f5003e);
        Builder builder = new Builder(this.f4999a);
        ListAdapter arrayAdapter = new ArrayAdapter(this.f4999a, 17367043);
        m7199a(this.f5000b.m5638g(), arrayAdapter);
        builder.setAdapter(arrayAdapter, new cci(this, arrayAdapter));
        return builder.create();
    }

    private void m7199a(int i, ArrayAdapter<emv> arrayAdapter) {
        arrayAdapter.add(new ccr(this.f4999a, this.f5001c.f4146a, i, true));
        arrayAdapter.add(new ccr(this.f4999a, this.f5001c.f4146a, i, false));
        arrayAdapter.add(new ccj(this, "Remove conversation", i));
        arrayAdapter.add(new ccl(this, "Inspect conversation"));
        arrayAdapter.add(new ccm(this, "Email conversation"));
        arrayAdapter.add(new cco(this, "Show SMS target", i));
        arrayAdapter.add(new cct(this, "Debug contact info"));
    }
}
