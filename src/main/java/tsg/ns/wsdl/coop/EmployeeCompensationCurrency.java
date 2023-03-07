
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeCompensationCurrency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EmployeeCompensationCurrency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_aed"/&gt;
 *     &lt;enumeration value="_afa"/&gt;
 *     &lt;enumeration value="_afn"/&gt;
 *     &lt;enumeration value="_all"/&gt;
 *     &lt;enumeration value="_amd"/&gt;
 *     &lt;enumeration value="_ang"/&gt;
 *     &lt;enumeration value="_aoa"/&gt;
 *     &lt;enumeration value="_ars"/&gt;
 *     &lt;enumeration value="_aud"/&gt;
 *     &lt;enumeration value="_awg"/&gt;
 *     &lt;enumeration value="_azn"/&gt;
 *     &lt;enumeration value="_bam"/&gt;
 *     &lt;enumeration value="_bbd"/&gt;
 *     &lt;enumeration value="_bdt"/&gt;
 *     &lt;enumeration value="_bgn"/&gt;
 *     &lt;enumeration value="_bhd"/&gt;
 *     &lt;enumeration value="_bif"/&gt;
 *     &lt;enumeration value="_bmd"/&gt;
 *     &lt;enumeration value="_bnd"/&gt;
 *     &lt;enumeration value="_bob"/&gt;
 *     &lt;enumeration value="_brl"/&gt;
 *     &lt;enumeration value="_bsd"/&gt;
 *     &lt;enumeration value="_btn"/&gt;
 *     &lt;enumeration value="_bwp"/&gt;
 *     &lt;enumeration value="_byn"/&gt;
 *     &lt;enumeration value="_byr"/&gt;
 *     &lt;enumeration value="_bzd"/&gt;
 *     &lt;enumeration value="_cad"/&gt;
 *     &lt;enumeration value="_cdf"/&gt;
 *     &lt;enumeration value="_chf"/&gt;
 *     &lt;enumeration value="_clp"/&gt;
 *     &lt;enumeration value="_cny"/&gt;
 *     &lt;enumeration value="_cop"/&gt;
 *     &lt;enumeration value="_crc"/&gt;
 *     &lt;enumeration value="_csd"/&gt;
 *     &lt;enumeration value="_cuc"/&gt;
 *     &lt;enumeration value="_cup"/&gt;
 *     &lt;enumeration value="_cve"/&gt;
 *     &lt;enumeration value="_cyp"/&gt;
 *     &lt;enumeration value="_czk"/&gt;
 *     &lt;enumeration value="_djf"/&gt;
 *     &lt;enumeration value="_dkk"/&gt;
 *     &lt;enumeration value="_dop"/&gt;
 *     &lt;enumeration value="_dzd"/&gt;
 *     &lt;enumeration value="_ecs"/&gt;
 *     &lt;enumeration value="_eek"/&gt;
 *     &lt;enumeration value="_egp"/&gt;
 *     &lt;enumeration value="_ern"/&gt;
 *     &lt;enumeration value="_etb"/&gt;
 *     &lt;enumeration value="_eur"/&gt;
 *     &lt;enumeration value="_fjd"/&gt;
 *     &lt;enumeration value="_fkp"/&gt;
 *     &lt;enumeration value="_gbp"/&gt;
 *     &lt;enumeration value="_gel"/&gt;
 *     &lt;enumeration value="_ggp"/&gt;
 *     &lt;enumeration value="_ghc"/&gt;
 *     &lt;enumeration value="_ghs"/&gt;
 *     &lt;enumeration value="_gip"/&gt;
 *     &lt;enumeration value="_gmd"/&gt;
 *     &lt;enumeration value="_gnf"/&gt;
 *     &lt;enumeration value="_gtq"/&gt;
 *     &lt;enumeration value="_gyd"/&gt;
 *     &lt;enumeration value="_hkd"/&gt;
 *     &lt;enumeration value="_hnl"/&gt;
 *     &lt;enumeration value="_hrk"/&gt;
 *     &lt;enumeration value="_htg"/&gt;
 *     &lt;enumeration value="_huf"/&gt;
 *     &lt;enumeration value="_idr"/&gt;
 *     &lt;enumeration value="_ils"/&gt;
 *     &lt;enumeration value="_imp"/&gt;
 *     &lt;enumeration value="_inr"/&gt;
 *     &lt;enumeration value="_iqd"/&gt;
 *     &lt;enumeration value="_irr"/&gt;
 *     &lt;enumeration value="_isk"/&gt;
 *     &lt;enumeration value="_jep"/&gt;
 *     &lt;enumeration value="_jmd"/&gt;
 *     &lt;enumeration value="_jod"/&gt;
 *     &lt;enumeration value="_jpy"/&gt;
 *     &lt;enumeration value="_kes"/&gt;
 *     &lt;enumeration value="_kgs"/&gt;
 *     &lt;enumeration value="_khr"/&gt;
 *     &lt;enumeration value="_kmf"/&gt;
 *     &lt;enumeration value="_kpw"/&gt;
 *     &lt;enumeration value="_krw"/&gt;
 *     &lt;enumeration value="_kwd"/&gt;
 *     &lt;enumeration value="_kyd"/&gt;
 *     &lt;enumeration value="_kzt"/&gt;
 *     &lt;enumeration value="_lak"/&gt;
 *     &lt;enumeration value="_lbp"/&gt;
 *     &lt;enumeration value="_lkr"/&gt;
 *     &lt;enumeration value="_lrd"/&gt;
 *     &lt;enumeration value="_lsl"/&gt;
 *     &lt;enumeration value="_ltl"/&gt;
 *     &lt;enumeration value="_lvl"/&gt;
 *     &lt;enumeration value="_lyd"/&gt;
 *     &lt;enumeration value="_mad"/&gt;
 *     &lt;enumeration value="_mdl"/&gt;
 *     &lt;enumeration value="_mfg"/&gt;
 *     &lt;enumeration value="_mga"/&gt;
 *     &lt;enumeration value="_mkd"/&gt;
 *     &lt;enumeration value="_mmk"/&gt;
 *     &lt;enumeration value="_mnt"/&gt;
 *     &lt;enumeration value="_mop"/&gt;
 *     &lt;enumeration value="_mro"/&gt;
 *     &lt;enumeration value="_mru"/&gt;
 *     &lt;enumeration value="_mtl"/&gt;
 *     &lt;enumeration value="_mur"/&gt;
 *     &lt;enumeration value="_mvr"/&gt;
 *     &lt;enumeration value="_mwk"/&gt;
 *     &lt;enumeration value="_mxn"/&gt;
 *     &lt;enumeration value="_myr"/&gt;
 *     &lt;enumeration value="_mzm"/&gt;
 *     &lt;enumeration value="_mzn"/&gt;
 *     &lt;enumeration value="_nad"/&gt;
 *     &lt;enumeration value="_ngn"/&gt;
 *     &lt;enumeration value="_nio"/&gt;
 *     &lt;enumeration value="_nok"/&gt;
 *     &lt;enumeration value="_npr"/&gt;
 *     &lt;enumeration value="_nzd"/&gt;
 *     &lt;enumeration value="_omr"/&gt;
 *     &lt;enumeration value="_pab"/&gt;
 *     &lt;enumeration value="_pen"/&gt;
 *     &lt;enumeration value="_pgk"/&gt;
 *     &lt;enumeration value="_php"/&gt;
 *     &lt;enumeration value="_pkr"/&gt;
 *     &lt;enumeration value="_pln"/&gt;
 *     &lt;enumeration value="_pyg"/&gt;
 *     &lt;enumeration value="_qar"/&gt;
 *     &lt;enumeration value="_rol"/&gt;
 *     &lt;enumeration value="_ron"/&gt;
 *     &lt;enumeration value="_rsd"/&gt;
 *     &lt;enumeration value="_rub"/&gt;
 *     &lt;enumeration value="_rur"/&gt;
 *     &lt;enumeration value="_rwf"/&gt;
 *     &lt;enumeration value="_sar"/&gt;
 *     &lt;enumeration value="_sbd"/&gt;
 *     &lt;enumeration value="_scr"/&gt;
 *     &lt;enumeration value="_sdd"/&gt;
 *     &lt;enumeration value="_sdg"/&gt;
 *     &lt;enumeration value="_sek"/&gt;
 *     &lt;enumeration value="_sgd"/&gt;
 *     &lt;enumeration value="_shp"/&gt;
 *     &lt;enumeration value="_sit"/&gt;
 *     &lt;enumeration value="_skk"/&gt;
 *     &lt;enumeration value="_sll"/&gt;
 *     &lt;enumeration value="_sos"/&gt;
 *     &lt;enumeration value="_spl"/&gt;
 *     &lt;enumeration value="_srd"/&gt;
 *     &lt;enumeration value="_srg"/&gt;
 *     &lt;enumeration value="_ssp"/&gt;
 *     &lt;enumeration value="_std"/&gt;
 *     &lt;enumeration value="_stn"/&gt;
 *     &lt;enumeration value="_svc"/&gt;
 *     &lt;enumeration value="_syp"/&gt;
 *     &lt;enumeration value="_szl"/&gt;
 *     &lt;enumeration value="_thb"/&gt;
 *     &lt;enumeration value="_tjs"/&gt;
 *     &lt;enumeration value="_tmm"/&gt;
 *     &lt;enumeration value="_tmt"/&gt;
 *     &lt;enumeration value="_tnd"/&gt;
 *     &lt;enumeration value="_top"/&gt;
 *     &lt;enumeration value="_trl"/&gt;
 *     &lt;enumeration value="_try"/&gt;
 *     &lt;enumeration value="_ttd"/&gt;
 *     &lt;enumeration value="_tvd"/&gt;
 *     &lt;enumeration value="_twd"/&gt;
 *     &lt;enumeration value="_tzs"/&gt;
 *     &lt;enumeration value="_uah"/&gt;
 *     &lt;enumeration value="_ugx"/&gt;
 *     &lt;enumeration value="_usd"/&gt;
 *     &lt;enumeration value="_uyu"/&gt;
 *     &lt;enumeration value="_uzs"/&gt;
 *     &lt;enumeration value="_veb"/&gt;
 *     &lt;enumeration value="_vef"/&gt;
 *     &lt;enumeration value="_ves"/&gt;
 *     &lt;enumeration value="_vnd"/&gt;
 *     &lt;enumeration value="_vuv"/&gt;
 *     &lt;enumeration value="_wst"/&gt;
 *     &lt;enumeration value="_wsx"/&gt;
 *     &lt;enumeration value="_xaf"/&gt;
 *     &lt;enumeration value="_xag"/&gt;
 *     &lt;enumeration value="_xau"/&gt;
 *     &lt;enumeration value="_xcd"/&gt;
 *     &lt;enumeration value="_xdr"/&gt;
 *     &lt;enumeration value="_xof"/&gt;
 *     &lt;enumeration value="_xop"/&gt;
 *     &lt;enumeration value="_xpd"/&gt;
 *     &lt;enumeration value="_xpf"/&gt;
 *     &lt;enumeration value="_xpt"/&gt;
 *     &lt;enumeration value="_yer"/&gt;
 *     &lt;enumeration value="_yum"/&gt;
 *     &lt;enumeration value="_zar"/&gt;
 *     &lt;enumeration value="_zmk"/&gt;
 *     &lt;enumeration value="_zmw"/&gt;
 *     &lt;enumeration value="_zrn"/&gt;
 *     &lt;enumeration value="_zwd"/&gt;
 *     &lt;enumeration value="_zwl"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmployeeCompensationCurrency", namespace = "urn:types.employees_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeeCompensationCurrency {

    @XmlEnumValue("_aed")
    AED("_aed"),
    @XmlEnumValue("_afa")
    AFA("_afa"),
    @XmlEnumValue("_afn")
    AFN("_afn"),
    @XmlEnumValue("_all")
    ALL("_all"),
    @XmlEnumValue("_amd")
    AMD("_amd"),
    @XmlEnumValue("_ang")
    ANG("_ang"),
    @XmlEnumValue("_aoa")
    AOA("_aoa"),
    @XmlEnumValue("_ars")
    ARS("_ars"),
    @XmlEnumValue("_aud")
    AUD("_aud"),
    @XmlEnumValue("_awg")
    AWG("_awg"),
    @XmlEnumValue("_azn")
    AZN("_azn"),
    @XmlEnumValue("_bam")
    BAM("_bam"),
    @XmlEnumValue("_bbd")
    BBD("_bbd"),
    @XmlEnumValue("_bdt")
    BDT("_bdt"),
    @XmlEnumValue("_bgn")
    BGN("_bgn"),
    @XmlEnumValue("_bhd")
    BHD("_bhd"),
    @XmlEnumValue("_bif")
    BIF("_bif"),
    @XmlEnumValue("_bmd")
    BMD("_bmd"),
    @XmlEnumValue("_bnd")
    BND("_bnd"),
    @XmlEnumValue("_bob")
    BOB("_bob"),
    @XmlEnumValue("_brl")
    BRL("_brl"),
    @XmlEnumValue("_bsd")
    BSD("_bsd"),
    @XmlEnumValue("_btn")
    BTN("_btn"),
    @XmlEnumValue("_bwp")
    BWP("_bwp"),
    @XmlEnumValue("_byn")
    BYN("_byn"),
    @XmlEnumValue("_byr")
    BYR("_byr"),
    @XmlEnumValue("_bzd")
    BZD("_bzd"),
    @XmlEnumValue("_cad")
    CAD("_cad"),
    @XmlEnumValue("_cdf")
    CDF("_cdf"),
    @XmlEnumValue("_chf")
    CHF("_chf"),
    @XmlEnumValue("_clp")
    CLP("_clp"),
    @XmlEnumValue("_cny")
    CNY("_cny"),
    @XmlEnumValue("_cop")
    COP("_cop"),
    @XmlEnumValue("_crc")
    CRC("_crc"),
    @XmlEnumValue("_csd")
    CSD("_csd"),
    @XmlEnumValue("_cuc")
    CUC("_cuc"),
    @XmlEnumValue("_cup")
    CUP("_cup"),
    @XmlEnumValue("_cve")
    CVE("_cve"),
    @XmlEnumValue("_cyp")
    CYP("_cyp"),
    @XmlEnumValue("_czk")
    CZK("_czk"),
    @XmlEnumValue("_djf")
    DJF("_djf"),
    @XmlEnumValue("_dkk")
    DKK("_dkk"),
    @XmlEnumValue("_dop")
    DOP("_dop"),
    @XmlEnumValue("_dzd")
    DZD("_dzd"),
    @XmlEnumValue("_ecs")
    ECS("_ecs"),
    @XmlEnumValue("_eek")
    EEK("_eek"),
    @XmlEnumValue("_egp")
    EGP("_egp"),
    @XmlEnumValue("_ern")
    ERN("_ern"),
    @XmlEnumValue("_etb")
    ETB("_etb"),
    @XmlEnumValue("_eur")
    EUR("_eur"),
    @XmlEnumValue("_fjd")
    FJD("_fjd"),
    @XmlEnumValue("_fkp")
    FKP("_fkp"),
    @XmlEnumValue("_gbp")
    GBP("_gbp"),
    @XmlEnumValue("_gel")
    GEL("_gel"),
    @XmlEnumValue("_ggp")
    GGP("_ggp"),
    @XmlEnumValue("_ghc")
    GHC("_ghc"),
    @XmlEnumValue("_ghs")
    GHS("_ghs"),
    @XmlEnumValue("_gip")
    GIP("_gip"),
    @XmlEnumValue("_gmd")
    GMD("_gmd"),
    @XmlEnumValue("_gnf")
    GNF("_gnf"),
    @XmlEnumValue("_gtq")
    GTQ("_gtq"),
    @XmlEnumValue("_gyd")
    GYD("_gyd"),
    @XmlEnumValue("_hkd")
    HKD("_hkd"),
    @XmlEnumValue("_hnl")
    HNL("_hnl"),
    @XmlEnumValue("_hrk")
    HRK("_hrk"),
    @XmlEnumValue("_htg")
    HTG("_htg"),
    @XmlEnumValue("_huf")
    HUF("_huf"),
    @XmlEnumValue("_idr")
    IDR("_idr"),
    @XmlEnumValue("_ils")
    ILS("_ils"),
    @XmlEnumValue("_imp")
    IMP("_imp"),
    @XmlEnumValue("_inr")
    INR("_inr"),
    @XmlEnumValue("_iqd")
    IQD("_iqd"),
    @XmlEnumValue("_irr")
    IRR("_irr"),
    @XmlEnumValue("_isk")
    ISK("_isk"),
    @XmlEnumValue("_jep")
    JEP("_jep"),
    @XmlEnumValue("_jmd")
    JMD("_jmd"),
    @XmlEnumValue("_jod")
    JOD("_jod"),
    @XmlEnumValue("_jpy")
    JPY("_jpy"),
    @XmlEnumValue("_kes")
    KES("_kes"),
    @XmlEnumValue("_kgs")
    KGS("_kgs"),
    @XmlEnumValue("_khr")
    KHR("_khr"),
    @XmlEnumValue("_kmf")
    KMF("_kmf"),
    @XmlEnumValue("_kpw")
    KPW("_kpw"),
    @XmlEnumValue("_krw")
    KRW("_krw"),
    @XmlEnumValue("_kwd")
    KWD("_kwd"),
    @XmlEnumValue("_kyd")
    KYD("_kyd"),
    @XmlEnumValue("_kzt")
    KZT("_kzt"),
    @XmlEnumValue("_lak")
    LAK("_lak"),
    @XmlEnumValue("_lbp")
    LBP("_lbp"),
    @XmlEnumValue("_lkr")
    LKR("_lkr"),
    @XmlEnumValue("_lrd")
    LRD("_lrd"),
    @XmlEnumValue("_lsl")
    LSL("_lsl"),
    @XmlEnumValue("_ltl")
    LTL("_ltl"),
    @XmlEnumValue("_lvl")
    LVL("_lvl"),
    @XmlEnumValue("_lyd")
    LYD("_lyd"),
    @XmlEnumValue("_mad")
    MAD("_mad"),
    @XmlEnumValue("_mdl")
    MDL("_mdl"),
    @XmlEnumValue("_mfg")
    MFG("_mfg"),
    @XmlEnumValue("_mga")
    MGA("_mga"),
    @XmlEnumValue("_mkd")
    MKD("_mkd"),
    @XmlEnumValue("_mmk")
    MMK("_mmk"),
    @XmlEnumValue("_mnt")
    MNT("_mnt"),
    @XmlEnumValue("_mop")
    MOP("_mop"),
    @XmlEnumValue("_mro")
    MRO("_mro"),
    @XmlEnumValue("_mru")
    MRU("_mru"),
    @XmlEnumValue("_mtl")
    MTL("_mtl"),
    @XmlEnumValue("_mur")
    MUR("_mur"),
    @XmlEnumValue("_mvr")
    MVR("_mvr"),
    @XmlEnumValue("_mwk")
    MWK("_mwk"),
    @XmlEnumValue("_mxn")
    MXN("_mxn"),
    @XmlEnumValue("_myr")
    MYR("_myr"),
    @XmlEnumValue("_mzm")
    MZM("_mzm"),
    @XmlEnumValue("_mzn")
    MZN("_mzn"),
    @XmlEnumValue("_nad")
    NAD("_nad"),
    @XmlEnumValue("_ngn")
    NGN("_ngn"),
    @XmlEnumValue("_nio")
    NIO("_nio"),
    @XmlEnumValue("_nok")
    NOK("_nok"),
    @XmlEnumValue("_npr")
    NPR("_npr"),
    @XmlEnumValue("_nzd")
    NZD("_nzd"),
    @XmlEnumValue("_omr")
    OMR("_omr"),
    @XmlEnumValue("_pab")
    PAB("_pab"),
    @XmlEnumValue("_pen")
    PEN("_pen"),
    @XmlEnumValue("_pgk")
    PGK("_pgk"),
    @XmlEnumValue("_php")
    PHP("_php"),
    @XmlEnumValue("_pkr")
    PKR("_pkr"),
    @XmlEnumValue("_pln")
    PLN("_pln"),
    @XmlEnumValue("_pyg")
    PYG("_pyg"),
    @XmlEnumValue("_qar")
    QAR("_qar"),
    @XmlEnumValue("_rol")
    ROL("_rol"),
    @XmlEnumValue("_ron")
    RON("_ron"),
    @XmlEnumValue("_rsd")
    RSD("_rsd"),
    @XmlEnumValue("_rub")
    RUB("_rub"),
    @XmlEnumValue("_rur")
    RUR("_rur"),
    @XmlEnumValue("_rwf")
    RWF("_rwf"),
    @XmlEnumValue("_sar")
    SAR("_sar"),
    @XmlEnumValue("_sbd")
    SBD("_sbd"),
    @XmlEnumValue("_scr")
    SCR("_scr"),
    @XmlEnumValue("_sdd")
    SDD("_sdd"),
    @XmlEnumValue("_sdg")
    SDG("_sdg"),
    @XmlEnumValue("_sek")
    SEK("_sek"),
    @XmlEnumValue("_sgd")
    SGD("_sgd"),
    @XmlEnumValue("_shp")
    SHP("_shp"),
    @XmlEnumValue("_sit")
    SIT("_sit"),
    @XmlEnumValue("_skk")
    SKK("_skk"),
    @XmlEnumValue("_sll")
    SLL("_sll"),
    @XmlEnumValue("_sos")
    SOS("_sos"),
    @XmlEnumValue("_spl")
    SPL("_spl"),
    @XmlEnumValue("_srd")
    SRD("_srd"),
    @XmlEnumValue("_srg")
    SRG("_srg"),
    @XmlEnumValue("_ssp")
    SSP("_ssp"),
    @XmlEnumValue("_std")
    STD("_std"),
    @XmlEnumValue("_stn")
    STN("_stn"),
    @XmlEnumValue("_svc")
    SVC("_svc"),
    @XmlEnumValue("_syp")
    SYP("_syp"),
    @XmlEnumValue("_szl")
    SZL("_szl"),
    @XmlEnumValue("_thb")
    THB("_thb"),
    @XmlEnumValue("_tjs")
    TJS("_tjs"),
    @XmlEnumValue("_tmm")
    TMM("_tmm"),
    @XmlEnumValue("_tmt")
    TMT("_tmt"),
    @XmlEnumValue("_tnd")
    TND("_tnd"),
    @XmlEnumValue("_top")
    TOP("_top"),
    @XmlEnumValue("_trl")
    TRL("_trl"),
    @XmlEnumValue("_try")
    TRY("_try"),
    @XmlEnumValue("_ttd")
    TTD("_ttd"),
    @XmlEnumValue("_tvd")
    TVD("_tvd"),
    @XmlEnumValue("_twd")
    TWD("_twd"),
    @XmlEnumValue("_tzs")
    TZS("_tzs"),
    @XmlEnumValue("_uah")
    UAH("_uah"),
    @XmlEnumValue("_ugx")
    UGX("_ugx"),
    @XmlEnumValue("_usd")
    USD("_usd"),
    @XmlEnumValue("_uyu")
    UYU("_uyu"),
    @XmlEnumValue("_uzs")
    UZS("_uzs"),
    @XmlEnumValue("_veb")
    VEB("_veb"),
    @XmlEnumValue("_vef")
    VEF("_vef"),
    @XmlEnumValue("_ves")
    VES("_ves"),
    @XmlEnumValue("_vnd")
    VND("_vnd"),
    @XmlEnumValue("_vuv")
    VUV("_vuv"),
    @XmlEnumValue("_wst")
    WST("_wst"),
    @XmlEnumValue("_wsx")
    WSX("_wsx"),
    @XmlEnumValue("_xaf")
    XAF("_xaf"),
    @XmlEnumValue("_xag")
    XAG("_xag"),
    @XmlEnumValue("_xau")
    XAU("_xau"),
    @XmlEnumValue("_xcd")
    XCD("_xcd"),
    @XmlEnumValue("_xdr")
    XDR("_xdr"),
    @XmlEnumValue("_xof")
    XOF("_xof"),
    @XmlEnumValue("_xop")
    XOP("_xop"),
    @XmlEnumValue("_xpd")
    XPD("_xpd"),
    @XmlEnumValue("_xpf")
    XPF("_xpf"),
    @XmlEnumValue("_xpt")
    XPT("_xpt"),
    @XmlEnumValue("_yer")
    YER("_yer"),
    @XmlEnumValue("_yum")
    YUM("_yum"),
    @XmlEnumValue("_zar")
    ZAR("_zar"),
    @XmlEnumValue("_zmk")
    ZMK("_zmk"),
    @XmlEnumValue("_zmw")
    ZMW("_zmw"),
    @XmlEnumValue("_zrn")
    ZRN("_zrn"),
    @XmlEnumValue("_zwd")
    ZWD("_zwd"),
    @XmlEnumValue("_zwl")
    ZWL("_zwl");
    private final String value;

    EmployeeCompensationCurrency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeCompensationCurrency fromValue(String v) {
        for (EmployeeCompensationCurrency c: EmployeeCompensationCurrency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
