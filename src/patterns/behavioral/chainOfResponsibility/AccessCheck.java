package patterns.behavioral.chainOfResponsibility;

public abstract class AccessCheck {
    private AccessCheck nextCheck;

    public AccessCheck addChainElement(AccessCheck nextCheck) {
        this.nextCheck = nextCheck;
        return nextCheck;
    }
    public abstract boolean doCheck(String userName);

    protected boolean checkNextElement(String userName) {
        if(nextCheck == null) {
            return true;
        }
        return nextCheck.doCheck(userName);
    }
}
