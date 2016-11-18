package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;

public class jvw extends jwh implements jyq {
    public final jyr f13971a = new jyr();
    public final jyn f13972b = this.f13971a.getBinder();
    private kbz f13973f;

    public jyn getBinder() {
        return this.f13972b;
    }

    public Context getContext() {
        return this.f13971a;
    }

    public void onAttach(Activity activity) {
        jyn a = jyn.m25429a((Context) activity, getParentFragment());
        this.f13971a.m25458a((Context) activity);
        this.f13971a.m25459a(a);
        this.c.m25556a(activity);
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle) {
        mo2092a(bundle);
        Iterator it = this.f13972b.m25457c(jzu.class).iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.f13972b.m25450a();
        this.f13973f = this.c.m25513a(new jvx(this, bundle));
        super.onCreate(bundle);
    }

    public void onDestroy() {
        this.c.m25522b(this.f13973f);
        super.onDestroy();
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        super.getLayoutInflater(bundle);
        return LayoutInflater.from(this.f13971a);
    }

    public void mo2092a(Bundle bundle) {
        this.f13972b.m25449a(new jzt(this, this.c));
    }
}
