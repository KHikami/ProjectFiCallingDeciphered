package p000;

import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.provider.ContactsContract.Data;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.mergedcontacts.impl.MergeContactsService;

class dyb extends bcq implements jcd, jnh {
    private final ContentObserver f10818a = new dyc(this);
    private final Context f10819b;

    dyb(Context context) {
        this.f10819b = context;
    }

    protected void k_() {
        m13077a(false);
        this.f10819b.getContentResolver().registerContentObserver(EsProvider.f6008k, true, this.f10818a);
        this.f10819b.getContentResolver().registerContentObserver(Data.CONTENT_URI, true, this.f10818a);
    }

    protected void l_() {
        this.f10819b.getContentResolver().unregisterContentObserver(this.f10818a);
    }

    void m13077a(boolean z) {
        for (int a : fde.m15022f()) {
            m13075a(a, z);
        }
    }

    private void m13075a(int i, boolean z) {
        Intent intent = new Intent(this.f10819b, MergeContactsService.class);
        intent.putExtra("account_id", i);
        if (z) {
            intent.putExtra("force_merge", true);
        }
        this.f10819b.startService(intent);
    }

    public void mo609a(int i) {
        if (fde.m15030j(i)) {
            m13075a(i, true);
        }
    }

    public void mo1774b(int i) {
        if (fde.m15030j(i)) {
            m13075a(i, true);
        }
    }

    public void mo1775c(int i) {
    }
}
