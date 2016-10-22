package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: bir */
public class bir extends ayn implements biu {
    private ImageView a;
    private TextView b;
    private TextView c;

    public final /* synthetic */ bdq g() {
        return this;
    }

    static {
        bir.class.getSimpleName();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(buf.lr, viewGroup, false);
        this.a = (ImageView) inflate.findViewById(buf.ll);
        this.b = (TextView) inflate.findViewById(buf.lj);
        this.c = (TextView) inflate.findViewById(buf.lk);
        return inflate;
    }

    public final void a(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.b.setText(null);
            this.c.setText(null);
            return;
        }
        int indexOf = str.indexOf(",");
        if (indexOf >= 0) {
            this.b.setText(str.substring(0, indexOf).trim());
            this.c.setText(str.substring(indexOf + 1).trim());
            return;
        }
        this.b.setText(str);
        this.c.setText(null);
    }

    public Context getContext() {
        return getActivity();
    }

    public final /* synthetic */ bdj h() {
        return new bis();
    }
}
