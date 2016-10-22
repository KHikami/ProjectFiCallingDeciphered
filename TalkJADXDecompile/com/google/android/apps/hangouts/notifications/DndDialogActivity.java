package com.google.android.apps.hangouts.notifications;

import android.content.Context;
import android.content.Intent;
import eas;
import fuz;
import gwb;
import iih;
import jca;
import jcu;
import jyy;

public class DndDialogActivity extends jyy {
    private final jca a;

    public DndDialogActivity() {
        this.a = new jcu(this, this.k).a(this.j);
    }

    public static Intent a(Context context, int i) {
        Intent intent = new Intent(context, DndDialogActivity.class);
        intent.putExtra("account_id", i);
        return intent;
    }

    public void onStop() {
        super.onStop();
        finish();
    }

    public void onStart() {
        super.onStart();
        int a = this.a.a();
        int intExtra = getIntent().getIntExtra("opened_from_impression", -1);
        if (intExtra != -1) {
            ((iih) this.j.a(iih.class)).a(a).b().c(intExtra);
        }
        String a2 = gwb.a(getIntent(), "dnd_duration_choice");
        if (a2 != null) {
            ((fuz) this.j.a(fuz.class)).a(a, a2);
            finish();
            return;
        }
        ((fuz) this.j.a(fuz.class)).a(this, a, new eas(this));
    }
}
