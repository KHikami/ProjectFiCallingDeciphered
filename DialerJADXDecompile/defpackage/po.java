package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: po */
public final class po {
    TextView A;
    TextView B;
    public View C;
    public ListAdapter D;
    public int E;
    int F;
    int G;
    public int H;
    int I;
    public int J;
    Handler K;
    final OnClickListener L;
    private int M;
    private int N;
    final Context a;
    final qx b;
    final Window c;
    CharSequence d;
    CharSequence e;
    public ListView f;
    View g;
    int h;
    int i;
    int j;
    int k;
    int l;
    boolean m;
    Button n;
    CharSequence o;
    Message p;
    Button q;
    CharSequence r;
    Message s;
    Button t;
    CharSequence u;
    Message v;
    NestedScrollView w;
    public int x;
    public Drawable y;
    public ImageView z;

    public po(Context context, qx qxVar, Window window) {
        this.m = false;
        this.x = 0;
        this.E = -1;
        this.N = 0;
        this.L = new pp(this);
        this.a = context;
        this.b = qxVar;
        this.c = window;
        this.K = new pv(qxVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, rk.G, buf.B, 0);
        this.F = obtainStyledAttributes.getResourceId(rk.H, 0);
        this.G = obtainStyledAttributes.getResourceId(rk.I, 0);
        this.H = obtainStyledAttributes.getResourceId(rk.K, 0);
        this.I = obtainStyledAttributes.getResourceId(rk.L, 0);
        this.M = obtainStyledAttributes.getResourceId(rk.M, 0);
        this.J = obtainStyledAttributes.getResourceId(rk.J, 0);
        obtainStyledAttributes.recycle();
        qxVar.a().c(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (po.a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void a(CharSequence charSequence) {
        this.d = charSequence;
        if (this.A != null) {
            this.A.setText(charSequence);
        }
    }

    static ViewGroup a(View view, View view2) {
        View inflate;
        if (view == null) {
            if (view2 instanceof ViewStub) {
                inflate = ((ViewStub) view2).inflate();
            } else {
                inflate = view2;
            }
            return (ViewGroup) inflate;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            inflate = ((ViewStub) view).inflate();
        } else {
            inflate = view;
        }
        return (ViewGroup) inflate;
    }
}
