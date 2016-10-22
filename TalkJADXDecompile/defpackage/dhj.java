package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;
import java.util.List;
import tp;

/* renamed from: dhj */
public final class dhj implements dht, fh<Cursor> {
    String a;
    private final dgg b;
    private dhk c;
    private Context d;
    private dij e;
    private bko f;
    private dhu g;
    private String h;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a(igVar, (Cursor) obj);
    }

    public dhj(Context context, bko bko, String str, String str2) {
        this.b = dgg.a();
        this.d = context;
        this.f = bko;
        this.a = str;
        this.h = str2;
    }

    public void a(dhu dhu) {
        this.g = dhu;
        this.c = new dhk(this);
        this.b.a(this.c);
        if (this.a != null) {
            dhu.f().a(0, null, this);
        }
        this.c.g();
    }

    public void a(tp tpVar) {
        this.e = (dij) tpVar.a();
        this.e.a(this.d.getResources().getString(bc.dc));
        c();
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        if (i != 0 || this.a == null) {
            return null;
        }
        return new enl(this.d, this.f, EsProvider.a(EsProvider.i, this.g.a().g()), bkj.a, "conversation_id=?", new String[]{this.a}, null);
    }

    void b() {
        if (this.a != null) {
            this.g.f().b(0, null, this);
        }
    }

    private void a(ig<Cursor> igVar, Cursor cursor) {
        if (igVar.p() == 0) {
            did s = this.b.s();
            if (s != null && s.J() == 1) {
                return;
            }
            if (this.h != null) {
                a(this.h, null);
            } else if (cursor != null && cursor.moveToFirst()) {
                String string = cursor.getString(3);
                if (TextUtils.isEmpty(string)) {
                    string = cursor.getString(4);
                }
                if (!TextUtils.isEmpty(string)) {
                    a(string, null);
                }
            }
        }
    }

    public void y_() {
        if (this.c != null) {
            this.b.b(this.c);
            this.c = null;
        }
    }

    void c() {
        String str = null;
        Object s = this.b.s();
        if (this.h != null) {
            a(this.h, null);
        } else if (s == null || s.J() != 1) {
            b();
        } else {
            String g;
            iil.b("Expected non-null", s);
            List T = s.T();
            if (T.size() == 1) {
                dii dii = (dii) T.get(0);
                if (dii.b() != null) {
                    str = glq.i(gwb.H(), dii.a());
                    g = glq.g(dii.a());
                } else {
                    str = glq.i(gwb.H(), dii.a());
                    g = null;
                }
            } else {
                g = null;
            }
            if (str != null) {
                a(str, g);
            } else {
                b();
            }
        }
    }

    private void a(String str, String str2) {
        if (this.e != null) {
            dij dij = this.e;
            if (TextUtils.isEmpty(str)) {
                str = this.d.getResources().getString(bc.dc);
            }
            dij.a(str);
            this.e.b(str2);
        }
    }

    public void a(int i) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLoaderReset(ig<Cursor> igVar) {
    }
}
