package p000;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.fragments.ConversationListFragment.InviteListItem;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.views.ConversationListItemView;
import com.google.android.apps.hangouts.views.ConversationListItemWrapper;

public final class dbh extends enk {
    final /* synthetic */ ConversationListFragment f9464j;
    private final Context f9465k;
    private final bko f9466l;
    private final ConversationListFragment f9467m;
    private long f9468n = Long.MAX_VALUE;
    private long f9469o = 0;
    private long f9470p = 0;

    public dbh(ConversationListFragment conversationListFragment, Context context, Cursor cursor, bko bko, ConversationListFragment conversationListFragment2) {
        this.f9464j = conversationListFragment;
        super(context, null);
        this.f9465k = context;
        this.f9466l = bko;
        this.f9467m = conversationListFragment2;
    }

    public View mo803a(Context context, Cursor cursor, ViewGroup viewGroup) {
        int i;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        int itemViewType = getItemViewType(cursor.getPosition());
        switch (itemViewType) {
            case 0:
                i = gwb.ga;
                break;
            case 1:
                i = gwb.gV;
                break;
            case 2:
                i = gwb.gW;
                break;
            default:
                return null;
        }
        if (ConversationListFragment.f6255a) {
            Object obj;
            switch (itemViewType) {
                case 0:
                    obj = "VIEW_TYPE_CONVERSATION";
                    break;
                case 1:
                    obj = "VIEW_TYPE_INVITATION";
                    break;
                case 2:
                    obj = "VIEW_TYPE_INVITATION_SET";
                    break;
                default:
                    obj = "UNKNOWN viewType: " + itemViewType;
                    break;
            }
            String valueOf = String.valueOf(obj);
            if (i == gwb.ga) {
                obj = "conversation_list_item_view";
            } else if (i == gwb.gV) {
                obj = "invite_list_item_view";
            } else if (i == gwb.gW) {
                obj = "invite_set_list_item_view";
            } else {
                obj = "UNKNOWN viewId: " + i;
            }
            String valueOf2 = String.valueOf(obj);
            new StringBuilder((String.valueOf(valueOf).length() + 23) + String.valueOf(valueOf2).length()).append("newView viewType: ").append(valueOf).append(" id: ").append(valueOf2);
        }
        View inflate = layoutInflater.inflate(i, null, false);
        if (inflate instanceof ConversationListItemView) {
            ((ConversationListItemView) inflate).m9273a(this.f9467m.f6261g);
        }
        ConversationListItemWrapper conversationListItemWrapper = (ConversationListItemWrapper) layoutInflater.inflate(gwb.gb, viewGroup, false);
        conversationListItemWrapper.m9368a(inflate);
        if (VERSION.SDK_INT < 21) {
            return conversationListItemWrapper;
        }
        oa.a(conversationListItemWrapper, new gnn(this.f9467m, conversationListItemWrapper));
        return conversationListItemWrapper;
    }

    public int getViewTypeCount() {
        return 3;
    }

    public int getItemViewType(int i) {
        Cursor a = a();
        a.moveToPosition(i);
        if (ConversationListFragment.f6255a) {
            new StringBuilder(48).append("getItemViewType position ").append(i).append(" ").append(a.getInt(14));
        }
        if (a.getInt(14) == 2) {
            return 0;
        }
        if (a.getInt(21) <= 1) {
            return 1;
        }
        return 2;
    }

