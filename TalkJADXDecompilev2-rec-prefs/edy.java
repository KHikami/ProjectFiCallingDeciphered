package p000;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class edy implements OnItemClickListener {
    final /* synthetic */ edv f11257a;

    edy(edv edv) {
        this.f11257a = edv;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        jbt jbt = (jbt) ((jbq) ((edr) this.f11257a.m7890u()).getItem(i));
        dr drVar;
        bxt bxt;
        switch (eed.f11297b[eee.m13702a()[jbt.m23803c()] - 1]) {
            case 1:
                this.f11257a.m13616a(2506);
                drVar = this.f11257a;
                bxt = bxt.HANGOUTS_MESSAGE;
                drVar.ap = new bck();
                drVar.at = bxt;
                drVar.ao = ((bpv) drVar.al.m25443a(bpv.class)).mo664a(drVar.ak, drVar.am, 0, drVar, drVar.ap, drVar.at);
                drVar.ao.mo653a(drVar.as);
                return;
            case 2:
                this.f11257a.m13616a(2507);
                drVar = this.f11257a;
                bxt = bxt.SMS_MESSAGE;
                drVar.ap = new bck();
                drVar.at = bxt;
                drVar.ao = ((bpv) drVar.al.m25443a(bpv.class)).mo664a(drVar.ak, drVar.am, 0, drVar, drVar.ap, drVar.at);
                drVar.ao.mo653a(drVar.as);
                return;
            case 3:
                this.f11257a.m13616a(2508);
                drVar = this.f11257a;
                bxt = bxt.AUDIO_CALL;
                drVar.ap = new bck();
                drVar.at = bxt;
                drVar.ao = ((bpv) drVar.al.m25443a(bpv.class)).mo664a(drVar.ak, drVar.am, 0, drVar, drVar.ap, drVar.at);
                drVar.ao.mo653a(drVar.as);
                return;
            case 4:
                this.f11257a.m13616a(2509);
                drVar = this.f11257a;
                bxt = bxt.VIDEO_CALL;
                drVar.ap = new bck();
                drVar.at = bxt;
                drVar.ao = ((bpv) drVar.al.m25443a(bpv.class)).mo664a(drVar.ak, drVar.am, 0, drVar, drVar.ap, drVar.at);
                drVar.ao.mo653a(drVar.as);
                return;
            case 5:
                this.f11257a.m13616a(2769);
                ((fxa) this.f11257a.al.m25443a(fxa.class)).mo2108a(this.f11257a.ak, this.f11257a, this.f11257a.as);
                this.f11257a.m7002a();
                return;
            case 6:
                edv edv = this.f11257a;
                bjg bjg = this.f11257a.as;
                String str = this.f11257a.au;
                new Builder(edv.ak).setTitle(edv.getResources().getString(bc.jB)).setMessage(edv.getResources().getString(bc.jA, new Object[]{bjg.mo571e()})).setNegativeButton(edv.getResources().getString(bc.f2931O), new eeb(edv)).setPositiveButton(edv.getResources().getString(bc.jz), new eea(edv, bjg, str)).create().show();
                return;
            case 7:
                if (this.f11257a.as.mo586t()) {
                    this.f11257a.m13616a(3241);
                    edv edv2 = this.f11257a;
                    edv2.aq.mo2008a(edv2.ar.mo2036a(-1), edv2.an.m5638g(), edv2.as.mo575i(), edv2.as.mo577k(), edv2.as.mo571e(), false, true);
                    edv2.m13617b(edv2.ak.getString(bc.jJ, new Object[]{gld.m17947d(edv2.as.mo571e())}));
                    edv2.m7002a();
                    return;
                }
                int i2;
                this.f11257a.m13616a(3240);
                edv edv3 = this.f11257a;
                String string = edv3.ak.getString(bc.iG, new Object[]{gld.m17947d(edv3.as.mo571e())});
                jyr jyr = edv3.ak;
                if (gwb.m2254i(edv3.ax)) {
                    i2 = bc.iD;
                } else {
                    i2 = bc.iF;
                }
                jxy a = jxy.m7674a(string, jyr.getString(i2), edv3.ak.getString(bc.iE), edv3.ak.getString(bc.f2931O), 0, 0, gwb.iE);
                a.m7677a(new edz(edv3, edv3.getActivity()));
                a.mo2341a(edv3.getFragmentManager(), null);
                edv3.m13616a(1818);
                edv3.m7002a();
                return;
            default:
                throw new IllegalStateException("Unknown action sheet item " + jbt.m23803c());
        }
    }
}
