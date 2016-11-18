package p000;

import android.animation.LayoutTransition;
import android.app.AlertDialog.Builder;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.rastermill.FrameSequenceDrawable;
import android.support.rastermill.FrameSequenceDrawable.OnFinishedListener;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.apps.hangouts.content.DraftService;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.conversation.v2.FloatingButtonWithCounter;
import com.google.android.apps.hangouts.hangout.ProximityCoverView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.service.broadcastreceiver.GcmStateReceiver;
import com.google.android.apps.hangouts.views.EasterEggView;
import com.google.android.apps.hangouts.views.FixedParticipantsView;
import com.google.android.apps.hangouts.views.MessageListAnimationManager;
import com.google.android.apps.hangouts.views.MessageListItemView;
import com.google.android.apps.hangouts.views.MessageListItemWrapperView;
import com.google.android.apps.hangouts.views.ParticipantsGalleryView;
import com.google.api.client.http.ExponentialBackOffPolicy;
import com.google.api.client.http.HttpStatusCodes;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

public class cdr extends daq implements OnFinishedListener, bnx, bpm, cce, cdg, cgq, cgs, chj, chx, cis, cyl, cyn, czb, dcr, ddn, ddp, dds, fh<Cursor>, gph {
    public static final boolean f5098a = false;
    static final gma f5099b = gma.m18073a("ConvFrag");
    private static String cP = "(select merge_key from merge_keys where merge_keys.conversation_id=conversations.conversation_id)  IN (SELECT merge_key FROM merge_keys WHERE conversation_id=?)";
    static long f5100d;
    int aA;
    final fip aB = new cgn(this);
    cim aC;
    fsi aD;
    dex aE;
    chi aF = new chi(this);
    String aG;
    String aH;
    String aI;
    String aJ;
    String aK;
    public boolean aL;
    boolean aM;
    boolean aN;
    btk aO;
    final ky<String, cgc> aP = new ky();
    boolean aQ;
    boolean aR;
    boolean aS;
    List<Runnable> aT = new ArrayList();
    int aU = -1;
    cdh aV;
    bxp aW;
    View aX;
    ParticipantsGalleryView aY;
    final gkq<cgp> aZ = new gkq();
    jek aj;
    bhl ak;
    bxt al;
    int am;
    bck an;
    ArrayList<bjg> ao;
    int ap;
    bpt aq;
    bqt ar;
    boolean as;
    boolean at;
    boolean au;
    bko av;
    dth aw;
    iih ax;
    iiq<Void, Void, ArrayList<edk>> ay;
    int az;
    fcm bA;
    final cij bB = new cij(this.context, new cik(this));
    cnt bC;
    bpy bD;
    final gia<bow> bE;
    final Runnable bF;
    private bor bJ;
    private final chn bK = new chn(this, this.lifecycle).m7663a(this.binder);
    private cbt bL;
    private final jej bM = new cds(this);
    private final jej bN = new ced(this);
    private final jej bO = new cen(this);
    private long bP;
    private int bQ;
    private final bpu bR = new cey(this);
    private boolean bS;
    private boolean bT;
    private cii bU;
    private cdq bV;
    private Uri bW;
    private boolean bX;
    private int bY;
    private boolean bZ;
    final Handler ba = new Handler();
    EasterEggView bb;
    public ProximityCoverView bc;
    long bd;
    long be;
    Cursor bf;
    boolean bg;
    int bh;
    boolean bi;
    edk bj;
    gpe bk;
    final cdp bl;
    chw bm;
    Runnable bn;
    final List<cgm> bo = new ArrayList();
    cgy bp;
    public final List<MessageListItemView> bq = new ArrayList();
    boolean br = false;
    das bs;
    MessageListAnimationManager bt;
    final Runnable bu = new ceh(this);
    FixedParticipantsView bv;
    ccv<?>[] bw;
    ccw<?> bx;
    cgi by = new cgi(this);
    int bz;
    Runnable f5101c;
    private final bsm cA = new cdx(this);
    private final brc cB = new cdy(this);
    private final brr cC = new cdz(this);
    private final bsf cD = new cea(this);
    private final brk cE = new ceb(this);
    private final Runnable cF = new ceg(this);
    private final boolean[] cG = new boolean[4];
    private final gpk cH = new gpk();
    private boolean cI;
    private Chronometer cJ;
    private dae cK;
    private final bpz cL;
    private final gia<fln> cM;
    private final Map<Long, Integer> cN;
    private final bpf cO;
    private final ccb cQ;
    private dr ca;
    private bxv cb = new cgo(this).m7544a(this.binder);
    private ViewGroup cc;
    private OnLayoutChangeListener cd;
    private FloatingButtonWithCounter ce;
    private View cf;
    private View cg;
    private ImageView ch;
    private int ci;
    private String cj;
    private long ck;
    private int cl;
    private edk cm;
    private long cn;
    private long co;
    private bnn cp;
    private String cq;
    private cgt cr;
    private final ccg cs = new ccg(this);
    private final ddk ct = new ddk(this);
    private final bst cu = new cfz(this);
    private final cbi cv = new cga(this);
    private final cbg cw = new cdt(this);
    private final cbe cx = new cdu(this);
    private final bqv cy = new cdv(this);
    private final bry cz = new cdw(this);
    int f5102e = -1;
    final fzr f5103f = new fzr();
    ciz f5104g;
    final chh f5105h = new chh().m7635a(this.binder);
    public final cgr f5106i = new cgu(this.context, this, this.lifecycle).m7576a(this.binder);

    public cdr() {
        glh glh = new glh(getClass().getSimpleName(), getLifecycle());
        cpe cpe = new cpe(getLifecycle());
        new cgb(this).m7516a(this.binder);
        this.bl = new cdp();
        this.bl.m7287a(this.binder);
        bkf bkf = new bkf();
        bkf.m5587a(new cei(this));
        this.f5106i.mo935a(bkf);
        this.cL = new cej(this);
        this.cM = new cek(this);
        this.bE = new cel(this);
        this.bF = new cfc(this);
        this.cN = new ky();
        this.cO = new cfs(this);
        this.cQ = new cfx(this);
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        m7386a(igVar, (Cursor) obj);
    }

    static {
        kae kae = glk.f15559f;
        gwb.m1835a(new cew());
    }

    void m7375a(int i, int i2) {
        if (this.aQ) {
            long j;
            Cursor a = ((bns) this.bH).a();
            if (i <= 0 || a == null || a.isClosed() || !a.moveToPosition(i - i2)) {
                j = 0;
            } else {
                j = a.getLong(6);
            }
            m7381a(new cfj(this, j));
            if (i == 0 && this.bz == ((bns) this.bH).a().getCount()) {
                boj boj = (boj) getLoaderManager().mo1997b(2);
                if (boj != null) {
                    this.bz += gwb.m1492a(this.context, "babel_conversation_messages_limit", 500);
                    ap();
                    boj.m1324a(this.bW);
                    boj.m1293v();
                    return;
                }
                glk.m17981d("Babel_Conv", "MessagesLoader is null. Error 22253232", new Object[0]);
            }
        }
    }

    public int mo869q() {
        return this.cl;
    }

    public edk mo870r() {
        return this.cm;
    }

    public void mo834a(int i) {
        this.cl = i;
        cgi cgi = this.by;
        if (cgi.f5246a == cgk.f5251b && !cgi.f5248c.af() && cgi.f5248c.aA != 1) {
            for (ccw ccw : cgi.f5248c.bw) {
                boolean a = ccw.mo809a();
                ccw.mo806a(a);
                if (ccw instanceof ddo) {
                    if (a && !cgi.f5247b) {
                        gwb.m1823a(cgi.f5248c.av, 2100);
                        cgi.f5247b = true;
                    } else if (cgi.f5247b && !a) {
                        gwb.m1823a(cgi.f5248c.av, 2101);
                        cgi.f5247b = false;
                    }
                }
            }
            cgi.f5248c.bx.mo806a(cgi.f5248c.bx.mo809a());
        }
    }

    public void mo837a(edk edk) {
        this.cm = null;
    }

    public long mo872s() {
        return this.ck;
    }

    public boolean mo874u() {
        return this.bZ;
    }

    public boolean mo856c() {
        return this.aL;
    }

    public boolean mo852b() {
        return this.aQ;
    }

    public void mo836a(das das) {
        this.bs = das;
    }

    void m7423v() {
        cgi cgi = this.by;
        if (cgi.f5246a == cgk.f5251b && !cgi.f5248c.af() && cgi.f5248c.aA != 1) {
            for (ccw ccw : cgi.f5248c.bw) {
                boolean a = ccw.mo809a();
                ccw.mo806a(a);
                if (ccw instanceof ddo) {
                    if (a && !cgi.f5247b) {
                        gwb.m1823a(cgi.f5248c.av, 2100);
                        cgi.f5247b = true;
                    } else if (cgi.f5247b && !a) {
                        gwb.m1823a(cgi.f5248c.av, 2101);
                        cgi.f5247b = false;
                    }
                }
            }
            cgi.f5248c.bx.mo806a(cgi.f5248c.bx.mo809a());
        }
    }

    public boolean mo875w() {
        return isResumed();
    }

    void m7389a(String str, String str2) {
        gwb.aJ();
        bcc b = this.f5106i.mo940b();
        bcc bcc = new bcc(str2, b.f2976b, b.f2977c);
        bcc.f2978d = b.f2978d;
        bcc.f2979e = b.f2979e;
        this.f5106i.mo934a(bcc);
        if (this.f5105h.m7649f() == null) {
            glk.m17979c("Babel_Conv", "variants not finished, canceling CVE", new Object[0]);
            this.bp.m7627a();
            this.bp = new cgy(this.context, this.f5105h, this.av, bcc.f2978d ? bcc.f2975a : null, bcc.f2979e);
            this.cI = false;
        } else {
            this.f5105h.m7642a(str, str2);
        }
        ap();
    }

