package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public final class dza implements jza, kci, kcq {
    private final Activity f10891a;
    private jca f10892b;

    public dza(Activity activity, kbu kbu) {
        this.f10891a = activity;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f10892b = (jca) jyn.m25443a(jca.class);
    }

    public boolean mo671a(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        Intent b = fk.m15533b(this.f10891a);
        b.putExtra("account_id", this.f10892b.mo2317a());
        if (fk.m15532a(this.f10891a, b)) {
            hq.m20483a(this.f10891a).m20490b(b).m20491b();
        } else {
            fk.m15535b(this.f10891a, b);
        }
        return true;
    }
}
