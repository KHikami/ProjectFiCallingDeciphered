import com.google.api.client.http.HttpStatusCodes;

public final class lkm extends nyx<lkm> {
    public Boolean allowH264;
    public Integer bandwidthRampupConstantBps;
    public Float bandwidthRampupRate;
    public Integer bitrateMode;
    public Integer callStartStatsWarmupFrames;
    public Boolean enableBitrateProbing;
    public Boolean enableCombinedAudioVideoBwe;
    public Boolean enableDirectRendering;
    public Boolean enableOpusDtx;
    public Boolean enableOpusFec;
    public Boolean enablePeerconnection;
    public Boolean enableQos;
    public Boolean enableScreenshareLayerRates;
    public Boolean enableSinglecast;
    public Boolean enableUsePaddingForBitrateProbing;
    public Boolean isPstnOnlyClient;
    public Integer lowVideoBandwidthConsecutiveFramesRequired;
    public Integer lowVideoBandwidthThreshold;
    public Integer minVideoBitrateBps;
    public Integer opusPreference;
    public Integer participantFastPollPeriodMillis;
    public Boolean reportRtpPushes;
    public Integer screenshareLayerMaxBitrate;
    public Integer screenshareLayerTargetBitrate;
    public Integer sessionFastPollPeriodMillis;
    public Integer startBitrate;
    public Boolean useGracefulCallDegradation;
    public Boolean useP2P;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lkm() {
        d();
    }

