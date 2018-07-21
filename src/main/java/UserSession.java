public class UserSession {
    private String ssoid;
    private String ts;
    private String grp;
    private String type;
    private String subtype;
    private String url;
    private String orgid;
    private String formid;
    private String code;
    private String ltpa;
    private String sudirresponse;
    private String ymdh;

    public UserSession(String[] data) {
        this.ssoid = data[0];
        this.ts = data[1];
        this.grp = data[2];
        this.type = data[3];
        this.subtype = data[4];
        this.url = data[5];
        this.orgid = data[6];
        this.formid = data[7];
        this.code = data[8];
        this.ltpa = data[9];
        this.sudirresponse = data[10];
        this.ymdh = data[11];
    }

    public void setSsoid(String ssoid) {
        this.ssoid = ssoid;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setGrp(String grp) {
        this.grp = grp;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public void setFormid(String formid) {
        this.formid = formid;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLtpa(String ltpa) {
        this.ltpa = ltpa;
    }

    public void setSudirresponse(String sudirresponse) {
        this.sudirresponse = sudirresponse;
    }

    public void setYmdh(String ymdh) {
        this.ymdh = ymdh;
    }

    public String getSsoid() {
        return ssoid;
    }

    public String getTs() {
        return ts;
    }

    public String getGrp() {
        return grp;
    }

    public String getType() {
        return type;
    }

    public String getSubtype() {
        return subtype;
    }

    public String getUrl() {
        return url;
    }

    public String getOrgid() {
        return orgid;
    }

    public String getFormid() {
        return formid;
    }

    public String getCode() {
        return code;
    }

    public String getLtpa() {
        return ltpa;
    }

    public String getSudirresponse() {
        return sudirresponse;
    }

    public String getYmdh() {
        return ymdh;
    }
}
