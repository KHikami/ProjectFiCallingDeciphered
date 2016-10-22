package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;

/* renamed from: jzn */
public class jzn extends kcv implements jyq {
    private kbz a;
    private boolean b;
    public final jyn binder;
    public final jyr context;

    public jzn() {
        this.context = new jyr();
        this.binder = this.context.getBinder();
    }

    public jyn getBinder() {
        return this.binder;
    }

    public Context getContext() {
        return this.context;
    }

    public void onAttach(Activity activity) {
        jyn a = jyn.a((Context) activity, getParentFragment());
        this.context.a((Context) activity);
        this.context.a(a);
        this.binder.a(getClass().getName());
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle) {
        onAttachBinder(bundle);
        if (this.b) {
            a();
            this.binder.a();
            this.a = this.lifecycle.a(new jzo(this, bundle));
            super.onCreate(bundle);
            return;
        }
        String valueOf = String.valueOf(this);
        throw new jzb(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Fragment ").append(valueOf).append(" did not call through to super.onAttachBinder()").toString());
    }

    public void onDestroy() {
        this.lifecycle.b(this.a);
        super.onDestroy();
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        super.getLayoutInflater(bundle);
        return LayoutInflater.from(this.context);
    }

    public void onAttachBinder(Bundle bundle) {
        this.b = true;
        this.binder.a(new jzt(this, this.lifecycle));
    }

    private void a() {
        Iterator it = this.binder.c(jzu.class).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
