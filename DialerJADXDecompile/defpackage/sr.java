package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;

/* compiled from: PG */
/* renamed from: sr */
public final class sr implements OnItemClickListener, tj {
    public LayoutInflater a;
    su b;
    public ExpandedMenuView c;
    int d;
    public tk e;
    public ss f;
    private Context g;
    private int h;

    public sr(Context context, int i) {
        this(i, 0);
        this.g = context;
        this.a = LayoutInflater.from(this.g);
    }

    private sr(int i, int i2) {
        this.d = i;
        this.h = 0;
    }

    public final void a(Context context, su suVar) {
        if (this.h != 0) {
            this.g = new ContextThemeWrapper(context, this.h);
            this.a = LayoutInflater.from(this.g);
        } else if (this.g != null) {
            this.g = context;
            if (this.a == null) {
                this.a = LayoutInflater.from(this.g);
            }
        }
        this.b = suVar;
        if (this.f != null) {
            this.f.notifyDataSetChanged();
        }
    }

    public final ListAdapter b() {
        if (this.f == null) {
            this.f = new ss(this);
        }
        return this.f;
    }

    public final void b(boolean z) {
        if (this.f != null) {
            this.f.notifyDataSetChanged();
        }
    }

    public final void a(tk tkVar) {
        this.e = tkVar;
    }

    public final boolean a(tr trVar) {
        if (!trVar.hasVisibleItems()) {
            return false;
        }
        sx sxVar = new sx(trVar);
        su suVar = sxVar.a;
        py pyVar = new py(suVar.a);
        sxVar.c = new sr(pyVar.a.a, buf.bS);
        sxVar.c.e = sxVar;
        sxVar.a.a(sxVar.c);
        pyVar.a.h = sxVar.c.b();
        pyVar.a.i = sxVar;
        View view = suVar.h;
        if (view != null) {
            pyVar.a.e = view;
        } else {
            pyVar.a.c = suVar.g;
            pyVar.a.d = suVar.f;
        }
        pyVar.a.g = sxVar;
        px pxVar = new px(pyVar.a.a, pyVar.b);
        pt ptVar = pyVar.a;
        po poVar = pxVar.a;
        if (ptVar.e != null) {
            poVar.C = ptVar.e;
        } else {
            if (ptVar.d != null) {
                poVar.a(ptVar.d);
            }
            if (ptVar.c != null) {
                Drawable drawable = ptVar.c;
                poVar.y = drawable;
                poVar.x = 0;
                if (poVar.z != null) {
                    if (drawable != null) {
                        poVar.z.setVisibility(0);
                        poVar.z.setImageDrawable(drawable);
                    } else {
                        poVar.z.setVisibility(8);
                    }
                }
            }
        }
        if (ptVar.h != null) {
            ListAdapter listAdapter;
            ListView listView = (ListView) ptVar.b.inflate(poVar.H, null);
            int i = poVar.J;
            if (ptVar.h != null) {
                listAdapter = ptVar.h;
            } else {
                listAdapter = new pw(ptVar.a, i, 16908308, null);
            }
            poVar.D = listAdapter;
            poVar.E = ptVar.j;
            if (ptVar.i != null) {
                listView.setOnItemClickListener(new pu(ptVar, poVar));
            }
            poVar.f = listView;
        }
        pxVar.setCancelable(pyVar.a.f);
        if (pyVar.a.f) {
            pxVar.setCanceledOnTouchOutside(true);
        }
        pxVar.setOnCancelListener(null);
        pxVar.setOnDismissListener(null);
        if (pyVar.a.g != null) {
            pxVar.setOnKeyListener(pyVar.a.g);
        }
        sxVar.b = pxVar;
        sxVar.b.setOnDismissListener(sxVar);
        LayoutParams attributes = sxVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        sxVar.b.show();
        if (this.e != null) {
            this.e.a(trVar);
        }
        return true;
    }

    public final void a(su suVar, boolean z) {
        if (this.e != null) {
            this.e.a(suVar, z);
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.a(this.f.a(i), (tj) this, 0);
    }

    public final boolean a() {
        return false;
    }

    public final boolean b(sy syVar) {
        return false;
    }

    public final boolean c(sy syVar) {
        return false;
    }
}
