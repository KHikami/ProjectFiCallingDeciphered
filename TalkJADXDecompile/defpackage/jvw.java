package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;

/* renamed from: jvw */
public class jvw extends jwh implements jyq {
    public final jyr a;
    public final jyn b;
    private kbz f;

    public jvw() {
        this.a = new jyr();
        this.b = this.a.getBinder();
    }

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
