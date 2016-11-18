package p000;

import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.views.GroupLinkSharingStatusMessageListItemView;
import com.google.android.apps.hangouts.views.HangoutEventMessageListItemView;
import com.google.android.apps.hangouts.views.MessageListAnimationManager;
import com.google.android.apps.hangouts.views.MessageListItemView;
import com.google.android.apps.hangouts.views.MessageListItemWrapperView;
import com.google.android.apps.hangouts.views.OtrModificationMessageListItemView;
import com.google.android.apps.hangouts.views.SystemMessageListItemView;
import java.util.concurrent.TimeUnit;

public final class bns extends enk {
    public static final boolean f4058j = false;
    public static long f4059l = TimeUnit.MINUTES.toMicros(15);
    public final daq f4060k;
    private final gpl f4061m;
    private final MessageListAnimationManager f4062n;
    private bnv f4063o;
    private int f4064p;
    private boolean f4065q;
    private boolean f4066r;
    private long f4067s = Long.MAX_VALUE;
    private final gpx f4068t = new bnw();

    static {
        kae kae = glk.f15557d;
    }

    public bns(daq daq, AbsListView absListView, MessageListAnimationManager messageListAnimationManager, int i, boolean z) {
        super(daq.getActivity(), null);
        if (f4059l == -1) {
            f4059l = gwb.m1519a(gwb.m1400H(), "babel_message_block_max_time_diff_ms", 180000);
        }
        this.f4060k = daq;
        this.f4064p = i;
        this.f4061m = new gpl(z);
        this.f4062n = messageListAnimationManager;
        this.f4062n.m9435a(this.f4061m);
        absListView.setRecyclerListener(new bnt(this));
    }

    public void m6245a(boolean z) {
        this.f4066r = z;
    }

