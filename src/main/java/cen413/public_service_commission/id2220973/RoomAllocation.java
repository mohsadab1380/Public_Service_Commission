package cen413.public_service_commission.id2220973;

public class RoomAllocation {
    private int allocationID;
    private int examID;
    private int centerID;
    private int roomNo;

    public RoomAllocation(int allocationID, int examID, int centerID, int roomNo) {
        this.allocationID = allocationID;
        this.examID = examID;
        this.centerID = centerID;
        this.roomNo = roomNo;
    }

    public int getAllocationID() {
        return allocationID;
    }

    public void setAllocationID(int allocationID) {
        this.allocationID = allocationID;
    }

    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public int getCenterID() {
        return centerID;
    }

    public void setCenterID(int centerID) {
        this.centerID = centerID;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "RoomAllocation{" +
                "allocationID=" + allocationID +
                ", examID=" + examID +
                ", centerID=" + centerID +
                ", roomNo=" + roomNo +
                '}';
    }
}
