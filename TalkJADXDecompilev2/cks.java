package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerActivity;

public class cks extends jzn implements cdf {
    private jek a;
    private int b;

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.b = ((jca) this.binder.a(jca.class)).a();
        this.a = ((jek) this.binder.a(jek.class)).a(gwb.mP, new ckt(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public boolean a() {
        if (gwb.a(fde.e(this.b), bnc.PHOTO_SHARING)) {
            Intent intent = new Intent(this.context, CameraPickerActivity.class);
            intent.putExtra("account_id", this.b);
            this.a.a(gwb.mP, intent);
            return true;
        }
        Toast.makeText(this.context, gwb.lZ, 0).show();
        return false;
    }

    public boolean b() {
        return true;
    }
}
