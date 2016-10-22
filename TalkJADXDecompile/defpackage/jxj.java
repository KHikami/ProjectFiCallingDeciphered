package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;

/* renamed from: jxj */
public class jxj extends jwi implements jxa {
    private int a;
    private boolean c;
    private boolean d;
    private int e;

    private jxj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.aU, i, 0);
        this.a = obtainStyledAttributes.getInt(jxi.aV, 1);
        this.c = obtainStyledAttributes.getBoolean(jxi.aW, true);
        this.d = obtainStyledAttributes.getBoolean(jxi.aX, true);
        obtainStyledAttributes.recycle();
    }

    private jxj(Context context, AttributeSet attributeSet) {
        this(context, null, gwb.zM);
    }

    public jxj(Context context) {
        this(context, null);
    }

    public int d() {
        return this.a;
    }

    public void b(int i) {
        this.a = i;
    }

    protected void M_() {
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        b(intent);
        jwp a = B().a();
        if (a != null) {
            a.startActivityForResult(intent, this.e);
        } else {
            B().g().startActivityForResult(intent, this.e);
        }
    }

    protected void b(Intent intent) {
        intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", c());
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", this.c);
        if (this.c) {
            intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(d()));
        }
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", this.d);
        intent.putExtra("android.intent.extra.ringtone.TYPE", this.a);
        intent.putExtra("android.intent.extra.ringtone.TITLE", o());
    }

    protected void b(Uri uri) {
        f(uri != null ? uri.toString() : "");
    }

    public Uri c() {
        Object g = g(null);
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        return Uri.parse(g);
    }

    protected Object a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    protected void a(boolean z, Object obj) {
        String str = (String) obj;
        if (!z && !TextUtils.isEmpty(str)) {
            b(Uri.parse(str));
        }
    }

    protected void a(jwy jwy) {
        super.a(jwy);
        jwy.a((jxa) this);
        this.e = jwy.j();
    }

    public boolean a(int i, int i2, Intent intent) {
        if (i != this.e) {
            return false;
        }
        if (intent != null) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (a(uri != null ? uri.toString() : "")) {
                b(uri);
            }
        }
        return true;
    }
}
