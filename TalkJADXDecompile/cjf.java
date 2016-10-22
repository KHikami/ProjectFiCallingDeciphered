import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.io.File;

public class cjf extends jzn implements cdf {
    jek a;
    private final jej b;
    private final jej c;

    public cjf() {
        this.b = new cjg(this);
        this.c = new cjh(this);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = ((jek) this.binder.a(jek.class)).a(gwb.lF, this.b);
        this.a = ((jek) this.binder.a(jek.class)).a(gwb.lx, this.c);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public boolean a() {
        ((cgr) this.binder.a(cgr.class)).m();
        if (gwb.a(fde.e(((jca) this.binder.a(jca.class)).a()), bnc.PHOTO_SHARING)) {
            c();
        } else {
            Toast.makeText(this.context, gwb.lZ, 0).show();
        }
        return false;
    }

    public boolean b() {
        return false;
    }

    void c() {
        String a = ccy.a(1);
        if ("".equals(a)) {
            d();
            return;
        }
        Intent a2 = chs.a(this.context, 1, new File(getContext().getExternalCacheDir(), a));
        try {
            a2.putExtra("android.intent.extra.showActionIcons", false);
            this.a.a(gwb.lF, a2);
        } catch (ActivityNotFoundException e) {
            d();
        }
    }

    private void d() {
        Toast.makeText(this.context, getResources().getString(gwb.mm), 0).show();
    }
}
