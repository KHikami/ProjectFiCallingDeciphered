package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public final class uc {
    private boolean A = false;
    private CharSequence B;
    private CharSequence C;
    private CharSequence D;
    private int E = 0;
    private Drawable F;
    private ImageView G;
    private TextView H;
    private TextView I;
    private View J;
    private int K;
    private int L;
    private int M = 0;
    private final OnClickListener N = new ud(this);
    final vs a;
    ListView b;
    Button c;
    Message d;
    Button e;
    Message f;
    Button g;
    Message h;
    NestedScrollView i;
    ListAdapter j;
    int k = -1;
    int l;
    int m;
    int n;
    int o;
    Handler p;
    private final Context q;
    private final Window r;
    private CharSequence s;
    private CharSequence t;
    private View u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public uc(Context context, vs vsVar, Window window) {
        this.q = context;
        this.a = vsVar;
        this.r = window;
        this.p = new um(vsVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, wi.F, gwb.C, 0);
        this.K = obtainStyledAttributes.getResourceId(wi.G, 0);
        this.L = obtainStyledAttributes.getResourceId(wi.H, 0);
        this.l = obtainStyledAttributes.getResourceId(wi.J, 0);
        this.m = obtainStyledAttributes.getResourceId(wi.K, 0);
        this.n = obtainStyledAttributes.getResourceId(wi.L, 0);
        this.o = obtainStyledAttributes.getResourceId(wi.I, 0);
        obtainStyledAttributes.recycle();
        vsVar.a(1);
    }

    private static boolean c(View view) {
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
            if (uc.c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public void a(CharSequence charSequence) {
        this.s = charSequence;
        if (this.H != null) {
            this.H.setText(charSequence);
        }
    }

    public void a(View view) {
        this.J = view;
    }

    public void b(CharSequence charSequence) {
        this.t = charSequence;
        if (this.I != null) {
            this.I.setText(charSequence);
        }
    }

    public void a(int i) {
        this.u = null;
        this.v = i;
        this.A = false;
    }

    public void b(View view) {
        this.u = view;
        this.v = 0;
        this.A = false;
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        this.u = view;
        this.v = 0;
        this.A = true;
        this.w = i;
        this.x = i2;
        this.y = i3;
        this.z = i4;
    }

    public void a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (onClickListener != null) {
            message = this.p.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.D = charSequence;
                this.h = message;
                return;
            case -2:
                this.C = charSequence;
                this.f = message;
                return;
            case -1:
                this.B = charSequence;
                this.d = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void b(int i) {
        this.F = null;
        this.E = i;
        if (this.G == null) {
            return;
        }
        if (i != 0) {
            this.G.setVisibility(0);
            this.G.setImageResource(this.E);
            return;
        }
        this.G.setVisibility(8);
    }

    public void a(Drawable drawable) {
        this.F = drawable;
        this.E = 0;
        if (this.G == null) {
            return;
        }
        if (drawable != null) {
            this.G.setVisibility(0);
            this.G.setImageDrawable(drawable);
            return;
        }
        this.G.setVisibility(8);
    }

    public int c(int i) {
        TypedValue typedValue = new TypedValue();
        this.q.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public boolean a(KeyEvent keyEvent) {
        return this.i != null && this.i.a(keyEvent);
    }

    public boolean b(KeyEvent keyEvent) {
        return this.i != null && this.i.a(keyEvent);
    }

    private static ViewGroup a(View view, View view2) {
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

    public void a() {
        int i;
        View view;
        boolean z;
        boolean z2;
        int i2 = 0;
        if (this.L == 0) {
            i = this.K;
        } else if (this.M == 1) {
            i = this.L;
        } else {
            i = this.K;
        }
        this.a.setContentView(i);
        View findViewById = this.r.findViewById(gwb.bA);
        View findViewById2 = findViewById.findViewById(gwb.bL);
        View findViewById3 = findViewById.findViewById(gwb.bu);
        View findViewById4 = findViewById.findViewById(gwb.bt);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(gwb.bw);
        if (this.u != null) {
            view = this.u;
        } else if (this.v != 0) {
            view = LayoutInflater.from(this.q).inflate(this.v, viewGroup, false);
        } else {
            view = null;
        }
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        if (!(z && uc.c(view))) {
            this.r.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.r.findViewById(gwb.bv);
            frameLayout.addView(view, new LayoutParams(-1, -1));
            if (this.A) {
                frameLayout.setPadding(this.w, this.x, this.y, this.z);
            }
            if (this.b != null) {
                ((LinearLayout.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById5 = viewGroup.findViewById(gwb.bL);
        view = viewGroup.findViewById(gwb.bu);
        View findViewById6 = viewGroup.findViewById(gwb.bt);
        ViewGroup a = uc.a(findViewById5, findViewById2);
        ViewGroup a2 = uc.a(view, findViewById3);
        ViewGroup a3 = uc.a(findViewById6, findViewById4);
        this.i = (NestedScrollView) this.r.findViewById(gwb.bD);
        this.i.setFocusable(false);
        this.i.setNestedScrollingEnabled(false);
        this.I = (TextView) a2.findViewById(16908299);
        if (this.I != null) {
            if (this.t != null) {
                this.I.setText(this.t);
            } else {
                this.I.setVisibility(8);
                this.i.removeView(this.I);
                if (this.b != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.i.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.i);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.b, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    a2.setVisibility(8);
                }
            }
        }
        this.c = (Button) a3.findViewById(16908313);
        this.c.setOnClickListener(this.N);
        if (TextUtils.isEmpty(this.B)) {
            this.c.setVisibility(8);
            indexOfChild = 0;
        } else {
            this.c.setText(this.B);
            this.c.setVisibility(0);
            indexOfChild = 1;
        }
        this.e = (Button) a3.findViewById(16908314);
        this.e.setOnClickListener(this.N);
        if (TextUtils.isEmpty(this.C)) {
            this.e.setVisibility(8);
        } else {
            this.e.setText(this.C);
            this.e.setVisibility(0);
            indexOfChild |= 2;
        }
        this.g = (Button) a3.findViewById(16908315);
        this.g.setOnClickListener(this.N);
        if (TextUtils.isEmpty(this.D)) {
            this.g.setVisibility(8);
        } else {
            this.g.setText(this.D);
            this.g.setVisibility(0);
            indexOfChild |= 4;
        }
        if (indexOfChild != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            a3.setVisibility(8);
        }
        if (this.J != null) {
            a.addView(this.J, 0, new LayoutParams(-1, -2));
            this.r.findViewById(gwb.bK).setVisibility(8);
        } else {
            this.G = (ImageView) this.r.findViewById(16908294);
            if (!TextUtils.isEmpty(this.s)) {
                this.H = (TextView) this.r.findViewById(gwb.bs);
                this.H.setText(this.s);
                if (this.E != 0) {
                    this.G.setImageResource(this.E);
                } else if (this.F != null) {
                    this.G.setImageDrawable(this.F);
                } else {
                    this.H.setPadding(this.G.getPaddingLeft(), this.G.getPaddingTop(), this.G.getPaddingRight(), this.G.getPaddingBottom());
                    this.G.setVisibility(8);
                }
            } else {
                this.r.findViewById(gwb.bK).setVisibility(8);
                this.G.setVisibility(8);
                a.setVisibility(8);
            }
        }
        boolean z3 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        if (a == null || a.getVisibility() == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (a3 == null || a3.getVisibility() == 8) {
            z = false;
        } else {
            z = true;
        }
        if (!(z || a2 == null)) {
            view = a2.findViewById(gwb.bI);
            if (view != null) {
                view.setVisibility(0);
            }
        }
        if (z2 && this.i != null) {
            this.i.setClipToPadding(true);
        }
        if (!z3) {
            view = this.b != null ? this.b : this.i;
            if (view != null) {
                if (z2) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (z) {
                    i2 = 2;
                }
                i2 |= i;
                findViewById5 = this.r.findViewById(gwb.bC);
                findViewById = this.r.findViewById(gwb.bB);
                if (VERSION.SDK_INT >= 23) {
                    oa.a.a(view, i2, 3);
                    if (findViewById5 != null) {
                        a2.removeView(findViewById5);
                    }
                    if (findViewById != null) {
                        a2.removeView(findViewById);
                    }
                } else {
                    if (findViewById5 != null && (i2 & 1) == 0) {
                        a2.removeView(findViewById5);
                        findViewById5 = null;
                    }
                    if (findViewById != null && (i2 & 2) == 0) {
                        a2.removeView(findViewById);
                        findViewById = null;
                    }
                    if (!(findViewById5 == null && findViewById == null)) {
                        if (this.t != null) {
                            this.i.a(new sw(this, findViewById5, findViewById));
                            this.i.post(new ue(this, findViewById5, findViewById));
                        } else if (this.b != null) {
                            this.b.setOnScrollListener(new uf(this, findViewById5, findViewById));
                            this.b.post(new ug(this, findViewById5, findViewById));
                        } else {
                            if (findViewById5 != null) {
                                a2.removeView(findViewById5);
                            }
                            if (findViewById != null) {
                                a2.removeView(findViewById);
                            }
                        }
                    }
                }
            }
        }
        ListView listView = this.b;
        if (listView != null && this.j != null) {
            listView.setAdapter(this.j);
            int i3 = this.k;
            if (i3 >= 0) {
                listView.setItemChecked(i3, true);
                listView.setSelection(i3);
            }
        }
    }
}
