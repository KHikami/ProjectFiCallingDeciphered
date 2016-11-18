package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.io.File;

public class cnm extends jzn implements cdf {
    jek f5708a;
    File f5709b;
    private final jej f5710c = new cnn(this);
    private final jej f5711d = new cnp(this);

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f5708a = ((jek) this.binder.m25443a(jek.class)).m24033a(gwb.lG, this.f5710c);
        this.f5708a = ((jek) this.binder.m25443a(jek.class)).m24033a(gwb.ly, this.f5711d);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("output_file");
            if (string != null) {
                this.f5709b = new File(string);
            }
        }
        return null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("output_file", this.f5709b.getPath());
        super.onSaveInstanceState(bundle);
    }

    public boolean mo495a() {
        this.f5709b = ccy.m7224a(bxo.VIDEO);
        ((cgr) this.binder.m25443a(cgr.class)).mo956m();
        bko e = fde.m15018e(((jca) this.binder.m25443a(jca.class)).mo2317a());
        bpd a = ((cgr) this.binder.m25443a(cgr.class)).mo931a();
        if (!gwb.m1923a(e, bnc.PHOTO_SHARING)) {
            Toast.makeText(this.context, gwb.lZ, 0).show();
        } else if (a == null || !gwb.m2267j(a.f4147b)) {
            Toast.makeText(this.context, gwb.nx, 0).show();
        } else {
            m7974c();
        }
        return false;
    }

    public boolean mo988b() {
        return false;
    }

    void m7974c() {
        Intent a = chs.m7666a(this.context, 2, this.f5709b);
        try {
            a.putExtra("android.intent.extra.showActionIcons", false);
            this.f5708a.m24035a(gwb.lG, a);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this.context, getResources().getString(gwb.nw), 0).show();
        }
    }
}
