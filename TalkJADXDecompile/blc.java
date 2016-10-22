import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.google.android.apps.hangouts.R$drawable;
import java.util.List;
import java.util.Map;

public final class blc {
    public static final boolean a;
    public static int b;
    public static int c;
    private static int d;
    private static int e;
    private static Bitmap f;
    private static Bitmap g;
    private static Bitmap h;
    private static Bitmap i;
    private static Bitmap j;
    private static Bitmap k;
    private static Bitmap l;
    private static Bitmap m;
    private static Map<bjy, Bitmap> n;

    static {
        kae kae = glk.d;
        a = false;
        n = new ky();
    }

    public static int a(Context context) {
        if (d == 0) {
            d = context.getResources().getDimensionPixelSize(gwb.fq);
        }
        return d;
    }

    public static Bitmap a(bjy bjy) {
        if (!n.containsKey(bjy)) {
            Object obj;
            Bitmap b = ((boz) jyn.a(gwb.H(), boz.class)).b();
            Bitmap copy = b.copy(b.getConfig(), true);
            Canvas canvas = new Canvas(copy);
            switch (bld.a[bjy.ordinal()]) {
                case wi.j /*1*/:
                    a(canvas, ((BitmapDrawable) gwb.H().getResources().getDrawable(R$drawable.aJ)).getBitmap());
                    obj = copy;
                    break;
                case wi.l /*2*/:
                    a(canvas, ((BitmapDrawable) gwb.H().getResources().getDrawable(R$drawable.bd)).getBitmap());
                    b = copy;
                    break;
                case wi.z /*3*/:
                    b = copy;
                    break;
                default:
                    String valueOf = String.valueOf(bjy);
                    throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Unknown badge type: ").append(valueOf).toString());
            }
            n.put(bjy, obj);
        }
        return (Bitmap) n.get(bjy);
    }

    private static void a(Canvas canvas, Bitmap bitmap) {
        float dimension = gwb.H().getResources().getDimension(gwb.fy);
        canvas.drawBitmap(bitmap, ((float) (canvas.getWidth() - bitmap.getWidth())) - dimension, ((float) (canvas.getHeight() - bitmap.getHeight())) - dimension, null);
    }

    public static int a() {
        if (e == 0) {
            e = gwb.H().getResources().getDimensionPixelSize(gwb.eY);
        }
        return e;
    }

    public static Bitmap b() {
        if (f == null) {
            f = gkd.a(R$drawable.h);
        }
        return f;
    }

    public static Bitmap c() {
        if (g == null) {
            g = BitmapFactory.decodeResource(gwb.H().getResources(), R$drawable.h);
        }
        return g;
    }

    public static Bitmap d() {
        if (h == null) {
            h = gkd.a(R$drawable.i);
        }
        return h;
    }

    public static Bitmap e() {
        if (i == null) {
            i = BitmapFactory.decodeResource(gwb.H().getResources(), R$drawable.i);
        }
        return i;
    }

    public static Bitmap f() {
        if (j == null) {
            j = gkd.a(R$drawable.j);
        }
        return j;
    }

    public static Bitmap g() {
        if (k == null) {
            k = BitmapFactory.decodeResource(gwb.H().getResources(), R$drawable.j);
        }
        return k;
    }

    public static Bitmap h() {
        if (l == null) {
            l = gkd.a(R$drawable.g);
        }
        return l;
    }

    public static Bitmap i() {
        if (m == null) {
            m = gkd.a(R$drawable.cr);
        }
        return m;
    }

    public static void a(bko bko, List<edk> list, boolean z) {
        if (list != null) {
            Context H = gwb.H();
            int a = z ? a() : ((boz) jyn.a(H, boz.class)).a();
            for (edk edk : list) {
                Object obj = edk.h;
                if (!TextUtils.isEmpty(obj)) {
                    ((fsi) jyn.a(H, fsi.class)).c(new bnn(new gkc(obj, bko.a()).a(a).d(true), null, true, null));
                } else if (a) {
                    String str = "Avatar url for contact is empty: ";
                    String valueOf = String.valueOf(glk.b(edk.e));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
            }
        }
    }

    public static boolean a(Bitmap bitmap) {
        return bitmap != null && (((boz) jyn.a(gwb.H(), boz.class)).a(bitmap) || bitmap == f || bitmap == g || bitmap == h || bitmap == i || bitmap == j || bitmap == k || bitmap == l || bitmap == m);
    }
}
