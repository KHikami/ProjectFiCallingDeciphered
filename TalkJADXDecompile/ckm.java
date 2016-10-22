import android.media.MediaPlayer;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.conversation.v2.gallerypicker.impl.GalleryItemView;

final class ckm extends aer {
    cjs p;
    GalleryItemView q;
    ImageView r;
    TextureView s;
    View t;
    View u;
    TextView v;
    MediaPlayer w;
    float x;
    float y;
    boolean z;

    public ckm(View view) {
        super(view);
        this.w = new MediaPlayer();
        this.q = (GalleryItemView) view.findViewById(gwb.mE);
        this.r = (ImageView) view.findViewById(gwb.mA);
        this.r.setBackgroundColor(view.getResources().getColor(gwb.mv));
        this.r.setAlpha(255);
        this.s = (TextureView) view.findViewById(gwb.mD);
        this.t = view.findViewById(gwb.mC);
        this.t.setVisibility(0);
        this.u = view.findViewById(gwb.mB);
        this.u.setVisibility(4);
        this.v = (TextView) view.findViewById(gwb.mI);
        this.s.setSurfaceTextureListener(new ckn(this));
        this.w.setOnPreparedListener(new cko(this));
    }

    public void b(boolean z) {
        this.v.setVisibility(8);
        this.s.setVisibility(8);
        this.r.setVisibility(0);
    }
}
