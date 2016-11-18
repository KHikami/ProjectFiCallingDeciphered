package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;
import java.util.List;

public final class dhj implements dht, fh<Cursor> {
    String f9753a;
    private final dgg f9754b = dgg.m11692a();
    private dhk f9755c;
    private Context f9756d;
    private dij f9757e;
    private bko f9758f;
    private dhu f9759g;
    private String f9760h;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        m11813a(igVar, (Cursor) obj);
    }

    public dhj(Context context, bko bko, String str, String str2) {
        this.f9756d = context;
        this.f9758f = bko;
        this.f9753a = str;
        this.f9760h = str2;
    }

    public void mo1110a(dhu dhu) {
        this.f9759g = dhu;
        this.f9755c = new dhk(this);
        this.f9754b.m11701a(this.f9755c);
        if (this.f9753a != null) {
            dhu.m11856f().mo1994a(0, null, this);
        }
        this.f9755c.mo1562g();
    }

    public void m11817a(tp tpVar) {
        this.f9757e = (dij) tpVar.a();
        this.f9757e.m12009a(this.f9756d.getResources().getString(bc.dc));
        m11819c();
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        if (i != 0 || this.f9753a == null) {
            return null;
        }
        return new enl(this.f9756d, this.f9758f, EsProvider.m8251a(EsProvider.f6006i, this.f9759g.m11848a().m5638g()), bkj.f3623a, "conversation_id=?", new String[]{this.f9753a}, null);
    }

    void m11818b() {
        if (this.f9753a != null) {
            this.f9759g.m11856f().mo1998b(0, null, this);
        }
    }

    private void m11813a(ig<Cursor> igVar, Cursor cursor) {
        if (igVar.m1287p() == 0) {
            did s = this.f9754b.m11727s();
            if (s != null && s.m11945J() == 1) {
                return;
            }
            if (this.f9760h != null) {
                m11814a(this.f9760h, null);
            } else if (cursor != null && cursor.moveToFirst()) {
                String string = cursor.getString(3);
                if (TextUtils.isEmpty(string)) {
                    string = cursor.getString(4);
                }
                if (!TextUtils.isEmpty(string)) {
                    m11814a(string, null);
                }
            }
        }
    }

    public void y_() {
        if (this.f9755c != null) {
            this.f9754b.m11705b(this.f9755c);
            this.f9755c = null;
        }
    }

    void m11819c() {
        String str = null;
        Object s = this.f9754b.m11727s();
        if (this.f9760h != null) {
            m11814a(this.f9760h, null);
        } else if (s == null || s.m11945J() != 1) {
            m11818b();
        } else {
            String g;
            iil.m21875b("Expected non-null", s);
            List T = s.m11954T();
            if (T.size() == 1) {
                dii dii = (dii) T.get(0);
                if (dii.m12006b() != null) {
                    str = glq.m18038i(gwb.m1400H(), dii.m12005a());
                    g = glq.m18031g(dii.m12005a());
                } else {
                    str = glq.m18038i(gwb.m1400H(), dii.m12005a());
                    g = null;
                }
            } else {
                g = null;
            }
            if (str != null) {
                m11814a(str, g);
            } else {
                m11818b();
            }
        }
    }

    private void m11814a(String str, String str2) {
        if (this.f9757e != null) {
            dij dij = this.f9757e;
            if (TextUtils.isEmpty(str)) {
                str = this.f9756d.getResources().getString(bc.dc);
            }
            dij.m12009a(str);
            this.f9757e.m12010b(str2);
        }
    }

    public void mo1109a(int i) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLoaderReset(ig<Cursor> igVar) {
    }
}
