package defpackage;

import android.accounts.NetworkErrorException;
import android.content.Context;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;

/* renamed from: ejq */
public final class ejq extends jgw implements gia<bow> {
    final /* synthetic */ BabelHomeActivity a;
    private czd b;
    private box f;

    public /* synthetic */ void a(ayo ayo, Exception exception) {
        b(exception);
    }

    public ejq(BabelHomeActivity babelHomeActivity, Context context, ed edVar, box box) {
        this.a = babelHomeActivity;
        super(context, edVar);
        this.f = box;
    }

    private void a(bow bow) {
        if (this.f != null) {
            String str = "ConversationChange Type: ";
            String valueOf = String.valueOf(this.f.name());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (this.b != null) {
            this.b.a();
        }
        this.a.x.a(this.a.y.a()).b().c(3319);
        this.a.startActivity(gwb.a(bow.c(), bow.b(), 2));
    }

    public void a(String str, String str2, String str3, boolean z) {
        this.b = new czd(this.a);
        this.b.a(str);
    }

    public void a(String str) {
        if (this.b != null) {
            this.b.a();
        }
    }

    public boolean a(jgz jgz) {
        return false;
    }

    private boolean a(Exception exception) {
        gag a;
        if (this.b != null) {
            this.b.a();
        }
        if (exception instanceof drb) {
            this.a.x.a(this.a.y.a()).b().c(3320);
            a = new gah(this.a).a(this.a.getResources().getString(bc.an)).a();
        } else if (exception instanceof NetworkErrorException) {
            a = new gah(this.a).a(this.a.getResources().getString(bc.dy)).a();
        } else {
            a = new gah(this.a).a(this.a.getResources().getString(bc.al)).a();
        }
        if (a != null) {
            if (this.a.w != null) {
                this.a.z.a(this.a.w, a);
            } else {
                this.a.z.a(a);
            }
        }
        return true;
    }

    private void b(Exception exception) {
        a(exception);
    }
}
