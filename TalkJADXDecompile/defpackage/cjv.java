package defpackage;

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
import wt;

/* renamed from: cjv */
public class cjv extends jzn implements cdf {
    jek a;
    private final jej aj;
    private final jej ak;
    private View al;
    private ckc am;
    private FloatingActionButton an;
    RecyclerView b;
    cki c;
    View d;
    View e;
    int f;
    boolean g;
    wt<cjs> h;
    ckb i;

    public cjv() {
        this.aj = new cjw(this);
        this.ak = new cjx(this);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = ((jek) this.binder.a(jek.class)).a(gwb.lz, this.aj).a(gwb.lD, this.ak);
        this.f = ((jca) this.binder.a(jca.class)).a();
        this.g = ((cdg) this.binder.a(cdg.class)).r_();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.al = layoutInflater.inflate(ba.jg, viewGroup, false);
        this.b = (RecyclerView) this.al.findViewById(gwb.mG);
        this.d = this.al.findViewById(gwb.mz);
        this.e = this.al.findViewById(gwb.mF);
        this.an = (FloatingActionButton) this.al.findViewById(gwb.mx);
        aef acr = new acr(getActivity(), 1);
        acr.a(0);
        this.b.a(acr);
        this.b.a(true);
        this.h = new wt(cjs.class, new cka(this));
        amu a = ays.a.a((dr) this);
        this.c = new cki(this.context, this.h, this.al, a);
        this.b.b(new anp(a, this.c, this.c, 5));
        this.b.a(this.c);
        this.b.a(new ckp(this.context.getResources().getDimensionPixelSize(gwb.mw)));
        this.an.setOnClickListener(new cjz(this));
        this.al.findViewById(gwb.my).bringToFront();
        return this.al;
    }

    public void onStart() {
        super.onStart();
        ContentResolver contentResolver = getContext().getContentResolver();
        this.am = new ckc(this);
        contentResolver.registerContentObserver(Files.getContentUri("external"), false, this.am);
        this.i = new ckb(this);
        this.i.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void onStop() {
        super.onStop();
        getContext().getContentResolver().unregisterContentObserver(this.am);
    }

    public boolean a() {
        if (gwb.a(fde.e(this.f), bnc.PHOTO_SHARING)) {
            return true;
        }
        Toast.makeText(this.context, gwb.lZ, 0).show();
        return false;
    }

    public boolean b() {
        return true;
    }
}
