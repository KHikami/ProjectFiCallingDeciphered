package com.google.android.apps.hangouts.phone;

import android.os.Bundle;
import ekc;
import epi;
import fde;

public class ArchivedConversationListActivity extends ekc {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.s.b(2);
    }

    public void a(String str, boolean z, int i, int i2) {
        new epi(this, fde.e(this.r.a()), str, z, i, true, i2).b(new Void[0]);
    }
}
