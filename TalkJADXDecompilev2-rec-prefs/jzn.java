package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;

public class jzn extends kcv implements jyq {
    private kbz f3127a;
    private boolean f3128b;
    public final jyn binder = this.context.getBinder();
    public final jyr context = new jyr();

    public jyn getBinder() {
        return this.binder;
    }

    public Context getContext() {
        return this.context;
    }

    public void onAttach(Activity activity) {
        jyn a = jyn.m25429a((Context) activity, getParentFragment());
        this.context.m25458a((Context) activity);
        this.context.m25459a(a);
        this.binder.m25452a(getClass().getName());
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle) {
        onAttachBinder(bundle);
        if (this.f3128b) {
            mo495a();
            this.binder.m25450a();
            this.f3127a = this.lifecycle.m25513a(new jzo(this, bundle));
            super.onCreate(bundle);
            return;
        }
        String valueOf = String.valueOf(this);
        throw new jzb(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Fragment ").append(valueOf).append(" did not call through to super.onAttachBinder()").toString());
    }

    public void onDestroy() {
        this.lifecycle.m25522b(this.f3127a);
        super.onDestroy();
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        super.getLayoutInflater(bundle);
        return LayoutInflater.from(this.context);
    }

    public void onAttachBinder(Bundle bundle) {
        this.f3128b = true;
        this.binder.m25449a(new jzt(this, this.lifecycle));
    }

    private void mo495a() {
        Iterator it = this.binder.m25457c(jzu.class).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
