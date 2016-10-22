import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.telecom.Call;
import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;

/* compiled from: PG */
final class bbu implements bbf {
    private /* synthetic */ bbv a;
    private /* synthetic */ bbt b;

    bbu(bbt bbt, bbv bbv) {
        this.b = bbt;
        this.a = bbv;
    }

    public final void a(String str, bbe bbe) {
        if (this.b.b.containsKey(this.a.a)) {
            String a;
            bbt bbt = this.b;
            bbv bbv = this.a;
            Context context = bbt.a;
            aic aic = bbt.c;
            Call call = bbv.a;
            if (!call.getDetails().hasProperty(1) || call.getDetails().hasProperty(2)) {
                a = aim.a(bbe.a, bbe.b, aic);
                if (TextUtils.isEmpty(a)) {
                    if (TextUtils.isEmpty(bbe.c)) {
                        a = null;
                    } else {
                        a = BidiFormatter.getInstance().unicodeWrap(bbe.c, TextDirectionHeuristics.LTR);
                    }
                }
            } else {
                a = context.getResources().getString(aq.bY);
            }
            bbv.c = a;
            Object c = buf.c(bbv.a);
            if (bbe.k != null && bbe.p != 1) {
                a = bbe.k.toString();
            } else if (TextUtils.isEmpty(c)) {
                a = "";
            } else {
                a = Uri.fromParts("tel", c, null).toString();
            }
            bbv.e = a;
            bbt.a(bbv);
        }
    }

    public final void b(String str, bbe bbe) {
        Bitmap bitmap = null;
        if (this.b.b.containsKey(this.a.a)) {
            Bitmap bitmap2;
            bbt bbt = this.b;
            bbv bbv = this.a;
            Context context = bbt.a;
            Call call = bbv.a;
            if (!call.getDetails().hasProperty(1) || call.getDetails().hasProperty(2)) {
                bitmap2 = null;
            } else {
                bitmap2 = BitmapFactory.decodeResource(context.getResources(), buf.kE);
            }
            if (bbe.f != null && (bbe.f instanceof BitmapDrawable)) {
                bitmap2 = ((BitmapDrawable) bbe.f).getBitmap();
            }
            if (bitmap2 != null) {
                Context context2 = bbt.a;
                if (bitmap2 != null) {
                    bitmap = buf.a(bitmap2, (int) context2.getResources().getDimension(17104901), (int) context2.getResources().getDimension(17104902));
                }
            } else {
                bitmap = bitmap2;
            }
            bbv.d = bitmap;
            bbt.a(bbv);
        }
    }

    public final void c(String str, bbe bbe) {
    }
}
