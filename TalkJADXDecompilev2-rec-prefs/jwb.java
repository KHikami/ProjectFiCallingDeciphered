package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;

public class jwb extends jvy {
    int f14150a;
    private CharSequence[] f14151c;
    private CharSequence[] f14152d;
    private String f14153e;
    private String f14154f;
    private boolean f14155g;

    public jwb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.aA, 0, 0);
        this.f14151c = obtainStyledAttributes.getTextArray(jxi.aB);
        this.f14152d = obtainStyledAttributes.getTextArray(jxi.aC);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.aD, 0, 0);
        this.f14154f = obtainStyledAttributes.getString(jxi.aP);
        obtainStyledAttributes.recycle();
    }

    public jwb(Context context) {
        this(context, null);
    }

    public void m16380b(CharSequence[] charSequenceArr) {
        this.f14151c = charSequenceArr;
    }

    public void m16378b(int i) {
        m16380b(m5166x().getResources().getTextArray(i));
    }

    public CharSequence[] m16384f() {
        return this.f14151c;
    }

    public void m16382c(CharSequence[] charSequenceArr) {
        this.f14152d = charSequenceArr;
    }

    public void m16381c(int i) {
        m16382c(m5166x().getResources().getTextArray(i));
    }

    public void m16373a(String str) {
        boolean z = !TextUtils.equals(this.f14153e, str);
        if (z || !this.f14155g) {
            this.f14153e = str;
            this.f14155g = true;
            m5145f(str);
            if (z) {
                m5168z();
            }
        }
    }

    public CharSequence mo2103g() {
        CharSequence i = m16387i();
        if (this.f14154f == null || i == null) {
            return super.mo2103g();
        }
        return String.format(this.f14154f, new Object[]{i});
    }

    public void mo2102b(CharSequence charSequence) {
        super.mo2102b(charSequence);
        if (charSequence == null && this.f14154f != null) {
            this.f14154f = null;
        } else if (charSequence != null && !charSequence.equals(this.f14154f)) {
            this.f14154f = charSequence.toString();
        }
    }

    public String m16386h() {
        return this.f14153e;
    }

    public CharSequence m16387i() {
        int H = m16370H();
        return (H < 0 || this.f14151c == null) ? null : this.f14151c[H];
    }

    public int m16377b(String str) {
        if (!(str == null || this.f14152d == null)) {
            for (int length = this.f14152d.length - 1; length >= 0; length--) {
                if (this.f14152d[length].equals(str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    private int m16370H() {
        return m16377b(this.f14153e);
    }

    public void mo2100a(up upVar) {
        super.mo2100a(upVar);
        if (this.f14151c == null || this.f14152d == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f14150a = m16370H();
        upVar.a(this.f14151c, this.f14150a, new jwc(this));
        upVar.a(null, null);
    }

    protected void mo2101a(boolean z) {
        super.mo2101a(z);
        if (z && this.f14150a >= 0 && this.f14152d != null) {
            String charSequence = this.f14152d[this.f14150a].toString();
            if (m5125a((Object) charSequence)) {
                m16373a(charSequence);
            }
        }
    }

    protected Object mo528a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    protected void mo530a(boolean z, Object obj) {
        m16373a(z ? m5147g(this.f14153e) : (String) obj);
    }

    protected Parcelable mo532e() {
        Parcelable e = super.mo532e();
        if (m5164v()) {
            return e;
        }
        jwd jwd = new jwd(e);
        jwd.f21156a = m16386h();
        return jwd;
    }

    protected void mo529a(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(jwd.class)) {
            super.mo529a(parcelable);
            return;
        }
        jwd jwd = (jwd) parcelable;
        super.mo529a(jwd.getSuperState());
        m16373a(jwd.f21156a);
    }
}
