package p000;

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
    public static final boolean f3676a = false;
    public static int f3677b;
    public static int f3678c;
    private static int f3679d;
    private static int f3680e;
    private static Bitmap f3681f;
    private static Bitmap f3682g;
    private static Bitmap f3683h;
    private static Bitmap f3684i;
    private static Bitmap f3685j;
    private static Bitmap f3686k;
    private static Bitmap f3687l;
    private static Bitmap f3688m;
    private static Map<bjy, Bitmap> f3689n = new ky();

    static {
        kae kae = glk.f15557d;
    }

    public static int m5739a(Context context) {
        if (f3679d == 0) {
            f3679d = context.getResources().getDimensionPixelSize(gwb.fq);
        }
        return f3679d;
    }

    public static Bitmap m5740a(bjy bjy) {
        if (!f3689n.containsKey(bjy)) {
            Object obj;
            Bitmap b = ((boz) jyn.m25426a(gwb.m1400H(), boz.class)).mo638b();
            Bitmap copy = b.copy(b.getConfig(), true);
            Canvas canvas = new Canvas(copy);
            switch (bld.f3690a[bjy.ordinal()]) {
                case 1:
                    blc.m5741a(canvas, ((BitmapDrawable) gwb.m1400H().getResources().getDrawable(R$drawable.aJ)).getBitmap());
                    obj = copy;
                    break;
                case 2:
                    blc.m5741a(canvas, ((BitmapDrawable) gwb.m1400H().getResources().getDrawable(R$drawable.bd)).getBitmap());
                    b = copy;
                    break;
                case 3:
                    b = copy;
                    break;
                default:
                    String valueOf = String.valueOf(bjy);
                    throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Unknown badge type: ").append(valueOf).toString());
            }
            f3689n.put(bjy, obj);
        }
        return (Bitmap) f3689n.get(bjy);
    }

    private static void m5741a(Canvas canvas, Bitmap bitmap) {
        float dimension = gwb.m1400H().getResources().getDimension(gwb.fy);
        canvas.drawBitmap(bitmap, ((float) (canvas.getWidth() - bitmap.getWidth())) - dimension, ((float) (canvas.getHeight() - bitmap.getHeight())) - dimension, null);
    }

    public static int m5738a() {
        if (f3680e == 0) {
            f3680e = gwb.m1400H().getResources().getDimensionPixelSize(gwb.eY);
        }
        return f3680e;
    }

    public static Bitmap m5744b() {
        if (f3681f == null) {
            f3681f = gkd.m17870a(R$drawable.f5934h);
        }
        return f3681f;
    }

    public static Bitmap m5745c() {
        if (f3682g == null) {
            f3682g = BitmapFactory.decodeResource(gwb.m1400H().getResources(), R$drawable.f5934h);
        }
        return f3682g;
    }

    public static Bitmap m5746d() {
        if (f3683h == null) {
            f3683h = gkd.m17870a(R$drawable.f5935i);
        }
        return f3683h;
    }

    public static Bitmap m5747e() {
        if (f3684i == null) {
            f3684i = BitmapFactory.decodeResource(gwb.m1400H().getResources(), R$drawable.f5935i);
        }
        return f3684i;
    }

    public static Bitmap m5748f() {
        if (f3685j == null) {
            f3685j = gkd.m17870a(R$drawable.f5936j);
        }
        return f3685j;
    }

    public static Bitmap m5749g() {
        if (f3686k == null) {
            f3686k = BitmapFactory.decodeResource(gwb.m1400H().getResources(), R$drawable.f5936j);
        }
        return f3686k;
    }

    public static Bitmap m5750h() {
        if (f3687l == null) {
            f3687l = gkd.m17870a(R$drawable.f5933g);
        }
        return f3687l;
    }

    public static Bitmap m5751i() {
        if (f3688m == null) {
            f3688m = gkd.m17870a(R$drawable.cr);
        }
        return f3688m;
    }

    public static void m5742a(bko bko, List<edk> list, boolean z) {
        if (list != null) {
            Context H = gwb.m1400H();
            int a = z ? blc.m5738a() : ((boz) jyn.m25426a(H, boz.class)).mo636a();
            for (edk edk : list) {
                Object obj = edk.f11219h;
                if (!TextUtils.isEmpty(obj)) {
                    ((fsi) jyn.m25426a(H, fsi.class)).m12718c(new bnn(new gkc(obj, bko.m5629a()).m5547a(a).m5558d(true), null, true, null));
                } else if (f3676a) {
                    String str = "Avatar url for contact is empty: ";
                    String valueOf = String.valueOf(glk.m17974b(edk.f11216e));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
            }
        }
    }

    public static boolean m5743a(Bitmap bitmap) {
        return bitmap != null && (((boz) jyn.m25426a(gwb.m1400H(), boz.class)).mo637a(bitmap) || bitmap == f3681f || bitmap == f3682g || bitmap == f3683h || bitmap == f3684i || bitmap == f3685j || bitmap == f3686k || bitmap == f3687l || bitmap == f3688m);
    }
}
