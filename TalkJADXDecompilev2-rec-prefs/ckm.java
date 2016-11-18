package p000;

import android.media.MediaPlayer;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.conversation.v2.gallerypicker.impl.GalleryItemView;

final class ckm extends aer {
    cjs f5514p;
    GalleryItemView f5515q;
    ImageView f5516r;
    TextureView f5517s;
    View f5518t;
    View f5519u;
    TextView f5520v;
    MediaPlayer f5521w = new MediaPlayer();
    float f5522x;
    float f5523y;
    boolean f5524z;

    public ckm(View view) {
        super(view);
        this.f5515q = (GalleryItemView) view.findViewById(gwb.mE);
        this.f5516r = (ImageView) view.findViewById(gwb.mA);
        this.f5516r.setBackgroundColor(view.getResources().getColor(gwb.mv));
        this.f5516r.setAlpha(255);
        this.f5517s = (TextureView) view.findViewById(gwb.mD);
        this.f5518t = view.findViewById(gwb.mC);
        this.f5518t.setVisibility(0);
        this.f5519u = view.findViewById(gwb.mB);
        this.f5519u.setVisibility(4);
        this.f5520v = (TextView) view.findViewById(gwb.mI);
        this.f5517s.setSurfaceTextureListener(new ckn(this));
        this.f5521w.setOnPreparedListener(new cko(this));
    }

    public void m7859b(boolean z) {
        this.f5520v.setVisibility(8);
        this.f5517s.setVisibility(8);
        this.f5516r.setVisibility(0);
    }
}
