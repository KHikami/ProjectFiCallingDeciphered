package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import java.util.ArrayList;

/* renamed from: er */
public class er extends TabHost implements OnTabChangeListener {
    private final ArrayList<ev> a;
    private FrameLayout b;
    private Context c;
    private ed d;
    private int e;
    private OnTabChangeListener f;
    private ev g;
    private boolean h;

    public er(Context context) {
        super(context, null);
        this.a = new ArrayList();
        a(context, null);
    }

    public er(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.f = onTabChangeListener;
    }

    public void a(TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        tabSpec.setContent(new es(this.c));
        String tag = tabSpec.getTag();
        ev evVar = new ev(tag, cls, null);
        if (this.h) {
            evVar.d = this.d.a(tag);
            if (!(evVar.d == null || evVar.d.isDetached())) {
                ew a = this.d.a();
                a.d(evVar.d);
                a.a();
            }
        }
        this.a.add(evVar);
        addTab(tabSpec);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        ew ewVar = null;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ev evVar = (ev) this.a.get(i);
            evVar.d = this.d.a(evVar.a);
            if (!(evVar.d == null || evVar.d.isDetached())) {
                if (evVar.a.equals(currentTabTag)) {
                    this.g = evVar;
                } else {
                    if (ewVar == null) {
                        ewVar = this.d.a();
                    }
                    ewVar.d(evVar.d);
                }
            }
        }
        this.h = true;
        ew a = a(currentTabTag, ewVar);
        if (a != null) {
            a.a();
            this.d.b();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h = false;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable etVar = new et(super.onSaveInstanceState());
        etVar.a = getCurrentTabTag();
        return etVar;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof et) {
            et etVar = (et) parcelable;
            super.onRestoreInstanceState(etVar.getSuperState());
            setCurrentTabByTag(etVar.a);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onTabChanged(String str) {
        if (this.h) {
            ew a = a(str, null);
            if (a != null) {
                a.a();
            }
        }
        if (this.f != null) {
            this.f.onTabChanged(str);
        }
    }

    public void a(Context context, ed edVar, int i) {
        if (findViewById(16908307) == null) {
            View linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new LayoutParams(-1, -1));
            View tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            tabWidget = new FrameLayout(context);
            tabWidget.setId(16908305);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(0, 0, 0.0f));
            tabWidget = new FrameLayout(context);
            this.b = tabWidget;
            this.b.setId(this.e);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        super.setup();
        this.c = context;
        this.d = edVar;
        this.e = i;
        if (this.b == null) {
            this.b = (FrameLayout) findViewById(this.e);
            if (this.b == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.e);
            }
        }
        this.b.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    private ew a(String str, ew ewVar) {
        ev evVar;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            evVar = (ev) this.a.get(i);
            if (evVar.a.equals(str)) {
                break;
            }
        }
        evVar = null;
        if (this.g != evVar) {
            if (ewVar == null) {
                ewVar = this.d.a();
            }
            if (!(this.g == null || this.g.d == null)) {
                ewVar.d(this.g.d);
            }
            if (evVar != null) {
                if (evVar.d == null) {
                    evVar.d = dr.instantiate(this.c, evVar.b.getName(), evVar.c);
                    ewVar.a(this.e, evVar.d, evVar.a);
                } else {
                    ewVar.e(evVar.d);
                }
            }
            this.g = evVar;
        }
        return ewVar;
    }
}
