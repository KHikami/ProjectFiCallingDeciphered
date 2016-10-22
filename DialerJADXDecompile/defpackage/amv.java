package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.widget.CardView;
import android.telephony.PhoneNumberUtils;
import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import com.android.contacts.common.dialog.CallSubjectDialog;
import com.android.dialer.app.DialtactsActivity;
import com.android.dialer.app.voicemail.VoicemailPlaybackLayout;

/* compiled from: PG */
/* renamed from: amv */
public final class amv extends zk implements OnMenuItemClickListener, OnClickListener, OnCreateContextMenuListener {
    public ImageView A;
    public long B;
    public long[] C;
    public String D;
    public String E;
    public String F;
    public int G;
    public String H;
    public String I;
    public int J;
    public Integer K;
    public String L;
    public CharSequence M;
    public CharSequence N;
    public aws O;
    public boolean P;
    public boolean Q;
    public int R;
    public CharSequence S;
    public boolean T;
    public AsyncTask U;
    private View V;
    private ImageView W;
    private boolean X;
    private final amu Y;
    private final asp Z;
    private View aa;
    private VoicemailPlaybackLayout ab;
    private View ac;
    private View ad;
    private View ae;
    private View af;
    private View ag;
    private View ah;
    private View ai;
    private OnClickListener aj;
    private boolean ak;
    public final QuickContactBadge n;
    public final View o;
    public final anx p;
    public final TextView q;
    public final CardView r;
    final Context s;
    final aob t;
    final amy u;
    final int v;
    public View w;
    public View x;
    public View y;
    public View z;

