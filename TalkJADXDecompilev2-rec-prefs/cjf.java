package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.io.File;

public class cjf extends jzn implements cdf {
    jek f5420a;
    private final jej f5421b = new cjg(this);
    private final jej f5422c = new cjh(this);

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f5420a = ((jek) this.binder.m25443a(jek.class)).m24033a(gwb.lF, this.f5421b);
        this.f5420a = ((jek) this.binder.m25443a(jek.class)).m24033a(gwb.lx, this.f5422c);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public boolean mo495a() {
        ((cgr) this.binder.m25443a(cgr.class)).mo956m();
        if (gwb.m1923a(fde.m15018e(((jca) this.binder.m25443a(jca.class)).mo2317a()), bnc.PHOTO_SHARING)) {
            m7771c();
        } else {
            Toast.makeText(this.context, gwb.lZ, 0).show();
        }
        return false;
    }

    public boolean mo988b() {
        return false;
    }

    void m7771c() {
        String a = ccy.m7225a(1);
        if ("".equals(a)) {
            m7768d();
            return;
        }
        Intent a2 = chs.m7666a(this.context, 1, new File(getContext().getExternalCacheDir(), a));
        try {
            a2.putExtra("android.intent.extra.showActionIcons", false);
            this.f5420a.m24035a(gwb.lF, a2);
        } catch (ActivityNotFoundException e) {
            m7768d();
        }
    }

    private void m7768d() {
        Toast.makeText(this.context, getResources().getString(gwb.mm), 0).show();
    }
}
