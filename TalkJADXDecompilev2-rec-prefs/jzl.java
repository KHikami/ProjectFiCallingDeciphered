package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;

public class jzl extends kcu implements jyq {
    private kbz aj;
    private boolean ak;
    public final jyr am = new jyr();
    public final jyn an = this.am.getBinder();

    public jyn getBinder() {
        return this.an;
    }

    public Context getContext() {
        return this.am;
    }

    public void onAttach(Activity activity) {
        jyn a = jyn.m25429a((Context) activity, getParentFragment());
        this.am.m25458a((Context) activity);
        this.am.m25459a(a);
        this.an.m25452a(getClass().getName());
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle) {
        mo973f(bundle);
        if (this.ak) {
            mo972q();
            this.an.m25450a();
            this.aj = this.ao.m25513a(new jzm(this, bundle));
            super.onCreate(bundle);
            return;
        }
        String valueOf = String.valueOf(this);
        throw new jzb(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Fragment ").append(valueOf).append(" did not call through to super.onAttachBinder()").toString());
    }

    public void onDestroy() {
        this.ao.m25522b(this.aj);
        super.onDestroy();
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        super.getLayoutInflater(bundle);
        return LayoutInflater.from(this.am);
    }

    public void mo973f(Bundle bundle) {
        this.ak = true;
        this.an.m25449a(new jzt(this, this.ao));
    }

    private void mo972q() {
        Iterator it = this.an.m25457c(jzu.class).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
