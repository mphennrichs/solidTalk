package _4_ISP.Violation;

public class KnoblessDoorImpl implements IDoor {
    @Override
    public void open() {
        //also needs to open
    }

    @Override
    public void close() {
        //also needs to close
    }

    @Override
    public void lock() {
        //there is no need to lock this door
    }

    @Override
    public void unlock() {
        //there is no need to unlock this door
    }
}
