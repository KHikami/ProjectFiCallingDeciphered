package p000;

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
    private boolean f35196A = false;
    private CharSequence f35197B;
    private CharSequence f35198C;
    private CharSequence f35199D;
    private int f35200E = 0;
    private Drawable f35201F;
    private ImageView f35202G;
    private TextView f35203H;
    private TextView f35204I;
    private View f35205J;
    private int f35206K;
    private int f35207L;
    private int f35208M = 0;
    private final OnClickListener f35209N = new ud(this);
    final vs f35210a;
    ListView f35211b;
    Button f35212c;
    Message f35213d;
    Button f35214e;
    Message f35215f;
    Button f35216g;
    Message f35217h;
    NestedScrollView f35218i;
    ListAdapter f35219j;
    int f35220k = -1;
    int f35221l;
    int f35222m;
    int f35223n;
    int f35224o;
    Handler f35225p;
    private final Context f35226q;
    private final Window f35227r;
    private CharSequence f35228s;
    private CharSequence f35229t;
    private View f35230u;
    private int f35231v;
    private int f35232w;
    private int f35233x;
    private int f35234y;
    private int f35235z;

    public uc(Context context, vs vsVar, Window window) {
        this.f35226q = context;
        this.f35210a = vsVar;
        this.f35227r = window;
        this.f35225p = new um(vsVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, wi.F, gwb.C, 0);
        this.f35206K = obtainStyledAttributes.getResourceId(wi.G, 0);
        this.f35207L = obtainStyledAttributes.getResourceId(wi.H, 0);
        this.f35221l = obtainStyledAttributes.getResourceId(wi.J, 0);
        this.f35222m = obtainStyledAttributes.getResourceId(wi.K, 0);
        this.f35223n = obtainStyledAttributes.getResourceId(wi.L, 0);
        this.f35224o = obtainStyledAttributes.getResourceId(wi.I, 0);
        obtainStyledAttributes.recycle();
        vsVar.m40900a(1);
    }

    private static boolean m40883c(View view) {
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
            if (uc.m40883c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public void m40890a(CharSequence charSequence) {
        this.f35228s = charSequence;
        if (this.f35203H != null) {
            this.f35203H.setText(charSequence);
        }
    }

    public void m40888a(View view) {
        this.f35205J = view;
    }

    public void m40894b(CharSequence charSequence) {
        this.f35229t = charSequence;
        if (this.f35204I != null) {
            this.f35204I.setText(charSequence);
        }
    }

    public void m40885a(int i) {
        this.f35230u = null;
        this.f35231v = i;
        this.f35196A = false;
    }

    public void m40893b(View view) {
        this.f35230u = view;
        this.f35231v = 0;
        this.f35196A = false;
    }

    public void m40889a(View view, int i, int i2, int i3, int i4) {
        this.f35230u = view;
        this.f35231v = 0;
        this.f35196A = true;
        this.f35232w = i;
        this.f35233x = i2;
        this.f35234y = i3;
        this.f35235z = i4;
    }

    public void m40886a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (onClickListener != null) {
            message = this.f35225p.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f35199D = charSequence;
                this.f35217h = message;
                return;
            case -2:
                this.f35198C = charSequence;
                this.f35215f = message;
                return;
            case -1:
                this.f35197B = charSequence;
                this.f35213d = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void m40892b(int i) {
        this.f35201F = null;
        this.f35200E = i;
        if (this.f35202G == null) {
            return;
        }
        if (i != 0) {
            this.f35202G.setVisibility(0);
            this.f35202G.setImageResource(this.f35200E);
            return;
        }
        this.f35202G.setVisibility(8);
    }

    public void m40887a(Drawable drawable) {
        this.f35201F = drawable;
        this.f35200E = 0;
        if (this.f35202G == null) {
            return;
        }
        if (drawable != null) {
            this.f35202G.setVisibility(0);
            this.f35202G.setImageDrawable(drawable);
            return;
        }
        this.f35202G.setVisibility(8);
    }

    public int m40896c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f35226q.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public boolean m40891a(KeyEvent keyEvent) {
        return this.f35218i != null && this.f35218i.a(keyEvent);
    }

    public boolean m40895b(KeyEvent keyEvent) {
        return this.f35218i != null && this.f35218i.a(keyEvent);
    }

    private static ViewGroup m40882a(View view, View view2) {
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

    public void m40884a() {
        int i;
        View view;
        boolean z;
        boolean z2;
        int i2 = 0;
        if (this.f35207L == 0) {
            i = this.f35206K;
        } else if (this.f35208M == 1) {
            i = this.f35207L;
        } else {
            i = this.f35206K;
        }
        this.f35210a.setContentView(i);
        View findViewById = this.f35227r.findViewById(gwb.bA);
        View findViewById2 = findViewById.findViewById(gwb.bL);
        View findViewById3 = findViewById.findViewById(gwb.bu);
        View findViewById4 = findViewById.findViewById(gwb.bt);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(gwb.bw);
        if (this.f35230u != null) {
            view = this.f35230u;
        } else if (this.f35231v != 0) {
            view = LayoutInflater.from(this.f35226q).inflate(this.f35231v, viewGroup, false);
        } else {
            view = null;
        }
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        if (!(z && uc.m40883c(view))) {
            this.f35227r.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f35227r.findViewById(gwb.bv);
            frameLayout.addView(view, new LayoutParams(-1, -1));
            if (this.f35196A) {
                frameLayout.setPadding(this.f35232w, this.f35233x, this.f35234y, this.f35235z);
            }
            if (this.f35211b != null) {
                ((LinearLayout.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById5 = viewGroup.findViewById(gwb.bL);
        view = viewGroup.findViewById(gwb.bu);
        View findViewById6 = viewGroup.findViewById(gwb.bt);
        ViewGroup a = uc.m40882a(findViewById5, findViewById2);
        ViewGroup a2 = uc.m40882a(view, findViewById3);
        ViewGroup a3 = uc.m40882a(findViewById6, findViewById4);
        this.f35218i = (NestedScrollView) this.f35227r.findViewById(gwb.bD);
        this.f35218i.setFocusable(false);
        this.f35218i.setNestedScrollingEnabled(false);
        this.f35204I = (TextView) a2.findViewById(16908299);
        if (this.f35204I != null) {
            if (this.f35229t != null) {
                this.f35204I.setText(this.f35229t);
            } else {
                this.f35204I.setVisibility(8);
                this.f35218i.removeView(this.f35204I);
                if (this.f35211b != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f35218i.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.f35218i);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.f35211b, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    a2.setVisibility(8);
                }
            }
        }
        this.f35212c = (Button) a3.findViewById(16908313);
        this.f35212c.setOnClickListener(this.f35209N);
        if (TextUtils.isEmpty(this.f35197B)) {
            this.f35212c.setVisibility(8);
            indexOfChild = 0;
        } else {
            this.f35212c.setText(this.f35197B);
            this.f35212c.setVisibility(0);
            indexOfChild = 1;
        }
        this.f35214e = (Button) a3.findViewById(16908314);
        this.f35214e.setOnClickListener(this.f35209N);
        if (TextUtils.isEmpty(this.f35198C)) {
            this.f35214e.setVisibility(8);
        } else {
            this.f35214e.setText(this.f35198C);
            this.f35214e.setVisibility(0);
            indexOfChild |= 2;
        }
        this.f35216g = (Button) a3.findViewById(16908315);
        this.f35216g.setOnClickListener(this.f35209N);
        if (TextUtils.isEmpty(this.f35199D)) {
            this.f35216g.setVisibility(8);
        } else {
            this.f35216g.setText(this.f35199D);
            this.f35216g.setVisibility(0);
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
        if (this.f35205J != null) {
            a.addView(this.f35205J, 0, new LayoutParams(-1, -2));
            this.f35227r.findViewById(gwb.bK).setVisibility(8);
        } else {
            this.f35202G = (ImageView) this.f35227r.findViewById(16908294);
            if (!TextUtils.isEmpty(this.f35228s)) {
                this.f35203H = (TextView) this.f35227r.findViewById(gwb.bs);
                this.f35203H.setText(this.f35228s);
                if (this.f35200E != 0) {
                    this.f35202G.setImageResource(this.f35200E);
                } else if (this.f35201F != null) {
                    this.f35202G.setImageDrawable(this.f35201F);
                } else {
                    this.f35203H.setPadding(this.f35202G.getPaddingLeft(), this.f35202G.getPaddingTop(), this.f35202G.getPaddingRight(), this.f35202G.getPaddingBottom());
                    this.f35202G.setVisibility(8);
                }
            } else {
                this.f35227r.findViewById(gwb.bK).setVisibility(8);
                this.f35202G.setVisibility(8);
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
        if (z2 && this.f35218i != null) {
            this.f35218i.setClipToPadding(true);
        }
        if (!z3) {
            view = this.f35211b != null ? this.f35211b : this.f35218i;
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
                findViewById5 = this.f35227r.findViewById(gwb.bC);
                findViewById = this.f35227r.findViewById(gwb.bB);
                if (VERSION.SDK_INT >= 23) {
                    oa.f31462a.mo4146a(view, i2, 3);
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
                        if (this.f35229t != null) {
                            this.f35218i.a(new sw(this, findViewById5, findViewById));
                            this.f35218i.post(new ue(this, findViewById5, findViewById));
                        } else if (this.f35211b != null) {
                            this.f35211b.setOnScrollListener(new uf(this, findViewById5, findViewById));
                            this.f35211b.post(new ug(this, findViewById5, findViewById));
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
        ListView listView = this.f35211b;
        if (listView != null && this.f35219j != null) {
            listView.setAdapter(this.f35219j);
            int i3 = this.f35220k;
            if (i3 >= 0) {
                listView.setItemChecked(i3, true);
                listView.setSelection(i3);
            }
        }
    }
}
