package p000;

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

public class er extends TabHost implements OnTabChangeListener {
    private final ArrayList<ev> f6829a = new ArrayList();
    private FrameLayout f6830b;
    private Context f6831c;
    private ed f6832d;
    private int f6833e;
    private OnTabChangeListener f6834f;
    private ev f6835g;
    private boolean f6836h;

    public er(Context context) {
        super(context, null);
        m9211a(context, null);
    }

    public er(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9211a(context, attributeSet);
    }

    private void m9211a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f6833e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.f6834f = onTabChangeListener;
    }

    public void m9213a(TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        tabSpec.setContent(new es(this.f6831c));
        String tag = tabSpec.getTag();
        ev evVar = new ev(tag, cls, null);
        if (this.f6836h) {
            evVar.f12339d = this.f6832d.mo1844a(tag);
            if (!(evVar.f12339d == null || evVar.f12339d.isDetached())) {
                ew a = this.f6832d.mo1845a();
                a.mo1535d(evVar.f12339d);
                a.mo1522a();
            }
        }
        this.f6829a.add(evVar);
        addTab(tabSpec);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        ew ewVar = null;
        int size = this.f6829a.size();
        for (int i = 0; i < size; i++) {
            ev evVar = (ev) this.f6829a.get(i);
            evVar.f12339d = this.f6832d.mo1844a(evVar.f12336a);
            if (!(evVar.f12339d == null || evVar.f12339d.isDetached())) {
                if (evVar.f12336a.equals(currentTabTag)) {
                    this.f6835g = evVar;
                } else {
                    if (ewVar == null) {
                        ewVar = this.f6832d.mo1845a();
                    }
                    ewVar.mo1535d(evVar.f12339d);
                }
            }
        }
        this.f6836h = true;
        ew a = m9210a(currentTabTag, ewVar);
        if (a != null) {
            a.mo1522a();
            this.f6832d.mo1848b();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6836h = false;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable etVar = new et(super.onSaveInstanceState());
        etVar.f12220a = getCurrentTabTag();
        return etVar;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof et) {
            et etVar = (et) parcelable;
            super.onRestoreInstanceState(etVar.getSuperState());
            setCurrentTabByTag(etVar.f12220a);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onTabChanged(String str) {
        if (this.f6836h) {
            ew a = m9210a(str, null);
            if (a != null) {
                a.mo1522a();
            }
        }
        if (this.f6834f != null) {
            this.f6834f.onTabChanged(str);
        }
    }

    public void m9212a(Context context, ed edVar, int i) {
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
            this.f6830b = tabWidget;
            this.f6830b.setId(this.f6833e);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        super.setup();
        this.f6831c = context;
        this.f6832d = edVar;
        this.f6833e = i;
        if (this.f6830b == null) {
            this.f6830b = (FrameLayout) findViewById(this.f6833e);
            if (this.f6830b == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f6833e);
            }
        }
        this.f6830b.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    private ew m9210a(String str, ew ewVar) {
        ev evVar;
        int size = this.f6829a.size();
        for (int i = 0; i < size; i++) {
            evVar = (ev) this.f6829a.get(i);
            if (evVar.f12336a.equals(str)) {
                break;
            }
        }
        evVar = null;
        if (this.f6835g != evVar) {
            if (ewVar == null) {
                ewVar = this.f6832d.mo1845a();
            }
            if (!(this.f6835g == null || this.f6835g.f12339d == null)) {
                ewVar.mo1535d(this.f6835g.f12339d);
            }
            if (evVar != null) {
                if (evVar.f12339d == null) {
                    evVar.f12339d = dr.instantiate(this.f6831c, evVar.f12337b.getName(), evVar.f12338c);
                    ewVar.mo1526a(this.f6833e, evVar.f12339d, evVar.f12336a);
                } else {
                    ewVar.mo1536e(evVar.f12339d);
                }
            }
            this.f6835g = evVar;
        }
        return ewVar;
    }
}
