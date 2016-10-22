import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;
import java.util.List;

public class jwi implements Comparable<jwi> {
    private boolean A;
    private List<jwi> B;
    private boolean C;
    private Context a;
    jwl b;
    private jwy c;
    private long d;
    private jwm e;
    private jwn f;
    private int g;
    private CharSequence h;
    private int i;
    private CharSequence j;
    private int k;
    private Drawable l;
    private String m;
    private Intent n;
    private String o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private String t;
    private Object u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private int z;

    public /* synthetic */ int compareTo(Object obj) {
        return a((jwi) obj);
    }

    public jwi(Context context, AttributeSet attributeSet, int i) {
        this.g = Integer.MAX_VALUE;
        this.p = true;
        this.q = true;
        this.s = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = gwb.zP;
        this.A = true;
        this.a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.aD, i, 0);
        for (int i2 = 0; i2 < obtainStyledAttributes.getIndexCount(); i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == jxi.aI) {
                this.k = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == jxi.aJ) {
                this.m = obtainStyledAttributes.getString(index);
            } else if (index == jxi.aQ) {
                this.i = obtainStyledAttributes.getResourceId(index, 0);
                this.h = obtainStyledAttributes.getString(index);
            } else if (index == jxi.aP) {
                this.j = obtainStyledAttributes.getString(index);
            } else if (index == jxi.aL) {
                this.g = obtainStyledAttributes.getInt(index, this.g);
            } else if (index == jxi.aH) {
                this.o = obtainStyledAttributes.getString(index);
            } else if (index == jxi.aK) {
                this.y = obtainStyledAttributes.getResourceId(index, this.y);
            } else if (index == jxi.aR) {
                this.z = obtainStyledAttributes.getResourceId(index, this.z);
            } else if (index == jxi.aG) {
                this.p = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == jxi.aN) {
                this.q = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == jxi.aM) {
                this.s = obtainStyledAttributes.getBoolean(index, this.s);
            } else if (index == jxi.aF) {
                this.t = obtainStyledAttributes.getString(index);
            } else if (index == jxi.aE) {
                this.u = a(obtainStyledAttributes, index);
            } else if (index == jxi.aO) {
                this.x = obtainStyledAttributes.getBoolean(index, this.x);
            }
        }
        obtainStyledAttributes.recycle();
        if (!getClass().getName().startsWith("com.google")) {
            this.A = false;
        }
    }

    public jwi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.zL);
    }

    public jwi(Context context) {
        this(context, null);
    }

    protected Object a(TypedArray typedArray, int i) {
        return null;
    }

    public void a(Intent intent) {
        this.n = intent;
    }

    public Intent j() {
        return this.n;
    }

    public String k() {
        return this.o;
    }

    public void d(int i) {
        if (i != this.y) {
            this.A = false;
        }
        this.y = i;
    }

    public int l() {
        return this.y;
    }

    public void e(int i) {
        if (i != this.z) {
            this.A = false;
        }
        this.z = i;
    }

    public int m() {
        return this.z;
    }

    public View a(View view, ViewGroup viewGroup) {
        if (view == null) {
            view = a(viewGroup);
        }
        a(view);
        return view;
    }

    public View a(ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) this.a.getSystemService("layout_inflater");
        View inflate = layoutInflater.inflate(this.y, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(co.j);
        if (viewGroup2 != null) {
            if (this.z != 0) {
                layoutInflater.inflate(this.z, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return inflate;
    }

    public void a(View view) {
        CharSequence o;
        int i = 0;
        TextView textView = (TextView) view.findViewById(co.i);
        if (textView != null) {
            o = o();
            if (TextUtils.isEmpty(o)) {
                textView.setVisibility(8);
            } else {
                textView.setText(o);
                textView.setVisibility(0);
                if (q() && !p()) {
                    textView.setTextColor(x().getResources().getColor(gwb.zO));
                }
            }
        }
        textView = (TextView) view.findViewById(co.g);
        if (textView != null) {
            o = g();
            if (TextUtils.isEmpty(o)) {
                textView.setVisibility(8);
            } else {
                textView.setText(o);
                textView.setVisibility(0);
                if (q() && !p()) {
                    textView.setTextColor(x().getResources().getColor(gwb.zO));
                }
            }
        }
        ImageView imageView = (ImageView) view.findViewById(co.b);
        if (imageView != null) {
            if (!(this.k == 0 && this.l == null)) {
                if (this.l == null) {
                    this.l = x().getResources().getDrawable(this.k);
                }
                if (this.l != null) {
                    imageView.setImageDrawable(this.l);
                }
            }
            if (this.l == null) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
        if (this.x) {
            a(view, p());
        }
    }

    private void a(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                a(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void f(int i) {
        if (i != this.g) {
            this.g = i;
            A();
        }
    }

    public int n() {
        return this.g;
    }

    public void c(CharSequence charSequence) {
        if ((charSequence == null && this.h != null) || (charSequence != null && !charSequence.equals(this.h))) {
            this.i = 0;
            this.h = charSequence;
            z();
        }
    }

    public void g(int i) {
        c(this.a.getString(i));
        this.i = i;
    }

    public CharSequence o() {
        return this.h;
    }

    public CharSequence g() {
        return this.j;
    }

    public void b(CharSequence charSequence) {
        if ((charSequence == null && this.j != null) || (charSequence != null && !charSequence.equals(this.j))) {
            this.j = charSequence;
            z();
        }
    }

    public void h(int i) {
        b(this.a.getString(i));
    }

    public void d(boolean z) {
        if (this.p != z) {
            this.p = z;
            f(D());
            z();
        }
    }

    public boolean p() {
        return this.p && this.v && this.w;
    }

    public boolean q() {
        return this.q;
    }

    long r() {
        return this.d;
    }

    public void M_() {
    }

    public void c(String str) {
        this.m = str;
        if (this.r && !u()) {
            t();
        }
    }

    public String s() {
        return this.m;
    }

    void t() {
        if (this.m == null) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.r = true;
    }

    public boolean u() {
        return !TextUtils.isEmpty(this.m);
    }

    public boolean v() {
        return this.s;
    }

    protected boolean w() {
        return this.c != null && v() && u();
    }

    public void e(boolean z) {
        this.s = true;
    }

    protected boolean a(Object obj) {
        return this.e == null || this.e.a(this, obj);
    }

    public void a(jwm jwm) {
        this.e = jwm;
    }

    public void a(jwn jwn) {
        this.f = jwn;
    }

    public void a(PreferenceScreen preferenceScreen) {
        if (p()) {
            M_();
            if (this.f != null) {
                this.f.a();
                return;
            }
            jwy B = B();
            if (B != null) {
                jxb k = B.k();
                if (!(preferenceScreen == null || k == null || !k.a(this))) {
                    return;
                }
            }
            if (this.n != null) {
                x().startActivity(this.n);
            }
        }
    }

    public Context x() {
        return this.a;
    }

    public SharedPreferences y() {
        if (this.c == null) {
            return null;
        }
        return this.c.c();
    }

    public int a(jwi jwi) {
        int i = 0;
        if (this.g != jwi.g) {
            return this.g - jwi.g;
        }
        if (this.h == jwi.h) {
            return 0;
        }
        if (this.h == null) {
            return 1;
        }
        if (jwi.h == null) {
            return -1;
        }
        int length = this.h.length();
        int length2 = jwi.h.length();
        int min = Math.min(length, length2);
        int i2 = 0;
        while (i2 < min) {
            int i3 = i2 + 1;
            char toLowerCase = Character.toLowerCase(this.h.charAt(i2));
            i2 = i + 1;
            i = toLowerCase - Character.toLowerCase(jwi.h.charAt(i));
            if (i != 0) {
                return i;
            }
            i = i2;
            i2 = i3;
        }
        return length - length2;
    }

    public void z() {
        if (this.b != null) {
            this.b.a();
        }
    }

    protected void A() {
        if (this.b != null) {
            this.b.b();
        }
    }

    public jwy B() {
        return this.c;
    }

    protected void a(jwy jwy) {
        this.c = jwy;
        this.d = jwy.b();
        if (w() && y().contains(this.m)) {
            a(true, null);
        } else if (this.u != null) {
            a(false, this.u);
        }
    }

    protected void C() {
        a();
    }

    private void a() {
        if (!TextUtils.isEmpty(this.t)) {
            jwi d = d(this.t);
            if (d != null) {
                if (d.B == null) {
                    d.B = new ArrayList();
                }
                d.B.add(this);
                g(d.D());
                return;
            }
            String str = this.t;
            String str2 = this.m;
            String valueOf = String.valueOf(this.h);
            throw new IllegalStateException(new StringBuilder(((String.valueOf(str).length() + 52) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("Dependency \"").append(str).append("\" not found for preference \"").append(str2).append("\" (title: \"").append(valueOf).append("\"").toString());
        }
    }

    private void c() {
        if (this.t != null) {
            jwi d = d(this.t);
            if (d != null && d.B != null) {
                d.B.remove(this);
            }
        }
    }

    protected jwi d(String str) {
        if (TextUtils.isEmpty(str) || this.c == null) {
            return null;
        }
        return this.c.a((CharSequence) str);
    }

    public void f(boolean z) {
        List list = this.B;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((jwi) list.get(i)).g(z);
            }
        }
    }

    public void g(boolean z) {
        if (this.v == z) {
            this.v = !z;
            f(D());
            z();
        }
    }

    public void h(boolean z) {
        if (this.w == z) {
            this.w = !z;
            f(D());
            z();
        }
    }

    public boolean D() {
        return !p();
    }

    public void e(String str) {
        c();
        this.t = str;
        a();
    }

    protected void E() {
        c();
    }

    public void b(Object obj) {
        this.u = obj;
    }

    protected void a(boolean z, Object obj) {
    }

    private void a(Editor editor) {
        if (this.c.f()) {
            try {
                editor.apply();
            } catch (AbstractMethodError e) {
                editor.commit();
            }
        }
    }

    protected boolean f(String str) {
        if (!w()) {
            return false;
        }
        if (str == g(null)) {
            return true;
        }
        Editor e = this.c.e();
        e.putString(this.m, str);
        a(e);
        return true;
    }

    protected String g(String str) {
        return !w() ? str : this.c.c().getString(this.m, str);
    }

    protected boolean b(boolean z) {
        boolean z2 = false;
        if (!w()) {
            return false;
        }
        if (!z) {
            z2 = true;
        }
        if (z == c(z2)) {
            return true;
        }
        Editor e = this.c.e();
        e.putBoolean(this.m, z);
        a(e);
        return true;
    }

    protected boolean c(boolean z) {
        return !w() ? z : this.c.c().getBoolean(this.m, z);
    }

    boolean F() {
        return this.A;
    }

    public String toString() {
        return G().toString();
    }

    StringBuilder G() {
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence o = o();
        if (!TextUtils.isEmpty(o)) {
            stringBuilder.append(o).append(' ');
        }
        o = g();
        if (!TextUtils.isEmpty(o)) {
            stringBuilder.append(o).append(' ');
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        return stringBuilder;
    }

    public void b(Bundle bundle) {
        c(bundle);
    }

    void c(Bundle bundle) {
        if (u()) {
            this.C = false;
            Parcelable e = e();
            if (!this.C) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (e != null) {
                bundle.putParcelable(this.m, e);
            }
        }
    }

    public Parcelable e() {
        this.C = true;
        return jwj.EMPTY_STATE;
    }

    public void d(Bundle bundle) {
        e(bundle);
    }

    void e(Bundle bundle) {
        if (u()) {
            Parcelable parcelable = bundle.getParcelable(this.m);
            if (parcelable != null) {
                this.C = false;
                a(parcelable);
                if (!this.C) {
                    throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
                }
            }
        }
    }

    public void a(Parcelable parcelable) {
        this.C = true;
        if (parcelable != jwj.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }
}