    private void m11416b(View view, Cursor cursor) {
        long k = gwb.m2274k(this.f9465k, this.f9466l.m5638g());
        View b = ConversationListFragment.m8486b(view);
        String string = cursor.getString(23);
        String string2 = cursor.getString(19);
        if (string2 != null && string != null) {
            String[] split = string.split("\\|");
            String[] split2 = string2.split("\\|");
            StringBuilder stringBuilder = new StringBuilder();
            int i = Integer.MAX_VALUE;
            int length = split.length - 1;
            while (length >= 0) {
                int i2;
                Object obj = split[length];
                long parseLong = Long.parseLong(length < split2.length ? split2[length] : "0");
                if (i != Integer.MAX_VALUE || k < parseLong) {
                    i2 = i;
                } else {
                    i2 = stringBuilder.length();
                }
                if (!TextUtils.isEmpty(obj)) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(obj);
                }
                length--;
                i = i2;
            }
            ((TextView) b.findViewById(ba.cJ)).setText(this.f9465k.getResources().getString(bc.fZ, new Object[]{ConversationListFragment.m8487c(cursor.getInt(21))}));
            CharSequence spannableStringBuilder = new SpannableStringBuilder(stringBuilder.toString());
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, Math.min(i, spannableStringBuilder.length()), 0);
            ((TextView) b.findViewById(ba.cI)).setText(spannableStringBuilder);
            b.setSelected(false);
        }
    }

    public void mo804a(View view, Cursor cursor) {
        ((ConversationListItemWrapper) view).m9373f();
        switch (getItemViewType(cursor.getPosition())) {
            case 0:
                boolean z;
                long nanoTime = System.nanoTime();
                if (cursor.getInt(14) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                iil.m21879b("Expected condition to be false", z);
                ConversationListItemView conversationListItemView = (ConversationListItemView) ConversationListFragment.m8486b(view);
                conversationListItemView.m9269a(cursor, this.f9466l, this.f9467m.f6262h == 3, null);
                long j = cursor.getLong(4);
                if (this.f9468n > j) {
                    this.f9468n = j;
                }
                conversationListItemView.setSelected(false);
                long nanoTime2 = System.nanoTime();
                if (ConversationListFragment.f6255a) {
                    nanoTime2 = (nanoTime2 - nanoTime) / 1000;
                    this.f9469o += nanoTime2;
                    this.f9470p++;
                    glk.m17981d("Babel", "BIND: CURRENT: " + nanoTime2 + " AVERAGE: " + (this.f9469o / this.f9470p) + " (" + this.f9470p + ")", new Object[0]);
                    break;
                }
                break;
            case 1:
                Object obj;
                InviteListItem inviteListItem = (InviteListItem) ConversationListFragment.m8486b(view);
                String c = ConversationListFragment.m8488c(cursor);
                if (cursor.getInt(3) == 2) {
                    obj = 1;
                } else {
                    obj = null;
                }
                TextView textView = (TextView) inviteListItem.findViewById(ba.cN);
                TextView textView2 = (TextView) inviteListItem.findViewById(ba.cK);
                Resources resources = this.f9464j.getResources();
                if (obj != null) {
                    CharSequence quantityString;
                    int length = cursor.getString(7).split(", ").length - 1;
                    CharSequence string = cursor.getString(6);
                    CharSequence string2 = cursor.getString(18);
                    if (TextUtils.isEmpty(string)) {
                        if (TextUtils.isEmpty(string2)) {
                            string2 = resources.getString(bc.fA);
                            quantityString = resources.getQuantityString(gwb.hZ, length + 1, new Object[]{Integer.valueOf(length + 1)});
                        } else if (length == 0) {
                            quantityString = resources.getString(bc.fF);
                        } else {
                            quantityString = resources.getQuantityString(gwb.ib, length, new Object[]{Integer.valueOf(length)});
                        }
                    } else if (TextUtils.isEmpty(string2)) {
                        quantityString = resources.getQuantityString(gwb.hZ, length + 1, new Object[]{Integer.valueOf(length + 1)});
                        string2 = string;
                    } else if (length == 0) {
                        quantityString = resources.getString(bc.fE, new Object[]{string2});
                        string2 = string;
                    } else {
                        quantityString = resources.getQuantityString(gwb.ia, length, new Object[]{Integer.valueOf(length), string2});
                        string2 = string;
                    }
                    textView.setText(string2);
                    textView2.setText(quantityString);
                } else {
                    textView.setText(resources.getString(bc.fB));
                    textView2.setText(cursor.getString(18));
                }
                inviteListItem.m8482a(this.f9466l, c);
                inviteListItem.setSelected(false);
                break;
            case 2:
                m11416b(view, cursor);
                break;
            default:
                glk.m17982e("Babel", "bindView called with cursor at unknown position.", new Object[0]);
                break;
        }
        View e = ((ConversationListItemWrapper) view).m9372e();
        if (e instanceof gmt) {
            gmt gmt = (gmt) e;
            gmt.m9252a(this.f9467m.f6260f);
            gmt.m9253a(ConversationListFragment.m8488c(cursor));
            gmt.m9251a(cursor.getLong(4));
        }
    }

    public void mo1489d() {
        this.f9468n = Long.MAX_VALUE;
    }

    public void mo618c() {
        if (this.f9468n != Long.MAX_VALUE) {
            RealTimeChatService.m9066b(this.f9464j.f6256b.mo2317a(), this.f9468n);
        }
    }
}