    public void onCreate(Bundle bundle) {
        bcc bcc;
        boolean z;
        String b = f5099b.m18078b("onCreate");
        if (bundle != null) {
            bcc bcc2 = (bcc) bundle.getParcelable("conversation_params");
            this.al = (bxt) bundle.getSerializable("call_conversation_type");
            this.am = bundle.getInt("call_start_action");
            this.an = (bck) bundle.getSerializable("call_participants");
            this.ao = (ArrayList) bundle.getSerializable("call_contacts");
            this.ap = bundle.getInt("next_call_contact");
            if (this.al != null) {
                ao();
            }
            this.at = bundle.getBoolean("user_scrolled");
            this.au = bundle.getBoolean("overscroll_reported");
            bcc = bcc2;
        } else {
            bcc = (bcc) getArguments().getParcelable("conversation_parameters");
        }
        this.f5106i.mo934a(bcc);
        super.onCreate(bundle);
        int a = ((jca) this.binder.m25443a(jca.class)).mo2317a();
        this.av = fde.m15018e(a);
        this.ax.mo1979a(a).mo1693b().mo1714c(3091);
        this.f5104g = new ciz(a);
        this.f5104g.m7749a(bundle);
        this.cK = new dae(getActivity());
        this.cK.m11370a(new dag(this));
        gpf.f4439f = false;
        MessageListItemWrapperView.m9510c(false);
        if (!af()) {
            if (this.bL != null) {
                z = true;
            } else {
                z = false;
            }
            for (Class b2 : r0 ? new Class[]{bsu.class, dsh.class, cbh.class, cbf.class, bqw.class, brz.class, ccc.class, cbu.class, brl.class} : new Class[]{bsu.class, dsh.class, cbj.class, bqw.class, brz.class, bsn.class, brd.class, brs.class, bsg.class, ccc.class, cbu.class, brl.class}) {
                byd byd = (byd) this.binder.m25454b(b2);
                if (byd != null) {
                    byd.mo673a();
                }
            }
        }
        setHasOptionsMenu(true);
        this.f5106i.mo957n().addObserver(new cem(this));
        this.f5106i.mo958o().addObserver(new ceo(this));
        this.bS = bcc.f2990p;
        this.bT = bcc.f2991q;
        this.as = bcc.f2994t;
        this.f5105h.m7641a(this.av.m5632b());
        this.f5106i.mo954k().m5595d(this.av, bcc.f2975a);
        this.bz = gwb.m1492a(this.context, "babel_conversation_messages_limit", 500);
        ap();
        this.aH = bcc.f2983i;
        this.aI = bcc.f2984j;
        this.bY = bcc.f2986l;
        this.bp = new cgy(this.context, this.f5105h, this.av, bcc.f2978d ? bcc.f2975a : null, bcc.f2979e);
        if (bcc.f2982h > -1) {
            this.cn = bcc.f2982h;
        }
        if (bcc.m4834a() == 1 || !giw.m17759d(this.context)) {
            getActivity().getWindow().setSoftInputMode(20);
        }
        if (fdq.f12770L.m14370b(a)) {
            bcc2 = this.f5106i.mo940b();
            if (bcc2 == null || bcc2.f2977c == 3) {
                z = false;
            } else if (((fzw) jyn.m25426a(this.context, fzw.class)).mo2155d()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            this.aO = (btk) this.binder.m25454b(btk.class);
        }
        String ae = ae();
        String valueOf = String.valueOf(this);
        String valueOf2 = String.valueOf(bcc.f2975a);
        String valueOf3 = String.valueOf(getLoaderManager());
        glk.m17979c("Babel", new StringBuilder((((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(ae).length()).append("CFI#onCreate for ").append(valueOf).append("(").append(valueOf2).append(") loader: ").append(valueOf3).append(" id: ").append(ae).toString(), new Object[0]);
        String a2 = ((flo) this.binder.m25443a(flo.class)).mo2027a(ae);
        if (!(a2 == null || a2.equals(ae))) {
            m7389a(ae, a2);
        }
        m7392a(false);
        f5099b.m18079c(b);
    }

    void m7392a(boolean z) {
        if (getActivity() != null) {
            fg loaderManager = getLoaderManager();
            f5099b.m18078b("MESSAGES_LOADER");
            if (this.aO == null) {
                m7344a(loaderManager, 2, z);
            }
            f5099b.m18078b("CONVERSATION_LOADER");
            m7344a(loaderManager, 0, z);
            f5099b.m18078b("EVENT_SUGGESTIONS_LOADER");
            m7344a(loaderManager, 3, z);
        }
    }

    private void m7344a(fg fgVar, int i, boolean z) {
        if (!this.cG[i] && !z) {
            fgVar.mo1994a(i, null, this);
        } else if (z) {
            this.cG[i] = false;
            fgVar.mo1998b(i, null, this);
        }
    }

    void m7400b(boolean z) {
        boolean z2 = true;
        if (this.bH != null && ((bns) this.bH).getCount() == 0) {
            z = true;
        }
        if (giw.m17758c(this.context)) {
            z = true;
        }
        if (giw.m17759d(this.context)) {
            z2 = z;
        }
        if (this.bs != null) {
            this.bs.b_(z2);
        }
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.binder.m25444a(bpu.class, this.bR);
        this.binder.m25444a(bpz.class, this.cL);
        this.bD = ((bpv) this.binder.m25443a(bpv.class)).mo666a(this.context, this.lifecycle, getFragmentManager());
        this.aw = ((dti) this.binder.m25443a(dti.class)).mo1673a(17);
        this.aD = (fsi) this.binder.m25443a(fsi.class);
        this.aE = (dex) this.binder.m25443a(dex.class);
        this.ax = (iih) this.binder.m25443a(iih.class);
        this.binder.m25444a(bxq.class, new cep(this));
        this.binder.m25444a(cdg.class, (Object) this);
        this.binder.m25444a(cgq.class, (Object) this);
        this.binder.m25444a(cnh.class, new cnh(((iih) this.binder.m25443a(iih.class)).mo1979a(((jca) this.binder.m25443a(jca.class)).mo2317a())));
        this.bJ = (bor) this.binder.m25443a(bor.class);
        this.aj = ((jek) this.binder.m25443a(jek.class)).m24033a(gwb.lB, this.bM).m24033a(gwb.lC, this.bM).m24033a(gwb.lA, this.bM).m24033a(gwb.lD, this.bN).m24033a(gwb.lE, this.bO);
        this.ak = (bhl) this.binder.m25443a(bhl.class);
        this.bL = (cbt) this.binder.m25454b(cbt.class);
        this.binder.m25444a(chy.class, new ceq(this));
        ((dut) this.binder.m25443a(dut.class)).mo1687a(this.context, gwb.lu, new cer(this));
        ((eia) this.binder.m25443a(eia.class)).mo1884a(gwb.lw, new ces(this));
        this.binder.m25444a(chx.class, (Object) this);
        this.binder.m25444a(bst.class, this.cu);
        this.binder.m25444a(cbi.class, this.cv);
        this.binder.m25444a(cbg.class, this.cw);
        this.binder.m25444a(cbe.class, this.cx);
        this.binder.m25444a(bqv.class, this.cy);
        this.binder.m25444a(bry.class, this.cz);
        this.binder.m25444a(bsm.class, this.cA);
        this.binder.m25444a(brc.class, this.cB);
        this.binder.m25444a(brr.class, this.cC);
        this.binder.m25444a(bsf.class, this.cD);
        this.binder.m25444a(brk.class, this.cE);
        this.binder.m25444a(ed.class, getFragmentManager());
        this.binder.m25444a(bpm.class, (Object) this);
        this.binder.m25444a(ccb.class, this.cQ);
        this.bC = (cnt) this.binder.m25443a(cnt.class);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        grg grg = (grg) this.binder.m25454b(grg.class);
        if (grg != null) {
            this.bk = grg.mo1666a(this.context, this.av.m5638g(), this.bs, getResources());
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Parcelable bcc;
        boolean z = true;
        super.onSaveInstanceState(bundle);
        this.f5104g.m7751b(bundle);
        bpd a = this.f5106i.mo931a();
        int e = this.f5106i.mo947e();
        if (a == null || a.f4146a == null) {
            bcc b = this.f5106i.mo940b();
            bcc = new bcc(b.f2975a, e, b.f2977c);
            bcc.f2978d = b.f2978d;
            bcc.f2979e = b.f2979e;
        } else {
            bcc = new bcc(a.f4146a, e, a.f4147b);
            bcc.f2978d = true;
            bcc.f2979e = true;
        }
        for (ccv ccv : this.bw) {
            bcc.f2988n.add(Boolean.valueOf(ccv.f4993a));
        }
        bcc.f2981g = this.f5106i.mo949f();
        bcc.f2982h = this.cn;
        bcc.f2983i = this.aH;
        bcc.f2984j = this.aI;
        bcc.f2986l = this.bY;
        bcc.f2987m = this.aK;
        if (getActivity() == null || !getActivity().isChangingConfigurations()) {
            z = false;
        }
        bcc.f2990p = z;
        bcc.f2991q = this.bT;
        bcc.f2994t = this.as;
        bundle.putParcelable("conversation_params", bcc);
        bundle.putSerializable("call_conversation_type", this.al);
        bundle.putInt("call_start_action", this.am);
        bundle.putSerializable("call_participants", this.an);
        bundle.putSerializable("call_contacts", this.ao);
        bundle.putInt("next_call_contact", this.ap);
        bundle.putBoolean("user_scrolled", this.at);
        bundle.putBoolean("overscroll_reported", this.au);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (i2 == 0) {
            return null;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), i2);
        if (loadAnimation == null) {
            return loadAnimation;
        }
        loadAnimation.setAnimationListener(new cet(this, z));
        return loadAnimation;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        this.bV.m7291a(contextMenu, view, contextMenuInfo, getActivity().getMenuInflater(), (fxa) this.binder.m25443a(fxa.class));
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        String str = null;
        boolean z = false;
        int itemId = menuItem.getItemId();
        if (itemId != ba.as && itemId != ba.aF && itemId != ba.az && itemId != ba.bs && itemId != ba.aD && itemId != ba.eU && itemId != 1000) {
            return false;
        }
        ContextMenuInfo menuInfo = menuItem.getMenuInfo();
        if (!(menuInfo instanceof AdapterContextMenuInfo)) {
            return false;
        }
        MessageListItemWrapperView messageListItemWrapperView = (MessageListItemWrapperView) ((AdapterContextMenuInfo) menuInfo).targetView;
        if (messageListItemWrapperView == null || !(messageListItemWrapperView.m9526c() instanceof MessageListItemView)) {
            return false;
        }
        MessageListItemView messageListItemView = (MessageListItemView) messageListItemWrapperView.m9526c();
        if (itemId == ba.as) {
            ((ClipboardManager) getActivity().getSystemService("clipboard")).setText(messageListItemView.m9484f());
        } else if (itemId == ba.aF) {
            messageListItemView.m9473a(getActivity());
        } else if (itemId == ba.bs) {
            String str2;
            fyj n = messageListItemView.m9492n();
            String charSequence = messageListItemView.m9484f() == null ? "" : messageListItemView.m9484f().toString();
            if (messageListItemView.m9496r() == 1) {
                z = true;
            }
            String t = messageListItemView.m9498t();
            if (n != null) {
                str2 = n.f14386a;
            } else {
                str2 = null;
            }
            if (n != null) {
                str = n.f14387b;
            }
            messageListItemView.m9495q();
            startActivity(gwb.m1554a(charSequence, z, t, str2, str));
        } else if (itemId == ba.aD) {
            dvm a = ba.m4618c().m12789a(messageListItemView.m9466D());
            String E = messageListItemView.m9467E();
            if (blo.m5871a(E)) {
                a.m12794b(E);
            } else {
                a.m12798c(E);
            }
            ba.m4548a(this.av.m5638g(), SystemClock.elapsedRealtime(), 10, a.m12786a((int) HttpStatusCodes.STATUS_CODE_SEE_OTHER));
            m7347d(messageListItemView.m9503y());
            this.ax.mo1979a(this.av.m5638g()).mo1693b().mo1698a(Integer.valueOf(messageListItemView.m9465C().ordinal())).mo1714c(2937);
        } else if (itemId == ba.eU) {
            cim.m7721a((eia) this.binder.m25443a(eia.class), messageListItemView);
        } else if (itemId == 1000) {
            messageListItemView.m9483e();
        } else if (itemId == ba.az) {
            cps.m10656a(messageListItemView.m9468F());
        }
        return true;
    }

    private void ao() {
        this.aq = ((bpv) this.binder.m25443a(bpv.class)).mo664a(this.context, this.lifecycle, this.bQ, this, this.an, this.al);
        this.bQ++;
    }

    void m7380a(bxt bxt, int i, int i2) {
        boolean z;
        boolean z2 = true;
        ba.m4610b(this.al == null, (Object) "Cannot start a call while one is in progress");
        if (this.am == 0) {
            z = true;
        } else {
            z = false;
        }
        ba.m4610b(z, (Object) "Cannot start a call while one is in progress");
        if (this.an == null) {
            z = true;
        } else {
            z = false;
        }
        ba.m4610b(z, (Object) "Cannot start a call while one is in progress");
        if (this.ao == null) {
            z = true;
        } else {
            z = false;
        }
        ba.m4610b(z, (Object) "Cannot start a call while one is in progress");
        if (this.ap == 0) {
            z = true;
        } else {
            z = false;
        }
        ba.m4610b(z, (Object) "Cannot start a call while one is in progress");
        if (this.aq != null) {
            z2 = false;
        }
        ba.m4610b(z2, (Object) "Cannot start a call while one is in progress");
        this.an = new bck();
        this.ao = new ArrayList();
        this.ap = 0;
        this.al = bxt;
        this.am = i;
        ao();
        if (this.ci == 0 || TextUtils.isEmpty(this.cj)) {
            this.ao = m7426y();
            m7425x();
            return;
        }
        this.aq.mo655a(this.cj, i2);
    }

    void m7425x() {
        if (this.ap == this.ao.size()) {
            bxt bxt;
            if (gwb.m2254i(mo858d())) {
                bxt = bxt.SMS_MESSAGE;
            } else {
                bxt = bxt.HANGOUTS_MESSAGE;
            }
            if (bxt == bxt.HANGOUTS_MESSAGE) {
                this.aq.mo655a(this.f5106i.mo931a().f4146a, 2622);
                return;
            } else {
                this.aq.mo654a(boy.LOCAL_AND_SERVER, false, null, null, 2622);
                return;
            }
        }
        bjg bjg = (bjg) this.ao.get(this.ap);
        this.ap++;
        this.aq.mo653a(bjg);
    }

    ArrayList<bjg> m7426y() {
        boolean z = true;
        ArrayList<bjg> arrayList = new ArrayList();
        Collection f = this.f5105h.m7649f();
        boolean z2 = f != null && f.size() > 1;
        int e = this.f5106i.mo947e();
        bkf k = this.f5106i.mo954k();
        boolean i = gwb.m2254i(this.f5106i.mo931a().f4147b);
        edk edk;
        if (z2 && e == 1) {
            edk = this.f5106i.mo931a().f4153h;
            if (i) {
                z = false;
            }
            arrayList.add(bjj.m5412a(edk, null, z));
        } else if (!k.m5596d()) {
            for (edk edk2 : k.m5592c()) {
                arrayList.add(bjj.m5412a(edk2, null, !i));
            }
        }
        return arrayList;
    }

    public boolean mo822A() {
        return !cdr.m7345a(this.context);
    }

    public int mo824C() {
        return this.az;
    }

    public void mo848b(int i) {
        this.az = 30;
        for (String b : this.aP.keySet()) {
            RealTimeChatService.m9072b(this.av, b, this.az);
        }
        m7423v();
    }

    private static boolean m7345a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean mo825D() {
        return this.ci != 0 && cdr.m7345a(this.context);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.ax.mo1979a(this.av.m5638g()).mo1693b().mo1714c(3269);
        fk.m15531a(getActivity());
        return true;
    }

    boolean m7352E() {
        if (this.f5106i.mo931a() == null && ((fzw) this.binder.m25443a(fzw.class)).mo2155d()) {
            return false;
        }
        if (this.bA != null && !this.bA.m14964a()) {
            return false;
        }
        if (this.br) {
            return false;
        }
        return true;
    }

    void m7353F() {
        this.aV.m7262a(m7352E());
        m7356I();
    }

    boolean m7354G() {
        return (this.f5106i.mo931a() == null || this.bA == null) ? false : true;
    }

    void m7355H() {
        if (m7354G()) {
            for (Runnable a : this.aT) {
                gwb.m1863a(a);
            }
            this.aT.clear();
        }
    }

    void m7356I() {
        if (m7352E()) {
            boolean z;
            int size = this.f5106i.mo955l().size();
            if (this.aV == null || !this.aV.m7271j()) {
                z = false;
            } else {
                z = true;
            }
            if (this.bm != null && z) {
                this.bm.m7685a(System.currentTimeMillis());
            }
            if (this.ce != null) {
                this.ce.m8344a(z, size);
            }
        }
    }

    private void ap() {
        this.bW = EsProvider.m8253a(this.av, this.f5106i.mo940b().f2975a).buildUpon().appendQueryParameter("limit", String.valueOf(this.bz)).build();
    }

    public void mo839a(CharSequence charSequence) {
        this.aV.m7260a(charSequence);
    }

    public void mo826J() {
        this.aV.m7267f();
    }

    public void mo827K() {
        this.aV.m7268g();
    }

    public void mo828L() {
        this.aV.m7263b();
    }

    Intent m7360M() {
        return (Intent) getActivity().getIntent().getParcelableExtra("share_intent");
    }

    public void mo829N() {
        if (getActivity().getIntent().hasExtra("android.intent.extra.TEXT")) {
            this.aV.m7261a(getActivity().getIntent().getCharSequenceExtra("android.intent.extra.TEXT"), false);
        }
        m7362O();
    }

    public void m7362O() {
        if (f5098a) {
            String valueOf = String.valueOf(this.aV);
            new StringBuilder(String.valueOf(valueOf).length() + 47).append("handleOptionalShareIntent mComposeMessageView: ").append(valueOf);
        }
        Intent M = m7360M();
        giv.m17744a("handleOptionalShareIntent", M);
        if (M != null) {
            String type = M.getType();
            if (((fwn) this.binder.m25443a(fwn.class)).mo2106a(this.context, type)) {
                if (M.hasExtra("android.intent.extra.TEXT")) {
                    this.aV.m7261a(M.getCharSequenceExtra("android.intent.extra.TEXT"), false);
                }
                if (!ba.m4636e(type)) {
                    Uri b = gwb.m1982b(M);
                    if (!gwb.m1923a(fde.m15018e(((jca) this.binder.m25443a(jca.class)).mo2317a()), bnc.PHOTO_SHARING)) {
                        Toast.makeText(this.context, gwb.lZ, 0).show();
                        return;
                    } else if (b != null) {
                        Intent a;
                        if (b.getScheme().equalsIgnoreCase("file")) {
                            try {
                                if (new File(b.getPath()).getCanonicalPath().startsWith(Environment.getDataDirectory().toString())) {
                                    glk.m17982e("Babel_Conv", "Trying to upload a file with an illegal directory path: %s", new File(b.getPath()).getCanonicalPath());
                                    return;
                                }
                            } catch (Throwable e) {
                                glk.m17980d("Babel_Conv", "IOException when getting canonical path for share intent URI string", e);
                                return;
                            }
                        }
                        if (ba.m4630d(type)) {
                            a = chs.m7667a(this.context, b, type, false);
                        } else {
                            a = chs.m7668a(this.context, b, false);
                        }
                        this.aj.m24035a(gwb.lD, a);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            glk.m17982e("Babel_Conv", "Trying to handle share intent with invalid share type: %s", type);
        }
    }

    public void mo830P() {
        if (this.aV != null) {
            this.aV.setVisibility(8);
            this.cf.setVisibility(8);
            this.ce.setVisibility(8);
        }
        this.f5106i.mo944c(true);
    }

    public boolean mo831Q() {
        iil.m21879b("Expected condition to be false", this.f5106i.mo953j());
        this.aW.mo813b();
        if (!giw.m17759d(this.context)) {
            return false;
        }
        boolean c = this.aV.m7264c();
        m7400b(false);
        return c;
    }

    public void onResume() {
        super.onResume();
        ah();
        this.ba.post(this.bu);
        this.ba.postDelayed(this.bu, 31000);
        if (((bns) this.bH).a() == null) {
            showEmptyViewProgress(getView());
        }
        for (MessageListItemView k : this.bq) {
            k.m9489k();
        }
        this.bc.m8677a(new ceu(this));
        this.bc.m8678a(new cev(this));
        if (cdr.m7340R()) {
            this.bc.m8676a();
        }
        m7365S();
        gmx.f15670b = new gna(this);
        this.cc.addOnLayoutChangeListener(this.cd);
    }

    public void onStart() {
        super.onStart();
        RealTimeChatService.m9040a(this.aB);
        ((bns) this.bH).n_();
    }

    public boolean m7366T() {
        return this.bg;
    }

    void m7367U() {
        if (m7366T()) {
            bko bko = this.av;
            Collection keySet = this.aP.keySet();
            if (RealTimeChatService.f6744a) {
                String valueOf = String.valueOf(keySet);
                String valueOf2 = String.valueOf(bko.m5629a());
                new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length()).append("setFocusedConversation ").append(valueOf).append(" account:").append(valueOf2);
            }
            synchronized (RealTimeChatService.f6746c) {
                RealTimeChatService.f6747d = bko.m5629a();
                RealTimeChatService.f6748e = new HashSet(keySet);
            }
        }
    }

    static void m7341V() {
        f5100d = gwb.m1519a(gwb.m1400H(), "babel_poll_conversation_data_frequency_ms", 60000);
    }

    public void a_(String str) {
        if (this.aS || this.cn > 0) {
            this.ak.mo550a(new fli(this.context, this.av.m5638g(), str, 0));
            int g = this.av.m5638g();
            if (!TextUtils.isEmpty(str) && !blo.m5871a(str)) {
                this.bC.mo1030a(g, str, false);
            }
        }
    }

    void m7368W() {
        m7381a(new cfb(this));
    }

    void m7378a(bkm bkm) {
        for (bpd bpd : this.f5105h.m7649f()) {
            if (bpd.f4146a != null) {
                DraftService.m8245a(getActivity(), this.av, bpd.f4146a, bkm);
            }
        }
    }

    public void m7369X() {
        this.aV.m7261a("", false);
        this.f5106i.mo956m();
        this.f5103f.m16722a();
        m7378a(new bkm());
    }

    public void m7370Y() {
        if (((ListView) this.bI).getFirstVisiblePosition() <= 0) {
            glk.m17979c("Babel_Scroll", "Message load failed. scroll to hide spinner.", new Object[0]);
            ((ListView) this.bI).smoothScrollToPositionFromTop(1, 0);
        }
        glk.m17982e("Babel", "Message load failed", new Object[0]);
        if (gwb.m1906a(this.context, "babel_enable_message_load_failed_toast", true)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.bP > TimeUnit.MINUTES.toMillis(1)) {
                this.bP = elapsedRealtime;
                Toast.makeText(getActivity(), bc.jb, 0).show();
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.ba.removeCallbacks(this.bu);
        this.ba.removeCallbacks(this.cF);
        Iterator it = this.aZ.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            it.remove();
            edk a = mo833a((edo) entry.getKey());
            if (a != null) {
                this.aY.m9587b(a, 4, true);
            }
        }
        ((bns) this.bH).mo618c();
        au();
        for (MessageListItemView l : this.bq) {
            l.m9490l();
        }
        if (this.bb != null) {
            this.bb.m9386a();
        }
        gmx.f15670b = null;
        this.bc.m8681d();
        this.bc.m8682e();
        this.bc.m8679b();
        for (MessageListItemView l2 : this.bq) {
            l2.m9463A();
        }
        gwb.m2386x(getView());
        this.cc.removeOnLayoutChangeListener(this.cd);
        boolean z = getActivity() != null && getActivity().isChangingConfigurations();
        if (!z && this.as) {
            this.ax.mo1979a(this.av.m5638g()).mo1693b().mo1714c(3318);
            this.as = false;
        }
    }

    public void onStop() {
        super.onStop();
        RealTimeChatService.m9077b(this.aB);
    }

    public void mo838a(gpc gpc, String str, String str2) {
        if (this.bs != null) {
            this.bs.mo1165a(gpc, str, str2);
        }
    }

    public void mo854c(int i) {
        if (getActivity() != null) {
            Cursor a = ((bns) this.bH).a();
            a.moveToPosition(i);
            int i2 = 2 == a.getInt(33) ? 1 : 0;
            String string = a.getString(2);
            long j = a.getLong(0);
            if (i2 != 0) {
                new Builder(getActivity()).setTitle(bc.jQ).setItems(gwb.dx, new cfw(this, a.getString(24), j)).create().show();
            } else {
                ((cnt) this.binder.m25443a(cnt.class)).mo1031b(this.av.m5638g(), string, j);
                this.ax.mo1979a(this.av.m5638g()).mo1693b().mo1698a(Integer.valueOf(((bns) this.bH).a().getInt(7))).mo1714c(2938);
            }
            ((bns) this.bH).notifyDataSetChanged();
        }
    }

    public boolean mo842a(long j) {
        return this.cN.containsKey(Long.valueOf(j));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String b = f5099b.m18078b("onCreateView");
        View inflate = layoutInflater.inflate(gwb.fU, viewGroup, false);
        this.bI = (ListView) inflate.findViewById(16908298);
        if (this.aO != null) {
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(ba.du);
            ((ListView) this.bI).setVisibility(8);
            frameLayout.setVisibility(0);
            ed childFragmentManager = getChildFragmentManager();
            this.ca = childFragmentManager.mo1843a(ba.du);
            if (this.ca == null) {
                childFragmentManager.mo1845a().mo1526a(ba.du, this.aO.mo753a(), "messageListFragment").mo1522a();
            }
        }
        if (((bph) this.binder.m25443a(bph.class)).m6353a(this.av.m5638g(), ae())) {
            this.f5106i.mo944c(true);
        }
        this.cc = (ViewGroup) inflate.findViewById(ba.eK);
        this.cd = new cfd(this);
        dr a = getChildFragmentManager().mo1844a(bxp.class.getName());
        if (a == null) {
            a = new ccz();
            getChildFragmentManager().mo1845a().mo1526a(ba.f2711v, a, bxp.class.getName()).mo1522a();
        }
        this.aW = (bxp) a;
        this.cf = inflate.findViewById(ba.f2711v);
        this.ce = (FloatingButtonWithCounter) inflate.findViewById(ba.bo);
        this.ce.bringToFront();
        cgg cgg = new cgg(this, ((ViewGroup) getActivity().findViewById(16908290)).getChildAt(0));
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(ba.aa);
        this.aV = new cdh(getContext(), layoutInflater, this.f5103f);
        viewGroup2.addView(this.aV, new LayoutParams(-1, -2));
        this.bV = new cdq(getContext(), (ListView) this.bI, this.av.m5638g());
        this.aV.m7259a(new cdn(this));
        if (this.f5106i.mo953j()) {
            viewGroup2.setVisibility(8);
            this.ce.setVisibility(8);
            if (this.cf != null) {
                this.cf.setVisibility(8);
            }
        }
        this.aY = (ParticipantsGalleryView) inflate.findViewById(ba.dS);
        if (this.aO != null) {
            this.aY.m9591c();
        }
        this.aY.m9581a(true);
        this.aY.m9571a(this.f5106i.mo947e(), this.av);
        this.aY.m9578a(new cgl(this));
        ah();
        dad dad = new dad(inflate, null, this.bK);
        ddo ddo = new ddo(inflate, this, this.bK);
        dcq dcq = new dcq(inflate, this, this.bK);
        ddl ddl = new ddl(inflate, this, this.bK);
        cyz cyz = new cyz(inflate, this, this.bK);
        cym cym = new cym(inflate, this, this.bK);
        ccd ccd = new ccd(inflate, this, this.bK);
        this.bm = new chw(this.context, this.av, this.lifecycle);
        dcy dcy = new dcy(inflate, this.bm, this.bK);
        ccf ccf = new ccf(inflate, this.cs, this.bK, this.av.m5638g());
        ddj ddj = new ddj(inflate, this.ct, this.bK);
        this.bw = new ccv[]{dad, ddo, dcq, cym, ccf, ccd, dcy, cyz, ddl, ddj};
        this.bx = new ddq(inflate, this);
        bcc b2 = this.f5106i.mo940b();
        if (b2 != null && b2.f2988n.size() > 0) {
            iil.m21873a("The saved snackbar shown size should equal the current list of snackbar.", Integer.valueOf(this.bw.length), Integer.valueOf(b2.f2988n.size()));
            ArrayList arrayList = b2.f2988n;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                Boolean bool = (Boolean) obj;
                int i3 = i + 1;
                this.bw[i].f4993a = gwb.m2061b(bool);
                i = i3;
            }
        }
        this.ch = (ImageView) inflate.findViewById(ba.fx);
        this.bU = new cii(this, this.av, this.ch);
        this.aC = new cim(this.context);
        this.cJ = (Chronometer) inflate.findViewById(ba.f2685X);
        this.bv = (FixedParticipantsView) inflate.findViewById(ba.bX);
        ((ViewGroup) inflate.findViewById(ba.dL)).setLayoutTransition(new LayoutTransition());
        this.cc.setLayoutTransition(new LayoutTransition());
        View inflate2 = layoutInflater.inflate(gwb.gY, null);
        ((ListView) this.bI).addHeaderView(inflate2);
        ((ListView) this.bI).addHeaderView(layoutInflater.inflate(gwb.ha, this.bI, false));
        this.cg = inflate2.findViewById(ba.cZ);
        au();
        this.bt = new MessageListAnimationManager(this.bI, this.cH, this.ba);
        this.bH = new bns(this, this.bI, this.bt, this.f5106i.mo947e(), af());
        ((bns) this.bH).m6244a(new bnv(this));
        ((ListView) this.bI).setAdapter(this.bH);
        if (gwb.m1906a(this.context, "babel_force_gb_copy_paste_textview", true)) {
            registerForContextMenu(this.bI);
            cdq.m7289a(this.context);
        } else {
            ((ListView) this.bI).setChoiceMode(0);
        }
        ((ListView) this.bI).setOnScrollListener(new cfe(this));
        ((ListView) this.bI).setRecyclerListener(new cff(this));
        this.bb = (EasterEggView) inflate.findViewById(ba.aP);
        if (!icb.m21567a(getActivity().getContentResolver(), "babel_easter_eggs", true)) {
            this.bb.setVisibility(8);
            this.bb = null;
        }
        this.bc = (ProximityCoverView) inflate.findViewById(ba.f2715z);
        showContent(inflate);
        getActivity().F_();
        this.f5105h.mo963a(this.cO);
        ((gie) this.binder.m25443a(gie.class)).mo2274a(fln.class, this.cM, fln.m15647a(ae())).mo2274a(bow.class, this.bE, new bow(ae(), this.av.m5638g(), box.UNSPECIFIED).m6328a());
        f5099b.m18079c(b);
        return inflate;
    }

    protected boolean isEmpty() {
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f5105h.m7649f() == null || this.f5105h.m7649f().size() == 0) {
            m7406c("Conversation fragment finishing");
            this.ax.mo1979a(((jca) this.binder.m25443a(jca.class)).mo2317a()).mo1693b().mo1714c(3093);
        }
        this.f5104g.m7747a();
    }

    void m7406c(String str) {
        Object obj;
        boolean z = true;
        List f = this.f5105h.m7649f();
        String str2 = "Babel_Conv";
        String str3 = "variants: ";
        if (f == null) {
            obj = "null";
        } else {
            obj = "size: " + f.size();
        }
        String valueOf = String.valueOf(obj);
        if (valueOf.length() != 0) {
            valueOf = str3.concat(valueOf);
        } else {
            valueOf = new String(str3);
        }
        glk.m17981d(str2, valueOf, new Object[0]);
        boolean z2 = this.cG[0];
        glk.m17981d("Babel_Conv", new StringBuilder(String.valueOf(str).length() + 76).append("no variants (").append(str).append("); loaders (conv, part, msgs, evnt): ").append(z2).append(", ").append(this.cG[1]).append(", ").append(this.cG[2]).append(", ").append(this.cG[3]).toString(), new Object[0]);
        bcc b = this.f5106i.mo940b();
        str3 = String.valueOf(b.f2975a);
        glk.m17981d("Babel_Conv", new StringBuilder(String.valueOf(str3).length() + 55).append("no variants; startup params: ").append(str3).append(", ").append(b.f2976b).append(", ").append(b.f2977c).toString(), new Object[0]);
        str3 = "Babel_Conv";
        int size = this.aP.size();
        boolean d = ((fzw) this.binder.m25443a(fzw.class)).mo2155d();
        String valueOf2 = String.valueOf(ae());
        String str4 = this.aG;
        int e = this.f5106i.mo947e();
        boolean z3 = this.f5106i.mo931a() != null;
        z2 = this.bA != null;
        if (mo832Z() == null) {
            z = false;
        }
        glk.m17981d(str3, new StringBuilder((String.valueOf(valueOf2).length() + 203) + String.valueOf(str4).length()).append("no variants; mergedConversations size: ").append(size).append(", merged: ").append(d).append(", conv id: ").append(valueOf2).append(", mergeKey: ").append(str4).append(", conv type: ").append(e).append(", has selected variant: ").append(z3).append(", has reachability: ").append(z2).append(", has root: ").append(z).append(", cve started: ").append(this.cI).toString(), new Object[0]);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f5105h.m7645b(this.cO);
        if (this.ar != null) {
            this.ar = null;
        }
        for (MessageListItemView m : this.bq) {
            m.m9491m();
        }
        this.aV.m7265d();
        this.cK.m11369a();
        this.aY.m9578a(null);
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        ig<Cursor> boj;
        if (f5098a) {
            String valueOf = String.valueOf(ae());
            new StringBuilder(String.valueOf(valueOf).length() + 42).append("onCreateLoader ").append(i).append(" conversationId ").append(valueOf);
        }
        if (i == 2) {
            if (f5098a) {
                valueOf = String.valueOf(this.bW);
                new StringBuilder(String.valueOf(valueOf).length() + 21).append("messages loader uri: ").append(valueOf);
            }
            boj = new boj(getActivity(), this.av, this.bW, bny.f4074a, "type!=? AND (expiration_timestamp>? OR expiration_timestamp IS NULL)", bny.m6265a(), bny.f4075b);
            f5099b.m18079c("MESSAGES_LOADER");
        } else if (i == 0) {
            boj = new enl(getActivity(), this.av, EsProvider.m8251a(EsProvider.f6006i, this.av.m5638g()), bkj.f3623a, cP, new String[]{ae()}, null);
            f5099b.m18079c("CONVERSATION_LOADER");
        } else if (i == 1) {
            valueOf = gwb.m1678a((String[]) this.aP.keySet().toArray(new String[this.aP.size()]));
            bkf k = this.f5106i.mo954k();
            k.m5595d(this.av, valueOf);
            this.f5105h.m7650g();
            boj = k.m5584a(bkh.f3620b);
        } else if (i == 3) {
            boj = new enl(getActivity(), this.av, EsProvider.m8271c(this.av.m5638g(), ae()), cgd.f5239a, "timestamp>? AND type=?", new String[]{Long.toString(this.cn), Integer.toString(17)}, null);
            f5099b.m18079c("EVENT_SUGGESTIONS_LOADER");
        } else {
            boj = null;
        }
        if (f5098a) {
            String valueOf2 = String.valueOf(boj);
            new StringBuilder(String.valueOf(valueOf2).length() + 39).append("onCreateLoader: id=").append(i).append(", loader=").append(valueOf2);
        }
        return boj;
    }

    public void m7386a(ig<Cursor> igVar, Cursor cursor) {
        bko D = ((enl) igVar).m6291D();
        if (TextUtils.equals(D.m5629a(), this.av.m5629a())) {
            Cursor cil;
            int count;
            int count2;
            int top;
            switch (igVar.m1287p()) {
                case 0:
                    m7342a(cursor, D, ((enl) igVar).m1337m()[0]);
                    if (!this.aP.isEmpty()) {
                        getLoaderManager().mo1994a(1, null, this);
                        break;
                    }
                    break;
                case 1:
                    m7346b(cursor, D);
                    break;
                case 2:
                    String valueOf;
                    String valueOf2;
                    cil = new cil(cursor);
                    this.f5104g.m7748a(cil);
                    this.cG[2] = true;
                    if (gwb.m1906a(this.context, "babel_extra_log_scrolling", false) || gwb.m1906a(getContext(), "babel_crash_on_conversation_scroll_error", false)) {
                        valueOf = String.valueOf(igVar);
                        count = ((bns) this.bH).getCount();
                        String valueOf3 = String.valueOf(Integer.valueOf(cil.getCount()));
                        glk.m17979c("Babel_Scroll", new StringBuilder((String.valueOf(valueOf).length() + 98) + String.valueOf(valueOf3).length()).append("onMessagesLoaderFinished MESSAGES_LOADER ").append(valueOf).append(" mAdapter.getCount(): ").append(count).append(" new cursor data count: ").append(valueOf3).toString(), new Object[0]);
                    }
                    if (f5098a) {
                        valueOf2 = String.valueOf(igVar);
                        count = ((bns) this.bH).getCount();
                        valueOf = String.valueOf(Integer.valueOf(cil.getCount()));
                        new StringBuilder((String.valueOf(valueOf2).length() + 98) + String.valueOf(valueOf).length()).append("onMessagesLoaderFinished MESSAGES_LOADER ").append(valueOf2).append(" mAdapter.getCount(): ").append(count).append(" new cursor data count: ").append(valueOf);
                    }
                    if (this.bt.m9433a().m18267c()) {
                        this.aR = true;
                    }
                    count2 = ((bns) this.bH).getCount();
                    int firstVisiblePosition = ((ListView) this.bI).getFirstVisiblePosition();
                    int count3 = cil.getCount();
                    View childAt = ((ListView) this.bI).getChildAt(0);
                    top = childAt != null ? childAt.getTop() : 0;
                    ((bns) this.bH).m6246b(cil);
                    if (!(this.cp == null || this.cq == null)) {
                        cil.moveToLast();
                        if (cil.getString(1).equals(this.cq)) {
                            this.bU.m7714a(this.cp);
                            this.aD.mo2072a(this.cp);
                        }
                    }
                    this.cp = null;
                    this.cq = null;
                    if (count2 > 0 && count3 > count2 + 1) {
                        count = at() ? 1 : 0;
                        ((ListView) this.bI).setSelectionFromTop(Math.max(count, Math.min((count3 - count2) + ((firstVisiblePosition + count) - 1), count3 - 1)), top);
                    }
                    if (this.f5106i.mo931a() == null) {
                        showEmptyView(getView());
                    } else {
                        showContent(getView());
                    }
                    if (cil.getCount() <= 0 || !cil.moveToFirst()) {
                        this.bd = System.currentTimeMillis() * 1000;
                    } else {
                        this.bd = cil.getLong(6);
                    }
                    if (cil.getCount() > 0 && cil.moveToLast()) {
                        long j = this.be;
                        this.be = cil.getLong(6);
                        if (m7366T() && this.be > j && isVisible()) {
                            a_(cil.getString(2));
                        }
                        if (!af()) {
                            ac();
                        }
                    }
                    this.f5106i.mo946d(true);
                    au();
                    if (cil.moveToLast()) {
                        if (gwb.m1906a(this.context, "babel_extra_log_scrolling", false)) {
                            glk.m17979c("Babel_Scroll", "onMessagesLoaderFinished moveToLast", new Object[0]);
                        }
                        count = this.cN.size();
                        while (true) {
                            long j2 = cil.getLong(0);
                            if (this.cN.containsKey(Long.valueOf(j2))) {
                                fwx fwx = fwx.values()[cil.getInt(7)];
                                if (fwx == fwx.ON_SERVER) {
                                    this.cN.remove(Long.valueOf(j2));
                                } else {
                                    this.cN.put(Long.valueOf(j2), Integer.valueOf(fwx.ordinal()));
                                }
                                count--;
                            }
                            valueOf2 = cil.getString(4);
                            if (!(this.aL || valueOf2 == null || !valueOf2.equalsIgnoreCase(this.av.m5632b().f11244a))) {
                                this.f5106i.mo948e(true);
                            }
                            if (cil.moveToPrevious() && (!this.aL || r0 > 0)) {
                            }
                        }
                    }
                    m7423v();
                    this.aV.m7257a();
                    break;
                case 3:
                    if (!m7366T()) {
                        this.bf = cursor;
                        break;
                    } else {
                        m7376a(cursor, D);
                        break;
                    }
            }
            aw();
            dw activity = getActivity();
            if (activity != null) {
                activity.F_();
            }
            if (this.bi) {
                boolean z;
                boolean[] zArr = this.cG;
                int length = zArr.length;
                count = 0;
                while (count < length) {
                    if (zArr[count]) {
                        count++;
                    } else {
                        z = false;
                        if (z) {
                            this.ba.removeCallbacks(this.cF);
                            showContent(getView());
                            if (this.f5106i.mo947e() == 1 && !gwb.m1926a(eow.AUTOSWITCH_TRANSPORT)) {
                                top = gwb.m1492a(this.context, "babel_max_outgoing_message_search_rows", 50);
                                if (top > 0) {
                                    cil = ((bns) this.bH).a();
                                    if (cil != null && cil.moveToLast()) {
                                        count2 = cil.getInt(36);
                                        count = top;
                                        while (fwy.values()[cil.getInt(8)] != fwy.OUTGOING_USER_MESSAGE) {
                                            count--;
                                            if (cil.moveToPrevious()) {
                                                if (count <= 0) {
                                                }
                                            }
                                            count = 0;
                                            if (!(gwb.m2280k(count2) || gwb.m2280k(r0) || gwb.m2254i(count2) == gwb.m2254i(r0))) {
                                                this.bZ = true;
                                                m7423v();
                                            }
                                        }
                                        count = cil.getInt(36);
                                        this.bZ = true;
                                        m7423v();
                                    }
                                }
                            }
                            this.bi = false;
                            return;
                        }
                        return;
                    }
                }
                z = true;
                if (z) {
                    this.ba.removeCallbacks(this.cF);
                    showContent(getView());
                    top = gwb.m1492a(this.context, "babel_max_outgoing_message_search_rows", 50);
                    if (top > 0) {
                        cil = ((bns) this.bH).a();
                        count2 = cil.getInt(36);
                        count = top;
                        while (fwy.values()[cil.getInt(8)] != fwy.OUTGOING_USER_MESSAGE) {
                            count--;
                            if (cil.moveToPrevious()) {
                                if (count <= 0) {
                                }
                            }
                            count = 0;
                            this.bZ = true;
                            m7423v();
                        }
                        count = cil.getInt(36);
                        this.bZ = true;
                        m7423v();
                    }
                    this.bi = false;
                    return;
                }
                return;
            }
            return;
        }
        glk.m17981d("Babel_Conv", "onLoadFinished called for non-fragment account", new Object[0]);
    }

    public edk mo832Z() {
        if (this.f5106i.mo947e() != 1) {
            return null;
        }
        bkf k = this.f5106i.mo954k();
        edk edk = null;
        for (edk edk2 : k.m5590b()) {
            if (!k.m5593c(edk2.f11213b)) {
                if (edk2.f11213b.f11244a != null) {
                    return edk2;
                }
                if (edk == null) {
                    edk = edk2;
                }
            }
        }
        return edk;
    }

    private void m7346b(Cursor cursor, bko bko) {
        String f;
        String str;
        boolean z;
        if (f5098a) {
            f = this.f5106i.mo949f();
            bpd a = this.f5106i.mo931a();
            String valueOf = String.valueOf(ae());
            String valueOf2 = String.valueOf(this);
            if (f != null) {
                str = ", convName=";
                f = String.valueOf(f);
                str = f.length() != 0 ? str.concat(f) : new String(str);
            } else {
                str = "";
            }
            f = String.valueOf(a != null ? Integer.valueOf(a.f4147b) : "not set");
            new StringBuilder((((String.valueOf(valueOf).length() + 75) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()) + String.valueOf(f).length()).append("onConversationParticipantsLoaderFinished() conversationId=").append(valueOf).append(": this=").append(valueOf2).append(str).append(" variant: ").append(f);
        }
        this.f5105h.m7650g();
        f = null;
        List arrayList = new ArrayList();
        if (cursor.moveToFirst()) {
            boolean z2 = false;
            do {
                if (cursor.getInt(13) != 0) {
                    edk a2 = bkf.m5577a(bko, cursor);
                    valueOf2 = cursor.getString(12);
                    m7343a(a2, valueOf2);
                    if (a2.m13598h() && !TextUtils.isEmpty(a2.m13596f())) {
                        arrayList.add(a2.m13596f());
                    }
                    if (f5098a) {
                        String valueOf3 = String.valueOf(a2);
                        new StringBuilder((String.valueOf(valueOf3).length() + 31) + String.valueOf(valueOf2).length()).append("Participant: ").append(valueOf3).append(" Conversation Id: ").append(valueOf2);
                    }
                    this.f5105h.m7637a(valueOf2).add(a2);
                    if (glq.m18019d(this.context, a2.f11214c)) {
                        f = a2.f11214c;
                    }
                    if (a2.m13599i()) {
                        z2 = true;
                    }
                }
            } while (cursor.moveToNext());
            z = z2;
            str = f;
        } else {
            str = null;
            z = false;
        }
        this.bB.m7719a(arrayList);
        if (this.aV != null && str == null) {
            this.aV.m7257a();
        }
        if (str != null) {
            fcm a3 = ((fcn) this.binder.m25443a(fcn.class)).mo1976a(bko.m5638g(), bxt.SMS_MESSAGE, 0, str);
            if (!a3.m14964a()) {
                a3.m14963a(this.context, new cfk(this), false);
                return;
            }
        }
        if (z && !(bko.m5644m() && glq.m18010b(this.context))) {
            int i;
            Builder title = new Builder(getActivity()).setTitle(bc.gu);
            if (bko.m5626M()) {
                i = bc.gA;
            } else {
                i = bc.gt;
            }
            title.setMessage(i).setCancelable(false).setPositiveButton(17039370, new cfl(this)).show();
        }
        bkf k = this.f5106i.mo954k();
        k.m5586a(cursor);
        ar();
        m7423v();
        this.aV.m7257a();
        for (cgm cgm : this.bo) {
            if (k.m5588a(cgm.f5256b)) {
                this.aB.mo926a(cgm.f5255a, cgm.f5256b, cgm.f5257c);
            }
        }
        this.bo.clear();
        if (!af()) {
            ac();
        }
        this.f5103f.m16724b(this.f5106i.mo947e() != 1, false);
        this.br = false;
        for (edk edk : k.m5590b()) {
            if (!gwb.m1925a(edk)) {
                f = edk.m13596f();
                if (f != null && dak.m11383a(f)) {
                    this.f5103f.m16723a(true, false);
                    break;
                }
            }
            this.br = true;
            m7353F();
        }
        aq();
        if (this.br) {
            this.aV.m7270i();
            this.cf.setVisibility(8);
            this.ce.setVisibility(8);
        } else {
            this.aW.mo814c();
        }
        this.aV.m7257a();
        this.cG[1] = true;
        ((ListView) this.bI).invalidateViews();
    }

    private void aq() {
        if (!this.bT) {
            this.bT = true;
            if (this.f5106i.mo947e() == 2) {
                int i;
                Collection<edk> c = this.f5106i.mo954k().m5592c();
                int size = c.size();
                int i2 = 0;
                for (edk edk : c) {
                    if (TextUtils.isEmpty(edk.f11219h)) {
                        i = i2;
                    } else {
                        i = i2 + 1;
                    }
                    i2 = i;
                }
                this.ax.mo1979a(this.av.m5638g()).mo1693b().mo1698a(Integer.valueOf(size)).mo1714c(2721);
                if (size != 0) {
                    if (((double) i2) <= ((double) size) * 0.25d) {
                        i = 2717;
                    } else if (((double) i2) <= ((double) size) * ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR) {
                        i = 2718;
                    } else if (((double) i2) <= ((double) size) * 0.75d) {
                        i = 2719;
                    }
                    this.ax.mo1979a(this.av.m5638g()).mo1693b().mo1698a(Integer.valueOf(i2)).mo1714c(i);
                    return;
                }
                i = 2720;
                this.ax.mo1979a(this.av.m5638g()).mo1693b().mo1698a(Integer.valueOf(i2)).mo1714c(i);
                return;
            }
            this.ax.mo1979a(this.av.m5638g()).mo1693b().mo1714c(2722);
        }
    }

    private void ar() {
        this.cl = 0;
        this.cm = null;
        for (edk edk : this.f5106i.mo954k().m5590b()) {
            if (Boolean.TRUE.equals(edk.f11220i)) {
                this.cl++;
                this.cm = edk;
            }
        }
    }

    void m7376a(Cursor cursor, bko bko) {
        if (this.cn <= 0) {
            this.bf = cursor;
            return;
        }
        this.cG[3] = true;
        cursor.moveToLast();
        if (!cursor.isAfterLast()) {
            long j = cursor.getLong(2);
            if (j > this.cn && j > this.co) {
                switch (cursor.getInt(3)) {
                    case wi.dK /*17*/:
                        gkc gkc = new gkc(cursor.getString(4), null);
                        this.bU.m7713a();
                        this.cp = null;
                        this.cq = null;
                        frj bnn = new bnn(gkc, this.bU, true, Integer.valueOf(cursor.getInt(5)));
                        Cursor a = ((bns) this.bH).a();
                        if (a == null || !a.moveToLast() || !a.getString(1).equals(cursor.getString(1))) {
                            this.cp = bnn;
                            this.cq = cursor.getString(1);
                            break;
                        }
                        this.bU.m7714a(bnn);
                        this.aD.mo2072a(bnn);
                        break;
                        break;
                }
            }
            glk.m17970a("Babel", "Setting last processed event suggestion timestamp from " + this.co + " to " + j, new Object[0]);
            this.co = j;
        }
        this.bf = null;
        RealTimeChatService.m9099d(bko, this.f5106i.mo931a().f4146a, this.co);
    }

    private void m7342a(Cursor cursor, bko bko, String str) {
        String str2;
        String str3;
        String string;
        int i;
        Object obj = null;
        int i2 = this.ci;
        String str4 = this.cj;
        this.cj = null;
        lo kyVar = new ky();
        if (cursor != null && cursor.moveToFirst()) {
            cgc cgc;
            int i3 = 0;
            str2 = null;
            str3 = null;
            while (true) {
                if (cursor.getPosition() == 0) {
                    string = cursor.getString(3);
                    str3 = cursor.getString(4);
                } else {
                    string = str3;
                    str3 = str2;
                }
                String string2 = cursor.getString(0);
                int i4 = cursor.getInt(12);
                glk.m17970a("Babel_Conv", "onConversationsLoaderFinished loading conversation %s", string2);
                if (obj == null && i4 == 1) {
                    this.f5106i.mo937a(cursor.getString(3), cursor.getString(4));
                    obj = 1;
                }
                long a = gwb.m1523a(Long.valueOf(cursor.getLong(13)));
                if (a > this.cn) {
                    this.cn = a;
                }
                cgc = (cgc) this.aP.get(string2);
                if (cgc == null) {
                    cgc = new cgc();
                }
                kyVar.put(string2, cgc);
                cgc.f5231a = string2;
                cgc.f5233c = cursor.getLong(14);
                cgc.f5234d = cursor.getInt(6) != 0;
                cgc.f5236f = cursor.getString(17);
                this.aG = cgc.f5236f;
                cgc.f5232b = i4;
                cgc.f5237g = cursor.getLong(15);
                cgc.f5238h = cursor.getLong(18);
                i = cursor.getInt(2);
                int e = this.f5106i.mo947e();
                if (!(i == 0 || i == e)) {
                    String valueOf = String.valueOf(ae());
                    glk.m17981d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 100).append("loaded client conversation type ").append(i).append(" overriding ").append(e).append(" for conversation ").append(valueOf).append(" (this is weird)").toString(), new Object[0]);
                }
                if (i4 == 1) {
                    if (bko.m5642k()) {
                        this.ci = 0;
                    } else {
                        this.ci = cursor.getInt(9);
                    }
                    this.cj = string2;
                    this.ck = cursor.getLong(10);
                }
                if (TextUtils.equals(ae(), cgc.f5231a)) {
                    String str5;
                    this.f5106i.mo932a(i);
                    this.f5106i.mo941b(cursor.getInt(21));
                    this.f5106i.mo938a(cursor.getInt(23) != 0);
                    this.aH = cursor.getString(19);
                    this.aI = cursor.getString(20);
                    this.az = cursor.getInt(1);
                    this.aA = cursor.getInt(16);
                    this.aK = cursor.getString(22);
                    this.aS = true;
                    if (f5098a) {
                        str2 = this.f5106i.mo949f();
                        bpd a2 = this.f5106i.mo931a();
                        String valueOf2 = String.valueOf(ae());
                        String valueOf3 = String.valueOf(this);
                        if (str2 != null) {
                            str5 = ", convName=";
                            str2 = String.valueOf(str2);
                            str5 = str2.length() != 0 ? str5.concat(str2) : new String(str5);
                        } else {
                            str5 = "";
                        }
                        str2 = String.valueOf(a2 != null ? Integer.valueOf(a2.f4147b) : "not set");
                        new StringBuilder((((String.valueOf(valueOf2).length() + 83) + String.valueOf(valueOf3).length()) + String.valueOf(str5).length()) + String.valueOf(str2).length()).append("onConversationsLoaderFinished(CONVERSATION_LOADER) conversationId=").append(valueOf2).append(": this=").append(valueOf3).append(str5).append(" variant: ").append(str2);
                    }
                    getActivity().F_();
                    this.bm.m7686a(cursor);
                    this.aY.m9592c(this.bm.m7694d());
                    this.aY.m9594d(e);
                    this.f5106i.mo942b(cursor.getInt(11) == 2);
                    if (!this.bX) {
                        this.bX = true;
                        if (m7360M() == null && !getActivity().getIntent().hasExtra("android.intent.extra.TEXT") && cursor.moveToFirst()) {
                            chi chi = this.aF;
                            bkm bkm = new bkm(cursor.getString(5));
                            bkm a3 = DraftService.m8244a(ae(), this.av);
                            if (a3 == null) {
                                if (f5098a) {
                                    str2 = String.valueOf(bkm);
                                    new StringBuilder(String.valueOf(str2).length() + 48).append("DraftService.getDraft returning original draft: ").append(str2);
                                }
                                a3 = bkm;
                            } else if (f5098a) {
                                str5 = String.valueOf(a3);
                                new StringBuilder(String.valueOf(str5).length() + 36).append("DraftService.getDraft pendingDraft: ").append(str5);
                            }
                            chi.m7652a(a3);
                        }
                    }
                }
                i = i3 + 1;
                if (!cursor.moveToNext()) {
                    break;
                }
                i3 = i;
                str2 = str3;
                str3 = string;
            }
            if (obj == null) {
                this.f5106i.mo937a(string, str3);
            }
            ah();
            if (this.aP.isEmpty()) {
                long j = 0;
                for (cgc cgc2 : kyVar.values()) {
                    j = Math.max(j, cgc2.f5238h);
                }
                ((bns) this.bH).m6243a(j);
            }
            this.aP.clear();
            this.aP.m28015a(kyVar);
            as();
        } else if (RealTimeChatService.m8987a(str) == null) {
            string = "Babel_Conv";
            String str6 = "Missing data, closing conversation ";
            str3 = String.valueOf(str);
            glk.m17979c(string, str3.length() != 0 ? str6.concat(str3) : new String(str6), new Object[0]);
            if (this.bs != null) {
                this.bs.mo1166a(str);
                i = 0;
            } else {
                i = 0;
            }
        } else {
            glk.m17979c("Babel_Conv", "Ignoring missing data, conversation ID changed", new Object[0]);
            return;
        }
        if (i2 == 0 && this.ci != 0) {
            RealTimeChatService.m9121j(bko, this.cj);
        }
        au();
        RealTimeChatService.m9099d(bko, ae(), this.co);
        str2 = ae();
        if (str2 == null) {
            str2 = "(NULL)";
        }
        glk.m17979c("Babel_Conv", "Conversation loader finished for %s, count# %d", str2, Integer.valueOf(i));
        if (str4 != null && this.cj == null) {
            str3 = "Babel_Conv";
            string = "Error: CallMediaTypeConvId is now missing! ";
            str2 = String.valueOf(str4);
            glk.m17982e(str3, str2.length() != 0 ? string.concat(str2) : new String(string), new Object[0]);
        }
        m7423v();
        if (this.f5106i.mo949f() != null) {
            this.cG[0] = true;
        } else if (this.bs != null) {
            this.bs.mo1166a(ae());
        }
    }

    public bkm ab() {
        return new bkm(this.aV.m7266e());
    }

    public void mo850b(bkm bkm) {
        if (bkm != null && !bkm.m5607a()) {
            this.aV.m7261a(bkm.f3628a, !this.bS);
            this.aV.m7257a();
        }
    }

    private void as() {
        int i = 0;
        for (cgc cgc : this.aP.values()) {
            int i2;
            switch (cgc.f5232b) {
                case 1:
                    i2 = i + 1;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    i2 = i;
                    break;
            }
            i = i2;
        }
        if (i > 1) {
            new cfm(this).m4950b(new Void[0]);
        }
    }

    private void m7343a(edk edk, String str) {
        if (this.f5106i.mo947e() == 1 && edk != null && edk.f11213b.f11244a != null && !edk.f11213b.m13608a(this.av.m5632b()) && edk.f11212a == edq.PERSON) {
            for (Entry entry : this.aP.entrySet()) {
                if (!TextUtils.isEmpty(edk.f11214c)) {
                    String str2 = this.aG;
                    String valueOf = String.valueOf(glk.m17974b(edk.toString()));
                    glk.m17982e("Babel_Conv", new StringBuilder(((String.valueOf(str).length() + 119) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("ParticipantType PERSON with phone found in conversation conversationId=").append(str).append(" mergeKey=").append(str2).append(" ParticipantEntity phone number like: ").append(valueOf).toString(), new Object[0]);
                }
                if (TextUtils.equals(str, (String) entry.getKey())) {
                    String c = bnr.GAIA.m6230c(this.aG);
                    if (!(c == null || c.equals(edk.f11213b.f11244a))) {
                        glk.m17982e("Babel", String.format(Locale.US, "in conversation %s gaia mismatch %s vs %s", new Object[]{str, this.aG, edk.f11213b.f11244a}), new Object[0]);
                        throw new IllegalStateException("Gaia mismatch");
                    }
                }
            }
        }
    }

    void ac() {
        bpd a = this.f5106i.mo931a();
        if (a != null && a.f4146a != null && this.be > 0) {
            bos a2 = this.bJ.m6320a(a.f4146a);
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            for (fqj fqj : a2.m6323a(0, Long.MAX_VALUE)) {
                edo b = fqj.m15831b();
                bkf k = this.f5106i.mo954k();
                edk b2 = k.m5589b(b);
                if (!(b2 == null || k.m5593c(b))) {
                    if (fqj.m15832c() >= this.be) {
                        arrayList2.add(b2);
                    } else {
                        arrayList.add(b2);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.aY.m9580a(arrayList, false);
            }
            if (!arrayList2.isEmpty()) {
                this.aY.m9589b(arrayList2, true);
            }
            if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                this.aw.mo1668a(this.av.m5638g(), "conversation_watermark_load", 1023);
            }
        }
    }

    public void mo835a(cgt cgt) {
        this.cr = cgt;
        m7356I();
    }

    public void mo841a(mjq<bxn> mjq_bxn) {
        m7403b((List) mjq_bxn);
    }

    public void mo840a(List<bxn> list) {
        if (m7403b((List) list)) {
            ad();
        }
        m7356I();
    }

    void ad() {
        this.aW.mo495a();
        if (this.cr != null) {
            cgt cgt = this.cr;
            this.cr = null;
            iiq.m4948a(new cfp(this, cgt));
        }
    }

    public boolean mo864e() {
        bpd a = this.f5106i.mo931a();
        return (a == null || gwb.m2237h(a.f4147b)) ? false : true;
    }

    public boolean r_() {
        bpd a = this.f5106i.mo931a();
        return (a == null || gwb.m2254i(a.f4147b) || !fdq.m15090a(this.context, this.av.m5638g())) ? false : true;
    }

    boolean m7403b(List<bxn> list) {
        bpd a = this.f5106i.mo931a();
        if (a != null) {
            return m7394a((List) list, a);
        }
        this.f5105h.mo964a(new cfq(this, list));
        return true;
    }

    void m7388a(String str, int i) {
        ba.m4548a(this.av.m5638g(), glj.m17963b(), 6, ba.m4618c().m12794b(str).m12803f(i));
    }

    boolean m7394a(List<bxn> list, bpd bpd) {
        this.f5106i.mo948e(true);
        as();
        boolean z = false;
        boolean z2 = true;
        for (bxn bxn : list) {
            bxo bxo = bxn.f4741c;
            if (!gwb.m2267j(this.f5106i.mo931a().f4147b) || bxo == bxo.PHOTO || bxo == bxo.VIDEO || bxo == bxo.STICKER || bxo == bxo.LOCATION) {
                boolean z3 = true;
            } else {
                int i = 0;
            }
            if (i != 0) {
                switch (cfy.f5215b[bxn.f4741c.ordinal()]) {
                    case 1:
                    case 2:
                        z3 = bxn.f4741c == bxo.PHOTO || bxn.f4741c == bxo.VIDEO;
                        ba.m4577a(z3);
                        z3 = fdq.m15090a(getContext(), this.av.m5638g());
                        if (bxn.f4741c == bxo.VIDEO && !z3) {
                            Toast.makeText(this.context, bc.tZ, 0).show();
                            break;
                        }
                        bxy bxy = (bxy) bxn;
                        this.bC.mo1027a(this.av.m5638g(), bpd.f4146a, bxy);
                        this.f5104g.m7750a(bpd.f4146a, bxy.e);
                        break;
                        break;
                    case 3:
                        if (bxn.f4741c == bxo.STICKER) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ba.m4577a(z3);
                        m7379a(bpd, "", bxn, bxn.f4743e, true);
                        this.f5103f.m16722a();
                        break;
                    case 4:
                        if (bxn.f4741c == bxo.LOCATION) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ba.m4577a(z3);
                        m7379a(bpd, "", bxn, bxn.f4743e, true);
                        this.f5103f.m16722a();
                        break;
                    default:
                        throw new UnsupportedOperationException("Cannot send unsupported attachment type.");
                }
                z = true;
            } else {
                z2 = false;
            }
        }
        if (!z2) {
            Toast.makeText(this.context, bc.gr, 0).show();
        } else if (this.bI != null) {
            int count = ((ListView) this.bI).getAdapter().getCount();
            int i2 = count - 20;
            if (((ListView) this.bI).getLastVisiblePosition() < i2) {
                ((ListView) this.bI).setSelection(i2);
            }
            View childAt = ((ListView) this.bI).getChildAt((count - 1) - ((ListView) this.bI).getFirstVisiblePosition());
            i = ((ListView) this.bI).getHeight();
            if (count > 0 && (childAt == null || childAt.getBottom() > i)) {
                ((ListView) this.bI).smoothScrollToPosition(((ListView) this.bI).getAdapter().getCount() - 1);
            }
        }
        f5099b.m18079c("sendMessageUiLatency");
        return z;
    }

    void m7379a(bpd bpd, CharSequence charSequence, bxn bxn, String str, boolean z) {
        CharSequence charSequence2;
        this.f5106i.mo948e(true);
        Object obj = getActivity() != null ? 1 : null;
        as();
        bko bko = this.av;
        if (!gwb.m2267j(mo858d()) || this.bb == null) {
            charSequence2 = charSequence;
        } else {
            String a = this.bb.m9385a(charSequence);
            if (a == null) {
                charSequence2 = charSequence;
            } else if (this.bb.m9390b(a)) {
                charSequence2 = this.bb.m9384a(charSequence, a);
            } else {
                if (this.bb.m9389a(a)) {
                    RealTimeChatService.m9001a(this.av.m5638g(), bpd.f4146a, (CharSequence) a);
                }
                if (obj != null) {
                    EasterEggView easterEggView = this.bb;
                    bko bko2 = this.av;
                    this.av.m5632b();
                    easterEggView.m9388a(bko2, a);
                }
                ba.m4548a(this.av.m5638g(), glj.m17963b(), 10, ba.m4618c().m12794b(str).m12786a(210));
                return;
            }
        }
        if (obj == null) {
            this.bC.mo1028a(bko.m5638g(), bpd.f4146a, charSequence2, bxn, z, str);
            return;
        }
        int count = ((ListView) this.bI).getAdapter().getCount();
        int i = count - 20;
        if (((ListView) this.bI).getLastVisiblePosition() < i) {
            ((ListView) this.bI).setSelection(i);
        }
        View childAt = ((ListView) this.bI).getChildAt((count - 1) - ((ListView) this.bI).getFirstVisiblePosition());
        boolean z2 = count > 0 && (childAt == null || childAt.getBottom() > ((ListView) this.bI).getHeight());
        if (gwb.m1906a(this.context, "babel_extra_log_scrolling", false)) {
            glk.m17979c("Babel_Scroll", "sendMessage needsScroll:" + z2, new Object[0]);
        }
        if (z2) {
            ((ListView) this.bI).smoothScrollToPosition(((ListView) this.bI).getAdapter().getCount() - 1);
            if (gwb.m1906a(this.context, "babel_extra_log_scrolling", false)) {
                glk.m17979c("Babel_Scroll", "sendMessage smoothScrollToPosition:" + (((ListView) this.bI).getAdapter().getCount() - 1), new Object[0]);
            }
            this.aM = true;
            this.ba.postDelayed(new cfr(this, bko, bpd, charSequence2, bxn, z, str), 500);
        } else {
            this.bC.mo1028a(bko.m5638g(), bpd.f4146a, charSequence2, bxn, z, str);
            this.f5104g.m7750a(bpd.f4146a, str);
        }
        m7378a(new bkm());
        getActivity().getIntent().removeExtra("share_intent");
        this.bZ = false;
        m7423v();
        f5099b.m18079c("sendMessageUiLatency");
    }

    private boolean at() {
        for (cgc cgc : this.aP.values()) {
            if (!cgc.f5234d) {
                return true;
            }
        }
        return false;
    }

    private void au() {
        if (this.aQ && at()) {
            this.cg.setVisibility(0);
        } else {
            this.cg.setVisibility(8);
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
        ((bns) this.bH).m6246b(null);
    }

    public void mo678a(Bundle bundle, String str) {
        if (str.equals("conversation_error")) {
            av();
        } else if (str.equals("delete_message")) {
            m7347d(bundle.getLong("row_id"));
        }
    }

    public void b_(String str) {
    }

    public void mo679b(String str) {
        if (str.equals("conversation_error")) {
            av();
        }
    }

    private void av() {
        bpd a = this.f5106i.mo931a();
        RealTimeChatService.m9117g(this.av, a.f4146a);
        if (this.bs != null) {
            this.bs.mo1166a(a.f4146a);
        }
    }

    public void mo860d(int i) {
        bxt bxt;
        if (this.ci == 1) {
            bxt = bxt.AUDIO_CALL;
        } else {
            bxt = bxt.VIDEO_CALL;
        }
        m7380a(bxt, 60, 2724);
    }

    public String ae() {
        return this.f5106i.mo943c();
    }

    public edk mo833a(edo edo) {
        return this.f5106i.mo954k().m5589b(edo);
    }

    public boolean mo853b(edo edo) {
        return this.av.m5632b().m13608a(edo);
    }

    public bko mo495a() {
        return this.av;
    }

    public boolean mo857c(edo edo) {
        return this.aY.m9582a(edo);
    }

    public boolean af() {
        return getId() == ba.cD;
    }

    public void mo849b(long j) {
        long currentTimeMillis = System.currentTimeMillis() - (j / 1000);
        if (currentTimeMillis < 0) {
            this.cJ.setVisibility(8);
            return;
        }
        this.cJ.setVisibility(0);
        this.cJ.setBase(SystemClock.elapsedRealtime() - currentTimeMillis);
        this.cJ.start();
    }

    public int mo858d() {
        return this.f5106i.mo931a().f4147b;
    }

    private void m7347d(long j) {
        ((cnt) this.binder.m25443a(cnt.class)).mo1026a(this.av.m5638g(), ae(), j);
    }

    public void ag() {
        if (this.aX != null) {
            gwb.m2031b(eow.TRANSPORT_SPINNER);
            ((ViewGroup) this.aX.getParent()).removeView(this.aX);
            this.aX = null;
        }
    }

    void ah() {
        String f = this.f5106i.mo949f();
        if (f != null && this.bs != null) {
            this.bs.mo1169b(f);
        }
    }

    public int ai() {
        return this.f5106i.mo947e();
    }

    public String mo859d(edo edo) {
        return this.f5106i.mo954k().m5594d(edo);
    }

    public String mo862e(edo edo) {
        edk b = this.f5106i.mo954k().m5589b(edo);
        if (b == null) {
            return null;
        }
        return gwb.m1648a(this.context, b, this.f5106i.mo947e() != 2);
    }

    public String mo865f(edo edo) {
        return this.f5106i.mo954k().m5598e(edo);
    }

    public String mo866g(edo edo) {
        edk b = this.f5106i.mo954k().m5589b(edo);
        if (b != null) {
            return gwb.m1648a(this.context, b, true);
        }
        return null;
    }

    public void mo861d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.aV.m7260a(new StringBuilder(String.valueOf(str).length() + 2).append("@").append(str).append(" ").toString());
        }
    }

    void m7381a(cgh cgh) {
        for (Entry entry : this.aP.entrySet()) {
            cgh.mo893a((String) entry.getKey(), (cgc) entry.getValue());
        }
    }

    public Handler aj() {
        return this.ba;
    }

    public void mo863e(int i) {
        ((dut) this.binder.m25443a(dut.class)).mo1686a(this.context, gwb.lu, i);
    }

    public void mo851b(String str, String str2) {
        RealTimeChatService.m9021a(this.av, str, str2);
    }

    public void mo855c(long j) {
        this.bm.m7690b(j);
    }

    public boolean mo873t() {
        return gwb.m2267j(mo858d()) && !blo.m5871a(ae());
    }

    public boolean mo876z() {
        return !GcmStateReceiver.f6806a;
    }

    public boolean mo823B() {
        return gwb.m2237h(mo858d());
    }

    static boolean m7340R() {
        gmx gmx = gmx.f15669a;
        return gmx != null && gmx.m18138e();
    }

    public void m7365S() {
        gmx gmx = gmx.f15669a;
        if (gmx == null || !gmx.m18140g()) {
            getActivity().setVolumeControlStream(nzf.UNSET_ENUM_VALUE);
        } else {
            getActivity().setVolumeControlStream(0);
        }
    }

    void aa() {
        edk edk;
        String str = null;
        if (af() || this.f5106i.mo931a() == null || !gwb.m2267j(mo858d())) {
            edk = null;
        } else {
            edk = mo832Z();
            if (edk == null || !edk.m13589a()) {
                edk = null;
            }
        }
        if (this.bj == edk) {
            return;
        }
        if (this.bj == null || !this.bj.equals(edk)) {
            String str2;
            this.bj = edk;
            if (this.bj != null) {
                str = edk.m13590b();
                str2 = edk.f11216e;
            } else {
                str2 = null;
            }
            if (this.bk != null) {
                this.bk.mo1661a(str);
            }
            Iterator it = jyn.m25438c(this.context, bxu.class).iterator();
            while (it.hasNext()) {
                it.next();
                this.av.m5638g();
            }
            this.bl.m7286a(str2, str);
        }
    }

    public void onFinished(FrameSequenceDrawable frameSequenceDrawable) {
        this.ch.setVisibility(8);
        FrameSequenceDrawable frameSequenceDrawable2 = (FrameSequenceDrawable) this.ch.getDrawable();
        frameSequenceDrawable2.stop();
        frameSequenceDrawable2.destroy();
        this.ch.setImageDrawable(null);
    }

    private void aw() {
        int i;
        int i2 = 0;
        iil.m21875b("Expected non-null", this.av);
        if (af()) {
            i = 0;
        } else if (this.aP.isEmpty()) {
            i = 0;
        } else {
            cgc cgc;
            if (this.aP.size() == 1) {
                cgc = (cgc) this.aP.values().iterator().next();
            } else {
                cgc = null;
            }
            if ((cgc == null || ((fzw) this.binder.m25443a(fzw.class)).mo2155d() || gwb.m2254i(cgc.f5232b)) && this.f5106i.mo947e() == 1 && mo832Z() == null) {
                glk.m17981d("Babel", "tryRunConversationVariantsEngine -- NO OTHER PARTICIPANT", new Object[0]);
                i = 0;
            } else if (this.aG == null) {
                i = 0;
            } else {
                boolean z = true;
            }
        }
        if (i != 0) {
            if (this.cI) {
                glk.m17970a("Babel", "Skipping variant computation; already ran", new Object[0]);
                return;
            }
            this.cI = true;
            che che = new che(this);
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(getLoaderManager());
            glk.m17979c("Babel", new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()).append("Starting variant engine for ").append(valueOf).append(" loader: ").append(valueOf2).toString(), new Object[0]);
            this.aw.mo1670a("conversation_variant_engine_computation");
            this.f5105h.mo964a(new cfv(this));
            Collection arrayList = new ArrayList(this.aP.size());
            while (i2 < this.aP.size()) {
                arrayList.add((cgc) this.aP.m28018c(i2));
                i2++;
            }
            this.bp.m7629a(this.f5106i.mo947e(), this.aG, arrayList, che);
        }
    }
}
