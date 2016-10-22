import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public final class dtf implements gpe {
    static final int a;
    static final gla b;
    long c;
    private final Context d;
    private final int e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final View i;
    private final erm j;
    private boolean k;
    private boolean l;

    static {
        a = etx.LAST_SEEN.l;
        b = gla.c;
    }

    public dtf(Context context, int i, View view) {
        this.d = context;
        this.e = i;
        this.i = view;
        this.f = (TextView) view.findViewById(gwb.rv);
        this.g = (TextView) view.findViewById(gwb.rw);
        this.h = (TextView) view.findViewById(gwb.ru);
        if (fdq.P.b(this.e)) {
            this.f.setText(gwb.ry);
        }
        this.j = new dtg(this, context, (kbu) jyn.b(context).a(kbc.class), i);
    }

    public void a(String str) {
        this.j.a(str);
    }

    public void a(boolean z) {
        this.k = z;
        a();
    }

    public void b(boolean z) {
        this.l = z;
        a();
    }

    private boolean b() {
        return fdq.P.b(this.e);
    }

    private boolean c() {
        return this.j.e() != null || this.k;
    }

    void a() {
        long currentTimeMillis = System.currentTimeMillis();
        CharSequence a = glj.a(this.d, this.c, currentTimeMillis, 262144);
        CharSequence a2 = glj.a(this.d, this.c, currentTimeMillis, 0);
        if (b()) {
            Object stringBuilder = new StringBuilder();
            if (a != null) {
                this.h.setVisibility(8);
                this.f.setVisibility(0);
                stringBuilder.append(this.f.getText());
                this.g.setText(a);
                TextView textView = this.g;
                if (!TextUtils.isEmpty(a2)) {
                    a = a2;
                }
                textView.setContentDescription(a);
                this.g.setVisibility(0);
                stringBuilder.append(" ");
                stringBuilder.append(this.g.getContentDescription());
            } else {
                int i;
                if (this.l || c()) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (i != 0) {
                    this.h.setVisibility(0);
                    stringBuilder.append(this.h.getText());
                } else {
                    this.h.setVisibility(8);
                }
                this.f.setVisibility(8);
                this.g.setVisibility(8);
            }
            this.i.setContentDescription(stringBuilder);
            return;
        }
        CharSequence stringBuilder2 = new StringBuilder();
        if (c()) {
            this.f.setVisibility(0);
            stringBuilder2.append(this.f.getText());
        } else {
            this.f.setVisibility(8);
        }
        if (a != null) {
            this.g.setText(a);
            textView = this.g;
            if (!TextUtils.isEmpty(a2)) {
                a = a2;
            }
            textView.setContentDescription(a);
            this.g.setVisibility(0);
            stringBuilder2.append(" ");
            stringBuilder2.append(this.g.getContentDescription());
        } else {
            this.g.setVisibility(8);
        }
        this.i.setContentDescription(stringBuilder2);
    }
}
