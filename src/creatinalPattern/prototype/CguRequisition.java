package creatinalPattern.prototype;

public class CguRequisition extends RequisitionWithPhone {
    public String requestedSubscriptionType;
    public String language;

    public CguRequisition() {
    }

    @Override
    public AbstractEntity clone() {
        return new CguRequisition(this);
    }

    public CguRequisition(CguRequisition source) {
        super(source);
        this.requestedSubscriptionType = source.requestedSubscriptionType;
        this.language = source.language;

    }

}
