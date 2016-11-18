package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;

public class jvw extends jwh implements jyq {
    public final jyr a = new jyr();
    public final jyn b = this.a.getBinder();
    private kbz f;

    public jyn getBinder() {
        return this.b;
    }

    public Context getContext() {
        return this.a;
    }

    public void onAttach(Activity activity) {
        jyn a = jyn.a((Context) activity, getParentFragment());
        this.a.a((Context) activity);
        this.a.a(a);
        this.c.a(activity);
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle) {
        a(bundle);
        Iterator it = this.b.c(jzu.class).iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.b.a();
        this.f = this.c.a(new jvx(this, bundle));
        super.onCreate(bundle);
    }

    public void onDestroy() {
        this.c.b(this.f);
        super.onDestroy();
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        super.getLayoutInflater(bundle);
        return LayoutInflater.from(this.a);
    }

    public void a(Bundle bundle) {
        this.b.a(new jzt(this, this.c));
    }
}