    private lkm d() {
        this.useP2P = null;
        this.isPstnOnlyClient = null;
        this.useGracefulCallDegradation = null;
        this.enableSinglecast = null;
        this.startBitrate = null;
        this.enableOpusFec = null;
        this.allowH264 = null;
        this.bitrateMode = null;
        this.enableBitrateProbing = null;
        this.enableUsePaddingForBitrateProbing = null;
        this.enableCombinedAudioVideoBwe = null;
        this.enableScreenshareLayerRates = null;
        this.screenshareLayerTargetBitrate = null;
        this.screenshareLayerMaxBitrate = null;
        this.lowVideoBandwidthThreshold = null;
        this.enableOpusDtx = null;
        this.bandwidthRampupRate = null;
        this.bandwidthRampupConstantBps = null;
        this.lowVideoBandwidthConsecutiveFramesRequired = null;
        this.callStartStatsWarmupFrames = null;
        this.enableQos = null;
        this.enableDirectRendering = null;
        this.participantFastPollPeriodMillis = null;
        this.sessionFastPollPeriodMillis = null;
        this.enablePeerconnection = null;
        this.reportRtpPushes = null;
        this.minVideoBitrateBps = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.useP2P != null) {
            nyu.a(1, this.useP2P.booleanValue());
        }
        if (this.isPstnOnlyClient != null) {
            nyu.a(2, this.isPstnOnlyClient.booleanValue());
        }
        if (this.useGracefulCallDegradation != null) {
            nyu.a(3, this.useGracefulCallDegradation.booleanValue());
        }
        if (this.enableSinglecast != null) {
            nyu.a(4, this.enableSinglecast.booleanValue());
        }
        if (this.startBitrate != null) {
            nyu.a(5, this.startBitrate.intValue());
        }
        if (this.enableOpusFec != null) {
            nyu.a(6, this.enableOpusFec.booleanValue());
        }
        if (this.allowH264 != null) {
            nyu.a(7, this.allowH264.booleanValue());
        }
        if (this.bitrateMode != null) {
            nyu.a(8, this.bitrateMode.intValue());
        }
        if (this.opusPreference != null) {
            nyu.a(10, this.opusPreference.intValue());
        }
        if (this.enableBitrateProbing != null) {
            nyu.a(11, this.enableBitrateProbing.booleanValue());
        }
        if (this.enableUsePaddingForBitrateProbing != null) {
            nyu.a(12, this.enableUsePaddingForBitrateProbing.booleanValue());
        }
        if (this.enableCombinedAudioVideoBwe != null) {
            nyu.a(13, this.enableCombinedAudioVideoBwe.booleanValue());
        }
        if (this.enableScreenshareLayerRates != null) {
            nyu.a(14, this.enableScreenshareLayerRates.booleanValue());
        }
        if (this.screenshareLayerTargetBitrate != null) {
            nyu.a(15, this.screenshareLayerTargetBitrate.intValue());
        }
        if (this.screenshareLayerMaxBitrate != null) {
            nyu.a(16, this.screenshareLayerMaxBitrate.intValue());
        }
        if (this.lowVideoBandwidthThreshold != null) {
            nyu.a(18, this.lowVideoBandwidthThreshold.intValue());
        }
        if (this.enableOpusDtx != null) {
            nyu.a(19, this.enableOpusDtx.booleanValue());
        }
        if (this.bandwidthRampupRate != null) {
            nyu.a(20, this.bandwidthRampupRate.floatValue());
        }
        if (this.bandwidthRampupConstantBps != null) {
            nyu.a(21, this.bandwidthRampupConstantBps.intValue());
        }
        if (this.lowVideoBandwidthConsecutiveFramesRequired != null) {
            nyu.a(23, this.lowVideoBandwidthConsecutiveFramesRequired.intValue());
        }
        if (this.callStartStatsWarmupFrames != null) {
            nyu.a(24, this.callStartStatsWarmupFrames.intValue());
        }
        if (this.enableQos != null) {
            nyu.a(25, this.enableQos.booleanValue());
        }
        if (this.enableDirectRendering != null) {
            nyu.a(26, this.enableDirectRendering.booleanValue());
        }
        if (this.participantFastPollPeriodMillis != null) {
            nyu.a(27, this.participantFastPollPeriodMillis.intValue());
        }
        if (this.sessionFastPollPeriodMillis != null) {
            nyu.a(28, this.sessionFastPollPeriodMillis.intValue());
        }
        if (this.enablePeerconnection != null) {
            nyu.a(29, this.enablePeerconnection.booleanValue());
        }
        if (this.reportRtpPushes != null) {
            nyu.a(30, this.reportRtpPushes.booleanValue());
        }
        if (this.minVideoBitrateBps != null) {
            nyu.a(31, this.minVideoBitrateBps.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.useP2P != null) {
            this.useP2P.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.isPstnOnlyClient != null) {
            this.isPstnOnlyClient.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.useGracefulCallDegradation != null) {
            this.useGracefulCallDegradation.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.enableSinglecast != null) {
            this.enableSinglecast.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.startBitrate != null) {
            b += nyu.f(5, this.startBitrate.intValue());
        }
        if (this.enableOpusFec != null) {
            this.enableOpusFec.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.allowH264 != null) {
            this.allowH264.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.bitrateMode != null) {
            b += nyu.f(8, this.bitrateMode.intValue());
        }
        if (this.opusPreference != null) {
            b += nyu.f(10, this.opusPreference.intValue());
        }
        if (this.enableBitrateProbing != null) {
            this.enableBitrateProbing.booleanValue();
            b += nyu.h(11) + 1;
        }
        if (this.enableUsePaddingForBitrateProbing != null) {
            this.enableUsePaddingForBitrateProbing.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.enableCombinedAudioVideoBwe != null) {
            this.enableCombinedAudioVideoBwe.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.enableScreenshareLayerRates != null) {
            this.enableScreenshareLayerRates.booleanValue();
            b += nyu.h(14) + 1;
        }
        if (this.screenshareLayerTargetBitrate != null) {
            b += nyu.f(15, this.screenshareLayerTargetBitrate.intValue());
        }
        if (this.screenshareLayerMaxBitrate != null) {
            b += nyu.f(16, this.screenshareLayerMaxBitrate.intValue());
        }
        if (this.lowVideoBandwidthThreshold != null) {
            b += nyu.f(18, this.lowVideoBandwidthThreshold.intValue());
        }
        if (this.enableOpusDtx != null) {
            this.enableOpusDtx.booleanValue();
            b += nyu.h(19) + 1;
        }
        if (this.bandwidthRampupRate != null) {
            this.bandwidthRampupRate.floatValue();
            b += nyu.h(20) + 4;
        }
        if (this.bandwidthRampupConstantBps != null) {
            b += nyu.f(21, this.bandwidthRampupConstantBps.intValue());
        }
        if (this.lowVideoBandwidthConsecutiveFramesRequired != null) {
            b += nyu.f(23, this.lowVideoBandwidthConsecutiveFramesRequired.intValue());
        }
        if (this.callStartStatsWarmupFrames != null) {
            b += nyu.f(24, this.callStartStatsWarmupFrames.intValue());
        }
        if (this.enableQos != null) {
            this.enableQos.booleanValue();
            b += nyu.h(25) + 1;
        }
        if (this.enableDirectRendering != null) {
            this.enableDirectRendering.booleanValue();
            b += nyu.h(26) + 1;
        }
        if (this.participantFastPollPeriodMillis != null) {
            b += nyu.f(27, this.participantFastPollPeriodMillis.intValue());
        }
        if (this.sessionFastPollPeriodMillis != null) {
            b += nyu.f(28, this.sessionFastPollPeriodMillis.intValue());
        }
        if (this.enablePeerconnection != null) {
            this.enablePeerconnection.booleanValue();
            b += nyu.h(29) + 1;
        }
        if (this.reportRtpPushes != null) {
            this.reportRtpPushes.booleanValue();
            b += nyu.h(30) + 1;
        }
        if (this.minVideoBitrateBps != null) {
            return b + nyu.f(31, this.minVideoBitrateBps.intValue());
        }
        return b;
    }

