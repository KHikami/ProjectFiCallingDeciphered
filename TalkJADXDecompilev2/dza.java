package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public final class dza implements jza, kci, kcq {
    private final Activity a;
    private jca b;

    public dza(Activity activity, kbu kbu) {
        this.a = activity;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (jca) jyn.a(jca.class);
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        Intent b = fk.b(this.a);
        b.putExtra("account_id", this.b.a());
        if (fk.a(this.a, b)) {
            hq.a(this.a).b(b).b();
        } else {
            fk.b(this.a, b);
        }
        return true;
    }
}
