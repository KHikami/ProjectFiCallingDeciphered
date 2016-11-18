package defpackage;

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
    public static final boolean j = false;
    public static long l = TimeUnit.MINUTES.toMicros(15);
    public final daq k;
    private final gpl m;
    private final MessageListAnimationManager n;
    private bnv o;
    private int p;
    private boolean q;
    private boolean r;
    private long s = Long.MAX_VALUE;
    private final gpx t = new bnw();

    static {
        kae kae = glk.d;
    }

    public bns(daq daq, AbsListView absListView, MessageListAnimationManager messageListAnimationManager, int i, boolean z) {
        super(daq.getActivity(), null);
        if (l == -1) {
            l = gwb.a(gwb.H(), "babel_message_block_max_time_diff_ms", 180000);
        }
        this.k = daq;
        this.p = i;
        this.m = new gpl(z);
        this.n = messageListAnimationManager;
        this.n.a(this.m);
        absListView.setRecyclerListener(new bnt(this));
    }

    public void a(boolean z) {
        this.r = z;
    }

    public void a(bnv bnv) {
        this.o = bnv;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.c.moveToPosition(i)) {
            int i2;
            long j = this.c.getLong(6);
            if (this.s > j) {
                this.s = j;
            }
            LayoutInflater layoutInflater = (LayoutInflater) this.d.getSystemService("layout_inflater");
            fwy fwy = fwy.values()[this.c.getInt(8)];
            if (view != null) {
                view = (MessageListItemWrapperView) view;
            } else {
                View view2 = (MessageListItemWrapperView) layoutInflater.inflate(gwb.hf, null);
                view2.a(this.n);
                view2.a(this.t);
                view = view2;
            }
            view.b(this.r);
            if ((this.c.getLong(19) != 0 ? 1 : null) != null) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            view.a(i2);
            long itemId = getItemId(i);
            Long d = this.m.d();
            boolean c = this.m.c(itemId);
            if (d != null && itemId == gwb.a(d)) {
                i2 = 1;
            } else if (this.m.b(itemId)) {
                i2 = 0;
            } else if (!c) {
                i2 = 4;
            } else if (d != null) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            view.b(i2);
            dyg c2 = view.c();
            dyg dyg;
            if (fwy == fwy.INCOMING_USER_MESSAGE || fwy == fwy.OUTGOING_USER_MESSAGE) {
                MessageListItemView messageListItemView;
                if (c2 != null) {
                    messageListItemView = (MessageListItemView) c2.b();
                } else {
                    int i3;
                    fwy fwy2 = fwy.values()[getItemViewType(i)];
                    if (fwy2 == fwy.OUTGOING_USER_MESSAGE) {
                        i3 = gwb.he;
                    } else if (fwy2 == fwy.INCOMING_USER_MESSAGE) {
                        i3 = gwb.hd;
                    } else {
                        iil.a("unexpected position: " + i);
                        i3 = -1;
                    }
                    dyg = (MessageListItemView) layoutInflater.inflate(i3, null);
                    dyg.a(this.k);
                    dyg.a(this.k);
                    view.a(dyg);
                    if (this.o != null) {
                        this.o.a(dyg);
                    }
                }
                if (fwy == fwy.OUTGOING_USER_MESSAGE) {
                    messageListItemView.a(this.k.a().p());
                }
                a(view, messageListItemView, i2);
                messageListItemView.requestLayout();
            } else if (fwy == fwy.HANGOUT_START_EVENT || fwy == fwy.HANGOUT_STOP_EVENT) {
                HangoutEventMessageListItemView hangoutEventMessageListItemView;
                if (c2 != null) {
                    hangoutEventMessageListItemView = (HangoutEventMessageListItemView) c2.b();
                } else {
                    dyg = (HangoutEventMessageListItemView) layoutInflater.inflate(gwb.gy, null);
                    view.a(dyg);
                }
                a(hangoutEventMessageListItemView);
            } else if (fwy == fwy.OFF_THE_RECORD || fwy == fwy.ON_THE_RECORD) {
                OtrModificationMessageListItemView otrModificationMessageListItemView;
                if (c2 != null) {
                    otrModificationMessageListItemView = (OtrModificationMessageListItemView) c2.b();
                } else {
                    dyg = (OtrModificationMessageListItemView) layoutInflater.inflate(gwb.hj, null);
                    view.a(dyg);
                }
                a(otrModificationMessageListItemView);
            } else if (fwy == fwy.LINK_SHARING_STATUS_OFF || fwy == fwy.LINK_SHARING_STATUS_ON || fwy == fwy.LINK_SHARING_STATUS_UNKNOWN) {
                GroupLinkSharingStatusMessageListItemView groupLinkSharingStatusMessageListItemView;
                if (c2 != null) {
                    groupLinkSharingStatusMessageListItemView = (GroupLinkSharingStatusMessageListItemView) c2.b();
                } else {
                    dyg = (GroupLinkSharingStatusMessageListItemView) layoutInflater.inflate(gwb.gv, null);
                    view.a(dyg);
                }
                a(groupLinkSharingStatusMessageListItemView);
            } else if (fwy == fwy.LOCATION_REQUEST_RECEIVER || fwy == fwy.LOCATION_REQUEST_SENDER) {
                dur dur;
                if (c2 != null) {
                    dur = (dur) c2.b();
                } else {
                    dyg = ((dut) jyn.a(this.d, dut.class)).a(this.d);
                    view.a(dyg);
                }
                if (dur != null) {
                    a(dur, fwy.equals(fwy.LOCATION_REQUEST_SENDER));
                }
            } else {
                SystemMessageListItemView systemMessageListItemView;
                if (c2 != null) {
                    systemMessageListItemView = (SystemMessageListItemView) c2.b();
                } else {
                    dyg = (SystemMessageListItemView) layoutInflater.inflate(gwb.hy, null);
                    view.a(dyg);
                }
                a(systemMessageListItemView);
            }
            view.a(this.c, this.k, this.p, ((bor) jyn.a(this.d, bor.class)).a(this.k.ae()));
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    private void a(MessageListItemWrapperView messageListItemWrapperView, MessageListItemView messageListItemView, int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        messageListItemView.a(this.c, this.p, this.k.a(), this.k, this.q);
        messageListItemView.setSelected(this.k.a(this.c.getLong(0)));
        boolean a = a(this.p != 1, true);
        if (a(true, false)) {
            z = false;
        } else {
            z = true;
        }
        messageListItemWrapperView.d(z);
        if (this.c.isFirst() || !this.c.moveToPrevious()) {
            z2 = false;
        } else {
            z = a(true, false);
            this.c.moveToNext();
            z2 = z;
        }
        switch (i) {
            case 3:
                messageListItemView.b(false);
                if (!a) {
                    z = a;
                    break;
                }
                messageListItemView.w();
                z = a;
                break;
            case 4:
                messageListItemView.b(a);
                z = a;
                break;
            default:
                messageListItemView.b(false);
                z = false;
                break;
        }
        messageListItemView.a(z);
        if (z2) {
            z3 = false;
        }
        messageListItemView.c(z3);
    }

    private boolean a(boolean z, boolean z2) {
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
            if ((!z2 || j2 - j < l) && i2 == i && ((!z || (fwy == fwy2 && edo.a(string2, string, string4, string3))) && fwx == fwx.ON_SERVER && fwx2 != fwx.FAILED_TO_SEND && fwx2 != fwx.QUEUED)) {
                z3 = true;
            }
            this.c.moveToPrevious();
        }
        return z3;
    }

    private void a(SystemMessageListItemView systemMessageListItemView) {
        int i;
        long j = this.c.getLong(6) / 1000;
        fwy fwy = fwy.values()[this.c.getInt(8)];
        fwx fwx = fwx.values()[this.c.getInt(7)];
        boolean z = fwy == fwy.ERROR || fwy == fwy.ERROR_FORCE_OTR_CONFLICT || fwy == fwy.ERROR_FORK || fwx == fwx.FAILED_TO_SEND;
        systemMessageListItemView.a(z);
        systemMessageListItemView.a(gwb.a(fwy, this.k.a(), fwx, this.c.getString(4), this.c.getString(3), this.c.getString(34), this.c.getString(35), this.c.getInt(38), false));
        systemMessageListItemView.a(j);
        switch (bnu.a[fwy.ordinal()]) {
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
        systemMessageListItemView.a(i);
        systemMessageListItemView.c();
    }

    private void a(HangoutEventMessageListItemView hangoutEventMessageListItemView) {
        long j = this.c.getLong(6) / 1000;
        fwy fwy = fwy.values()[this.c.getInt(8)];
        fwx fwx = fwx.values()[this.c.getInt(7)];
        String string = this.c.getString(35);
        int i = this.c.getInt(38);
        HangoutEventMessageListItemView hangoutEventMessageListItemView2 = hangoutEventMessageListItemView;
        long j2 = j;
        hangoutEventMessageListItemView2.a(gwb.a(fwy, this.k.a(), fwx, this.c.getString(4), this.c.getString(3), this.c.getString(34), string, i, false), j2, this.k.a(), gwb.a(this.k.a(), string, false), i);
        hangoutEventMessageListItemView.c();
    }

    private void a(OtrModificationMessageListItemView otrModificationMessageListItemView) {
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
        boolean b = this.k.b(edo);
        otrModificationMessageListItemView.a(i, fwx, this.k.e(edo), b);
        if (i == 2) {
            otrModificationMessageListItemView.a(j);
            if (!b) {
                this.k.c(j);
            }
        }
        otrModificationMessageListItemView.c();
    }

    private void a(GroupLinkSharingStatusMessageListItemView groupLinkSharingStatusMessageListItemView) {
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
        groupLinkSharingStatusMessageListItemView.a(i, fwx, this.k.e(edo), this.k.b(edo));
        if (i == 1) {
            groupLinkSharingStatusMessageListItemView.a(j);
        }
        groupLinkSharingStatusMessageListItemView.c();
    }

    private void a(dur dur, boolean z) {
        long j = this.c.getLong(6) / 1000;
        String string = this.c.getString(1);
        String string2 = this.c.getString(2);
        String string3 = this.c.getString(5);
        dur.a(j);
        dur.a(new dus(this, z, string3, string2, string));
    }

    public void c() {
        e();
    }

    public Cursor b(Cursor cursor) {
        this.m.a(cursor);
        return super.b(cursor);
    }

    private void e() {
        bko a = this.k.a();
        CharSequence ae = this.k.ae();
        if (this.s != Long.MAX_VALUE && a != null && !TextUtils.isEmpty(ae)) {
            RealTimeChatService.c(this.k.a(), this.k.ae(), this.s);
            this.s = Long.MAX_VALUE;
        }
    }

    public void n_() {
        this.m.b();
    }

    public int getItemViewType(int i) {
        this.c.moveToPosition(i);
        return this.c.getInt(8);
    }

    public int getViewTypeCount() {
        return fwy.values().length;
    }

    public void b(boolean z) {
        this.m.a(z);
    }

    public void c(boolean z) {
        this.q = z;
    }

    public void a(long j) {
        this.m.a(j);
    }
}
