package defpackage;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: edy */
final class edy implements OnItemClickListener {
    final /* synthetic */ edv a;

    edy(edv edv) {
        this.a = edv;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        jbt jbt = (jbt) ((jbq) ((edr) this.a.u()).getItem(i));
        dr drVar;
        bxt bxt;
        switch (eed.b[eee.a()[jbt.c()] - 1]) {
            case wi.j /*1*/:
                this.a.a(2506);
                drVar = this.a;
                bxt = bxt.HANGOUTS_MESSAGE;
                drVar.ap = new bck();
                drVar.at = bxt;
                drVar.ao = ((bpv) drVar.al.a(bpv.class)).a(drVar.ak, drVar.am, 0, drVar, drVar.ap, drVar.at);
                drVar.ao.a(drVar.as);
            case wi.l /*2*/:
                this.a.a(2507);
                drVar = this.a;
                bxt = bxt.SMS_MESSAGE;
                drVar.ap = new bck();
                drVar.at = bxt;
                drVar.ao = ((bpv) drVar.al.a(bpv.class)).a(drVar.ak, drVar.am, 0, drVar, drVar.ap, drVar.at);
                drVar.ao.a(drVar.as);
            case wi.z /*3*/:
                this.a.a(2508);
                drVar = this.a;
                bxt = bxt.AUDIO_CALL;
                drVar.ap = new bck();
                drVar.at = bxt;
                drVar.ao = ((bpv) drVar.al.a(bpv.class)).a(drVar.ak, drVar.am, 0, drVar, drVar.ap, drVar.at);
                drVar.ao.a(drVar.as);
            case wi.h /*4*/:
                this.a.a(2509);
                drVar = this.a;
                bxt = bxt.VIDEO_CALL;
                drVar.ap = new bck();
                drVar.at = bxt;
                drVar.ao = ((bpv) drVar.al.a(bpv.class)).a(drVar.ak, drVar.am, 0, drVar, drVar.ap, drVar.at);
                drVar.ao.a(drVar.as);
            case wi.p /*5*/:
                this.a.a(2769);
                ((fxa) this.a.al.a(fxa.class)).a(this.a.ak, this.a, this.a.as);
                this.a.a();
            case wi.s /*6*/:
                edv edv = this.a;
                bjg bjg = this.a.as;
                String str = this.a.au;
                new Builder(edv.ak).setTitle(edv.getResources().getString(bc.jB)).setMessage(edv.getResources().getString(bc.jA, new Object[]{bjg.e()})).setNegativeButton(edv.getResources().getString(bc.O), new eeb(edv)).setPositiveButton(edv.getResources().getString(bc.jz), new eea(edv, bjg, str)).create().show();
            case wi.q /*7*/:
                if (this.a.as.t()) {
                    this.a.a(3241);
                    edv edv2 = this.a;
                    edv2.aq.a(edv2.ar.a(-1), edv2.an.g(), edv2.as.i(), edv2.as.k(), edv2.as.e(), false, true);
                    edv2.b(edv2.ak.getString(bc.jJ, new Object[]{gld.d(edv2.as.e())}));
                    edv2.a();
                    return;
                }
                int i2;
                this.a.a(3240);
                edv edv3 = this.a;
                String string = edv3.ak.getString(bc.iG, new Object[]{gld.d(edv3.as.e())});
                jyr jyr = edv3.ak;
                if (gwb.i(edv3.ax)) {
                    i2 = bc.iD;
                } else {
                    i2 = bc.iF;
                }
                jxy a = jxy.a(string, jyr.getString(i2), edv3.ak.getString(bc.iE), edv3.ak.getString(bc.O), 0, 0, gwb.iE);
                a.a(new edz(edv3, edv3.getActivity()));
                a.a(edv3.getFragmentManager(), null);
                edv3.a(1818);
                edv3.a();
            default:
                throw new IllegalStateException("Unknown action sheet item " + jbt.c());
        }
    }
}
