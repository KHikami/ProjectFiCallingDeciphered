package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerActivity;

public class cks extends jzn implements cdf {
    private jek f5528a;
    private int f5529b;

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f5529b = ((jca) this.binder.m25443a(jca.class)).mo2317a();
        this.f5528a = ((jek) this.binder.m25443a(jek.class)).m24033a(gwb.mP, new ckt(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public boolean mo495a() {
        if (gwb.m1923a(fde.m15018e(this.f5529b), bnc.PHOTO_SHARING)) {
            Intent intent = new Intent(this.context, CameraPickerActivity.class);
            intent.putExtra("account_id", this.f5529b);
            this.f5528a.m24035a(gwb.mP, intent);
            return true;
        }
        Toast.makeText(this.context, gwb.lZ, 0).show();
        return false;
    }

    public boolean mo988b() {
        return true;
    }
}
