import android.content.Context;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/* compiled from: PG */
public final class px extends qx implements DialogInterface {
    public final po a;

    public px(Context context, int i) {
        super(context, a(context, i));
        this.a = new po(getContext(), this, getWindow());
    }

    static int a(Context context, int i) {
        if (i >= 16777216) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(buf.C, typedValue, true);
        return typedValue.resourceId;
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }

    protected final void onCreate(Bundle bundle) {
        int i;
        View view;
        int indexOfChild;
        Object obj;
        int i2;
        super.onCreate(bundle);
        po poVar = this.a;
        if (poVar.G == 0) {
            i = poVar.F;
        } else {
            i = poVar.F;
        }
        poVar.b.setContentView(i);
        View findViewById = poVar.c.findViewById(buf.bw);
        View findViewById2 = findViewById.findViewById(buf.bH);
        View findViewById3 = findViewById.findViewById(buf.bn);
        View findViewById4 = findViewById.findViewById(buf.bm);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(buf.bp);
        if (poVar.g != null) {
            view = poVar.g;
        } else if (poVar.h != 0) {
            view = LayoutInflater.from(poVar.a).inflate(poVar.h, viewGroup, false);
        } else {
            view = null;
        }
        Object obj2 = view != null ? 1 : null;
        if (obj2 == null || !po.a(view)) {
            poVar.c.setFlags(131072, 131072);
        }
        if (obj2 != null) {
            FrameLayout frameLayout = (FrameLayout) poVar.c.findViewById(buf.bo);
            frameLayout.addView(view, new LayoutParams(-1, -1));
            if (poVar.m) {
                frameLayout.setPadding(poVar.i, poVar.j, poVar.k, poVar.l);
            }
            if (poVar.f != null) {
                ((LinearLayout.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById5 = viewGroup.findViewById(buf.bH);
        view = viewGroup.findViewById(buf.bn);
        View findViewById6 = viewGroup.findViewById(buf.bm);
        ViewGroup a = po.a(findViewById5, findViewById2);
        ViewGroup a2 = po.a(view, findViewById3);
        ViewGroup a3 = po.a(findViewById6, findViewById4);
        poVar.w = (NestedScrollView) poVar.c.findViewById(buf.bz);
        poVar.w.setFocusable(false);
        poVar.w.setNestedScrollingEnabled(false);
        poVar.B = (TextView) a2.findViewById(16908299);
        if (poVar.B != null) {
            if (poVar.e != null) {
                poVar.B.setText(poVar.e);
            } else {
                poVar.B.setVisibility(8);
                poVar.w.removeView(poVar.B);
                if (poVar.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) poVar.w.getParent();
                    indexOfChild = viewGroup2.indexOfChild(poVar.w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(poVar.f, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    a2.setVisibility(8);
                }
            }
        }
        indexOfChild = 0;
        poVar.n = (Button) a3.findViewById(16908313);
        poVar.n.setOnClickListener(poVar.L);
        if (TextUtils.isEmpty(poVar.o)) {
            poVar.n.setVisibility(8);
        } else {
            poVar.n.setText(poVar.o);
            poVar.n.setVisibility(0);
            indexOfChild = 1;
        }
        poVar.q = (Button) a3.findViewById(16908314);
        poVar.q.setOnClickListener(poVar.L);
        if (TextUtils.isEmpty(poVar.r)) {
            poVar.q.setVisibility(8);
        } else {
            poVar.q.setText(poVar.r);
            poVar.q.setVisibility(0);
            indexOfChild |= 2;
        }
        poVar.t = (Button) a3.findViewById(16908315);
        poVar.t.setOnClickListener(poVar.L);
        if (TextUtils.isEmpty(poVar.u)) {
            poVar.t.setVisibility(8);
        } else {
            poVar.t.setText(poVar.u);
            poVar.t.setVisibility(0);
            indexOfChild |= 4;
        }
        if ((indexOfChild != 0 ? 1 : null) == null) {
            a3.setVisibility(8);
        }
        if (poVar.C != null) {
            a.addView(poVar.C, 0, new LayoutParams(-1, -2));
            poVar.c.findViewById(buf.bG).setVisibility(8);
        } else {
            poVar.z = (ImageView) poVar.c.findViewById(16908294);
            if ((!TextUtils.isEmpty(poVar.d) ? 1 : null) != null) {
                poVar.A = (TextView) poVar.c.findViewById(buf.bl);
                poVar.A.setText(poVar.d);
                if (poVar.x != 0) {
                    poVar.z.setImageResource(poVar.x);
                } else if (poVar.y != null) {
                    poVar.z.setImageDrawable(poVar.y);
                } else {
                    poVar.A.setPadding(poVar.z.getPaddingLeft(), poVar.z.getPaddingTop(), poVar.z.getPaddingRight(), poVar.z.getPaddingBottom());
                    poVar.z.setVisibility(8);
                }
            } else {
                poVar.c.findViewById(buf.bG).setVisibility(8);
                poVar.z.setVisibility(8);
                a.setVisibility(8);
            }
        }
        Object obj3 = (viewGroup == null || viewGroup.getVisibility() == 8) ? null : 1;
        obj2 = (a == null || a.getVisibility() == 8) ? null : 1;
        if (a3 == null || a3.getVisibility() == 8) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj == null && a2 != null) {
            findViewById = a2.findViewById(buf.bE);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        if (!(obj2 == null || poVar.w == null)) {
            poVar.w.setClipToPadding(true);
        }
        if (obj3 == null) {
            view = poVar.f != null ? poVar.f : poVar.w;
            if (view != null) {
                if (obj2 != null) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (obj != null) {
                    i = 2;
                } else {
                    i = 0;
                }
                int i3 = i2 | i;
                findViewById5 = poVar.c.findViewById(buf.by);
                findViewById = poVar.c.findViewById(buf.bx);
                if (VERSION.SDK_INT >= 23) {
                    kn.a.a(view, i3, 3);
                    if (findViewById5 != null) {
                        a2.removeView(findViewById5);
                    }
                    if (findViewById != null) {
                        a2.removeView(findViewById);
                    }
                } else {
                    if (findViewById5 != null && (i3 & 1) == 0) {
                        a2.removeView(findViewById5);
                        findViewById5 = null;
                    }
                    if (findViewById != null && (i3 & 2) == 0) {
                        a2.removeView(findViewById);
                        findViewById = null;
                    }
                    if (!(findViewById5 == null && findViewById == null)) {
                        if (poVar.e != null) {
                            poVar.w.a = new on(poVar, findViewById5, findViewById);
                            poVar.w.post(new pq(poVar, findViewById5, findViewById));
                        } else if (poVar.f != null) {
                            poVar.f.setOnScrollListener(new pr(poVar, findViewById5, findViewById));
                            poVar.f.post(new ps(poVar, findViewById5, findViewById));
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
        ListView listView = poVar.f;
        if (listView != null && poVar.D != null) {
            listView.setAdapter(poVar.D);
            i2 = poVar.E;
            if (i2 >= 0) {
                listView.setItemChecked(i2, true);
                listView.setSelection(i2);
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        po poVar = this.a;
        if (poVar.w == null || !poVar.w.a(keyEvent)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z;
        po poVar = this.a;
        if (poVar.w == null || !poVar.w.a(keyEvent)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
