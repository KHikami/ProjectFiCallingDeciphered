package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;

public class jxj extends jwi implements jxa {
    private int f13989a;
    private boolean f13990c;
    private boolean f13991d;
    private int f13992e;

    private jxj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.aU, i, 0);
        this.f13989a = obtainStyledAttributes.getInt(jxi.aV, 1);
        this.f13990c = obtainStyledAttributes.getBoolean(jxi.aW, true);
        this.f13991d = obtainStyledAttributes.getBoolean(jxi.aX, true);
        obtainStyledAttributes.recycle();
    }

    private jxj(Context context, AttributeSet attributeSet) {
        this(context, null, gwb.zM);
    }

    public jxj(Context context) {
        this(context, null);
    }

    public int m16228d() {
        return this.f13989a;
    }

    public void m16224b(int i) {
        this.f13989a = i;
    }

    protected void M_() {
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        m16225b(intent);
        jwp a = m5107B().m25361a();
        if (a != null) {
            a.startActivityForResult(intent, this.f13992e);
        } else {
            m5107B().m25376g().startActivityForResult(intent, this.f13992e);
        }
    }

    protected void m16225b(Intent intent) {
        intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", mo1328c());
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", this.f13990c);
        if (this.f13990c) {
            intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(m16228d()));
        }
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", this.f13991d);
        intent.putExtra("android.intent.extra.ringtone.TYPE", this.f13989a);
        intent.putExtra("android.intent.extra.ringtone.TITLE", m5157o());
    }

    protected void m16226b(Uri uri) {
        m5145f(uri != null ? uri.toString() : "");
    }

    public Uri mo1328c() {
        Object g = m5147g(null);
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        return Uri.parse(g);
    }

    protected Object mo528a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    protected void mo530a(boolean z, Object obj) {
        String str = (String) obj;
        if (!z && !TextUtils.isEmpty(str)) {
            m16226b(Uri.parse(str));
        }
    }

    protected void mo2094a(jwy jwy) {
        super.mo2094a(jwy);
        jwy.m25366a((jxa) this);
        this.f13992e = jwy.m25379j();
    }

    public boolean mo2095a(int i, int i2, Intent intent) {
        if (i != this.f13992e) {
            return false;
        }
        if (intent != null) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (m5125a(uri != null ? uri.toString() : "")) {
                m16226b(uri);
            }
        }
        return true;
    }
}
