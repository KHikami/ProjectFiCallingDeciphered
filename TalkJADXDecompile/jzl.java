import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;

public class jzl extends kcu implements jyq {
    private kbz aj;
    private boolean ak;
    public final jyr am;
    public final jyn an;

    public jzl() {
        this.am = new jyr();
        this.an = this.am.getBinder();
    }

    public jyn getBinder() {
        return this.an;
    }

    public Context getContext() {
        return this.am;
    }

    public void onAttach(Activity activity) {
        jyn a = jyn.a((Context) activity, getParentFragment());
        this.am.a((Context) activity);
        this.am.a(a);
        this.an.a(getClass().getName());
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle) {
        f(bundle);
        if (this.ak) {
            q();
            this.an.a();
            this.aj = this.ao.a(new jzm(this, bundle));
            super.onCreate(bundle);
            return;
        }
        String valueOf = String.valueOf(this);
        throw new jzb(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Fragment ").append(valueOf).append(" did not call through to super.onAttachBinder()").toString());
    }

    public void onDestroy() {
        this.ao.b(this.aj);
        super.onDestroy();
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        super.getLayoutInflater(bundle);
        return LayoutInflater.from(this.am);
    }

    public void f(Bundle bundle) {
        this.ak = true;
        this.an.a(new jzt(this, this.ao));
    }

    private void q() {
        Iterator it = this.an.c(jzu.class).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
