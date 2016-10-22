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
    public static final boolean a;
    static final gma b;
    private static String cP;
    static long d;
    int aA;
    final fip aB;
    cim aC;
    fsi aD;
    dex aE;
    chi aF;
    String aG;
    String aH;
    String aI;
    String aJ;
    String aK;
    public boolean aL;
    boolean aM;
    boolean aN;
    btk aO;
    final ky<String, cgc> aP;
    boolean aQ;
    boolean aR;
    boolean aS;
    List<Runnable> aT;
    int aU;
    cdh aV;
    bxp aW;
    View aX;
    ParticipantsGalleryView aY;
    final gkq<cgp> aZ;
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
    final cij bB;
    cnt bC;
    bpy bD;
    final gia<bow> bE;
    final Runnable bF;
    private bor bJ;
    private final chn bK;
    private cbt bL;
    private final jej bM;
    private final jej bN;
    private final jej bO;
    private long bP;
    private int bQ;
    private final bpu bR;
    private boolean bS;
    private boolean bT;
    private cii bU;
    private cdq bV;
    private Uri bW;
    private boolean bX;
    private int bY;
    private boolean bZ;
    final Handler ba;
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
    final List<cgm> bo;
    cgy bp;
    public final List<MessageListItemView> bq;
    boolean br;
    das bs;
    MessageListAnimationManager bt;
    final Runnable bu;
    FixedParticipantsView bv;
    ccv<?>[] bw;
    ccw<?> bx;
    cgi by;
    int bz;
    Runnable c;
    private final bsm cA;
    private final brc cB;
    private final brr cC;
    private final bsf cD;
    private final brk cE;
    private final Runnable cF;
    private final boolean[] cG;
    private final gpk cH;
    private boolean cI;
    private Chronometer cJ;
    private dae cK;
    private final bpz cL;
    private final gia<fln> cM;
    private final Map<Long, Integer> cN;
    private final bpf cO;
    private final ccb cQ;
    private dr ca;
    private bxv cb;
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
    private final ccg cs;
    private final ddk ct;
    private final bst cu;
    private final cbi cv;
    private final cbg cw;
    private final cbe cx;
    private final bqv cy;
    private final bry cz;
    int e;
    final fzr f;
    ciz g;
    final chh h;
    public final cgr i;

    public cdr() {
        glh glh = new glh(getClass().getSimpleName(), getLifecycle());
        cpe cpe = new cpe(getLifecycle());
        this.e = -1;
        this.f = new fzr();
        this.h = new chh().a(this.binder);
        this.i = new cgu(this.context, this, this.lifecycle).a(this.binder);
        this.bK = new chn(this, this.lifecycle).a(this.binder);
        this.bM = new cds(this);
        this.bN = new ced(this);
        this.bO = new cen(this);
        this.bR = new cey(this);
        this.aB = new cgn(this);
        this.aF = new chi(this);
        this.cb = new cgo(this).a(this.binder);
        this.aP = new ky();
        this.aT = new ArrayList();
        this.aU = -1;
        this.aZ = new gkq();
        this.ba = new Handler();
        this.cs = new ccg(this);
        this.ct = new ddk(this);
        this.cu = new cfz(this);
        this.cv = new cga(this);
        this.cw = new cdt(this);
        this.cx = new cdu(this);
        this.cy = new cdv(this);
        this.cz = new cdw(this);
        this.cA = new cdx(this);
        this.cB = new cdy(this);
        this.cC = new cdz(this);
        this.cD = new cea(this);
        this.cE = new ceb(this);
        this.cF = new ceg(this);
        this.cG = new boolean[4];
        this.cH = new gpk();
        this.bo = new ArrayList();
        this.bq = new ArrayList();
        this.br = false;
        this.bu = new ceh(this);
        this.by = new cgi(this);
        this.bB = new cij(this.context, new cik(this));
        new cgb(this).a(this.binder);
        this.bl = new cdp();
        this.bl.a(this.binder);
        bkf bkf = new bkf();
        bkf.a(new cei(this));
        this.i.a(bkf);
        this.cL = new cej(this);
        this.cM = new cek(this);
        this.bE = new cel(this);
        this.bF = new cfc(this);
        this.cN = new ky();
        this.cO = new cfs(this);
        this.cQ = new cfx(this);
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a(igVar, (Cursor) obj);
    }

    static {
        kae kae = glk.f;
        a = false;
        b = gma.a("ConvFrag");
        gwb.a(new cew());
        cP = "(select merge_key from merge_keys where merge_keys.conversation_id=conversations.conversation_id)  IN (SELECT merge_key FROM merge_keys WHERE conversation_id=?)";
    }

    void a(int i, int i2) {
        if (this.aQ) {
            long j;
            Cursor a = ((bns) this.bH).a();
            if (i <= 0 || a == null || a.isClosed() || !a.moveToPosition(i - i2)) {
                j = 0;
            } else {
                j = a.getLong(6);
            }
            a(new cfj(this, j));
            if (i == 0 && this.bz == ((bns) this.bH).a().getCount()) {
                boj boj = (boj) getLoaderManager().b(2);
                if (boj != null) {
                    this.bz += gwb.a(this.context, "babel_conversation_messages_limit", (int) HttpStatusCodes.STATUS_CODE_SERVER_ERROR);
                    ap();
                    boj.a(this.bW);
                    boj.v();
                    return;
                }
                glk.d("Babel_Conv", "MessagesLoader is null. Error 22253232", new Object[0]);
            }
        }
    }

    public int q() {
        return this.cl;
    }

    public edk r() {
        return this.cm;
    }

    public void a(int i) {
        this.cl = i;
        cgi cgi = this.by;
        if (cgi.a == cgk.b && !cgi.c.af() && cgi.c.aA != 1) {
            for (ccw ccw : cgi.c.bw) {
                boolean a = ccw.a();
                ccw.a(a);
                if (ccw instanceof ddo) {
                    if (a && !cgi.b) {
                        gwb.a(cgi.c.av, 2100);
                        cgi.b = true;
                    } else if (cgi.b && !a) {
                        gwb.a(cgi.c.av, 2101);
                        cgi.b = false;
                    }
                }
            }
            cgi.c.bx.a(cgi.c.bx.a());
        }
    }

    public void a(edk edk) {
        this.cm = null;
    }

    public long s() {
        return this.ck;
    }

    public boolean u() {
        return this.bZ;
    }

    public boolean c() {
        return this.aL;
    }

    public boolean b() {
        return this.aQ;
    }

    public void a(das das) {
        this.bs = das;
    }

    void v() {
        cgi cgi = this.by;
        if (cgi.a == cgk.b && !cgi.c.af() && cgi.c.aA != 1) {
            for (ccw ccw : cgi.c.bw) {
                boolean a = ccw.a();
                ccw.a(a);
                if (ccw instanceof ddo) {
                    if (a && !cgi.b) {
                        gwb.a(cgi.c.av, 2100);
                        cgi.b = true;
                    } else if (cgi.b && !a) {
                        gwb.a(cgi.c.av, 2101);
                        cgi.b = false;
                    }
                }
            }
            cgi.c.bx.a(cgi.c.bx.a());
        }
    }

    public boolean w() {
        return isResumed();
    }

    void a(String str, String str2) {
        gwb.aJ();
        bcc b = this.i.b();
        bcc bcc = new bcc(str2, b.b, b.c);
        bcc.d = b.d;
        bcc.e = b.e;
        this.i.a(bcc);
        if (this.h.f() == null) {
            glk.c("Babel_Conv", "variants not finished, canceling CVE", new Object[0]);
            this.bp.a();
            this.bp = new cgy(this.context, this.h, this.av, bcc.d ? bcc.a : null, bcc.e);
            this.cI = false;
        } else {
            this.h.a(str, str2);
        }
        ap();
    }

    public void onCreate(Bundle bundle) {
        bcc bcc;
        boolean z;
        String b = b.b("onCreate");
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
        this.i.a(bcc);
        super.onCreate(bundle);
        int a = ((jca) this.binder.a(jca.class)).a();
        this.av = fde.e(a);
        this.ax.a(a).b().c(3091);
        this.g = new ciz(a);
        this.g.a(bundle);
        this.cK = new dae(getActivity());
        this.cK.a(new dag(this));
        gpf.f = false;
        MessageListItemWrapperView.c(false);
        if (!af()) {
            if (this.bL != null) {
                z = true;
            } else {
                z = false;
            }
            for (Class b2 : r0 ? new Class[]{bsu.class, dsh.class, cbh.class, cbf.class, bqw.class, brz.class, ccc.class, cbu.class, brl.class} : new Class[]{bsu.class, dsh.class, cbj.class, bqw.class, brz.class, bsn.class, brd.class, brs.class, bsg.class, ccc.class, cbu.class, brl.class}) {
                byd byd = (byd) this.binder.b(b2);
                if (byd != null) {
                    byd.a();
                }
            }
        }
        setHasOptionsMenu(true);
        this.i.n().addObserver(new cem(this));
        this.i.o().addObserver(new ceo(this));
        this.bS = bcc.p;
        this.bT = bcc.q;
        this.as = bcc.t;
        this.h.a(this.av.b());
        this.i.k().d(this.av, bcc.a);
        this.bz = gwb.a(this.context, "babel_conversation_messages_limit", (int) HttpStatusCodes.STATUS_CODE_SERVER_ERROR);
        ap();
        this.aH = bcc.i;
        this.aI = bcc.j;
        this.bY = bcc.l;
        this.bp = new cgy(this.context, this.h, this.av, bcc.d ? bcc.a : null, bcc.e);
        if (bcc.h > -1) {
            this.cn = bcc.h;
        }
        if (bcc.a() == 1 || !giw.d(this.context)) {
            getActivity().getWindow().setSoftInputMode(20);
        }
        if (fdq.L.b(a)) {
            bcc2 = this.i.b();
            if (bcc2 == null || bcc2.c == 3) {
                z = false;
            } else if (((fzw) jyn.a(this.context, fzw.class)).d()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            this.aO = (btk) this.binder.b(btk.class);
        }
        String ae = ae();
        String valueOf = String.valueOf(this);
        String valueOf2 = String.valueOf(bcc.a);
        String valueOf3 = String.valueOf(getLoaderManager());
        glk.c("Babel", new StringBuilder((((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(ae).length()).append("CFI#onCreate for ").append(valueOf).append("(").append(valueOf2).append(") loader: ").append(valueOf3).append(" id: ").append(ae).toString(), new Object[0]);
        String a2 = ((flo) this.binder.a(flo.class)).a(ae);
        if (!(a2 == null || a2.equals(ae))) {
            a(ae, a2);
        }
        a(false);
        b.c(b);
    }

    void a(boolean z) {
        if (getActivity() != null) {
            fg loaderManager = getLoaderManager();
            b.b("MESSAGES_LOADER");
            if (this.aO == null) {
                a(loaderManager, 2, z);
            }
            b.b("CONVERSATION_LOADER");
            a(loaderManager, 0, z);
            b.b("EVENT_SUGGESTIONS_LOADER");
            a(loaderManager, 3, z);
        }
    }

    private void a(fg fgVar, int i, boolean z) {
        if (!this.cG[i] && !z) {
            fgVar.a(i, null, this);
        } else if (z) {
            this.cG[i] = false;
            fgVar.b(i, null, this);
        }
    }

    void b(boolean z) {
        boolean z2 = true;
        if (this.bH != null && ((bns) this.bH).getCount() == 0) {
            z = true;
        }
        if (giw.c(this.context)) {
            z = true;
        }
        if (giw.d(this.context)) {
            z2 = z;
        }
        if (this.bs != null) {
            this.bs.b_(z2);
        }
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.binder.a(bpu.class, this.bR);
        this.binder.a(bpz.class, this.cL);
        this.bD = ((bpv) this.binder.a(bpv.class)).a(this.context, this.lifecycle, getFragmentManager());
        this.aw = ((dti) this.binder.a(dti.class)).a(17);
        this.aD = (fsi) this.binder.a(fsi.class);
        this.aE = (dex) this.binder.a(dex.class);
        this.ax = (iih) this.binder.a(iih.class);
        this.binder.a(bxq.class, new cep(this));
        this.binder.a(cdg.class, (Object) this);
        this.binder.a(cgq.class, (Object) this);
        this.binder.a(cnh.class, new cnh(((iih) this.binder.a(iih.class)).a(((jca) this.binder.a(jca.class)).a())));
        this.bJ = (bor) this.binder.a(bor.class);
        this.aj = ((jek) this.binder.a(jek.class)).a(gwb.lB, this.bM).a(gwb.lC, this.bM).a(gwb.lA, this.bM).a(gwb.lD, this.bN).a(gwb.lE, this.bO);
        this.ak = (bhl) this.binder.a(bhl.class);
        this.bL = (cbt) this.binder.b(cbt.class);
        this.binder.a(chy.class, new ceq(this));
        ((dut) this.binder.a(dut.class)).a(this.context, gwb.lu, new cer(this));
        ((eia) this.binder.a(eia.class)).a(gwb.lw, new ces(this));
        this.binder.a(chx.class, (Object) this);
        this.binder.a(bst.class, this.cu);
        this.binder.a(cbi.class, this.cv);
        this.binder.a(cbg.class, this.cw);
        this.binder.a(cbe.class, this.cx);
        this.binder.a(bqv.class, this.cy);
        this.binder.a(bry.class, this.cz);
        this.binder.a(bsm.class, this.cA);
        this.binder.a(brc.class, this.cB);
        this.binder.a(brr.class, this.cC);
        this.binder.a(bsf.class, this.cD);
        this.binder.a(brk.class, this.cE);
        this.binder.a(ed.class, getFragmentManager());
        this.binder.a(bpm.class, (Object) this);
        this.binder.a(ccb.class, this.cQ);
        this.bC = (cnt) this.binder.a(cnt.class);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        grg grg = (grg) this.binder.b(grg.class);
        if (grg != null) {
            this.bk = grg.a(this.context, this.av.g(), this.bs, getResources());
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Parcelable bcc;
        boolean z = true;
        super.onSaveInstanceState(bundle);
        this.g.b(bundle);
        bpd a = this.i.a();
        int e = this.i.e();
        if (a == null || a.a == null) {
            bcc b = this.i.b();
            bcc = new bcc(b.a, e, b.c);
            bcc.d = b.d;
            bcc.e = b.e;
        } else {
            bcc = new bcc(a.a, e, a.b);
            bcc.d = true;
            bcc.e = true;
        }
        for (ccv ccv : this.bw) {
            bcc.n.add(Boolean.valueOf(ccv.a));
        }
        bcc.g = this.i.f();
        bcc.h = this.cn;
        bcc.i = this.aH;
        bcc.j = this.aI;
        bcc.l = this.bY;
        bcc.m = this.aK;
        if (getActivity() == null || !getActivity().isChangingConfigurations()) {
            z = false;
        }
        bcc.p = z;
        bcc.q = this.bT;
        bcc.t = this.as;
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
        this.bV.a(contextMenu, view, contextMenuInfo, getActivity().getMenuInflater(), (fxa) this.binder.a(fxa.class));
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
        if (messageListItemWrapperView == null || !(messageListItemWrapperView.c() instanceof MessageListItemView)) {
            return false;
        }
        MessageListItemView messageListItemView = (MessageListItemView) messageListItemWrapperView.c();
        if (itemId == ba.as) {
            ((ClipboardManager) getActivity().getSystemService("clipboard")).setText(messageListItemView.f());
        } else if (itemId == ba.aF) {
            messageListItemView.a(getActivity());
        } else if (itemId == ba.bs) {
            String str2;
            fyj n = messageListItemView.n();
            String charSequence = messageListItemView.f() == null ? "" : messageListItemView.f().toString();
            if (messageListItemView.r() == 1) {
                z = true;
            }
            String t = messageListItemView.t();
            if (n != null) {
                str2 = n.a;
            } else {
                str2 = null;
            }
            if (n != null) {
                str = n.b;
            }
            messageListItemView.q();
            startActivity(gwb.a(charSequence, z, t, str2, str));
        } else if (itemId == ba.aD) {
            dvm a = ba.c().a(messageListItemView.D());
            String E = messageListItemView.E();
            if (blo.a(E)) {
                a.b(E);
            } else {
                a.c(E);
            }
            ba.a(this.av.g(), SystemClock.elapsedRealtime(), 10, a.a((int) HttpStatusCodes.STATUS_CODE_SEE_OTHER));
            d(messageListItemView.y());
            this.ax.a(this.av.g()).b().a(Integer.valueOf(messageListItemView.C().ordinal())).c(2937);
        } else if (itemId == ba.eU) {
            cim.a((eia) this.binder.a(eia.class), messageListItemView);
        } else if (itemId == 1000) {
            messageListItemView.e();
        } else if (itemId == ba.az) {
            cps.a(messageListItemView.F());
        }
        return true;
    }

    private void ao() {
        this.aq = ((bpv) this.binder.a(bpv.class)).a(this.context, this.lifecycle, this.bQ, this, this.an, this.al);
        this.bQ++;
    }

    void a(bxt bxt, int i, int i2) {
        boolean z;
        boolean z2 = true;
        ba.b(this.al == null, (Object) "Cannot start a call while one is in progress");
        if (this.am == 0) {
            z = true;
        } else {
            z = false;
        }
        ba.b(z, (Object) "Cannot start a call while one is in progress");
        if (this.an == null) {
            z = true;
        } else {
            z = false;
        }
        ba.b(z, (Object) "Cannot start a call while one is in progress");
        if (this.ao == null) {
            z = true;
        } else {
            z = false;
        }
        ba.b(z, (Object) "Cannot start a call while one is in progress");
        if (this.ap == 0) {
            z = true;
        } else {
            z = false;
        }
        ba.b(z, (Object) "Cannot start a call while one is in progress");
        if (this.aq != null) {
            z2 = false;
        }
        ba.b(z2, (Object) "Cannot start a call while one is in progress");
        this.an = new bck();
        this.ao = new ArrayList();
        this.ap = 0;
        this.al = bxt;
        this.am = i;
        ao();
        if (this.ci == 0 || TextUtils.isEmpty(this.cj)) {
            this.ao = y();
            x();
            return;
        }
        this.aq.a(this.cj, i2);
    }

    void x() {
        if (this.ap == this.ao.size()) {
            bxt bxt;
            if (gwb.i(d())) {
                bxt = bxt.SMS_MESSAGE;
            } else {
                bxt = bxt.HANGOUTS_MESSAGE;
            }
            if (bxt == bxt.HANGOUTS_MESSAGE) {
                this.aq.a(this.i.a().a, 2622);
                return;
            } else {
                this.aq.a(boy.LOCAL_AND_SERVER, false, null, null, 2622);
                return;
            }
        }
        bjg bjg = (bjg) this.ao.get(this.ap);
        this.ap++;
        this.aq.a(bjg);
    }

    ArrayList<bjg> y() {
        boolean z = true;
        ArrayList<bjg> arrayList = new ArrayList();
        Collection f = this.h.f();
        boolean z2 = f != null && f.size() > 1;
        int e = this.i.e();
        bkf k = this.i.k();
        boolean i = gwb.i(this.i.a().b);
        edk edk;
        if (z2 && e == 1) {
            edk = this.i.a().h;
            if (i) {
                z = false;
            }
            arrayList.add(bjj.a(edk, null, z));
        } else if (!k.d()) {
            for (edk edk2 : k.c()) {
                arrayList.add(bjj.a(edk2, null, !i));
            }
        }
        return arrayList;
    }

    public boolean A() {
        return !a(this.context);
    }

    public int C() {
        return this.az;
    }

    public void b(int i) {
        this.az = 30;
        for (String b : this.aP.keySet()) {
            RealTimeChatService.b(this.av, b, this.az);
        }
        v();
    }

    private static boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean D() {
        return this.ci != 0 && a(this.context);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.ax.a(this.av.g()).b().c(3269);
        fk.a(getActivity());
        return true;
    }

    boolean E() {
        if (this.i.a() == null && ((fzw) this.binder.a(fzw.class)).d()) {
            return false;
        }
        if (this.bA != null && !this.bA.a()) {
            return false;
        }
        if (this.br) {
            return false;
        }
        return true;
    }

    void F() {
        this.aV.a(E());
        I();
    }

    boolean G() {
        return (this.i.a() == null || this.bA == null) ? false : true;
    }

    void H() {
        if (G()) {
            for (Runnable a : this.aT) {
                gwb.a(a);
            }
            this.aT.clear();
        }
    }

    void I() {
        if (E()) {
            boolean z;
            int size = this.i.l().size();
            if (this.aV == null || !this.aV.j()) {
                z = false;
            } else {
                z = true;
            }
            if (this.bm != null && z) {
                this.bm.a(System.currentTimeMillis());
            }
            if (this.ce != null) {
                this.ce.a(z, size);
            }
        }
    }

    private void ap() {
        this.bW = EsProvider.a(this.av, this.i.b().a).buildUpon().appendQueryParameter("limit", String.valueOf(this.bz)).build();
    }

    public void a(CharSequence charSequence) {
        this.aV.a(charSequence);
    }

    public void J() {
        this.aV.f();
    }

    public void K() {
        this.aV.g();
    }

    public void L() {
        this.aV.b();
    }

    Intent M() {
        return (Intent) getActivity().getIntent().getParcelableExtra("share_intent");
    }

    public void N() {
        if (getActivity().getIntent().hasExtra("android.intent.extra.TEXT")) {
            this.aV.a(getActivity().getIntent().getCharSequenceExtra("android.intent.extra.TEXT"), false);
        }
        O();
    }

    public void O() {
        if (a) {
            String valueOf = String.valueOf(this.aV);
            new StringBuilder(String.valueOf(valueOf).length() + 47).append("handleOptionalShareIntent mComposeMessageView: ").append(valueOf);
        }
        Intent M = M();
        giv.a("handleOptionalShareIntent", M);
        if (M != null) {
            String type = M.getType();
            if (((fwn) this.binder.a(fwn.class)).a(this.context, type)) {
                if (M.hasExtra("android.intent.extra.TEXT")) {
                    this.aV.a(M.getCharSequenceExtra("android.intent.extra.TEXT"), false);
                }
                if (!ba.e(type)) {
                    Uri b = gwb.b(M);
                    if (!gwb.a(fde.e(((jca) this.binder.a(jca.class)).a()), bnc.PHOTO_SHARING)) {
                        Toast.makeText(this.context, gwb.lZ, 0).show();
                        return;
                    } else if (b != null) {
                        Intent a;
                        if (b.getScheme().equalsIgnoreCase("file")) {
                            try {
                                if (new File(b.getPath()).getCanonicalPath().startsWith(Environment.getDataDirectory().toString())) {
                                    glk.e("Babel_Conv", "Trying to upload a file with an illegal directory path: %s", new File(b.getPath()).getCanonicalPath());
                                    return;
                                }
                            } catch (Throwable e) {
                                glk.d("Babel_Conv", "IOException when getting canonical path for share intent URI string", e);
                                return;
                            }
                        }
                        if (ba.d(type)) {
                            a = chs.a(this.context, b, type, false);
                        } else {
                            a = chs.a(this.context, b, false);
                        }
                        this.aj.a(gwb.lD, a);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            glk.e("Babel_Conv", "Trying to handle share intent with invalid share type: %s", type);
        }
    }

    public void P() {
        if (this.aV != null) {
            this.aV.setVisibility(8);
            this.cf.setVisibility(8);
            this.ce.setVisibility(8);
        }
        this.i.c(true);
    }

    public boolean Q() {
        iil.b("Expected condition to be false", this.i.j());
        this.aW.b();
        if (!giw.d(this.context)) {
            return false;
        }
        boolean c = this.aV.c();
        b(false);
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
            k.k();
        }
        this.bc.a(new ceu(this));
        this.bc.a(new cev(this));
        if (R()) {
            this.bc.a();
        }
        S();
        gmx.b = new gna(this);
        this.cc.addOnLayoutChangeListener(this.cd);
    }

    public void onStart() {
        super.onStart();
        RealTimeChatService.a(this.aB);
        ((bns) this.bH).n_();
    }

    public boolean T() {
        return this.bg;
    }

    void U() {
        if (T()) {
            bko bko = this.av;
            Collection keySet = this.aP.keySet();
            if (RealTimeChatService.a) {
                String valueOf = String.valueOf(keySet);
                String valueOf2 = String.valueOf(bko.a());
                new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length()).append("setFocusedConversation ").append(valueOf).append(" account:").append(valueOf2);
            }
            synchronized (RealTimeChatService.c) {
                RealTimeChatService.d = bko.a();
                RealTimeChatService.e = new HashSet(keySet);
            }
        }
    }

    static void V() {
        d = gwb.a(gwb.H(), "babel_poll_conversation_data_frequency_ms", 60000);
    }

    public void a_(String str) {
        if (this.aS || this.cn > 0) {
            this.ak.a(new fli(this.context, this.av.g(), str, 0));
            int g = this.av.g();
            if (!TextUtils.isEmpty(str) && !blo.a(str)) {
                this.bC.a(g, str, false);
            }
        }
    }

    void W() {
        a(new cfb(this));
    }

    void a(bkm bkm) {
        for (bpd bpd : this.h.f()) {
            if (bpd.a != null) {
                DraftService.a(getActivity(), this.av, bpd.a, bkm);
            }
        }
    }

    public void X() {
        this.aV.a("", false);
        this.i.m();
        this.f.a();
        a(new bkm());
    }

    public void Y() {
        if (((ListView) this.bI).getFirstVisiblePosition() <= 0) {
            glk.c("Babel_Scroll", "Message load failed. scroll to hide spinner.", new Object[0]);
            ((ListView) this.bI).smoothScrollToPositionFromTop(1, 0);
        }
        glk.e("Babel", "Message load failed", new Object[0]);
        if (gwb.a(this.context, "babel_enable_message_load_failed_toast", true)) {
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
            edk a = a((edo) entry.getKey());
            if (a != null) {
                this.aY.b(a, 4, true);
            }
        }
        ((bns) this.bH).c();
        au();
        for (MessageListItemView l : this.bq) {
            l.l();
        }
        if (this.bb != null) {
            this.bb.a();
        }
        gmx.b = null;
        this.bc.d();
        this.bc.e();
        this.bc.b();
        for (MessageListItemView l2 : this.bq) {
            l2.A();
        }
        gwb.x(getView());
        this.cc.removeOnLayoutChangeListener(this.cd);
        boolean z = getActivity() != null && getActivity().isChangingConfigurations();
        if (!z && this.as) {
            this.ax.a(this.av.g()).b().c(3318);
            this.as = false;
        }
    }

    public void onStop() {
        super.onStop();
        RealTimeChatService.b(this.aB);
    }

    public void a(gpc gpc, String str, String str2) {
        if (this.bs != null) {
            this.bs.a(gpc, str, str2);
        }
    }

    public void c(int i) {
        if (getActivity() != null) {
            Cursor a = ((bns) this.bH).a();
            a.moveToPosition(i);
            int i2 = 2 == a.getInt(33) ? 1 : 0;
            String string = a.getString(2);
            long j = a.getLong(0);
            if (i2 != 0) {
                new Builder(getActivity()).setTitle(bc.jQ).setItems(gwb.dx, new cfw(this, a.getString(24), j)).create().show();
            } else {
                ((cnt) this.binder.a(cnt.class)).b(this.av.g(), string, j);
                this.ax.a(this.av.g()).b().a(Integer.valueOf(((bns) this.bH).a().getInt(7))).c(2938);
            }
            ((bns) this.bH).notifyDataSetChanged();
        }
    }

    public boolean a(long j) {
        return this.cN.containsKey(Long.valueOf(j));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String b = b.b("onCreateView");
        View inflate = layoutInflater.inflate(gwb.fU, viewGroup, false);
        this.bI = (ListView) inflate.findViewById(16908298);
        if (this.aO != null) {
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(ba.du);
            ((ListView) this.bI).setVisibility(8);
            frameLayout.setVisibility(0);
            ed childFragmentManager = getChildFragmentManager();
            this.ca = childFragmentManager.a(ba.du);
            if (this.ca == null) {
                childFragmentManager.a().a(ba.du, this.aO.a(), "messageListFragment").a();
            }
        }
        if (((bph) this.binder.a(bph.class)).a(this.av.g(), ae())) {
            this.i.c(true);
        }
        this.cc = (ViewGroup) inflate.findViewById(ba.eK);
        this.cd = new cfd(this);
        dr a = getChildFragmentManager().a(bxp.class.getName());
        if (a == null) {
            a = new ccz();
            getChildFragmentManager().a().a(ba.v, a, bxp.class.getName()).a();
        }
        this.aW = (bxp) a;
        this.cf = inflate.findViewById(ba.v);
        this.ce = (FloatingButtonWithCounter) inflate.findViewById(ba.bo);
        this.ce.bringToFront();
        cgg cgg = new cgg(this, ((ViewGroup) getActivity().findViewById(16908290)).getChildAt(0));
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(ba.aa);
        this.aV = new cdh(getContext(), layoutInflater, this.f);
        viewGroup2.addView(this.aV, new LayoutParams(-1, -2));
        this.bV = new cdq(getContext(), (ListView) this.bI, this.av.g());
        this.aV.a(new cdn(this));
        if (this.i.j()) {
            viewGroup2.setVisibility(8);
            this.ce.setVisibility(8);
            if (this.cf != null) {
                this.cf.setVisibility(8);
            }
        }
        this.aY = (ParticipantsGalleryView) inflate.findViewById(ba.dS);
        if (this.aO != null) {
            this.aY.c();
        }
        this.aY.a(true);
        this.aY.a(this.i.e(), this.av);
        this.aY.a(new cgl(this));
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
        ccf ccf = new ccf(inflate, this.cs, this.bK, this.av.g());
        ddj ddj = new ddj(inflate, this.ct, this.bK);
        this.bw = new ccv[]{dad, ddo, dcq, cym, ccf, ccd, dcy, cyz, ddl, ddj};
        this.bx = new ddq(inflate, this);
        bcc b2 = this.i.b();
        if (b2 != null && b2.n.size() > 0) {
            iil.a("The saved snackbar shown size should equal the current list of snackbar.", Integer.valueOf(this.bw.length), Integer.valueOf(b2.n.size()));
            ArrayList arrayList = b2.n;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                Boolean bool = (Boolean) obj;
                int i3 = i + 1;
                this.bw[i].a = gwb.b(bool);
                i = i3;
            }
        }
        this.ch = (ImageView) inflate.findViewById(ba.fx);
        this.bU = new cii(this, this.av, this.ch);
        this.aC = new cim(this.context);
        this.cJ = (Chronometer) inflate.findViewById(ba.X);
        this.bv = (FixedParticipantsView) inflate.findViewById(ba.bX);
        ((ViewGroup) inflate.findViewById(ba.dL)).setLayoutTransition(new LayoutTransition());
        this.cc.setLayoutTransition(new LayoutTransition());
        View inflate2 = layoutInflater.inflate(gwb.gY, null);
        ((ListView) this.bI).addHeaderView(inflate2);
        ((ListView) this.bI).addHeaderView(layoutInflater.inflate(gwb.ha, this.bI, false));
        this.cg = inflate2.findViewById(ba.cZ);
        au();
        this.bt = new MessageListAnimationManager(this.bI, this.cH, this.ba);
        this.bH = new bns(this, this.bI, this.bt, this.i.e(), af());
        ((bns) this.bH).a(new bnv(this));
        ((ListView) this.bI).setAdapter(this.bH);
        if (gwb.a(this.context, "babel_force_gb_copy_paste_textview", true)) {
            registerForContextMenu(this.bI);
            cdq.a(this.context);
        } else {
            ((ListView) this.bI).setChoiceMode(0);
        }
        ((ListView) this.bI).setOnScrollListener(new cfe(this));
        ((ListView) this.bI).setRecyclerListener(new cff(this));
        this.bb = (EasterEggView) inflate.findViewById(ba.aP);
        if (!icb.a(getActivity().getContentResolver(), "babel_easter_eggs", true)) {
            this.bb.setVisibility(8);
            this.bb = null;
        }
        this.bc = (ProximityCoverView) inflate.findViewById(ba.z);
        showContent(inflate);
        getActivity().F_();
        this.h.a(this.cO);
        ((gie) this.binder.a(gie.class)).a(fln.class, this.cM, fln.a(ae())).a(bow.class, this.bE, new bow(ae(), this.av.g(), box.UNSPECIFIED).a());
        b.c(b);
        return inflate;
    }

    protected boolean isEmpty() {
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.h.f() == null || this.h.f().size() == 0) {
            c("Conversation fragment finishing");
            this.ax.a(((jca) this.binder.a(jca.class)).a()).b().c(3093);
        }
        this.g.a();
    }

    void c(String str) {
        Object obj;
        boolean z = true;
        List f = this.h.f();
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
        glk.d(str2, valueOf, new Object[0]);
        boolean z2 = this.cG[0];
        glk.d("Babel_Conv", new StringBuilder(String.valueOf(str).length() + 76).append("no variants (").append(str).append("); loaders (conv, part, msgs, evnt): ").append(z2).append(", ").append(this.cG[1]).append(", ").append(this.cG[2]).append(", ").append(this.cG[3]).toString(), new Object[0]);
        bcc b = this.i.b();
        str3 = String.valueOf(b.a);
        glk.d("Babel_Conv", new StringBuilder(String.valueOf(str3).length() + 55).append("no variants; startup params: ").append(str3).append(", ").append(b.b).append(", ").append(b.c).toString(), new Object[0]);
        str3 = "Babel_Conv";
        int size = this.aP.size();
        boolean d = ((fzw) this.binder.a(fzw.class)).d();
        String valueOf2 = String.valueOf(ae());
        String str4 = this.aG;
        int e = this.i.e();
        boolean z3 = this.i.a() != null;
        z2 = this.bA != null;
        if (Z() == null) {
            z = false;
        }
        glk.d(str3, new StringBuilder((String.valueOf(valueOf2).length() + 203) + String.valueOf(str4).length()).append("no variants; mergedConversations size: ").append(size).append(", merged: ").append(d).append(", conv id: ").append(valueOf2).append(", mergeKey: ").append(str4).append(", conv type: ").append(e).append(", has selected variant: ").append(z3).append(", has reachability: ").append(z2).append(", has root: ").append(z).append(", cve started: ").append(this.cI).toString(), new Object[0]);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.h.b(this.cO);
        if (this.ar != null) {
            this.ar = null;
        }
        for (MessageListItemView m : this.bq) {
            m.m();
        }
        this.aV.d();
        this.cK.a();
        this.aY.a(null);
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        ig<Cursor> boj;
        if (a) {
            String valueOf = String.valueOf(ae());
            new StringBuilder(String.valueOf(valueOf).length() + 42).append("onCreateLoader ").append(i).append(" conversationId ").append(valueOf);
        }
        if (i == 2) {
            if (a) {
                valueOf = String.valueOf(this.bW);
                new StringBuilder(String.valueOf(valueOf).length() + 21).append("messages loader uri: ").append(valueOf);
            }
            boj = new boj(getActivity(), this.av, this.bW, bny.a, "type!=? AND (expiration_timestamp>? OR expiration_timestamp IS NULL)", bny.a(), bny.b);
            b.c("MESSAGES_LOADER");
        } else if (i == 0) {
            boj = new enl(getActivity(), this.av, EsProvider.a(EsProvider.i, this.av.g()), bkj.a, cP, new String[]{ae()}, null);
            b.c("CONVERSATION_LOADER");
        } else if (i == 1) {
            valueOf = gwb.a((String[]) this.aP.keySet().toArray(new String[this.aP.size()]));
            bkf k = this.i.k();
            k.d(this.av, valueOf);
            this.h.g();
            boj = k.a(bkh.b);
        } else if (i == 3) {
            boj = new enl(getActivity(), this.av, EsProvider.c(this.av.g(), ae()), cgd.a, "timestamp>? AND type=?", new String[]{Long.toString(this.cn), Integer.toString(17)}, null);
            b.c("EVENT_SUGGESTIONS_LOADER");
        } else {
            boj = null;
        }
        if (a) {
            String valueOf2 = String.valueOf(boj);
            new StringBuilder(String.valueOf(valueOf2).length() + 39).append("onCreateLoader: id=").append(i).append(", loader=").append(valueOf2);
        }
        return boj;
    }

    public void a(ig<Cursor> igVar, Cursor cursor) {
        bko D = ((enl) igVar).D();
        if (TextUtils.equals(D.a(), this.av.a())) {
            Cursor cil;
            int count;
            int count2;
            int top;
            switch (igVar.p()) {
                case wi.w /*0*/:
                    a(cursor, D, ((enl) igVar).m()[0]);
                    if (!this.aP.isEmpty()) {
                        getLoaderManager().a(1, null, this);
                        break;
                    }
                    break;
                case wi.j /*1*/:
                    b(cursor, D);
                    break;
                case wi.l /*2*/:
                    String valueOf;
                    String valueOf2;
                    cil = new cil(cursor);
                    this.g.a(cil);
                    this.cG[2] = true;
                    if (gwb.a(this.context, "babel_extra_log_scrolling", false) || gwb.a(getContext(), "babel_crash_on_conversation_scroll_error", false)) {
                        valueOf = String.valueOf(igVar);
                        count = ((bns) this.bH).getCount();
                        String valueOf3 = String.valueOf(Integer.valueOf(cil.getCount()));
                        glk.c("Babel_Scroll", new StringBuilder((String.valueOf(valueOf).length() + 98) + String.valueOf(valueOf3).length()).append("onMessagesLoaderFinished MESSAGES_LOADER ").append(valueOf).append(" mAdapter.getCount(): ").append(count).append(" new cursor data count: ").append(valueOf3).toString(), new Object[0]);
                    }
                    if (a) {
                        valueOf2 = String.valueOf(igVar);
                        count = ((bns) this.bH).getCount();
                        valueOf = String.valueOf(Integer.valueOf(cil.getCount()));
                        new StringBuilder((String.valueOf(valueOf2).length() + 98) + String.valueOf(valueOf).length()).append("onMessagesLoaderFinished MESSAGES_LOADER ").append(valueOf2).append(" mAdapter.getCount(): ").append(count).append(" new cursor data count: ").append(valueOf);
                    }
                    if (this.bt.a().c()) {
                        this.aR = true;
                    }
                    count2 = ((bns) this.bH).getCount();
                    int firstVisiblePosition = ((ListView) this.bI).getFirstVisiblePosition();
                    int count3 = cil.getCount();
                    View childAt = ((ListView) this.bI).getChildAt(0);
                    top = childAt != null ? childAt.getTop() : 0;
                    ((bns) this.bH).b(cil);
                    if (!(this.cp == null || this.cq == null)) {
                        cil.moveToLast();
                        if (cil.getString(1).equals(this.cq)) {
                            this.bU.a(this.cp);
                            this.aD.a(this.cp);
                        }
                    }
                    this.cp = null;
                    this.cq = null;
                    if (count2 > 0 && count3 > count2 + 1) {
                        count = at() ? 1 : 0;
                        ((ListView) this.bI).setSelectionFromTop(Math.max(count, Math.min((count3 - count2) + ((firstVisiblePosition + count) - 1), count3 - 1)), top);
                    }
                    if (this.i.a() == null) {
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
                        if (T() && this.be > j && isVisible()) {
                            a_(cil.getString(2));
                        }
                        if (!af()) {
                            ac();
                        }
                    }
                    this.i.d(true);
                    au();
                    if (cil.moveToLast()) {
                        if (gwb.a(this.context, "babel_extra_log_scrolling", false)) {
                            glk.c("Babel_Scroll", "onMessagesLoaderFinished moveToLast", new Object[0]);
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
                            if (!(this.aL || valueOf2 == null || !valueOf2.equalsIgnoreCase(this.av.b().a))) {
                                this.i.e(true);
                            }
                            if (cil.moveToPrevious() && (!this.aL || r0 > 0)) {
                            }
                        }
                    }
                    v();
                    this.aV.a();
                    break;
                case wi.z /*3*/:
                    if (!T()) {
                        this.bf = cursor;
                        break;
                    } else {
                        a(cursor, D);
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
                            if (this.i.e() == 1 && !gwb.a(eow.AUTOSWITCH_TRANSPORT)) {
                                top = gwb.a(this.context, "babel_max_outgoing_message_search_rows", 50);
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
                                            if (!(gwb.k(count2) || gwb.k(r0) || gwb.i(count2) == gwb.i(r0))) {
                                                this.bZ = true;
                                                v();
                                            }
                                        }
                                        count = cil.getInt(36);
                                        this.bZ = true;
                                        v();
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
                    top = gwb.a(this.context, "babel_max_outgoing_message_search_rows", 50);
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
                            v();
                        }
                        count = cil.getInt(36);
                        this.bZ = true;
                        v();
                    }
                    this.bi = false;
                    return;
                }
                return;
            }
            return;
        }
        glk.d("Babel_Conv", "onLoadFinished called for non-fragment account", new Object[0]);
    }

    public edk Z() {
        if (this.i.e() != 1) {
            return null;
        }
        bkf k = this.i.k();
        edk edk = null;
        for (edk edk2 : k.b()) {
            if (!k.c(edk2.b)) {
                if (edk2.b.a != null) {
                    return edk2;
                }
                if (edk == null) {
                    edk = edk2;
                }
            }
        }
        return edk;
    }

    private void b(Cursor cursor, bko bko) {
        String f;
        String str;
        boolean z;
        if (a) {
            f = this.i.f();
            bpd a = this.i.a();
            String valueOf = String.valueOf(ae());
            String valueOf2 = String.valueOf(this);
            if (f != null) {
                str = ", convName=";
                f = String.valueOf(f);
                str = f.length() != 0 ? str.concat(f) : new String(str);
            } else {
                str = "";
            }
            f = String.valueOf(a != null ? Integer.valueOf(a.b) : "not set");
            new StringBuilder((((String.valueOf(valueOf).length() + 75) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()) + String.valueOf(f).length()).append("onConversationParticipantsLoaderFinished() conversationId=").append(valueOf).append(": this=").append(valueOf2).append(str).append(" variant: ").append(f);
        }
        this.h.g();
        f = null;
        List arrayList = new ArrayList();
        if (cursor.moveToFirst()) {
            boolean z2 = false;
            do {
                if (cursor.getInt(13) != 0) {
                    edk a2 = bkf.a(bko, cursor);
                    valueOf2 = cursor.getString(12);
                    a(a2, valueOf2);
                    if (a2.h() && !TextUtils.isEmpty(a2.f())) {
                        arrayList.add(a2.f());
                    }
                    if (a) {
                        String valueOf3 = String.valueOf(a2);
                        new StringBuilder((String.valueOf(valueOf3).length() + 31) + String.valueOf(valueOf2).length()).append("Participant: ").append(valueOf3).append(" Conversation Id: ").append(valueOf2);
                    }
                    this.h.a(valueOf2).add(a2);
                    if (glq.d(this.context, a2.c)) {
                        f = a2.c;
                    }
                    if (a2.i()) {
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
        this.bB.a(arrayList);
        if (this.aV != null && str == null) {
            this.aV.a();
        }
        if (str != null) {
            fcm a3 = ((fcn) this.binder.a(fcn.class)).a(bko.g(), bxt.SMS_MESSAGE, 0, str);
            if (!a3.a()) {
                a3.a(this.context, new cfk(this), false);
                return;
            }
        }
        if (z && !(bko.m() && glq.b(this.context))) {
            int i;
            Builder title = new Builder(getActivity()).setTitle(bc.gu);
            if (bko.M()) {
                i = bc.gA;
            } else {
                i = bc.gt;
            }
            title.setMessage(i).setCancelable(false).setPositiveButton(17039370, new cfl(this)).show();
        }
        bkf k = this.i.k();
        k.a(cursor);
        ar();
        v();
        this.aV.a();
        for (cgm cgm : this.bo) {
            if (k.a(cgm.b)) {
                this.aB.a(cgm.a, cgm.b, cgm.c);
            }
        }
        this.bo.clear();
        if (!af()) {
            ac();
        }
        this.f.b(this.i.e() != 1, false);
        this.br = false;
        for (edk edk : k.b()) {
            if (!gwb.a(edk)) {
                f = edk.f();
                if (f != null && dak.a(f)) {
                    this.f.a(true, false);
                    break;
                }
            }
            this.br = true;
            F();
        }
        aq();
        if (this.br) {
            this.aV.i();
            this.cf.setVisibility(8);
            this.ce.setVisibility(8);
        } else {
            this.aW.c();
        }
        this.aV.a();
        this.cG[1] = true;
        ((ListView) this.bI).invalidateViews();
    }

    private void aq() {
        if (!this.bT) {
            this.bT = true;
            if (this.i.e() == 2) {
                int i;
                Collection<edk> c = this.i.k().c();
                int size = c.size();
                int i2 = 0;
                for (edk edk : c) {
                    if (TextUtils.isEmpty(edk.h)) {
                        i = i2;
                    } else {
                        i = i2 + 1;
                    }
                    i2 = i;
                }
                this.ax.a(this.av.g()).b().a(Integer.valueOf(size)).c(2721);
                if (size != 0) {
                    if (((double) i2) <= ((double) size) * 0.25d) {
                        i = 2717;
                    } else if (((double) i2) <= ((double) size) * ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR) {
                        i = 2718;
                    } else if (((double) i2) <= ((double) size) * 0.75d) {
                        i = 2719;
                    }
                    this.ax.a(this.av.g()).b().a(Integer.valueOf(i2)).c(i);
                    return;
                }
                i = 2720;
                this.ax.a(this.av.g()).b().a(Integer.valueOf(i2)).c(i);
                return;
            }
            this.ax.a(this.av.g()).b().c(2722);
        }
    }

    private void ar() {
        this.cl = 0;
        this.cm = null;
        for (edk edk : this.i.k().b()) {
            if (Boolean.TRUE.equals(edk.i)) {
                this.cl++;
                this.cm = edk;
            }
        }
    }

    void a(Cursor cursor, bko bko) {
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
                        this.bU.a();
                        this.cp = null;
                        this.cq = null;
                        frj bnn = new bnn(gkc, this.bU, true, Integer.valueOf(cursor.getInt(5)));
                        Cursor a = ((bns) this.bH).a();
                        if (a == null || !a.moveToLast() || !a.getString(1).equals(cursor.getString(1))) {
                            this.cp = bnn;
                            this.cq = cursor.getString(1);
                            break;
                        }
                        this.bU.a(bnn);
                        this.aD.a(bnn);
                        break;
                        break;
                }
            }
            glk.a("Babel", "Setting last processed event suggestion timestamp from " + this.co + " to " + j, new Object[0]);
            this.co = j;
        }
        this.bf = null;
        RealTimeChatService.d(bko, this.i.a().a, this.co);
    }

    private void a(Cursor cursor, bko bko, String str) {
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
                glk.a("Babel_Conv", "onConversationsLoaderFinished loading conversation %s", string2);
                if (obj == null && i4 == 1) {
                    this.i.a(cursor.getString(3), cursor.getString(4));
                    obj = 1;
                }
                long a = gwb.a(Long.valueOf(cursor.getLong(13)));
                if (a > this.cn) {
                    this.cn = a;
                }
                cgc = (cgc) this.aP.get(string2);
                if (cgc == null) {
                    cgc = new cgc();
                }
                kyVar.put(string2, cgc);
                cgc.a = string2;
                cgc.c = cursor.getLong(14);
                cgc.d = cursor.getInt(6) != 0;
                cgc.f = cursor.getString(17);
                this.aG = cgc.f;
                cgc.b = i4;
                cgc.g = cursor.getLong(15);
                cgc.h = cursor.getLong(18);
                i = cursor.getInt(2);
                int e = this.i.e();
                if (!(i == 0 || i == e)) {
                    String valueOf = String.valueOf(ae());
                    glk.d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 100).append("loaded client conversation type ").append(i).append(" overriding ").append(e).append(" for conversation ").append(valueOf).append(" (this is weird)").toString(), new Object[0]);
                }
                if (i4 == 1) {
                    if (bko.k()) {
                        this.ci = 0;
                    } else {
                        this.ci = cursor.getInt(9);
                    }
                    this.cj = string2;
                    this.ck = cursor.getLong(10);
                }
                if (TextUtils.equals(ae(), cgc.a)) {
                    String str5;
                    this.i.a(i);
                    this.i.b(cursor.getInt(21));
                    this.i.a(cursor.getInt(23) != 0);
                    this.aH = cursor.getString(19);
                    this.aI = cursor.getString(20);
                    this.az = cursor.getInt(1);
                    this.aA = cursor.getInt(16);
                    this.aK = cursor.getString(22);
                    this.aS = true;
                    if (a) {
                        str2 = this.i.f();
                        bpd a2 = this.i.a();
                        String valueOf2 = String.valueOf(ae());
                        String valueOf3 = String.valueOf(this);
                        if (str2 != null) {
                            str5 = ", convName=";
                            str2 = String.valueOf(str2);
                            str5 = str2.length() != 0 ? str5.concat(str2) : new String(str5);
                        } else {
                            str5 = "";
                        }
                        str2 = String.valueOf(a2 != null ? Integer.valueOf(a2.b) : "not set");
                        new StringBuilder((((String.valueOf(valueOf2).length() + 83) + String.valueOf(valueOf3).length()) + String.valueOf(str5).length()) + String.valueOf(str2).length()).append("onConversationsLoaderFinished(CONVERSATION_LOADER) conversationId=").append(valueOf2).append(": this=").append(valueOf3).append(str5).append(" variant: ").append(str2);
                    }
                    getActivity().F_();
                    this.bm.a(cursor);
                    this.aY.c(this.bm.d());
                    this.aY.d(e);
                    this.i.b(cursor.getInt(11) == 2);
                    if (!this.bX) {
                        this.bX = true;
                        if (M() == null && !getActivity().getIntent().hasExtra("android.intent.extra.TEXT") && cursor.moveToFirst()) {
                            chi chi = this.aF;
                            bkm bkm = new bkm(cursor.getString(5));
                            bkm a3 = DraftService.a(ae(), this.av);
                            if (a3 == null) {
                                if (a) {
                                    str2 = String.valueOf(bkm);
                                    new StringBuilder(String.valueOf(str2).length() + 48).append("DraftService.getDraft returning original draft: ").append(str2);
                                }
                                a3 = bkm;
                            } else if (a) {
                                str5 = String.valueOf(a3);
                                new StringBuilder(String.valueOf(str5).length() + 36).append("DraftService.getDraft pendingDraft: ").append(str5);
                            }
                            chi.a(a3);
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
                this.i.a(string, str3);
            }
            ah();
            if (this.aP.isEmpty()) {
                long j = 0;
                for (cgc cgc2 : kyVar.values()) {
                    j = Math.max(j, cgc2.h);
                }
                ((bns) this.bH).a(j);
            }
            this.aP.clear();
            this.aP.a(kyVar);
            as();
        } else if (RealTimeChatService.a(str) == null) {
            string = "Babel_Conv";
            String str6 = "Missing data, closing conversation ";
            str3 = String.valueOf(str);
            glk.c(string, str3.length() != 0 ? str6.concat(str3) : new String(str6), new Object[0]);
            if (this.bs != null) {
                this.bs.a(str);
                i = 0;
            } else {
                i = 0;
            }
        } else {
            glk.c("Babel_Conv", "Ignoring missing data, conversation ID changed", new Object[0]);
            return;
        }
        if (i2 == 0 && this.ci != 0) {
            RealTimeChatService.j(bko, this.cj);
        }
        au();
        RealTimeChatService.d(bko, ae(), this.co);
        str2 = ae();
        if (str2 == null) {
            str2 = "(NULL)";
        }
        glk.c("Babel_Conv", "Conversation loader finished for %s, count# %d", str2, Integer.valueOf(i));
        if (str4 != null && this.cj == null) {
            str3 = "Babel_Conv";
            string = "Error: CallMediaTypeConvId is now missing! ";
            str2 = String.valueOf(str4);
            glk.e(str3, str2.length() != 0 ? string.concat(str2) : new String(string), new Object[0]);
        }
        v();
        if (this.i.f() != null) {
            this.cG[0] = true;
        } else if (this.bs != null) {
            this.bs.a(ae());
        }
    }

    public bkm ab() {
        return new bkm(this.aV.e());
    }

    public void b(bkm bkm) {
        if (bkm != null && !bkm.a()) {
            this.aV.a(bkm.a, !this.bS);
            this.aV.a();
        }
    }

    private void as() {
        int i = 0;
        for (cgc cgc : this.aP.values()) {
            int i2;
            switch (cgc.b) {
                case wi.j /*1*/:
                    i2 = i + 1;
                    break;
                case wi.l /*2*/:
                case wi.z /*3*/:
                    break;
                default:
                    i2 = i;
                    break;
            }
            i = i2;
        }
        if (i > 1) {
            new cfm(this).b(new Void[0]);
        }
    }

    private void a(edk edk, String str) {
        if (this.i.e() == 1 && edk != null && edk.b.a != null && !edk.b.a(this.av.b()) && edk.a == edq.PERSON) {
            for (Entry entry : this.aP.entrySet()) {
                if (!TextUtils.isEmpty(edk.c)) {
                    String str2 = this.aG;
                    String valueOf = String.valueOf(glk.b(edk.toString()));
                    glk.e("Babel_Conv", new StringBuilder(((String.valueOf(str).length() + 119) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("ParticipantType PERSON with phone found in conversation conversationId=").append(str).append(" mergeKey=").append(str2).append(" ParticipantEntity phone number like: ").append(valueOf).toString(), new Object[0]);
                }
                if (TextUtils.equals(str, (String) entry.getKey())) {
                    String c = bnr.GAIA.c(this.aG);
                    if (!(c == null || c.equals(edk.b.a))) {
                        glk.e("Babel", String.format(Locale.US, "in conversation %s gaia mismatch %s vs %s", new Object[]{str, this.aG, edk.b.a}), new Object[0]);
                        throw new IllegalStateException("Gaia mismatch");
                    }
                }
            }
        }
    }

    void ac() {
        bpd a = this.i.a();
        if (a != null && a.a != null && this.be > 0) {
            bos a2 = this.bJ.a(a.a);
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            for (fqj fqj : a2.a(0, Long.MAX_VALUE)) {
                edo b = fqj.b();
                bkf k = this.i.k();
                edk b2 = k.b(b);
                if (!(b2 == null || k.c(b))) {
                    if (fqj.c() >= this.be) {
                        arrayList2.add(b2);
                    } else {
                        arrayList.add(b2);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.aY.a(arrayList, false);
            }
            if (!arrayList2.isEmpty()) {
                this.aY.b(arrayList2, true);
            }
            if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                this.aw.a(this.av.g(), "conversation_watermark_load", 1023);
            }
        }
    }

    public void a(cgt cgt) {
        this.cr = cgt;
        I();
    }

    public void a(mjq<bxn> mjq_bxn) {
        b((List) mjq_bxn);
    }

    public void a(List<bxn> list) {
        if (b((List) list)) {
            ad();
        }
        I();
    }

    void ad() {
        this.aW.a();
        if (this.cr != null) {
            cgt cgt = this.cr;
            this.cr = null;
            iiq.a(new cfp(this, cgt));
        }
    }

    public boolean e() {
        bpd a = this.i.a();
        return (a == null || gwb.h(a.b)) ? false : true;
    }

    public boolean r_() {
        bpd a = this.i.a();
        return (a == null || gwb.i(a.b) || !fdq.a(this.context, this.av.g())) ? false : true;
    }

    boolean b(List<bxn> list) {
        bpd a = this.i.a();
        if (a != null) {
            return a((List) list, a);
        }
        this.h.a(new cfq(this, list));
        return true;
    }

    void a(String str, int i) {
        ba.a(this.av.g(), glj.b(), 6, ba.c().b(str).f(i));
    }

    boolean a(List<bxn> list, bpd bpd) {
        this.i.e(true);
        as();
        boolean z = false;
        boolean z2 = true;
        for (bxn bxn : list) {
            bxo bxo = bxn.c;
            if (!gwb.j(this.i.a().b) || bxo == bxo.PHOTO || bxo == bxo.VIDEO || bxo == bxo.STICKER || bxo == bxo.LOCATION) {
                boolean z3 = true;
            } else {
                int i = 0;
            }
            if (i != 0) {
                switch (cfy.b[bxn.c.ordinal()]) {
                    case wi.j /*1*/:
                    case wi.l /*2*/:
                        z3 = bxn.c == bxo.PHOTO || bxn.c == bxo.VIDEO;
                        ba.a(z3);
                        z3 = fdq.a(getContext(), this.av.g());
                        if (bxn.c == bxo.VIDEO && !z3) {
                            Toast.makeText(this.context, bc.tZ, 0).show();
                            break;
                        }
                        bxy bxy = (bxy) bxn;
                        this.bC.a(this.av.g(), bpd.a, bxy);
                        this.g.a(bpd.a, bxy.e);
                        break;
                        break;
                    case wi.z /*3*/:
                        if (bxn.c == bxo.STICKER) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ba.a(z3);
                        a(bpd, "", bxn, bxn.e, true);
                        this.f.a();
                        break;
                    case wi.h /*4*/:
                        if (bxn.c == bxo.LOCATION) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ba.a(z3);
                        a(bpd, "", bxn, bxn.e, true);
                        this.f.a();
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
        b.c("sendMessageUiLatency");
        return z;
    }

    void a(bpd bpd, CharSequence charSequence, bxn bxn, String str, boolean z) {
        CharSequence charSequence2;
        this.i.e(true);
        Object obj = getActivity() != null ? 1 : null;
        as();
        bko bko = this.av;
        if (!gwb.j(d()) || this.bb == null) {
            charSequence2 = charSequence;
        } else {
            String a = this.bb.a(charSequence);
            if (a == null) {
                charSequence2 = charSequence;
            } else if (this.bb.b(a)) {
                charSequence2 = this.bb.a(charSequence, a);
            } else {
                if (this.bb.a(a)) {
                    RealTimeChatService.a(this.av.g(), bpd.a, (CharSequence) a);
                }
                if (obj != null) {
                    EasterEggView easterEggView = this.bb;
                    bko bko2 = this.av;
                    this.av.b();
                    easterEggView.a(bko2, a);
                }
                ba.a(this.av.g(), glj.b(), 10, ba.c().b(str).a(210));
                return;
            }
        }
        if (obj == null) {
            this.bC.a(bko.g(), bpd.a, charSequence2, bxn, z, str);
            return;
        }
        int count = ((ListView) this.bI).getAdapter().getCount();
        int i = count - 20;
        if (((ListView) this.bI).getLastVisiblePosition() < i) {
            ((ListView) this.bI).setSelection(i);
        }
        View childAt = ((ListView) this.bI).getChildAt((count - 1) - ((ListView) this.bI).getFirstVisiblePosition());
        boolean z2 = count > 0 && (childAt == null || childAt.getBottom() > ((ListView) this.bI).getHeight());
        if (gwb.a(this.context, "babel_extra_log_scrolling", false)) {
            glk.c("Babel_Scroll", "sendMessage needsScroll:" + z2, new Object[0]);
        }
        if (z2) {
            ((ListView) this.bI).smoothScrollToPosition(((ListView) this.bI).getAdapter().getCount() - 1);
            if (gwb.a(this.context, "babel_extra_log_scrolling", false)) {
                glk.c("Babel_Scroll", "sendMessage smoothScrollToPosition:" + (((ListView) this.bI).getAdapter().getCount() - 1), new Object[0]);
            }
            this.aM = true;
            this.ba.postDelayed(new cfr(this, bko, bpd, charSequence2, bxn, z, str), 500);
        } else {
            this.bC.a(bko.g(), bpd.a, charSequence2, bxn, z, str);
            this.g.a(bpd.a, str);
        }
        a(new bkm());
        getActivity().getIntent().removeExtra("share_intent");
        this.bZ = false;
        v();
        b.c("sendMessageUiLatency");
    }

    private boolean at() {
        for (cgc cgc : this.aP.values()) {
            if (!cgc.d) {
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
        ((bns) this.bH).b(null);
    }

    public void a(Bundle bundle, String str) {
        if (str.equals("conversation_error")) {
            av();
        } else if (str.equals("delete_message")) {
            d(bundle.getLong("row_id"));
        }
    }

    public void b_(String str) {
    }

    public void b(String str) {
        if (str.equals("conversation_error")) {
            av();
        }
    }

    private void av() {
        bpd a = this.i.a();
        RealTimeChatService.g(this.av, a.a);
        if (this.bs != null) {
            this.bs.a(a.a);
        }
    }

    public void d(int i) {
        bxt bxt;
        if (this.ci == 1) {
            bxt = bxt.AUDIO_CALL;
        } else {
            bxt = bxt.VIDEO_CALL;
        }
        a(bxt, 60, 2724);
    }

    public String ae() {
        return this.i.c();
    }

    public edk a(edo edo) {
        return this.i.k().b(edo);
    }

    public boolean b(edo edo) {
        return this.av.b().a(edo);
    }

    public bko a() {
        return this.av;
    }

    public boolean c(edo edo) {
        return this.aY.a(edo);
    }

    public boolean af() {
        return getId() == ba.cD;
    }

    public void b(long j) {
        long currentTimeMillis = System.currentTimeMillis() - (j / 1000);
        if (currentTimeMillis < 0) {
            this.cJ.setVisibility(8);
            return;
        }
        this.cJ.setVisibility(0);
        this.cJ.setBase(SystemClock.elapsedRealtime() - currentTimeMillis);
        this.cJ.start();
    }

    public int d() {
        return this.i.a().b;
    }

    private void d(long j) {
        ((cnt) this.binder.a(cnt.class)).a(this.av.g(), ae(), j);
    }

    public void ag() {
        if (this.aX != null) {
            gwb.b(eow.TRANSPORT_SPINNER);
            ((ViewGroup) this.aX.getParent()).removeView(this.aX);
            this.aX = null;
        }
    }

    void ah() {
        String f = this.i.f();
        if (f != null && this.bs != null) {
            this.bs.b(f);
        }
    }

    public int ai() {
        return this.i.e();
    }

    public String d(edo edo) {
        return this.i.k().d(edo);
    }

    public String e(edo edo) {
        edk b = this.i.k().b(edo);
        if (b == null) {
            return null;
        }
        return gwb.a(this.context, b, this.i.e() != 2);
    }

    public String f(edo edo) {
        return this.i.k().e(edo);
    }

    public String g(edo edo) {
        edk b = this.i.k().b(edo);
        if (b != null) {
            return gwb.a(this.context, b, true);
        }
        return null;
    }

    public void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.aV.a(new StringBuilder(String.valueOf(str).length() + 2).append("@").append(str).append(" ").toString());
        }
    }

    void a(cgh cgh) {
        for (Entry entry : this.aP.entrySet()) {
            cgh.a((String) entry.getKey(), (cgc) entry.getValue());
        }
    }

    public Handler aj() {
        return this.ba;
    }

    public void e(int i) {
        ((dut) this.binder.a(dut.class)).a(this.context, gwb.lu, i);
    }

    public void b(String str, String str2) {
        RealTimeChatService.a(this.av, str, str2);
    }

    public void c(long j) {
        this.bm.b(j);
    }

    public boolean t() {
        return gwb.j(d()) && !blo.a(ae());
    }

    public boolean z() {
        return !GcmStateReceiver.a;
    }

    public boolean B() {
        return gwb.h(d());
    }

    static boolean R() {
        gmx gmx = gmx.a;
        return gmx != null && gmx.e();
    }

    public void S() {
        gmx gmx = gmx.a;
        if (gmx == null || !gmx.g()) {
            getActivity().setVolumeControlStream(nzf.UNSET_ENUM_VALUE);
        } else {
            getActivity().setVolumeControlStream(0);
        }
    }

    void aa() {
        edk edk;
        String str = null;
        if (af() || this.i.a() == null || !gwb.j(d())) {
            edk = null;
        } else {
            edk = Z();
            if (edk == null || !edk.a()) {
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
                str = edk.b();
                str2 = edk.e;
            } else {
                str2 = null;
            }
            if (this.bk != null) {
                this.bk.a(str);
            }
            Iterator it = jyn.c(this.context, bxu.class).iterator();
            while (it.hasNext()) {
                it.next();
                this.av.g();
            }
            this.bl.a(str2, str);
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
        iil.b("Expected non-null", this.av);
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
            if ((cgc == null || ((fzw) this.binder.a(fzw.class)).d() || gwb.i(cgc.b)) && this.i.e() == 1 && Z() == null) {
                glk.d("Babel", "tryRunConversationVariantsEngine -- NO OTHER PARTICIPANT", new Object[0]);
                i = 0;
            } else if (this.aG == null) {
                i = 0;
            } else {
                boolean z = true;
            }
        }
        if (i != 0) {
            if (this.cI) {
                glk.a("Babel", "Skipping variant computation; already ran", new Object[0]);
                return;
            }
            this.cI = true;
            che che = new che(this);
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(getLoaderManager());
            glk.c("Babel", new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()).append("Starting variant engine for ").append(valueOf).append(" loader: ").append(valueOf2).toString(), new Object[0]);
            this.aw.a("conversation_variant_engine_computation");
            this.h.a(new cfv(this));
            Collection arrayList = new ArrayList(this.aP.size());
            while (i2 < this.aP.size()) {
                arrayList.add((cgc) this.aP.c(i2));
                i2++;
            }
            this.bp.a(this.i.e(), this.aG, arrayList, che);
        }
    }
}
