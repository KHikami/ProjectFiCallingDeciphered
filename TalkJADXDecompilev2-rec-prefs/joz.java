package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class joz extends FrameLayout {
    private int f20634a;
    private jcf f20635b = ((jcf) jyn.m25426a(getContext(), jcf.class));
    private View f20636c = findViewById(gwb.zC);
    private View f20637d = findViewById(gwb.zF);
    private TextView f20638e = ((TextView) findViewById(gwb.zE));
    private TextView f20639f = ((TextView) findViewById(gwb.zD));
    private AvatarView f20640g = ((AvatarView) findViewById(gwb.zB));
    private boolean f20641h;

    public joz(Context context) {
        super(context);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(gwb.zG, this, true);
    }

    public void m24883a(int i) {
        this.f20634a = i;
        if (this.f20635b.mo3467c(this.f20634a)) {
            jch a = this.f20635b.mo3456a(this.f20634a);
            this.f20636c.setVisibility(0);
            if (this.f20641h) {
                this.f20637d.setVisibility(0);
            } else {
                this.f20637d.setVisibility(4);
            }
            CharSequence b = a.mo3440b("display_name");
            CharSequence b2 = a.mo3440b("account_name");
            String b3 = a.mo3440b("gaia_id");
            String b4 = a.mo3440b("profile_photo_url");
            if (TextUtils.isEmpty(b)) {
                this.f20638e.setText(b2);
                this.f20639f.setVisibility(8);
            } else {
                this.f20638e.setText(b);
                this.f20639f.setText(b2);
                this.f20639f.setVisibility(0);
            }
            this.f20640g.m10457a(b3, b4);
            return;
        }
        this.f20636c.setVisibility(8);
    }
}
