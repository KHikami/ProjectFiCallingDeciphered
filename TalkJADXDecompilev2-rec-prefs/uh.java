package p000;

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
    public int f35246A;
    public boolean f35247B = false;
    public boolean[] f35248C;
    public boolean f35249D;
    public boolean f35250E;
    public int f35251F = -1;
    public OnMultiChoiceClickListener f35252G;
    public Cursor f35253H;
    public String f35254I;
    public String f35255J;
    public OnItemSelectedListener f35256K;
    public boolean f35257L = true;
    public final Context f35258a;
    public final LayoutInflater f35259b;
    public int f35260c = 0;
    public Drawable f35261d;
    public int f35262e = 0;
    public CharSequence f35263f;
    public View f35264g;
    public CharSequence f35265h;
    public CharSequence f35266i;
    public OnClickListener f35267j;
    public CharSequence f35268k;
    public OnClickListener f35269l;
    public CharSequence f35270m;
    public OnClickListener f35271n;
    public boolean f35272o;
    public OnCancelListener f35273p;
    public OnDismissListener f35274q;
    public OnKeyListener f35275r;
    public CharSequence[] f35276s;
    public ListAdapter f35277t;
    public OnClickListener f35278u;
    public int f35279v;
    public View f35280w;
    public int f35281x;
    public int f35282y;
    public int f35283z;

    public uh(Context context) {
        this.f35258a = context;
        this.f35272o = true;
        this.f35259b = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public void m40897a(uc ucVar) {
        if (this.f35264g != null) {
            ucVar.m40888a(this.f35264g);
        } else {
            if (this.f35263f != null) {
                ucVar.m40890a(this.f35263f);
            }
            if (this.f35261d != null) {
                ucVar.m40887a(this.f35261d);
            }
            if (this.f35260c != 0) {
                ucVar.m40892b(this.f35260c);
            }
            if (this.f35262e != 0) {
                ucVar.m40892b(ucVar.m40896c(this.f35262e));
            }
        }
        if (this.f35265h != null) {
            ucVar.m40894b(this.f35265h);
        }
        if (this.f35266i != null) {
            ucVar.m40886a(-1, this.f35266i, this.f35267j, null);
        }
        if (this.f35268k != null) {
            ucVar.m40886a(-2, this.f35268k, this.f35269l, null);
        }
        if (this.f35270m != null) {
            ucVar.m40886a(-3, this.f35270m, this.f35271n, null);
        }
        if (!(this.f35276s == null && this.f35253H == null && this.f35277t == null)) {
            ListAdapter simpleCursorAdapter;
            ListView listView = (ListView) this.f35259b.inflate(ucVar.f35221l, null);
            if (!this.f35249D) {
                int i;
                if (this.f35250E) {
                    i = ucVar.f35223n;
                } else {
                    i = ucVar.f35224o;
                }
                if (this.f35253H != null) {
                    simpleCursorAdapter = new SimpleCursorAdapter(this.f35258a, i, this.f35253H, new String[]{this.f35254I}, new int[]{16908308});
                } else if (this.f35277t != null) {
                    simpleCursorAdapter = this.f35277t;
                } else {
                    simpleCursorAdapter = new un(this.f35258a, i, 16908308, this.f35276s);
                }
            } else if (this.f35253H == null) {
                simpleCursorAdapter = new ui(this, this.f35258a, ucVar.f35222m, 16908308, this.f35276s, listView);
            } else {
                Object ujVar = new uj(this, this.f35258a, this.f35253H, false, listView, ucVar);
            }
            ucVar.f35219j = simpleCursorAdapter;
            ucVar.f35220k = this.f35251F;
            if (this.f35278u != null) {
                listView.setOnItemClickListener(new uk(this, ucVar));
            } else if (this.f35252G != null) {
                listView.setOnItemClickListener(new ul(this, listView, ucVar));
            }
            if (this.f35256K != null) {
                listView.setOnItemSelectedListener(this.f35256K);
            }
            if (this.f35250E) {
                listView.setChoiceMode(1);
            } else if (this.f35249D) {
                listView.setChoiceMode(2);
            }
            ucVar.f35211b = listView;
        }
        if (this.f35280w != null) {
            if (this.f35247B) {
                ucVar.m40889a(this.f35280w, this.f35281x, this.f35282y, this.f35283z, this.f35246A);
                return;
            }
            ucVar.m40893b(this.f35280w);
        } else if (this.f35279v != 0) {
            ucVar.m40885a(this.f35279v);
        }
    }
}
