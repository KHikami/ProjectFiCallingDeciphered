package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.mergedcontacts.impl.MergeContactsService;

/* renamed from: dxz */
final class dxz implements dwt {
    final /* synthetic */ Context a;
    final /* synthetic */ dxy b;

    dxz(dxy dxy, Context context) {
        this.b = dxy;
        this.a = context;
    }

    public void a(int i) {
        Intent intent = new Intent(this.a, MergeContactsService.class);
        intent.putExtra("account_id", i);
        intent.putExtra("force_merge", true);
        this.a.startService(intent);
    }

    public void a() {
        for (int a : fde.f()) {
            a(a);
        }
    }
}