    public void m6244a(bnv bnv) {
        this.f4063o = bnv;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.c.moveToPosition(i)) {
            int i2;
            long j = this.c.getLong(6);
            if (this.f4067s > j) {
                this.f4067s = j;
            }
            LayoutInflater layoutInflater = (LayoutInflater) this.d.getSystemService("layout_inflater");
            fwy fwy = fwy.values()[this.c.getInt(8)];
            if (view != null) {
                view = (MessageListItemWrapperView) view;
            } else {
                View view2 = (MessageListItemWrapperView) layoutInflater.inflate(gwb.hf, null);
                view2.m9519a(this.f4062n);
                view2.m9521a(this.f4068t);
                view = view2;
            }
            view.m9525b(this.f4066r);
            if ((this.c.getLong(19) != 0 ? 1 : null) != null) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            view.m9517a(i2);
            long itemId = getItemId(i);
            Long d = this.f4061m.m18277d();
            boolean c = this.f4061m.m18276c(itemId);
            if (d != null && itemId == gwb.m1523a(d)) {
                i2 = 1;
            } else if (this.f4061m.m18274b(itemId)) {
                i2 = 0;
            } else if (!c) {
                i2 = 4;
            } else if (d != null) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            view.m9524b(i2);
            dyg c2 = view.m9526c();
            dyg dyg;
            if (fwy == fwy.INCOMING_USER_MESSAGE || fwy == fwy.OUTGOING_USER_MESSAGE) {
                MessageListItemView messageListItemView;
                if (c2 != null) {
                    messageListItemView = (MessageListItemView) c2.mo1257b();
                } else {
                    int i3;
                    fwy fwy2 = fwy.values()[getItemViewType(i)];
                    if (fwy2 == fwy.OUTGOING_USER_MESSAGE) {
                        i3 = gwb.he;
                    } else if (fwy2 == fwy.INCOMING_USER_MESSAGE) {
                        i3 = gwb.hd;
                    } else {
                        iil.m21870a("unexpected position: " + i);
                        i3 = -1;
                    }
                    dyg = (MessageListItemView) layoutInflater.inflate(i3, null);
                    dyg.m9474a(this.f4060k);
                    dyg.m9472a(this.f4060k);
                    view.m9520a(dyg);
                    if (this.f4063o != null) {
                        this.f4063o.m6250a(dyg);
                    }
                }
                if (fwy == fwy.OUTGOING_USER_MESSAGE) {
                    messageListItemView.m9475a(this.f4060k.mo495a().m5647p());
                }
                m6237a(view, messageListItemView, i2);
                messageListItemView.requestLayout();
            } else if (fwy == fwy.HANGOUT_START_EVENT || fwy == fwy.HANGOUT_STOP_EVENT) {
                HangoutEventMessageListItemView hangoutEventMessageListItemView;
                if (c2 != null) {
                    hangoutEventMessageListItemView = (HangoutEventMessageListItemView) c2.mo1257b();
                } else {
                    dyg = (HangoutEventMessageListItemView) layoutInflater.inflate(gwb.gy, null);
                    view.m9520a(dyg);
                }
                m6236a(hangoutEventMessageListItemView);
            } else if (fwy == fwy.OFF_THE_RECORD || fwy == fwy.ON_THE_RECORD) {
                OtrModificationMessageListItemView otrModificationMessageListItemView;
                if (c2 != null) {
                    otrModificationMessageListItemView = (OtrModificationMessageListItemView) c2.mo1257b();
                } else {
                    dyg = (OtrModificationMessageListItemView) layoutInflater.inflate(gwb.hj, null);
                    view.m9520a(dyg);
                }
                m6238a(otrModificationMessageListItemView);
            } else if (fwy == fwy.LINK_SHARING_STATUS_OFF || fwy == fwy.LINK_SHARING_STATUS_ON || fwy == fwy.LINK_SHARING_STATUS_UNKNOWN) {
                GroupLinkSharingStatusMessageListItemView groupLinkSharingStatusMessageListItemView;
                if (c2 != null) {
                    groupLinkSharingStatusMessageListItemView = (GroupLinkSharingStatusMessageListItemView) c2.mo1257b();
                } else {
                    dyg = (GroupLinkSharingStatusMessageListItemView) layoutInflater.inflate(gwb.gv, null);
                    view.m9520a(dyg);
                }
                m6235a(groupLinkSharingStatusMessageListItemView);
            } else if (fwy == fwy.LOCATION_REQUEST_RECEIVER || fwy == fwy.LOCATION_REQUEST_SENDER) {
                dur dur;
                if (c2 != null) {
                    dur = (dur) c2.mo1257b();
                } else {
                    dyg = ((dut) jyn.m25426a(this.d, dut.class)).mo1684a(this.d);
                    view.m9520a(dyg);
                }
                if (dur != null) {
                    m6240a(dur, fwy.equals(fwy.LOCATION_REQUEST_SENDER));
                }
            } else {
                SystemMessageListItemView systemMessageListItemView;
                if (c2 != null) {
                    systemMessageListItemView = (SystemMessageListItemView) c2.mo1257b();
                } else {
                    dyg = (SystemMessageListItemView) layoutInflater.inflate(gwb.hy, null);
                    view.m9520a(dyg);
                }
                m6239a(systemMessageListItemView);
            }
            view.m9518a(this.c, this.f4060k, this.f4064p, ((bor) jyn.m25426a(this.d, bor.class)).m6320a(this.f4060k.ae()));
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    private void m6237a(MessageListItemWrapperView messageListItemWrapperView, MessageListItemView messageListItemView, int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        messageListItemView.m9470a(this.c, this.f4064p, this.f4060k.mo495a(), this.f4060k, this.f4065q);
        messageListItemView.setSelected(this.f4060k.mo842a(this.c.getLong(0)));
        boolean a = m6241a(this.f4064p != 1, true);
        if (m6241a(true, false)) {
            z = false;
        } else {
            z = true;
        }
        messageListItemWrapperView.m9528d(z);
        if (this.c.isFirst() || !this.c.moveToPrevious()) {
            z2 = false;
        } else {
            z = m6241a(true, false);
            this.c.moveToNext();
            z2 = z;
        }
        switch (i) {
            case 3:
                messageListItemView.m9479b(false);
                if (!a) {
                    z = a;
                    break;
                }
                messageListItemView.m9501w();
                z = a;
                break;
            case 4:
                messageListItemView.m9479b(a);
                z = a;
                break;
            default:
                messageListItemView.m9479b(false);
                z = false;
                break;
        }
        messageListItemView.m9477a(z);
        if (z2) {
            z3 = false;
        }
        messageListItemView.m9480c(z3);
    }

    private boolean m6241a(boolean z, boolean z2) {
        boolean z3 = false;
        long j = this.c.getLong(6);
        String string = this.c.getString(4);
        String string2 = this.c.getString(3);
        fwy fwy = fwy.values()[this.c.getInt(8)];
        fwx fwx = fwx.values()[this.c.getInt(7)];
        int i = this.c.getInt(36);
        if (!this.c.isLast() && this.c.moveToNext()) {
            long j2 = this.c.getLong(6);
            String string3 = this.c.getString(4);
            String string4 = this.c.getString(3);
            fwy fwy2 = fwy.values()[this.c.getInt(8)];
            fwx fwx2 = fwx.values()[this.c.getInt(7)];
            int i2 = this.c.getInt(36);
            if ((!z2 || j2 - j < f4059l) && i2 == i && ((!z || (fwy == fwy2 && edo.m13605a(string2, string, string4, string3))) && fwx == fwx.ON_SERVER && fwx2 != fwx.FAILED_TO_SEND && fwx2 != fwx.QUEUED)) {
                z3 = true;
            }
            this.c.moveToPrevious();
        }
        return z3;
    }

    private void m6239a(SystemMessageListItemView systemMessageListItemView) {
        int i;
        long j = this.c.getLong(6) / 1000;
        fwy fwy = fwy.values()[this.c.getInt(8)];
        fwx fwx = fwx.values()[this.c.getInt(7)];
        boolean z = fwy == fwy.ERROR || fwy == fwy.ERROR_FORCE_OTR_CONFLICT || fwy == fwy.ERROR_FORK || fwx == fwx.FAILED_TO_SEND;
        systemMessageListItemView.m9614a(z);
        systemMessageListItemView.m9613a(gwb.m1661a(fwy, this.f4060k.mo495a(), fwx, this.c.getString(4), this.c.getString(3), this.c.getString(34), this.c.getString(35), this.c.getInt(38), false));
        systemMessageListItemView.m9612a(j);
        switch (bnu.f4070a[fwy.ordinal()]) {
            case 1:
                i = R$drawable.cg;
                break;
            case 2:
            case 3:
                i = R$drawable.bV;
                break;
            case 4:
                i = R$drawable.cd;
                break;
            case 5:
                i = R$drawable.bQ;
                break;
            default:
                i = R$drawable.bU;
                break;
        }
        systemMessageListItemView.m9611a(i);
        systemMessageListItemView.m9617c();
    }

    private void m6236a(HangoutEventMessageListItemView hangoutEventMessageListItemView) {
        long j = this.c.getLong(6) / 1000;
        fwy fwy = fwy.values()[this.c.getInt(8)];
        fwx fwx = fwx.values()[this.c.getInt(7)];
        String string = this.c.getString(35);
        int i = this.c.getInt(38);
        HangoutEventMessageListItemView hangoutEventMessageListItemView2 = hangoutEventMessageListItemView;
        long j2 = j;
        hangoutEventMessageListItemView2.m9408a(gwb.m1661a(fwy, this.f4060k.mo495a(), fwx, this.c.getString(4), this.c.getString(3), this.c.getString(34), string, i, false), j2, this.f4060k.mo495a(), gwb.m1696a(this.f4060k.mo495a(), string, false), i);
        hangoutEventMessageListItemView.m9410c();
    }

    private void m6238a(OtrModificationMessageListItemView otrModificationMessageListItemView) {
        int i;
        long j = this.c.getLong(6) / 1000;
        fwy fwy = fwy.values()[this.c.getInt(8)];
        fwx fwx = fwx.values()[this.c.getInt(7)];
        if (fwy == fwy.OFF_THE_RECORD) {
            i = 1;
        } else {
            i = 2;
        }
        edo edo = new edo(this.c.getString(4), this.c.getString(3));
        boolean b = this.f4060k.mo853b(edo);
        otrModificationMessageListItemView.m9538a(i, fwx, this.f4060k.mo862e(edo), b);
        if (i == 2) {
            otrModificationMessageListItemView.m9539a(j);
            if (!b) {
                this.f4060k.mo855c(j);
            }
        }
        otrModificationMessageListItemView.m9541c();
    }

    private void m6235a(GroupLinkSharingStatusMessageListItemView groupLinkSharingStatusMessageListItemView) {
        int i;
        long j = this.c.getLong(6) / 1000;
        fwy fwy = fwy.values()[this.c.getInt(8)];
        fwx fwx = fwx.values()[this.c.getInt(7)];
        if (fwy == fwy.LINK_SHARING_STATUS_OFF) {
            i = 2;
        } else {
            i = 1;
        }
        edo edo = new edo(this.c.getString(4), this.c.getString(3));
        groupLinkSharingStatusMessageListItemView.m9402a(i, fwx, this.f4060k.mo862e(edo), this.f4060k.mo853b(edo));
        if (i == 1) {
            groupLinkSharingStatusMessageListItemView.m9403a(j);
        }
        groupLinkSharingStatusMessageListItemView.m9405c();
    }

    private void m6240a(dur dur, boolean z) {
        long j = this.c.getLong(6) / 1000;
        String string = this.c.getString(1);
        String string2 = this.c.getString(2);
        String string3 = this.c.getString(5);
        dur.mo1681a(j);
        dur.mo1682a(new dus(this, z, string3, string2, string));
    }

    public void mo618c() {
        m6242e();
    }

    public Cursor m6246b(Cursor cursor) {
        this.f4061m.m18270a(cursor);
        return super.b(cursor);
    }

    private void m6242e() {
        bko a = this.f4060k.mo495a();
        CharSequence ae = this.f4060k.ae();
        if (this.f4067s != Long.MAX_VALUE && a != null && !TextUtils.isEmpty(ae)) {
            RealTimeChatService.m9090c(this.f4060k.mo495a(), this.f4060k.ae(), this.f4067s);
            this.f4067s = Long.MAX_VALUE;
        }
    }

    public void n_() {
        this.f4061m.m18273b();
    }

    public int getItemViewType(int i) {
        this.c.moveToPosition(i);
        return this.c.getInt(8);
    }

    public int getViewTypeCount() {
        return fwy.values().length;
    }

    public void m6247b(boolean z) {
        this.f4061m.m18272a(z);
    }

    public void m6249c(boolean z) {
        this.f4065q = z;
    }

    public void m6243a(long j) {
        this.f4061m.m18269a(j);
    }
}
