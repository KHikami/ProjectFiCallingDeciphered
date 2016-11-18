package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.io.File;

public class cnm extends jzn implements cdf {
    jek a;
    File b;
    private final jej c = new cnn(this);
    private final jej d = new cnp(this);

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = ((jek) this.binder.a(jek.class)).a(gwb.lG, this.c);
        this.a = ((jek) this.binder.a(jek.class)).a(gwb.ly, this.d);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("output_file");
            if (string != null) {
                this.b = new File(string);
            }
        }
        return null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("output_file", this.b.getPath());
        super.onSaveInstanceState(bundle);
    }

    public boolean a() {
        this.b = ccy.a(bxo.VIDEO);
        ((cgr) this.binder.a(cgr.class)).m();
        bko e = fde.e(((jca) this.binder.a(jca.class)).a());
        bpd a = ((cgr) this.binder.a(cgr.class)).a();
        if (!gwb.a(e, bnc.PHOTO_SHARING)) {
            Toast.makeText(this.context, gwb.lZ, 0).show();
        } else if (a == null || !gwb.j(a.b)) {
            Toast.makeText(this.context, gwb.nx, 0).show();
        } else {
            c();
        }
        return false;
    }

    public boolean b() {
        return false;
    }

    void c() {
        Intent a = chs.a(this.context, 2, this.b);
        try {
            a.putExtra("android.intent.extra.showActionIcons", false);
            this.a.a(gwb.lG, a);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this.context, getResources().getString(gwb.nw), 0).show();
        }
    }
}
