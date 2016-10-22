import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class joz extends FrameLayout {
    private int a;
    private jcf b;
    private View c;
    private View d;
    private TextView e;
    private TextView f;
    private AvatarView g;
    private boolean h;

    public joz(Context context) {
        super(context);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(gwb.zG, this, true);
        this.c = findViewById(gwb.zC);
        this.d = findViewById(gwb.zF);
        this.e = (TextView) findViewById(gwb.zE);
        this.f = (TextView) findViewById(gwb.zD);
        this.g = (AvatarView) findViewById(gwb.zB);
        this.b = (jcf) jyn.a(getContext(), jcf.class);
    }

    public void a(int i) {
        this.a = i;
        if (this.b.c(this.a)) {
            jch a = this.b.a(this.a);
            this.c.setVisibility(0);
            if (this.h) {
                this.d.setVisibility(0);
            } else {
                this.d.setVisibility(4);
            }
            CharSequence b = a.b("display_name");
            CharSequence b2 = a.b("account_name");
            String b3 = a.b("gaia_id");
            String b4 = a.b("profile_photo_url");
            if (TextUtils.isEmpty(b)) {
                this.e.setText(b2);
                this.f.setVisibility(8);
            } else {
                this.e.setText(b);
                this.f.setText(b2);
                this.f.setVisibility(0);
            }
            this.g.a(b3, b4);
            return;
        }
        this.c.setVisibility(8);
    }
}
