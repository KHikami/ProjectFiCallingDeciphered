import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.telephony.PhoneNumberUtils;
import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
public class aqd extends aej {
    private final boolean[] C;
    private final BidiFormatter D;
    private String E;
    private String F;
    private boolean G;

    protected final /* synthetic */ View a(Context context, int i, Cursor cursor, int i2, ViewGroup viewGroup) {
        return b(context, i, cursor, i2, viewGroup);
    }

    public aqd(Context context) {
        super(context);
        this.C = new boolean[6];
        this.D = BidiFormatter.getInstance();
        this.G = false;
        this.F = buf.g(context);
        this.G = buf.e(context);
    }

    public int getCount() {
        return super.getCount() + f();
    }

    private int f() {
        int i = 0;
        int i2 = 0;
        while (i < this.C.length) {
            if (this.C[i]) {
                i2++;
            }
            i++;
        }
        return i2;
    }

    public final void d() {
        for (int i = 0; i < this.C.length; i++) {
            this.C[i] = false;
        }
    }

    public int getItemViewType(int i) {
        int n = n(i);
        if (n >= 0) {
            return n + super.getViewTypeCount();
        }
        return super.getItemViewType(i);
    }

    public int getViewTypeCount() {
        return super.getViewTypeCount() + 6;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int n = n(i);
        if (n < 0) {
            return super.getView(i, view, viewGroup);
        }
        if (view != null) {
            b((adr) view, n);
            return view;
        }
        adr adr = new adr(this.a, null, this.G);
        b(adr, n);
        return adr;
    }

    protected final adr b(Context context, int i, Cursor cursor, int i2, ViewGroup viewGroup) {
        adr b = super.b(context, i, cursor, i2, viewGroup);
        b.h = this.G;
        return b;
    }

    public final int n(int i) {
        int count = i - super.getCount();
        if (count < 0) {
            return -1;
        }
        int i2 = 0;
        while (count >= 0 && i2 < this.C.length) {
            if (this.C[i2]) {
                count--;
                if (count < 0) {
                    return i2;
                }
            }
            i2++;
        }
        throw new IllegalArgumentException("Invalid position - greater than cursor count  but not a shortcut.");
    }

    public boolean isEmpty() {
        return f() == 0 && super.isEmpty();
    }

    public boolean isEnabled(int i) {
        if (n(i) >= 0) {
            return true;
        }
        return super.isEnabled(i);
    }

    public final boolean b(int i, boolean z) {
        boolean z2 = this.C[i] != z;
        this.C[i] = z;
        return z2;
    }

    public String e() {
        return this.E;
    }

    public void a(String str) {
        this.E = PhoneNumberUtils.formatNumber(PhoneNumberUtils.normalizeNumber(str), this.F);
        super.a(str);
    }

    private final void b(adr adr, int i) {
        CharSequence a;
        int i2;
        Resources resources = this.a.getResources();
        String e = e();
        switch (i) {
            case rl.c /*0*/:
                a = aim.a(resources, cob.cM, this.D.unicodeWrap(e, TextDirectionHeuristics.LTR));
                i2 = cob.aJ;
                break;
            case rq.b /*1*/:
                a = resources.getString(cob.cN);
                i2 = cob.aI;
                break;
            case rq.c /*2*/:
                a = resources.getString(cob.cK);
                i2 = cob.aB;
                break;
            case rl.e /*3*/:
                a = resources.getString(cob.cP);
                i2 = cob.ax;
                break;
            case rl.f /*4*/:
                a = resources.getString(cob.cO);
                i2 = cob.aK;
                break;
            case rl.g /*5*/:
                a = resources.getString(cob.cL);
                i2 = cob.ay;
                break;
            default:
                throw new IllegalArgumentException("Invalid shortcut type");
        }
        adr.a(i2);
        adr.a(a);
        adr.i = this.y;
        adr.v = false;
    }
}
