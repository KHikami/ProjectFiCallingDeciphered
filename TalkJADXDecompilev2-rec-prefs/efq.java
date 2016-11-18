package p000;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.hangouts.peoplelistv2.impl.PeopleSearchActivity;

final class efq extends dyy {
    efq() {
    }

    public int mo1639a() {
        return gwb.sV;
    }

    public int mo1641b() {
        return bc.vn;
    }

    public int mo1642c() {
        return 5;
    }

    public void mo1640a(Activity activity) {
        gwb.m1823a(this.a, 2546);
        Intent intent = new Intent(activity, PeopleSearchActivity.class);
        intent.putExtra("account_id", this.a.m5638g());
        intent.putExtra("edit_participants_model", new bck());
        activity.startActivity(intent);
    }

    public int mo1643d() {
        return 2;
    }

    public int mo1644e() {
        return 5;
    }
}
