package p000;

import android.graphics.Rect;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class ish {
    String f18852a;
    String f18853b;
    private final ite f18854c;
    private final isj f18855d = new isj(this);
    private final Map<String, isk> f18856e = new HashMap();
    private final List<C0000a> f18857f = new ArrayList();
    private String f18858g;
    private ViewGroup f18859h;
    private int f18860i = 3;
    private int f18861j = 1;
    private int f18862k = 1;
    private Rect f18863l = new Rect();

    public ish(ite ite) {
        this.f18854c = ite;
        ite.mo3217a(this.f18855d);
    }

    public void m23103a() {
        this.f18854c.mo3219b(this.f18855d);
        m23101c();
        for (isk isk : this.f18856e.values()) {
            isk.f18869e.m23144a();
        }
        this.f18856e.clear();
    }

    public void m23104a(int i) {
        this.f18862k = 4;
    }

    public void m23108b() {
        for (Entry entry : this.f18856e.entrySet()) {
            if (!((String) entry.getKey()).equals(this.f18858g)) {
                isk isk = (isk) entry.getValue();
                if (((isk) entry.getValue()).f18868d.getGlobalVisibleRect(this.f18863l)) {
                    isk.f18869e.m23146a(this.f18861j);
                } else {
                    isk.f18869e.m23146a(this.f18862k);
                }
            }
        }
    }

    public void m23105a(ViewGroup viewGroup) {
        isk isk = (isk) this.f18856e.get(this.f18858g);
        if (isk != null) {
            m23099a(isk);
        }
        this.f18859h = viewGroup;
        if (isk != null) {
            m23100b(isk);
        }
    }

    public void m23107a(String str, View view, int i, isi isi) {
        String d = m23102d(str);
        if (this.f18856e.containsKey(d)) {
            itx.m23287b("vclib", "View already registered for participant %s", d);
            return;
        }
        TextureView textureView;
        isk isk = new isk();
        isk.f18865a = d;
        isk.f18866b = (ViewGroup) view.getParent();
        isk.f18867c = isk.f18866b.indexOfChild(view);
        isk.f18868d = view;
        isk.f18870f = isi;
        if (view instanceof TextureView) {
            textureView = (TextureView) view;
        } else {
            textureView = (TextureView) view.findViewById(-1);
        }
        isy isy = new isy(this.f18854c, textureView, d);
        isi.mo1582a(isy);
        isk.f18869e = isy;
        this.f18856e.put(d, isk);
        if (d.equals(this.f18858g)) {
            m23100b(isk);
        } else if (this.f18858g == null) {
            m23110c(d);
        } else {
            m23108b();
        }
    }

    public void m23106a(String str) {
        String d = m23102d(str);
        if (d.equals(this.f18858g)) {
            m23101c();
        }
        isk isk = (isk) this.f18856e.remove(d);
        if (isk != null) {
            isk.f18869e.m23144a();
        }
        if (d.equals(this.f18853b)) {
            m23109b(null);
        }
    }

    public void m23109b(String str) {
        this.f18853b = m23102d(str);
        Iterator it = this.f18857f.iterator();
        while (it.hasNext()) {
            it.next();
        }
        m23110c(this.f18853b == null ? this.f18852a : this.f18853b);
    }

    private void m23101c() {
        if (this.f18858g != null) {
            isk isk = (isk) this.f18856e.get(this.f18858g);
            this.f18858g = null;
            if (isk != null) {
                m23099a(isk);
            }
        }
    }

    private void m23099a(isk isk) {
        if (this.f18859h != null) {
            isk.f18870f.mo1581a();
            this.f18859h.removeView(isk.f18868d);
            isk.f18866b.addView(isk.f18868d, isk.f18867c);
            if (isk.f18868d.getGlobalVisibleRect(this.f18863l)) {
                isk.f18869e.m23146a(this.f18861j);
            } else {
                isk.f18869e.m23146a(this.f18862k);
            }
            isk.f18869e.m23149b();
        }
    }

    protected void m23110c(String str) {
        if (str != null && !str.equals(this.f18858g)) {
            m23101c();
            this.f18858g = str;
            isk isk = (isk) this.f18856e.get(str);
            if (isk != null) {
                m23100b(isk);
            }
        }
    }

    private void m23100b(isk isk) {
        if (this.f18859h != null) {
            isk.f18866b.removeView(isk.f18868d);
            this.f18859h.addView(isk.f18868d);
            isk.f18869e.m23146a(this.f18860i);
            isk.f18869e.m23149b();
            isk.f18870f.mo1583a(isk.f18865a.equals(this.f18853b));
        }
    }

    private String m23102d(String str) {
        if (str == null) {
            return null;
        }
        ith o = this.f18854c.mo3224o();
        return str.equals(o.m23209b() == null ? "localParticipant" : o.m23209b().m23223b()) ? "localParticipant" : str;
    }
}
