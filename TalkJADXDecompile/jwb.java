import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;

public class jwb extends jvy {
    int a;
    private CharSequence[] c;
    private CharSequence[] d;
    private String e;
    private String f;
    private boolean g;

    public jwb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.aA, 0, 0);
        this.c = obtainStyledAttributes.getTextArray(jxi.aB);
        this.d = obtainStyledAttributes.getTextArray(jxi.aC);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.aD, 0, 0);
        this.f = obtainStyledAttributes.getString(jxi.aP);
        obtainStyledAttributes.recycle();
    }

    public jwb(Context context) {
        this(context, null);
    }

    public void b(CharSequence[] charSequenceArr) {
        this.c = charSequenceArr;
    }

    public void b(int i) {
        b(x().getResources().getTextArray(i));
    }

    public CharSequence[] f() {
        return this.c;
    }

    public void c(CharSequence[] charSequenceArr) {
        this.d = charSequenceArr;
    }

    public void c(int i) {
        c(x().getResources().getTextArray(i));
    }

    public void a(String str) {
        boolean z = !TextUtils.equals(this.e, str);
        if (z || !this.g) {
            this.e = str;
            this.g = true;
            f(str);
            if (z) {
                z();
            }
        }
    }

    public CharSequence g() {
        CharSequence i = i();
        if (this.f == null || i == null) {
            return super.g();
        }
        return String.format(this.f, new Object[]{i});
    }

    public void b(CharSequence charSequence) {
        super.b(charSequence);
        if (charSequence == null && this.f != null) {
            this.f = null;
        } else if (charSequence != null && !charSequence.equals(this.f)) {
            this.f = charSequence.toString();
        }
    }

    public String h() {
        return this.e;
    }

    public CharSequence i() {
        int H = H();
        return (H < 0 || this.c == null) ? null : this.c[H];
    }

    public int b(String str) {
        if (!(str == null || this.d == null)) {
            for (int length = this.d.length - 1; length >= 0; length--) {
                if (this.d[length].equals(str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    private int H() {
        return b(this.e);
    }

    public void a(up upVar) {
        super.a(upVar);
        if (this.c == null || this.d == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.a = H();
        upVar.a(this.c, this.a, new jwc(this));
        upVar.a(null, null);
    }

    protected void a(boolean z) {
        super.a(z);
        if (z && this.a >= 0 && this.d != null) {
            String charSequence = this.d[this.a].toString();
            if (a((Object) charSequence)) {
                a(charSequence);
            }
        }
    }

    protected Object a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    protected void a(boolean z, Object obj) {
        a(z ? g(this.e) : (String) obj);
    }

    protected Parcelable e() {
        Parcelable e = super.e();
        if (v()) {
            return e;
        }
        jwd jwd = new jwd(e);
        jwd.a = h();
        return jwd;
    }

    protected void a(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(jwd.class)) {
            super.a(parcelable);
            return;
        }
        jwd jwd = (jwd) parcelable;
        super.a(jwd.getSuperState());
        a(jwd.a);
    }
}
