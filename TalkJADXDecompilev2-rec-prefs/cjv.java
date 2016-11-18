package p000;

import android.content.ContentResolver;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.MediaStore.Files;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.libraries.quantum.fab.FloatingActionButton;

public class cjv extends jzn implements cdf {
    jek f5469a;
    private final jej aj = new cjw(this);
    private final jej ak = new cjx(this);
    private View al;
    private ckc am;
    private FloatingActionButton an;
    RecyclerView f5470b;
    cki f5471c;
    View f5472d;
    View f5473e;
    int f5474f;
    boolean f5475g;
    wt<cjs> f5476h;
    ckb f5477i;

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f5469a = ((jek) this.binder.m25443a(jek.class)).m24033a(gwb.lz, this.aj).m24033a(gwb.lD, this.ak);
        this.f5474f = ((jca) this.binder.m25443a(jca.class)).mo2317a();
        this.f5475g = ((cdg) this.binder.m25443a(cdg.class)).r_();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.al = layoutInflater.inflate(ba.jg, viewGroup, false);
        this.f5470b = (RecyclerView) this.al.findViewById(gwb.mG);
        this.f5472d = this.al.findViewById(gwb.mz);
        this.f5473e = this.al.findViewById(gwb.mF);
        this.an = (FloatingActionButton) this.al.findViewById(gwb.mx);
        aef acr = new acr(getActivity(), 1);
        acr.m533a(0);
        this.f5470b.m3054a(acr);
        this.f5470b.m3061a(true);
        this.f5476h = new wt(cjs.class, new cka(this));
        amu a = ays.f2555a.m4365a((dr) this);
        this.f5471c = new cki(this.context, this.f5476h, this.al, a);
        this.f5470b.m3068b(new anp(a, this.f5471c, this.f5471c, 5));
        this.f5470b.m3050a(this.f5471c);
        this.f5470b.m3052a(new ckp(this.context.getResources().getDimensionPixelSize(gwb.mw)));
        this.an.setOnClickListener(new cjz(this));
        this.al.findViewById(gwb.my).bringToFront();
        return this.al;
    }

    public void onStart() {
        super.onStart();
        ContentResolver contentResolver = getContext().getContentResolver();
        this.am = new ckc(this);
        contentResolver.registerContentObserver(Files.getContentUri("external"), false, this.am);
        this.f5477i = new ckb(this);
        this.f5477i.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void onStop() {
        super.onStop();
        getContext().getContentResolver().unregisterContentObserver(this.am);
    }

    public boolean mo495a() {
        if (gwb.m1923a(fde.m15018e(this.f5474f), bnc.PHOTO_SHARING)) {
            return true;
        }
        Toast.makeText(this.context, gwb.lZ, 0).show();
        return false;
    }

    public boolean mo988b() {
        return true;
    }
}
