package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.hangouts.views.OverlayedAvatarView;
import com.google.android.apps.hangouts.views.ParticipantsGalleryView;
import java.lang.ref.WeakReference;

public final class gqo extends Handler {
    private final WeakReference<ParticipantsGalleryView> f15924a;

    public gqo(ParticipantsGalleryView participantsGalleryView) {
        super(Looper.getMainLooper());
        this.f15924a = new WeakReference(participantsGalleryView);
    }

    public void handleMessage(Message message) {
        if (message.what == 0) {
            ParticipantsGalleryView participantsGalleryView = (ParticipantsGalleryView) this.f15924a.get();
            if (participantsGalleryView != null) {
                participantsGalleryView.f7168i = false;
                gql gql = new gql(participantsGalleryView, participantsGalleryView.f7167h.size());
                while (participantsGalleryView.f7167h.size() > 0) {
                    gqr gqr = (gqr) participantsGalleryView.f7167h.poll();
                    participantsGalleryView.f7168i = true;
                    if (gqr instanceof gqp) {
                        String str;
                        gqp gqp = (gqp) gqr;
                        if (ParticipantsGalleryView.f7160a) {
                            str = gqp.f15927c ? "set" : "unset";
                            String valueOf = String.valueOf(OverlayedAvatarView.m9543a(gqp.f15926b));
                            String valueOf2 = String.valueOf(gqp.f15925a.f11213b);
                            new StringBuilder(((String.valueOf(str).length() + 50) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("[PartGallery] change participant state  ").append(str).append(" ").append(valueOf).append(" bit for ").append(valueOf2);
                        }
                        edk edk;
                        OverlayedAvatarView b;
                        int b2;
                        int d;
                        int b3;
                        if (gqp.f15927c) {
                            Object obj;
                            boolean z;
                            edk = gqp.f15925a;
                            int i = gqp.f15926b;
                            boolean z2 = gqp.f15928d;
                            OverlayedAvatarView c = participantsGalleryView.m9590c(edk);
                            if (c == null) {
                                obj = 1;
                                b = participantsGalleryView.m9585b(edk);
                            } else {
                                obj = null;
                                b = c;
                            }
                            b2 = b.m9552b();
                            d = b.m9555d(i);
                            int b4 = OverlayedAvatarView.m9544b(d);
                            b3 = OverlayedAvatarView.m9544b(b2);
                            if (participantsGalleryView.m9596d(edk)) {
                                b.m9560f(d);
                                if (ParticipantsGalleryView.f7160a) {
                                    participantsGalleryView.m9579a(null, b, "SetState (COALESCED) " + b2 + " -> " + d);
                                    z = false;
                                } else {
                                    z = false;
                                }
                            } else if (b4 == b3) {
                                b.m9557e(d);
                                if (ParticipantsGalleryView.f7160a) {
                                    participantsGalleryView.m9579a(null, b, "SetState (HI EQ) " + b2 + " -> " + d);
                                }
                                z = false;
                            } else if (b4 == 4 && b3 == 2) {
                                b.m9557e(d);
                                if (ParticipantsGalleryView.f7160a) {
                                    participantsGalleryView.m9579a(null, b, "SetState (F->T) " + b2 + " -> " + d);
                                }
                                z = true;
                            } else {
                                if (obj != null) {
                                    participantsGalleryView.m9575a(edk, b, d, z2);
                                } else {
                                    participantsGalleryView.m9583a(gql, edk, b, b2, d);
                                }
                                z = true;
                            }
                            gql.m18310a(z);
                            if (i == 2) {
                                if (ParticipantsGalleryView.f7160a) {
                                    str = String.valueOf(edk.f11213b);
                                    new StringBuilder(String.valueOf(str).length() + 25).append("Focus state set for user ").append(str);
                                }
                                if (participantsGalleryView.f7161b != null) {
                                    participantsGalleryView.f7161b.mo918a();
                                }
                            }
                        } else {
                            boolean z3;
                            boolean z4;
                            edk = gqp.f15925a;
                            int i2 = gqp.f15926b;
                            boolean z5 = gqp.f15928d;
                            b = participantsGalleryView.m9590c(edk);
                            if (b != null) {
                                b2 = b.m9552b();
                                d = b.m9554c(i2);
                                b3 = OverlayedAvatarView.m9544b(d);
                                int b5 = OverlayedAvatarView.m9544b(b2);
                                if (participantsGalleryView.m9596d(edk)) {
                                    b.m9560f(d);
                                    if (ParticipantsGalleryView.f7160a) {
                                        participantsGalleryView.m9579a(null, b, "UnsetState (COALESCED) " + b2 + " -> " + d);
                                        z3 = false;
                                        z4 = true;
                                    }
                                } else if (b3 == b5) {
                                    b.m9557e(d);
                                    if (ParticipantsGalleryView.f7160a) {
                                        participantsGalleryView.m9579a(null, b, "UnsetState (HI EQ) " + b2 + " -> " + d);
                                    }
                                    z3 = false;
                                    z4 = true;
                                } else if (b3 == 2 && b5 == 4) {
                                    b.m9557e(d);
                                    if (ParticipantsGalleryView.f7160a) {
                                        participantsGalleryView.m9579a(null, b, "UnsetState (T->F) " + b2 + " -> " + d);
                                    }
                                    z3 = true;
                                    z4 = true;
                                } else {
                                    if (d == 0) {
                                        z3 = participantsGalleryView.m9593c(edk, b2, z5);
                                    } else {
                                        z3 = participantsGalleryView.m9583a(gql, edk, b, b2, d);
                                    }
                                    z4 = z3;
                                    z3 = true;
                                }
                                if (z4) {
                                    gql.m18310a(z3);
                                }
                                if (b != null && i2 == 2) {
                                    if (ParticipantsGalleryView.f7160a) {
                                        str = String.valueOf(edk.f11213b);
                                        new StringBuilder(String.valueOf(str).length() + 27).append("Focus state unset for user ").append(str);
                                    }
                                    if (participantsGalleryView.f7161b != null) {
                                        participantsGalleryView.f7161b.mo918a();
                                    }
                                }
                            }
                            z3 = false;
                            z4 = true;
                            if (z4) {
                                gql.m18310a(z3);
                            }
                            if (ParticipantsGalleryView.f7160a) {
                                str = String.valueOf(edk.f11213b);
                                new StringBuilder(String.valueOf(str).length() + 27).append("Focus state unset for user ").append(str);
                            }
                            if (participantsGalleryView.f7161b != null) {
                                participantsGalleryView.f7161b.mo918a();
                            }
                        }
                    } else if (gqr instanceof gqm) {
                        gqm gqm = (gqm) gqr;
                        if (ParticipantsGalleryView.f7160a) {
                            String str2 = gqm.f15923c ? "set" : "unset";
                            new StringBuilder(String.valueOf(str2).length() + 71).append("[PartGallery] batch change participant state  ").append(str2).append(" watermark bit for users:");
                            for (edk edk2 : gqm.f15921a) {
                                str2 = String.valueOf(edk2.f11213b);
                                new StringBuilder(String.valueOf(str2).length() + 2).append("  ").append(str2);
                            }
                        }
                        if (gqm.f15923c) {
                            participantsGalleryView.m9588b(gql, gqm.f15921a, gqm.f15922b);
                        } else {
                            participantsGalleryView.m9577a(gql, gqm.f15921a, gqm.f15922b);
                        }
                    }
                }
            }
        }
    }
}
