package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.mergedcontacts.impl.MergeContactsService;

final class dxz implements dwt {
    final /* synthetic */ Context f10788a;
    final /* synthetic */ dxy f10789b;

    dxz(dxy dxy, Context context) {
        this.f10789b = dxy;
        this.f10788a = context;
    }

    public void mo1761a(int i) {
        Intent intent = new Intent(this.f10788a, MergeContactsService.class);
        intent.putExtra("account_id", i);
        intent.putExtra("force_merge", true);
        this.f10788a.startService(intent);
    }

    public void mo1760a() {
        for (int a : fde.m15022f()) {
            mo1761a(a);
        }
    }
}
