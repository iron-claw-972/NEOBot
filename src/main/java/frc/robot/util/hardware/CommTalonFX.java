package frc.robot.util.hardware;

public class CommTalonFX extends Hardware implements Motor {
    public CommTalonFX() {
        type = "TalonFX";
        booleans = new boolean[0];
        integers = new int[] { 0 };
        doubles = new double[] { 0.0, 0.0 };
        strings = new String[0];
    }

    public CommTalonFX(int canID) {
        type = "TalonFX";
        booleans = new boolean[0];
        integers = new int[] { canID };
        doubles = new double[] { 0.0, 0.0 };
        strings = new String[0];
    }

    @Override
    public void setPower(double motorPower) {
        doubles[0] = motorPower;
    }

    @Override
    public void setEncoderPos(double encoderPosition) {
        doubles[1] = encoderPosition;
    }

    @Override
    public double getPower() {
        return doubles[0];
    }

    @Override
    public double getEncoderPos() {
        return doubles[1];
    }

    @Override
    public int getMotorID() {
        return integers[0];
    }

    @Override
    public void copyRelValues(Hardware other) {
        this.doubles[1] = other.doubles[1];
    }
}