package mydelivery;

public class Delivered extends AbstractEvent {

    private Long deliveryId;
    private Long orderId;
    private String orderStatus;

    public Long getId() {
        return deliveryId;
    }

    public void setId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}