    private lkm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.useP2P = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dI /*16*/:
                    this.isPstnOnlyClient = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.useGracefulCallDegradation = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.enableSinglecast = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.startBitrate = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.enableOpusFec = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.allowH264 = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.bitrateMode = Integer.valueOf(nyt.f());
                    continue;
                case 80:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.opusPreference = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 88:
                    this.enableBitrateProbing = Boolean.valueOf(nyt.i());
                    continue;
                case 96:
                    this.enableUsePaddingForBitrateProbing = Boolean.valueOf(nyt.i());
                    continue;
                case 104:
                    this.enableCombinedAudioVideoBwe = Boolean.valueOf(nyt.i());
                    continue;
                case 112:
                    this.enableScreenshareLayerRates = Boolean.valueOf(nyt.i());
                    continue;
                case 120:
                    this.screenshareLayerTargetBitrate = Integer.valueOf(nyt.f());
                    continue;
                case 128:
                    this.screenshareLayerMaxBitrate = Integer.valueOf(nyt.f());
                    continue;
                case 144:
                    this.lowVideoBandwidthThreshold = Integer.valueOf(nyt.f());
                    continue;
                case 152:
                    this.enableOpusDtx = Boolean.valueOf(nyt.i());
                    continue;
                case 165:
                    this.bandwidthRampupRate = Float.valueOf(nyt.c());
                    continue;
                case 168:
                    this.bandwidthRampupConstantBps = Integer.valueOf(nyt.f());
                    continue;
                case 184:
                    this.lowVideoBandwidthConsecutiveFramesRequired = Integer.valueOf(nyt.f());
                    continue;
                case 192:
                    this.callStartStatsWarmupFrames = Integer.valueOf(nyt.f());
                    continue;
                case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                    this.enableQos = Boolean.valueOf(nyt.i());
                    continue;
                case 208:
                    this.enableDirectRendering = Boolean.valueOf(nyt.i());
                    continue;
                case 216:
                    this.participantFastPollPeriodMillis = Integer.valueOf(nyt.f());
                    continue;
                case 224:
                    this.sessionFastPollPeriodMillis = Integer.valueOf(nyt.f());
                    continue;
                case 232:
                    this.enablePeerconnection = Boolean.valueOf(nyt.i());
                    continue;
                case 240:
                    this.reportRtpPushes = Boolean.valueOf(nyt.i());
                    continue;
                case 248:
                    this.minVideoBitrateBps = Integer.valueOf(nyt.f());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
