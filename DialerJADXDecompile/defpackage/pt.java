package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* compiled from: PG */
/* renamed from: pt */
public final class pt {
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public boolean f;
    public OnKeyListener g;
    public ListAdapter h;
    public OnClickListener i;
    public int j;
    private int k;
    private int l;
    private boolean m;

    public pt(Context context) {
        this.k = 0;
        this.l = 0;
        this.m = false;
        this.j = -1;
        this.a = context;
        this.f = true;
        this.b = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
