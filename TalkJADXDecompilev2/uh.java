package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public final class uh {
    public int A;
    public boolean B = false;
    public boolean[] C;
    public boolean D;
    public boolean E;
    public int F = -1;
    public OnMultiChoiceClickListener G;
    public Cursor H;
    public String I;
    public String J;
    public OnItemSelectedListener K;
    public boolean L = true;
    public final Context a;
    public final LayoutInflater b;
    public int c = 0;
    public Drawable d;
    public int e = 0;
    public CharSequence f;
    public View g;
    public CharSequence h;
    public CharSequence i;
    public OnClickListener j;
    public CharSequence k;
    public OnClickListener l;
    public CharSequence m;
    public OnClickListener n;
    public boolean o;
    public OnCancelListener p;
    public OnDismissListener q;
    public OnKeyListener r;
    public CharSequence[] s;
    public ListAdapter t;
    public OnClickListener u;
    public int v;
    public View w;
    public int x;
    public int y;
    public int z;

    public uh(Context context) {
        this.a = context;
        this.o = true;
        this.b = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public void a(uc ucVar) {
        if (this.g != null) {
            ucVar.a(this.g);
        } else {
            if (this.f != null) {
                ucVar.a(this.f);
            }
            if (this.d != null) {
                ucVar.a(this.d);
            }
            if (this.c != 0) {
                ucVar.b(this.c);
            }
            if (this.e != 0) {
                ucVar.b(ucVar.c(this.e));
            }
        }
        if (this.h != null) {
            ucVar.b(this.h);
        }
        if (this.i != null) {
            ucVar.a(-1, this.i, this.j, null);
        }
        if (this.k != null) {
            ucVar.a(-2, this.k, this.l, null);
        }
        if (this.m != null) {
            ucVar.a(-3, this.m, this.n, null);
        }
        if (!(this.s == null && this.H == null && this.t == null)) {
            ListAdapter simpleCursorAdapter;
            ListView listView = (ListView) this.b.inflate(ucVar.l, null);
            if (!this.D) {
                int i;
                if (this.E) {
                    i = ucVar.n;
                } else {
                    i = ucVar.o;
                }
                if (this.H != null) {
                    simpleCursorAdapter = new SimpleCursorAdapter(this.a, i, this.H, new String[]{this.I}, new int[]{16908308});
                } else if (this.t != null) {
                    simpleCursorAdapter = this.t;
                } else {
                    simpleCursorAdapter = new un(this.a, i, 16908308, this.s);
                }
            } else if (this.H == null) {
                simpleCursorAdapter = new ui(this, this.a, ucVar.m, 16908308, this.s, listView);
            } else {
                Object ujVar = new uj(this, this.a, this.H, false, listView, ucVar);
            }
            ucVar.j = simpleCursorAdapter;
            ucVar.k = this.F;
            if (this.u != null) {
                listView.setOnItemClickListener(new uk(this, ucVar));
            } else if (this.G != null) {
                listView.setOnItemClickListener(new ul(this, listView, ucVar));
            }
            if (this.K != null) {
                listView.setOnItemSelectedListener(this.K);
            }
            if (this.E) {
                listView.setChoiceMode(1);
            } else if (this.D) {
                listView.setChoiceMode(2);
            }
            ucVar.b = listView;
        }
        if (this.w != null) {
            if (this.B) {
                ucVar.a(this.w, this.x, this.y, this.z, this.A);
                return;
            }
            ucVar.b(this.w);
        } else if (this.v != 0) {
            ucVar.a(this.v);
        }
    }
}
