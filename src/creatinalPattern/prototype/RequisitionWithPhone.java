package creatinalPattern.prototype;

public abstract class RequisitionWithPhone extends RequisitionBase {
    public String phone;

    public RequisitionWithPhone() {
    }

    public RequisitionWithPhone(RequisitionWithPhone source) {
        super(source);
        this.phone = source.phone;
    }

}
