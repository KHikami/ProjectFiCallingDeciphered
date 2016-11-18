package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.provider.ContactsContract.Data;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.mergedcontacts.impl.MergeContactsService;

class dyb extends bcq implements jcd, jnh {
    private final ContentObserver a = new dyc(this);
    private final Context b;

    dyb(Context context) {
        this.b = context;
    }

    protected void k_() {
        a(false);
        this.b.getContentResolver().registerContentObserver(EsProvider.k, true, this.a);
        this.b.getContentResolver().registerContentObserver(Data.CONTENT_URI, true, this.a);
    }

    protected void l_() {
        this.b.getContentResolver().unregisterContentObserver(this.a);
    }

    void a(boolean z) {
        for (int a : fde.f()) {
            a(a, z);
        }
    }

    private void a(int i, boolean z) {
        Intent intent = new Intent(this.b, MergeContactsService.class);
        intent.putExtra("account_id", i);
        if (z) {
            intent.putExtra("force_merge", true);
        }
        this.b.startService(intent);
    }

    public void a(int i) {
        if (fde.j(i)) {
            a(i, true);
        }
    }

    public void b(int i) {
        if (fde.j(i)) {
            a(i, true);
        }
    }

    public void c(int i) {
    }
}
