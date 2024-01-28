package creatinalPattern.prototype;

public abstract class RequisitionBase extends AbstractEntity {
    public User user;
    public String name;
    public String mail;
    public String utmMark;
    public String webinarType;
    public String promoCode;

    public RequisitionBase() {
    }

    public RequisitionBase(RequisitionBase source) {
        super(source);
        this.user = (User) source.user.clone();
        this.name = source.name;
        this.mail = source.mail;
        this.utmMark = source.utmMark;
        this.webinarType = source.webinarType;
        this.promoCode = source.promoCode;

    }

}