    amv(Context context, amy amy, OnClickListener onClickListener, aob aob, amu amu, asp asp, View view, QuickContactBadge quickContactBadge, View view2, anx anx, CardView cardView, TextView textView, ImageView imageView, boolean z) {
        super(view);
        this.s = context;
        this.aj = onClickListener;
        this.t = aob;
        this.Y = amu;
        this.Z = asp;
        this.u = amy;
        this.V = view;
        this.n = quickContactBadge;
        this.o = view2;
        this.p = anx;
        this.r = cardView;
        this.q = textView;
        this.W = imageView;
        this.A = (ImageView) view.findViewById(aq.bL);
        this.X = z;
        this.v = this.s.getResources().getDimensionPixelSize(buf.hl);
        anx.a.setElegantTextHeight(false);
        anx.c.setElegantTextHeight(false);
        quickContactBadge.setOverlay(null);
        if (abw.a()) {
            quickContactBadge.setPrioritizedMimeType("vnd.android.cursor.item/phone_v2");
        }
        imageView.setOnClickListener(this);
        view2.setOnClickListener(this.aj);
        view2.setOnCreateContextMenuListener(this);
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        if (!TextUtils.isEmpty(this.D)) {
            if (this.J == 4) {
                contextMenu.setHeaderTitle(this.s.getResources().getText(cob.du));
            } else {
                contextMenu.setHeaderTitle(buf.a(BidiFormatter.getInstance().unicodeWrap(this.D, TextDirectionHeuristics.LTR)));
            }
            contextMenu.add(0, aq.R, 0, cob.aU).setOnMenuItemClickListener(this);
            if (!(!awy.a(this.D, this.G) || this.t.a(null, this.D) || awy.a(this.D))) {
                contextMenu.add(0, aq.T, 0, cob.aV).setOnMenuItemClickListener(this);
            }
            if (this.J == 4 && this.p.d.length() > 0) {
                contextMenu.add(0, aq.S, 0, cob.bD).setOnMenuItemClickListener(this);
            }
            buf.H(this.s).a(17, (Activity) this.s);
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == aq.R) {
            buf.a(this.s, null, this.D, true);
            return true;
        } else if (itemId == aq.S) {
            buf.a(this.s, null, this.p.d.getText(), true);
            return true;
        } else if (itemId != aq.T) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.DIAL", buf.e(this.D));
            intent.setClass(this.s, DialtactsActivity.class);
            buf.d(this.s, intent);
            return true;
        }
    }

    public final void b(boolean z) {
        TextView textView;
        String str;
        if (this.J == 4) {
            textView = this.p.d;
            if (!z || TextUtils.isEmpty(textView.getText())) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        if (z) {
            boolean z2;
            int i;
            ViewStub viewStub = (ViewStub) this.V.findViewById(aq.y);
            if (viewStub != null) {
                this.aa = viewStub.inflate();
                this.ab = (VoicemailPlaybackLayout) this.aa.findViewById(aq.bJ);
                if (this.X) {
                    this.ab.l();
                }
                this.ac = this.aa.findViewById(aq.o);
                this.ac.setOnClickListener(this);
                this.w = this.aa.findViewById(aq.bF);
                this.w.setOnClickListener(this);
                this.x = this.aa.findViewById(aq.U);
                this.x.setOnClickListener(this);
                this.y = this.aa.findViewById(aq.d);
                this.y.setOnClickListener(this);
                this.ad = this.aa.findViewById(aq.bp);
                this.ad.setOnClickListener(this);
                this.ae = this.aa.findViewById(aq.h);
                this.ae.setOnClickListener(this);
                this.af = this.aa.findViewById(aq.f);
                this.af.setOnClickListener(this);
                this.ag = this.aa.findViewById(aq.bE);
                this.ag.setOnClickListener(this);
                this.ah = this.aa.findViewById(aq.bf);
                this.ah.setOnClickListener(this);
                this.z = this.aa.findViewById(aq.aa);
                this.z.setOnClickListener(this);
                this.ai = this.aa.findViewById(aq.G);
                this.ai.setOnClickListener(this);
            }
            boolean a = awy.a(this.D, this.G);
            if (TextUtils.isEmpty(this.L) || !a) {
                this.ac.setVisibility(8);
            } else {
                this.ac.setTag(ann.a(this.D));
                ((TextView) this.ac.findViewById(aq.p)).setText(TextUtils.expandTemplate(this.s.getString(cob.bk), new CharSequence[]{this.M}));
                textView = (TextView) this.ac.findViewById(aq.E);
                if (this.J != 4 || TextUtils.isEmpty(this.N)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(this.N);
                    textView.setVisibility(0);
                }
                this.ac.setVisibility(0);
            }
            aob aob = this.t;
            if (!aob.b) {
                aob.c = buf.e(aob.a);
                aob.b = true;
            }
            if (aob.c && a && this.p.b.a) {
                this.w.setTag(ann.b(this.D));
                this.w.setVisibility(0);
            } else {
                this.w.setVisibility(8);
            }
            if (this.J != 4 || this.Z == null || TextUtils.isEmpty(this.L)) {
                this.ab.setVisibility(8);
            } else {
                this.ab.setVisibility(0);
                Uri parse = Uri.parse(this.L);
                asp asp = this.Z;
                asy asy = this.ab;
                boolean z3 = this.ak;
                asp.i = asy;
                asp.i.a(asp, parse);
                if (asp.g != null && asp.l && parse.equals(asp.f)) {
                    asp.j = asp.g.getCurrentPosition();
                    asp.onPrepared(asp.g);
                } else {
                    if (parse.equals(asp.f)) {
                        asp.i.a(asp.m);
                    } else {
                        asp.f = parse;
                        asp.j = 0;
                        asp.a(false);
                        asp.o.a(false);
                    }
                    asp.a(new asq(asp, z3));
                    if (z3) {
                        asp.k = z3;
                    }
                }
                this.ak = false;
                if (!this.X) {
                    Context context = this.s;
                    if (ame.b == null) {
                        ame.b = avn.b();
                    }
                    avm avm = ame.b;
                    amn amn = amn.MARK_VOICEMAIL_READ;
                    avm.a(new amh(context, parse), new Void[0]);
                }
            }
            if (this.J == 4) {
                this.z.setVisibility(8);
            } else {
                this.z.setVisibility(0);
                this.z.setTag(ann.a(this.B, this.C, null));
            }
            if (this.K != null || (this.P && this.Q)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || this.O == null || !buf.c(this.O.b)) {
                this.x.setVisibility(8);
                this.y.setVisibility(8);
            } else {
                this.x.setTag(ann.a(this.O.b, this.O.d, this.O.h, this.O.f, true));
                this.x.setVisibility(0);
                this.y.setTag(ann.a(this.O.b, this.O.d, this.O.h, this.O.f, false));
                this.y.setVisibility(0);
            }
            if (!a || z2) {
                this.ad.setVisibility(8);
            } else {
                this.ad.setTag(ann.c(this.D));
                this.ad.setVisibility(0);
            }
            amu amu = this.Y;
            if (this.M == null) {
                Log.e("CallLogListItemHelper", "setActionContentDescriptions; name or number is null.");
            }
            str = this.M == null ? "" : this.M;
            this.w.setContentDescription(TextUtils.expandTemplate(amu.b.getString(cob.bU), new CharSequence[]{str}));
            this.x.setContentDescription(TextUtils.expandTemplate(amu.b.getString(cob.bH), new CharSequence[]{str}));
            this.y.setContentDescription(TextUtils.expandTemplate(amu.b.getString(cob.bE), new CharSequence[]{str}));
            this.z.setContentDescription(TextUtils.expandTemplate(amu.b.getString(cob.bI), new CharSequence[]{str}));
            z2 = this.t.c(null);
            a = this.t.a(null, this.D);
            View view = this.ai;
            if (!z2 || a) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            this.ae.setVisibility(8);
            this.af.setVisibility(8);
            this.ag.setVisibility(8);
            this.ah.setVisibility(8);
            str = PhoneNumberUtils.formatNumberToE164(this.D, this.I);
            if (!a && buf.b(this.s, str, this.D) && buf.A(this.s)) {
                if (this.K != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.ag.setVisibility(0);
                } else if (!this.P) {
                    this.af.setVisibility(0);
                } else if (this.Q) {
                    this.af.setVisibility(0);
                    this.ah.setVisibility(0);
                } else {
                    this.ae.setVisibility(0);
                }
            }
            this.aa.setVisibility(0);
            this.aa.setAlpha(1.0f);
        } else if (this.aa != null) {
            this.aa.setVisibility(8);
        }
        if (this.M == null) {
            buf.b("updatePrimaryActionButton, name or number is null", new Object[0]);
        }
        str = this.M == null ? "" : this.M;
        if (TextUtils.isEmpty(this.L)) {
            if (awy.a(this.D, this.G)) {
                if (this.t.a(null, this.D)) {
                    this.W.setTag(ann.a());
                } else {
                    ImageView imageView = this.W;
                    String valueOf = String.valueOf(this.D);
                    String valueOf2 = String.valueOf(this.E);
                    imageView.setTag(ann.a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                }
                this.W.setContentDescription(TextUtils.expandTemplate(this.s.getString(cob.bF), new CharSequence[]{str}));
                this.W.setImageResource(cob.ap);
                this.W.setVisibility(0);
                return;
            }
            this.W.setTag(null);
            this.W.setVisibility(8);
        } else if (z) {
            this.W.setVisibility(8);
        } else {
            this.W.setImageResource(cob.aF);
            this.W.setContentDescription(TextUtils.expandTemplate(this.s.getString(cob.bV), new CharSequence[]{str}));
            this.W.setVisibility(0);
        }
    }

    public final void onClick(View view) {
        if (view.getId() == aq.aX && !TextUtils.isEmpty(this.L)) {
            this.ak = true;
            this.aj.onClick(this.o);
        } else if (view.getId() == aq.G) {
            String str;
            Activity activity = (Activity) this.s;
            long j = this.O.k;
            Uri uri = this.O.l;
            Uri uri2 = this.O.b;
            String str2 = (String) this.M;
            String str3 = this.D;
            if (TextUtils.isEmpty(this.O.d)) {
                str = null;
            } else {
                str = this.F;
            }
            CallSubjectDialog.a(activity, j, uri, uri2, str2, false, str3, str, this.H, null);
        } else if (view.getId() == aq.h) {
            buf.H(this.s).a(1004);
            a(new amw(this));
        } else if (view.getId() == aq.f) {
            buf.H(this.s).a(1005);
            a(new amx(this));
        } else if (view.getId() == aq.bE) {
            buf.H(this.s).a(1006);
            this.u.a(this.F, this.D, this.I, this.K, this.Q, this.J);
        } else if (view.getId() == aq.bf) {
            buf.H(this.s).a(1007);
            this.u.c(this.F, this.D, this.I, this.J);
        } else {
            ann ann = (ann) view.getTag();
            if (ann != null) {
                Intent a = ann.a(this.s);
                if (a != null) {
                    buf.d(this.s, a);
                }
            }
        }
    }

    private final void a(auo auo) {
        if (!buf.a(this.s, ((Activity) this.s).getFragmentManager(), auo)) {
            auo.a();
        }
    }
}
