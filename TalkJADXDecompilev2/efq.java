package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.hangouts.peoplelistv2.impl.PeopleSearchActivity;

final class efq extends dyy {
    efq() {
    }

    public int a() {
        return gwb.sV;
    }

    public int b() {
        return bc.vn;
    }

    public int c() {
        return 5;
    }

    public void a(Activity activity) {
        gwb.a(this.a, 2546);
        Intent intent = new Intent(activity, PeopleSearchActivity.class);
        intent.putExtra("account_id", this.a.g());
        intent.putExtra("edit_participants_model", new bck());
        activity.startActivity(intent);
    }

    public int d() {
        return 2;
    }

    public int e() {
        return 5;
    }
}
