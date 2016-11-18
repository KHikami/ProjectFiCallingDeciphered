package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public final class dtf implements gpe {
    static final int f10495a = etx.LAST_SEEN.f12271l;
    static final gla f10496b = gla.f15532c;
    long f10497c;
    private final Context f10498d;
    private final int f10499e;
    private final TextView f10500f;
    private final TextView f10501g;
    private final TextView f10502h;
    private final View f10503i;
    private final erm f10504j;
    private boolean f10505k;
    private boolean f10506l;

    public dtf(Context context, int i, View view) {
        this.f10498d = context;
        this.f10499e = i;
        this.f10503i = view;
        this.f10500f = (TextView) view.findViewById(gwb.rv);
        this.f10501g = (TextView) view.findViewById(gwb.rw);
        this.f10502h = (TextView) view.findViewById(gwb.ru);
        if (fdq.f12774P.m14370b(this.f10499e)) {
            this.f10500f.setText(gwb.ry);
        }
        this.f10504j = new dtg(this, context, (kbu) jyn.m25435b(context).m25443a(kbc.class), i);
    }

    public void mo1661a(String str) {
        this.f10504j.m7738a(str);
    }

    public void mo1662a(boolean z) {
        this.f10505k = z;
        m12656a();
    }

    public void mo1663b(boolean z) {
        this.f10506l = z;
        m12656a();
    }

    private boolean m12654b() {
        return fdq.f12774P.m14370b(this.f10499e);
    }

    private boolean m12655c() {
        return this.f10504j.m7741e() != null || this.f10505k;
    }

    void m12656a() {
        long currentTimeMillis = System.currentTimeMillis();
        CharSequence a = glj.m17960a(this.f10498d, this.f10497c, currentTimeMillis, 262144);
        CharSequence a2 = glj.m17960a(this.f10498d, this.f10497c, currentTimeMillis, 0);
        if (m12654b()) {
            Object stringBuilder = new StringBuilder();
            if (a != null) {
                this.f10502h.setVisibility(8);
                this.f10500f.setVisibility(0);
                stringBuilder.append(this.f10500f.getText());
                this.f10501g.setText(a);
                TextView textView = this.f10501g;
                if (!TextUtils.isEmpty(a2)) {
                    a = a2;
                }
                textView.setContentDescription(a);
                this.f10501g.setVisibility(0);
                stringBuilder.append(" ");
                stringBuilder.append(this.f10501g.getContentDescription());
            } else {
                int i;
                if (this.f10506l || m12655c()) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (i != 0) {
                    this.f10502h.setVisibility(0);
                    stringBuilder.append(this.f10502h.getText());
                } else {
                    this.f10502h.setVisibility(8);
                }
                this.f10500f.setVisibility(8);
                this.f10501g.setVisibility(8);
            }
            this.f10503i.setContentDescription(stringBuilder);
            return;
        }
        CharSequence stringBuilder2 = new StringBuilder();
        if (m12655c()) {
            this.f10500f.setVisibility(0);
            stringBuilder2.append(this.f10500f.getText());
        } else {
            this.f10500f.setVisibility(8);
        }
        if (a != null) {
            this.f10501g.setText(a);
            textView = this.f10501g;
            if (!TextUtils.isEmpty(a2)) {
                a = a2;
            }
            textView.setContentDescription(a);
            this.f10501g.setVisibility(0);
            stringBuilder2.append(" ");
            stringBuilder2.append(this.f10501g.getContentDescription());
        } else {
            this.f10501g.setVisibility(8);
        }
        this.f10503i.setContentDescription(stringBuilder2);
    }
}
