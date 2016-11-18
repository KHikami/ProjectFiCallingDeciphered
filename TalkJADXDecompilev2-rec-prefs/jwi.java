package p000;

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
    private boolean f3258A;
    private List<jwi> f3259B;
    private boolean f3260C;
    private Context f3261a;
    jwl f3262b;
    private jwy f3263c;
    private long f3264d;
    private jwm f3265e;
    private jwn f3266f;
    private int f3267g;
    private CharSequence f3268h;
    private int f3269i;
    private CharSequence f3270j;
    private int f3271k;
    private Drawable f3272l;
    private String f3273m;
    private Intent f3274n;
    private String f3275o;
    private boolean f3276p;
    private boolean f3277q;
    private boolean f3278r;
    private boolean f3279s;
    private String f3280t;
    private Object f3281u;
    private boolean f3282v;
    private boolean f3283w;
    private boolean f3284x;
    private int f3285y;
    private int f3286z;

    public /* synthetic */ int compareTo(Object obj) {
        return m5113a((jwi) obj);
    }

    public jwi(Context context, AttributeSet attributeSet, int i) {
        this.f3267g = Integer.MAX_VALUE;
        this.f3276p = true;
        this.f3277q = true;
        this.f3279s = true;
        this.f3282v = true;
        this.f3283w = true;
        this.f3284x = true;
        this.f3285y = gwb.zP;
        this.f3258A = true;
        this.f3261a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.aD, i, 0);
        for (int i2 = 0; i2 < obtainStyledAttributes.getIndexCount(); i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == jxi.aI) {
                this.f3271k = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == jxi.aJ) {
                this.f3273m = obtainStyledAttributes.getString(index);
            } else if (index == jxi.aQ) {
                this.f3269i = obtainStyledAttributes.getResourceId(index, 0);
                this.f3268h = obtainStyledAttributes.getString(index);
            } else if (index == jxi.aP) {
                this.f3270j = obtainStyledAttributes.getString(index);
            } else if (index == jxi.aL) {
                this.f3267g = obtainStyledAttributes.getInt(index, this.f3267g);
            } else if (index == jxi.aH) {
                this.f3275o = obtainStyledAttributes.getString(index);
            } else if (index == jxi.aK) {
                this.f3285y = obtainStyledAttributes.getResourceId(index, this.f3285y);
            } else if (index == jxi.aR) {
                this.f3286z = obtainStyledAttributes.getResourceId(index, this.f3286z);
            } else if (index == jxi.aG) {
                this.f3276p = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == jxi.aN) {
                this.f3277q = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == jxi.aM) {
                this.f3279s = obtainStyledAttributes.getBoolean(index, this.f3279s);
            } else if (index == jxi.aF) {
                this.f3280t = obtainStyledAttributes.getString(index);
            } else if (index == jxi.aE) {
                this.f3281u = mo528a(obtainStyledAttributes, index);
            } else if (index == jxi.aO) {
                this.f3284x = obtainStyledAttributes.getBoolean(index, this.f3284x);
            }
        }
        obtainStyledAttributes.recycle();
        if (!getClass().getName().startsWith("com.google")) {
            this.f3258A = false;
        }
    }

    public jwi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.zL);
    }

    public jwi(Context context) {
        this(context, null);
    }

    protected Object mo528a(TypedArray typedArray, int i) {
        return null;
    }

    public void m5117a(Intent intent) {
        this.f3274n = intent;
    }

    public Intent m5152j() {
        return this.f3274n;
    }

    public String m5153k() {
        return this.f3275o;
    }

    public void m5135d(int i) {
        if (i != this.f3285y) {
            this.f3258A = false;
        }
        this.f3285y = i;
    }

    public int m5154l() {
        return this.f3285y;
    }

    public void m5139e(int i) {
        if (i != this.f3286z) {
            this.f3258A = false;
        }
        this.f3286z = i;
    }

    public int m5155m() {
        return this.f3286z;
    }

    public View m5114a(View view, ViewGroup viewGroup) {
        if (view == null) {
            view = mo1325a(viewGroup);
        }
        mo533a(view);
        return view;
    }

    public View mo1325a(ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) this.f3261a.getSystemService("layout_inflater");
        View inflate = layoutInflater.inflate(this.f3285y, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(co.f5751j);
        if (viewGroup2 != null) {
            if (this.f3286z != 0) {
                layoutInflater.inflate(this.f3286z, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return inflate;
    }

    public void mo533a(View view) {
        CharSequence o;
        int i = 0;
        TextView textView = (TextView) view.findViewById(co.f5750i);
        if (textView != null) {
            o = m5157o();
            if (TextUtils.isEmpty(o)) {
                textView.setVisibility(8);
            } else {
                textView.setText(o);
                textView.setVisibility(0);
                if (m5159q() && !mo1333p()) {
                    textView.setTextColor(m5166x().getResources().getColor(gwb.zO));
                }
            }
        }
        textView = (TextView) view.findViewById(co.f5748g);
        if (textView != null) {
            o = mo2103g();
            if (TextUtils.isEmpty(o)) {
                textView.setVisibility(8);
            } else {
                textView.setText(o);
                textView.setVisibility(0);
                if (m5159q() && !mo1333p()) {
                    textView.setTextColor(m5166x().getResources().getColor(gwb.zO));
                }
            }
        }
        ImageView imageView = (ImageView) view.findViewById(co.f5743b);
        if (imageView != null) {
            if (!(this.f3271k == 0 && this.f3272l == null)) {
                if (this.f3272l == null) {
                    this.f3272l = m5166x().getResources().getDrawable(this.f3271k);
                }
                if (this.f3272l != null) {
                    imageView.setImageDrawable(this.f3272l);
                }
            }
            if (this.f3272l == null) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
        if (this.f3284x) {
            m5104a(view, mo1333p());
        }
    }

    private void m5104a(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                m5104a(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void m5143f(int i) {
        if (i != this.f3267g) {
            this.f3267g = i;
            m5106A();
        }
    }

    public int m5156n() {
        return this.f3267g;
    }

    public void m5131c(CharSequence charSequence) {
        if ((charSequence == null && this.f3268h != null) || (charSequence != null && !charSequence.equals(this.f3268h))) {
            this.f3269i = 0;
            this.f3268h = charSequence;
            m5168z();
        }
    }

    public void m5148g(int i) {
        m5131c(this.f3261a.getString(i));
        this.f3269i = i;
    }

    public CharSequence m5157o() {
        return this.f3268h;
    }

    public CharSequence mo2103g() {
        return this.f3270j;
    }

    public void mo2102b(CharSequence charSequence) {
        if ((charSequence == null && this.f3270j != null) || (charSequence != null && !charSequence.equals(this.f3270j))) {
            this.f3270j = charSequence;
            m5168z();
        }
    }

    public void m5150h(int i) {
        mo2102b(this.f3261a.getString(i));
    }

    public void m5137d(boolean z) {
        if (this.f3276p != z) {
            this.f3276p = z;
            mo1331f(mo526D());
            m5168z();
        }
    }

    public boolean mo1333p() {
        return this.f3276p && this.f3282v && this.f3283w;
    }

    public boolean m5159q() {
        return this.f3277q;
    }

    long m5160r() {
        return this.f3264d;
    }

    public void M_() {
    }

    public void m5132c(String str) {
        this.f3273m = str;
        if (this.f3278r && !m5163u()) {
            m5162t();
        }
    }

    public String m5161s() {
        return this.f3273m;
    }

    void m5162t() {
        if (this.f3273m == null) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.f3278r = true;
    }

    public boolean m5163u() {
        return !TextUtils.isEmpty(this.f3273m);
    }

    public boolean m5164v() {
        return this.f3279s;
    }

    protected boolean m5165w() {
        return this.f3263c != null && m5164v() && m5163u();
    }

    public void m5142e(boolean z) {
        this.f3279s = true;
    }

    protected boolean m5125a(Object obj) {
        return this.f3265e == null || this.f3265e.mo1377a(this, obj);
    }

    public void m5121a(jwm jwm) {
        this.f3265e = jwm;
    }

    public void m5122a(jwn jwn) {
        this.f3266f = jwn;
    }

    public void m5120a(PreferenceScreen preferenceScreen) {
        if (mo1333p()) {
            M_();
            if (this.f3266f != null) {
                this.f3266f.mo516a();
                return;
            }
            jwy B = m5107B();
            if (B != null) {
                jxb k = B.m25380k();
                if (!(preferenceScreen == null || k == null || !k.mo2090a(this))) {
                    return;
                }
            }
            if (this.f3274n != null) {
                m5166x().startActivity(this.f3274n);
            }
        }
    }

    public Context m5166x() {
        return this.f3261a;
    }

    public SharedPreferences m5167y() {
        if (this.f3263c == null) {
            return null;
        }
        return this.f3263c.m25372c();
    }

    public int m5113a(jwi jwi) {
        int i = 0;
        if (this.f3267g != jwi.f3267g) {
            return this.f3267g - jwi.f3267g;
        }
        if (this.f3268h == jwi.f3268h) {
            return 0;
        }
        if (this.f3268h == null) {
            return 1;
        }
        if (jwi.f3268h == null) {
            return -1;
        }
        int length = this.f3268h.length();
        int length2 = jwi.f3268h.length();
        int min = Math.min(length, length2);
        int i2 = 0;
        while (i2 < min) {
            int i3 = i2 + 1;
            char toLowerCase = Character.toLowerCase(this.f3268h.charAt(i2));
            i2 = i + 1;
            i = toLowerCase - Character.toLowerCase(jwi.f3268h.charAt(i));
            if (i != 0) {
                return i;
            }
            i = i2;
            i2 = i3;
        }
        return length - length2;
    }

    public void m5168z() {
        if (this.f3262b != null) {
            this.f3262b.mo3622a();
        }
    }

    protected void m5106A() {
        if (this.f3262b != null) {
            this.f3262b.mo3623b();
        }
    }

    public jwy m5107B() {
        return this.f3263c;
    }

    protected void mo2094a(jwy jwy) {
        this.f3263c = jwy;
        this.f3264d = jwy.m25369b();
        if (m5165w() && m5167y().contains(this.f3273m)) {
            mo530a(true, null);
        } else if (this.f3281u != null) {
            mo530a(false, this.f3281u);
        }
    }

    protected void mo1326C() {
        mo531a();
    }

    private void mo531a() {
        if (!TextUtils.isEmpty(this.f3280t)) {
            jwi d = m5134d(this.f3280t);
            if (d != null) {
                if (d.f3259B == null) {
                    d.f3259B = new ArrayList();
                }
                d.f3259B.add(this);
                m5149g(d.mo526D());
                return;
            }
            String str = this.f3280t;
            String str2 = this.f3273m;
            String valueOf = String.valueOf(this.f3268h);
            throw new IllegalStateException(new StringBuilder(((String.valueOf(str).length() + 52) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("Dependency \"").append(str).append("\" not found for preference \"").append(str2).append("\" (title: \"").append(valueOf).append("\"").toString());
        }
    }

    private void mo1328c() {
        if (this.f3280t != null) {
            jwi d = m5134d(this.f3280t);
            if (d != null && d.f3259B != null) {
                d.f3259B.remove(this);
            }
        }
    }

    protected jwi m5134d(String str) {
        if (TextUtils.isEmpty(str) || this.f3263c == null) {
            return null;
        }
        return this.f3263c.m25360a((CharSequence) str);
    }

    public void mo1331f(boolean z) {
        List list = this.f3259B;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((jwi) list.get(i)).m5149g(z);
            }
        }
    }

    public void m5149g(boolean z) {
        if (this.f3282v == z) {
            this.f3282v = !z;
            mo1331f(mo526D());
            m5168z();
        }
    }

    public void m5151h(boolean z) {
        if (this.f3283w == z) {
            this.f3283w = !z;
            mo1331f(mo526D());
            m5168z();
        }
    }

    public boolean mo526D() {
        return !mo1333p();
    }

    public void m5141e(String str) {
        mo1328c();
        this.f3280t = str;
        mo531a();
    }

    protected void mo1327E() {
        mo1328c();
    }

    public void m5128b(Object obj) {
        this.f3281u = obj;
    }

    protected void mo530a(boolean z, Object obj) {
    }

    private void m5103a(Editor editor) {
        if (this.f3263c.m25375f()) {
            try {
                editor.apply();
            } catch (AbstractMethodError e) {
                editor.commit();
            }
        }
    }

    protected boolean m5145f(String str) {
        if (!m5165w()) {
            return false;
        }
        if (str == m5147g(null)) {
            return true;
        }
        Editor e = this.f3263c.m25374e();
        e.putString(this.f3273m, str);
        m5103a(e);
        return true;
    }

    protected String m5147g(String str) {
        return !m5165w() ? str : this.f3263c.m25372c().getString(this.f3273m, str);
    }

    protected boolean mo3620b(boolean z) {
        boolean z2 = false;
        if (!m5165w()) {
            return false;
        }
        if (!z) {
            z2 = true;
        }
        if (z == mo3621c(z2)) {
            return true;
        }
        Editor e = this.f3263c.m25374e();
        e.putBoolean(this.f3273m, z);
        m5103a(e);
        return true;
    }

    protected boolean mo3621c(boolean z) {
        return !m5165w() ? z : this.f3263c.m25372c().getBoolean(this.f3273m, z);
    }

    boolean m5111F() {
        return this.f3258A;
    }

    public String toString() {
        return m5112G().toString();
    }

    StringBuilder m5112G() {
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence o = m5157o();
        if (!TextUtils.isEmpty(o)) {
            stringBuilder.append(o).append(' ');
        }
        o = mo2103g();
        if (!TextUtils.isEmpty(o)) {
            stringBuilder.append(o).append(' ');
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        return stringBuilder;
    }

    public void m5126b(Bundle bundle) {
        mo1329c(bundle);
    }

    void mo1329c(Bundle bundle) {
        if (m5163u()) {
            this.f3260C = false;
            Parcelable e = mo532e();
            if (!this.f3260C) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (e != null) {
                bundle.putParcelable(this.f3273m, e);
            }
        }
    }

    public Parcelable mo532e() {
        this.f3260C = true;
        return jwj.EMPTY_STATE;
    }

    public void m5136d(Bundle bundle) {
        mo1330e(bundle);
    }

    void mo1330e(Bundle bundle) {
        if (m5163u()) {
            Parcelable parcelable = bundle.getParcelable(this.f3273m);
            if (parcelable != null) {
                this.f3260C = false;
                mo529a(parcelable);
                if (!this.f3260C) {
                    throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
                }
            }
        }
    }

    public void mo529a(Parcelable parcelable) {
        this.f3260C = true;
        if (parcelable != jwj.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }
}
